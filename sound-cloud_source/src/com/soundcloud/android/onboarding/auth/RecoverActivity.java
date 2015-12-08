// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.main.TrackedActivity;
import com.soundcloud.android.utils.ScTextUtils;
import com.soundcloud.rx.eventbus.EventBus;

public class RecoverActivity extends TrackedActivity
{

    EventBus eventBus;
    PublicApi publicApi;

    public RecoverActivity()
    {
    }

    private void recoverPassword(String s)
    {
        (new _cls4(publicApi)).execute(new String[] {
            s
        });
    }

    protected void build()
    {
        final EditText emailField = (EditText)findViewById(0x7f0f0217);
        final Button recoverBtn = (Button)findViewById(0x7f0f0219);
        emailField.setOnEditorActionListener(new _cls1());
        recoverBtn.setOnClickListener(new _cls2());
        ScTextUtils.clickify((TextView)findViewById(0x7f0f0218), getResources().getString(0x7f07009d), new _cls3(), true, false);
        if (getIntent().hasExtra("email"))
        {
            emailField.setText(getIntent().getStringExtra("email"));
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        build();
        if (bundle == null)
        {
            eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.AUTH_FORGOT_PASSWORD));
        }
    }

    protected void setActivityContentView()
    {
        setContentView(0x7f0300a4);
    }


    private class _cls4 extends RecoverPasswordTask
    {

        private ProgressDialog progressDialog;
        final RecoverActivity this$0;

        protected void onPostExecute(Boolean boolean1)
        {
            if (!isFinishing() && progressDialog != null)
            {
                try
                {
                    progressDialog.dismiss();
                }
                catch (IllegalArgumentException illegalargumentexception) { }
            }
            setResult(-1, (new Intent()).putExtra("success", boolean1).putExtra("error", getFirstError()));
            finish();
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Boolean)obj);
        }

        protected void onPreExecute()
        {
            if (!isFinishing())
            {
                progressDialog = AndroidUtils.showProgress(RecoverActivity.this, 0x7f07009e);
            }
        }

        _cls4(PublicApi publicapi)
        {
            this$0 = RecoverActivity.this;
            super(publicapi);
        }
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final RecoverActivity this$0;
        final Button val$recoverBtn;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (i == 6 || keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
            {
                return recoverBtn.performClick();
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = RecoverActivity.this;
            recoverBtn = button;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final RecoverActivity this$0;
        final EditText val$emailField;

        public void onClick(View view)
        {
            if (emailField.getText().length() == 0)
            {
                AndroidUtils.showToast(RecoverActivity.this, 0x7f07008c, new Object[0]);
                return;
            } else
            {
                recoverPassword(emailField.getText().toString());
                return;
            }
        }

        _cls2()
        {
            this$0 = RecoverActivity.this;
            emailField = edittext;
            super();
        }
    }


    private class _cls3
        implements com.soundcloud.android.utils.ScTextUtils.ClickSpan.OnClickListener
    {

        final RecoverActivity this$0;

        public void onClick()
        {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(0x7f070330))));
        }

        _cls3()
        {
            this$0 = RecoverActivity.this;
            super();
        }
    }

}
