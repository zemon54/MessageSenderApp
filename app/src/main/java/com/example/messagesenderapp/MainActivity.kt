package com.example.messagesenderapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to the TextView and EditTexts
        val appNameTextView: TextView = findViewById(R.id.appNameTextView)
        val phoneNumberInput: EditText = findViewById(R.id.phoneNumberInput)
        val messageInput: EditText = findViewById(R.id.messageInput)
        val sendButton: Button = findViewById(R.id.sendButton)

        sendButton.setOnClickListener {
            val phoneNumber = phoneNumberInput.text.toString()
            val message = messageInput.text.toString()
            val intent = Intent(this, DisplayMessageActivity::class.java).apply {
                putExtra("EXTRA_PHONE_NUMBER", phoneNumber)
                putExtra("EXTRA_MESSAGE", message)
            }
            startActivity(intent)
        }
    }
}
