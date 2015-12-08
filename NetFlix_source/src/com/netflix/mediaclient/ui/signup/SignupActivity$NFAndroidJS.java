// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.signup;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.javabridge.ui.ActivationTokens;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.login.LoginActivity;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.LogUtils;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.ui.signup:
//            SignupActivity

public class this._cls0
{

    final SignupActivity this$0;

    public String getDeviceCategory()
    {
        if (SignupActivity.access$800(SignupActivity.this) != null)
        {
            return SignupActivity.access$800(SignupActivity.this);
        } else
        {
            return "phone";
        }
    }

    public String getESN()
    {
        if (SignupActivity.access$500(SignupActivity.this) != null)
        {
            return SignupActivity.access$500(SignupActivity.this);
        } else
        {
            return "";
        }
    }

    public String getESNPrefix()
    {
        if (SignupActivity.access$600(SignupActivity.this) != null)
        {
            return SignupActivity.access$600(SignupActivity.this);
        } else
        {
            return "";
        }
    }

    public String getLanguage()
    {
        return getDeviceLanguage();
    }

    public String getSoftwareVersion()
    {
        if (SignupActivity.access$700(SignupActivity.this) != null)
        {
            return SignupActivity.access$700(SignupActivity.this);
        } else
        {
            return "";
        }
    }

    public String isNetflixPreloaded()
    {
        if (AndroidUtils.isNetflixPreloaded(SignupActivity.this))
        {
            return "true";
        } else
        {
            return "false";
        }
    }

    public void launchUrl(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        s = "http://netflix.com";
_L4:
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
        return;
_L2:
        String s1 = s.trim();
        s = s1;
        if (!s1.toLowerCase(Locale.ENGLISH).startsWith("http"))
        {
            s = (new StringBuilder()).append("http://").append(s1).toString();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void loginCompleted()
    {
        Log.d("SignupActivity", "loginCompleted, noop");
    }

    public void loginToApp(String s, String s1)
    {
        if (SignupActivity.access$1000(SignupActivity.this))
        {
            Log.d("SignupActivity", "loginToApp ongoing, returning NULL operation");
            return;
        }
        Log.d("SignupActivity", (new StringBuilder()).append("Login with Tokens ").append(s).append(" ErrHandler: ").append(s1).toString());
        SignupActivity.access$1102(SignupActivity.this, s1);
        if (!ConnectivityUtils.isConnectedOrConnecting(SignupActivity.this))
        {
            SignupActivity.access$1200(SignupActivity.this);
            return;
        }
        try
        {
            s = new JSONObject(s);
            Log.d("SignupActivity", (new StringBuilder()).append("NetflixId: ").append(s.getString("NetflixId")).toString());
            Log.d("SignupActivity", (new StringBuilder()).append("SecureNetflixId: ").append(s.getString("SecureNetflixId")).toString());
            s = new ActivationTokens(s);
            s1 = getServiceManager();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("SignupActivity", "Failed to LoginToApp");
            s.printStackTrace();
            SignupActivity.access$1002(SignupActivity.this, false);
            provideDialog(getString(0x7f0c019a), mHandleError);
            return;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        if (s1.isReady())
        {
            s1.loginUserByTokens(s, SignupActivity.access$1300(SignupActivity.this));
            SignupActivity.access$1002(SignupActivity.this, true);
            runOnUiThread(new Runnable() {

                final SignupActivity.NFAndroidJS this$1;

                public void run()
                {
                    Log.d("SignupActivity", "Disabling webview visibility");
                    webViewVisibility(false);
                }

            
            {
                this$1 = SignupActivity.NFAndroidJS.this;
                super();
            }
            });
            return;
        }
        Log.d("SignupActivity", "loginToApp, invalid state to Login, bailing out");
        return;
    }

    public void notifyReady()
    {
        Log.d("SignupActivity", "Signup UI ready to interact");
        SignupActivity.access$900(SignupActivity.this).removeCallbacks(mJumpToSignInTask);
        runOnUiThread(new Runnable() {

            final SignupActivity.NFAndroidJS this$1;

            public void run()
            {
                if (!SignupActivity.access$200(this$0))
                {
                    webViewVisibility(true);
                    SignupActivity.access$202(this$0, true);
                }
            }

            
            {
                this$1 = SignupActivity.NFAndroidJS.this;
                super();
            }
        });
    }

    public void setLanguage(String s)
    {
label0:
        {
            boolean flag = s.equals(getLanguage());
            Log.d("SignupActivity", (new StringBuilder()).append("Update language to ").append(s).toString());
            if (!flag)
            {
                ServiceManager servicemanager = getServiceManager();
                if (servicemanager == null || !servicemanager.isReady())
                {
                    break label0;
                }
                getServiceManager().setCurrentAppLocale(s);
                ((NetflixApplication)getApplication()).refreshLocale(s);
                SignupActivity.access$400(SignupActivity.this);
            }
            return;
        }
        Log.w("SignupActivity", "setLanguage  failed, invalid state");
    }

    public void showSignIn()
    {
        Log.d("SignupActivity", "Show SignIn: ");
        SignupActivity.access$302(SignupActivity.this, true);
        SignupActivity.access$400(SignupActivity.this);
    }

    public void showSignOut()
    {
        Log.d("SignupActivity", "Show SignOut");
        SignupActivity.access$302(SignupActivity.this, false);
        SignupActivity.access$400(SignupActivity.this);
    }

    public void signupCompleted()
    {
        Log.d("SignupActivity", "signupCompleted, report");
        LogUtils.reportSignUpOnDevice(SignupActivity.this);
    }

    public void supportsSignUp(String s)
    {
        Log.d("SignupActivity", (new StringBuilder()).append("SupportSignUp flag: ").append(s).toString());
    }

    public void toSignIn()
    {
        Log.d("SignupActivity", "Redirecting to Login screen");
        SignupActivity.access$000(SignupActivity.this, LoginActivity.createStartIntent(SignupActivity.this));
        finish();
    }

    public _cls2.this._cls1()
    {
        this$0 = SignupActivity.this;
        super();
    }
}
