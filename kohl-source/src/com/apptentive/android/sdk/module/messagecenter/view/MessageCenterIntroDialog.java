// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.apptentive.android.sdk.module.rating.view.ApptentiveBaseDialog;
import com.apptentive.android.sdk.util.Util;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            EmailValidationFailedDialog

public class MessageCenterIntroDialog extends ApptentiveBaseDialog
{
    public static interface OnSendListener
    {

        public abstract void onSend(String s, String s1);
    }


    private CharSequence email;
    private boolean emailRequired;
    private CharSequence message;
    private OnSendListener onSendListener;

    public MessageCenterIntroDialog(Context context)
    {
        super(context, com.apptentive.android.sdk.R.layout.apptentive_message_center_intro_dialog);
        emailRequired = false;
    }

    private void validateForm(Button button)
    {
        boolean flag2 = true;
        boolean flag = true;
        boolean flag1;
        if (emailRequired)
        {
            if (email != null && email.length() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (message != null && message.length() != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag || !flag1)
        {
            flag2 = false;
        }
        button.setEnabled(flag2);
    }

    public boolean isEmailFieldVisible()
    {
        return ((EditText)findViewById(com.apptentive.android.sdk.R.id.email)).getVisibility() == 0;
    }

    protected void onCreate(final Bundle emailText)
    {
        super.onCreate(emailText);
        emailText = (AutoCompleteTextView)findViewById(com.apptentive.android.sdk.R.id.email);
        final EditText messageText = (EditText)findViewById(com.apptentive.android.sdk.R.id.message);
        Button button = (Button)findViewById(com.apptentive.android.sdk.R.id.no_thanks);
        final Button sendButton = (Button)findViewById(com.apptentive.android.sdk.R.id.send);
        emailText.setAdapter(new ArrayAdapter(getContext(), 0x109000a, Util.getAllUserAccountEmailAddresses(getContext())));
        emailText.setOnTouchListener(new android.view.View.OnTouchListener() {

            final MessageCenterIntroDialog this$0;
            final AutoCompleteTextView val$emailText;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                emailText.showDropDown();
                return false;
            }

            
            {
                this$0 = MessageCenterIntroDialog.this;
                emailText = autocompletetextview;
                super();
            }
        });
        emailText.addTextChangedListener(new TextWatcher() {

            final MessageCenterIntroDialog this$0;
            final Button val$sendButton;

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                email = charsequence;
                validateForm(sendButton);
            }

            
            {
                this$0 = MessageCenterIntroDialog.this;
                sendButton = button;
                super();
            }
        });
        messageText.addTextChangedListener(new TextWatcher() {

            final MessageCenterIntroDialog this$0;
            final Button val$sendButton;

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                message = charsequence;
                validateForm(sendButton);
            }

            
            {
                this$0 = MessageCenterIntroDialog.this;
                sendButton = button;
                super();
            }
        });
        button.setEnabled(true);
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final MessageCenterIntroDialog this$0;

            public void onClick(View view)
            {
                cancel();
            }

            
            {
                this$0 = MessageCenterIntroDialog.this;
                super();
            }
        });
        sendButton.setEnabled(false);
        sendButton.setOnClickListener(new android.view.View.OnClickListener() {

            final MessageCenterIntroDialog this$0;
            final AutoCompleteTextView val$emailText;
            final EditText val$messageText;

            public void onClick(View view)
            {
                if (email != null && email.length() != 0 && !Util.isEmailValid(email.toString()))
                {
                    (new EmailValidationFailedDialog(getContext())).show();
                } else
                if (onSendListener != null)
                {
                    onSendListener.onSend(emailText.getText().toString(), messageText.getText().toString());
                    return;
                }
            }

            
            {
                this$0 = MessageCenterIntroDialog.this;
                emailText = autocompletetextview;
                messageText = edittext;
                super();
            }
        });
        validateForm(sendButton);
    }

    public void prePopulateEmail(String s)
    {
        ((EditText)findViewById(com.apptentive.android.sdk.R.id.email)).setText(s);
        email = s;
    }

    public void setBody(int i)
    {
        setBody(((CharSequence) (getContext().getResources().getString(i))));
    }

    public void setBody(CharSequence charsequence)
    {
        ((TextView)findViewById(com.apptentive.android.sdk.R.id.body)).setText(charsequence);
    }

    public void setEmailFieldHidden(boolean flag)
    {
        EditText edittext = (EditText)findViewById(com.apptentive.android.sdk.R.id.email);
        if (flag)
        {
            edittext.setVisibility(8);
            return;
        } else
        {
            edittext.setVisibility(0);
            return;
        }
    }

    public void setEmailRequired(boolean flag)
    {
        emailRequired = flag;
        AutoCompleteTextView autocompletetextview = (AutoCompleteTextView)findViewById(com.apptentive.android.sdk.R.id.email);
        if (flag)
        {
            autocompletetextview.setHint(com.apptentive.android.sdk.R.string.apptentive_edittext_hint_email_required);
            return;
        } else
        {
            autocompletetextview.setHint(com.apptentive.android.sdk.R.string.apptentive_edittext_hint_email);
            return;
        }
    }

    public void setOnSendListener(OnSendListener onsendlistener)
    {
        onSendListener = onsendlistener;
    }

    public void setTitle(int i)
    {
        setTitle(((CharSequence) (getContext().getResources().getString(i))));
    }

    public void setTitle(CharSequence charsequence)
    {
        ((TextView)findViewById(com.apptentive.android.sdk.R.id.title)).setText(charsequence);
    }



/*
    static CharSequence access$002(MessageCenterIntroDialog messagecenterintrodialog, CharSequence charsequence)
    {
        messagecenterintrodialog.email = charsequence;
        return charsequence;
    }

*/



/*
    static CharSequence access$202(MessageCenterIntroDialog messagecenterintrodialog, CharSequence charsequence)
    {
        messagecenterintrodialog.message = charsequence;
        return charsequence;
    }

*/

}
