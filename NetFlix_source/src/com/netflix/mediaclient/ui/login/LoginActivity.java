// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.AlertDialogFactory;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.SimpleManagerCallback;
import com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.ui.login:
//            AccountActivity

public class LoginActivity extends AccountActivity
{

    private static final int MIN_PASSWORD_CHARS = 4;
    private static final String TAG = "LoginActivity";
    private EditText emailView;
    private View loginButton;
    private View loginForm;
    private final SimpleManagerCallback loginQueryCallback = new SimpleManagerCallback() {

        final LoginActivity this$0;

        public void onLoginComplete(final int statusCode, String s)
        {
            runOnUiThread(s. new Runnable() {

                final _cls4 this$1;
                final String val$msg;
                final int val$statusCode;

                public void run()
                {
                    handleLoginComplete(statusCode, msg);
                }

            
            {
                this$1 = final__pcls4;
                statusCode = i;
                msg = String.this;
                super();
            }
            });
        }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
    };
    private EditText passwordView;
    private View statusGroup;
    private TextView statusMessageView;

    public LoginActivity()
    {
    }

    private void attemptLogin()
    {
        emailView.setError(null);
        passwordView.setError(null);
        String s = emailView.getText().toString();
        String s1 = passwordView.getText().toString();
        boolean flag = false;
        Object obj = null;
        if (passwordIsInvalid(s1))
        {
            passwordView.setError(getString(0x7f0c015b));
            obj = passwordView;
            flag = true;
        }
        if (emailIsInvalid(s))
        {
            emailView.setError(getString(0x7f0c015a));
            obj = emailView;
            flag = true;
        }
        if (flag)
        {
            Log.i("LoginActivity", "There was an error - skipping login and showing error msg");
            ((View) (obj)).requestFocus();
            return;
        }
        obj = getServiceManager();
        if (!ConnectivityUtils.isConnectedOrConnecting(this) || obj == null || !((ServiceManager) (obj)).isReady())
        {
            noConnectivityWarning();
            return;
        } else
        {
            int i = DeviceUtils.getScreenSensorOrientation(this);
            Log.i("LoginActivity", (new StringBuilder()).append("Locking orientation to: ").append(i).toString());
            setRequestedOrientation(i);
            statusMessageView.setText(0x7f0c0159);
            showProgress(true);
            ((ServiceManager) (obj)).loginUser(s, s1, loginQueryCallback);
            return;
        }
    }

    public static Intent createStartIntent(Context context)
    {
        return new Intent(context, com/netflix/mediaclient/ui/login/LoginActivity);
    }

    private boolean emailIsInvalid(String s)
    {
        return StringUtils.isEmpty(s);
    }

    private void handleLoginComplete(int i, String s)
    {
        Log.d("LoginActivity", (new StringBuilder()).append("Login Complete - Status: ").append(i).append(" msg:").append(s).toString());
        setRequestedOrientation(-1);
        if (i == 0 || i == -41)
        {
            showDebugToast(0x7f0c0160);
            return;
        } else
        {
            handleUserAgentErrors(this, i, s);
            showProgress(false);
            return;
        }
    }

    private void noConnectivityWarning()
    {
        runOnUiThread(new Runnable() );
    }

    private boolean passwordIsInvalid(String s)
    {
        return StringUtils.isEmpty(s) || s.length() < 4;
    }

    private void showDebugToast(int i)
    {
        showDebugToast(getString(i));
    }

    private void showDebugToast(String s)
    {
    }

    private void showProgress(boolean flag)
    {
        byte byte0 = 8;
        boolean flag1 = false;
        View view = statusGroup;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        view = loginForm;
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        view = loginButton;
        if (!flag)
        {
            flag1 = true;
        }
        view.setEnabled(flag1);
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.login;
    }

    protected void handleAccountDeactivated()
    {
        Log.i("LoginActivity", "Account deactivated ...");
    }

    protected void handleProfileReadyToSelect()
    {
        Log.i("LoginActivity", "New profile requested - starting profile selection activity...");
        startActivity(ProfileSelectionActivity.createStartIntent(this));
        finishAllAccountActivities(this);
    }

    protected void handleUserAgentErrors(Activity activity, int i, String s)
    {
        if (i == -203 || i == -207)
        {
            passwordView.setError(getString(0x7f0c015c));
            return;
        }
        if (i == -201)
        {
            displayUserAgentDialog((new StringBuilder()).append(getString(0x7f0c0194)).append(" (").append(i).append(")").toString(), null, false);
            return;
        }
        if (i == -3)
        {
            displayUserAgentDialog((new StringBuilder()).append(getString(0x7f0c0196)).append(" (").append(i).append(")").toString(), null, true);
            return;
        } else
        {
            handleUserAgentErrors(activity, i, s);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        onCreate(bundle);
        AndroidUtils.logIntent("LoginActivity", getIntent());
        setContentView(0x7f030048);
        LogUtils.reportLoginActionEnded(this, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.success, null);
        emailView = (EditText)findViewById(0x7f0700f3);
        emailView.requestFocus();
        passwordView = (EditText)findViewById(0x7f0700f4);
        passwordView.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final LoginActivity this$0;

            private boolean isLoginId(int i)
            {
                return i == 0x7f0700f5 || i == 0 || i == 6;
            }

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                Log.v("LoginActivity", (new StringBuilder()).append("Editor action: ").append(i).append(", keyevent: ").append(keyevent).toString());
                if (isLoginId(i))
                {
                    attemptLogin();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
        });
        loginForm = findViewById(0x7f0700f2);
        loginButton = findViewById(0x7f0700f0);
        statusGroup = findViewById(0x7f0700f6);
        statusMessageView = (TextView)findViewById(0x7f0700f7);
        findViewById(0x7f0700f0).setOnClickListener(new android.view.View.OnClickListener() {

            final LoginActivity this$0;

            public void onClick(View view)
            {
                attemptLogin();
            }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
        });
        findViewById(0x7f0700f1).setOnClickListener(new android.view.View.OnClickListener() {

            final LoginActivity this$0;

            public void onClick(View view)
            {
                startActivity((new Intent("android.intent.action.VIEW")).setData(Uri.parse("https://signup.netflix.com/loginhelp")));
            }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
        });
    }



}
