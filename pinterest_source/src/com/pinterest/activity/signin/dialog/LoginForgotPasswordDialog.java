// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.kit.application.Resources;

public class LoginForgotPasswordDialog extends BaseDialog
{

    public static final String KEY = "login_forgot_password";

    public LoginForgotPasswordDialog()
    {
        _key = "login_forgot_password";
    }

    public void make(LayoutInflater layoutinflater)
    {
        setTitle(Resources.string(0x7f0702c4));
        setSubTitle(Resources.string(0x7f0702c5));
        super.make(layoutinflater);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        activity = LayoutInflater.from(activity).inflate(0x7f03007c, null);
        final EditText emailEt = (EditText)activity.findViewById(0x7f0f0163);
        emailEt.setHint(0x7f070233);
        setContent(activity);
        setNegativeButton(0x7f0700af, new _cls1());
        setPositiveButton(0x7f0704b8, new _cls2());
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LoginForgotPasswordDialog this$0;

        public void onClick(View view)
        {
            Events.post(new DialogEvent(new LoginDialog()));
        }

        _cls1()
        {
            this$0 = LoginForgotPasswordDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final LoginForgotPasswordDialog this$0;
        final EditText val$emailEt;

        public void onClick(View view)
        {
            view = emailEt.getText().toString();
            if (SignupFormUtils.isEmailValid(view))
            {
                Events.post(new DialogEvent(new ResetPasswordDialog(view)));
                return;
            } else
            {
                Application.showToast(0x7f070531);
                return;
            }
        }

        _cls2()
        {
            this$0 = LoginForgotPasswordDialog.this;
            emailEt = edittext;
            super();
        }
    }

}
