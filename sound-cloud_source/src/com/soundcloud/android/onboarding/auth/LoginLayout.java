// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import a.a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.soundcloud.android.utils.AndroidUtils;
import com.soundcloud.android.utils.ScTextUtils;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            AuthLayout

public class LoginLayout extends AuthLayout
{
    public static interface LoginHandler
        extends AuthLayout.AuthHandler
    {

        public abstract void onCancelLogin();

        public abstract void onLogin(String s, String s1);

        public abstract void onRecoverPassword(String s);
    }


    private static final String BUNDLE_EMAIL = "BUNDLE_EMAIL";
    private static final String BUNDLE_PASSWORD = "BUNDLE_PASSWORD";
    AutoCompleteTextView emailField;
    Button loginButton;
    private LoginHandler loginHandler;
    EditText passwordField;

    public LoginLayout(Context context)
    {
        super(context);
    }

    public LoginLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public LoginLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected AuthLayout.AuthHandler getAuthHandler()
    {
        return loginHandler;
    }

    public LoginHandler getLoginHandler()
    {
        return loginHandler;
    }

    public Bundle getStateBundle()
    {
        EditText edittext = (EditText)findViewById(0x7f0f017f);
        EditText edittext1 = (EditText)findViewById(0x7f0f0180);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("BUNDLE_EMAIL", edittext.getText());
        bundle.putCharSequence("BUNDLE_PASSWORD", edittext1.getText());
        return bundle;
    }

    public void onCancelClick()
    {
        getLoginHandler().onCancelLogin();
        InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
        inputmethodmanager.hideSoftInputFromWindow(passwordField.getWindowToken(), 0);
        inputmethodmanager.hideSoftInputFromWindow(emailField.getWindowToken(), 0);
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
label0:
        {
            boolean flag1 = true;
            boolean flag3 = false;
            boolean flag;
            boolean flag2;
            if (i == 6)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (keyevent != null && keyevent.getKeyCode() == 66)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (keyevent == null || keyevent.getAction() != 0)
            {
                flag1 = false;
            }
            if (i == 0)
            {
                flag2 = flag3;
                if (!flag)
                {
                    break label0;
                }
                flag2 = flag3;
                if (!flag1)
                {
                    break label0;
                }
            }
            flag2 = loginButton.performClick();
        }
        return flag2;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a.a(this);
        ArrayAdapter arrayadapter = new ArrayAdapter(getContext(), 0x7f03008c, AndroidUtils.listEmails(getContext()));
        emailField.setAdapter(arrayadapter);
        emailField.setThreshold(0);
        ScTextUtils.clickify((TextView)findViewById(0x7f0f0182), getResources().getString(0x7f07007e), new _cls1(), true, false);
    }

    public void onLoginClick()
    {
        if (emailField.getText().length() == 0 || passwordField.getText().length() == 0)
        {
            AndroidUtils.showToast(getContext(), 0x7f07008c, new Object[0]);
            return;
        } else
        {
            String s = emailField.getText().toString();
            String s1 = passwordField.getText().toString();
            getLoginHandler().onLogin(s, s1);
            return;
        }
    }

    public void setLoginHandler(LoginHandler loginhandler)
    {
        loginHandler = loginhandler;
    }

    public void setStateFromBundle(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            EditText edittext = (EditText)findViewById(0x7f0f017f);
            EditText edittext1 = (EditText)findViewById(0x7f0f0180);
            edittext.setText(bundle.getCharSequence("BUNDLE_EMAIL"));
            edittext1.setText(bundle.getCharSequence("BUNDLE_PASSWORD"));
            return;
        }
    }

    private class _cls1
        implements com.soundcloud.android.utils.ScTextUtils.ClickSpan.OnClickListener
    {

        final LoginLayout this$0;

        public void onClick()
        {
            getLoginHandler().onRecoverPassword(emailField.getText().toString());
        }

        _cls1()
        {
            this$0 = LoginLayout.this;
            super();
        }
    }

}
