// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.signup;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ViewFlipper;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.widget.AlertDialogFactory;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.javabridge.ui.ActivationTokens;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.SignUpParams;
import com.netflix.mediaclient.servicemgr.SimpleManagerCallback;
import com.netflix.mediaclient.ui.login.AccountActivity;
import com.netflix.mediaclient.ui.login.LoginActivity;
import com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.ThreadUtils;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.ui.signup:
//            SignUpWebViewClient, Bootloader

public class SignupActivity extends AccountActivity
{
    public class NFAndroidJS
    {

        final SignupActivity this$0;

        public String getDeviceCategory()
        {
            if (mDeviceCategory != null)
            {
                return mDeviceCategory;
            } else
            {
                return "phone";
            }
        }

        public String getESN()
        {
            if (mESN != null)
            {
                return mESN;
            } else
            {
                return "";
            }
        }

        public String getESNPrefix()
        {
            if (mESNPrefix != null)
            {
                return mESNPrefix;
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
            if (mSoftwareVersion != null)
            {
                return mSoftwareVersion;
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
            if (mSignupOngoing)
            {
                Log.d("SignupActivity", "loginToApp ongoing, returning NULL operation");
                return;
            }
            Log.d("SignupActivity", (new StringBuilder()).append("Login with Tokens ").append(s).append(" ErrHandler: ").append(s1).toString());
            mErrHandler = s1;
            if (!ConnectivityUtils.isConnectedOrConnecting(SignupActivity.this))
            {
                noConnectivityWarning();
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
                mSignupOngoing = false;
                provideDialog(getString(0x7f0c019a), mHandleError);
                return;
            }
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_261;
            }
            if (s1.isReady())
            {
                s1.loginUserByTokens(s, loginQueryCallback);
                mSignupOngoing = true;
                runOnUiThread(new Runnable() {

                    final NFAndroidJS this$1;

                    public void run()
                    {
                        Log.d("SignupActivity", "Disabling webview visibility");
                        webViewVisibility(false);
                    }

            
            {
                this$1 = NFAndroidJS.this;
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
            mHandler.removeCallbacks(mJumpToSignInTask);
            runOnUiThread(new Runnable() {

                final NFAndroidJS this$1;

                public void run()
                {
                    if (!mSignupLoaded)
                    {
                        webViewVisibility(true);
                        mSignupLoaded = true;
                    }
                }

            
            {
                this$1 = NFAndroidJS.this;
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
                    updateMenuItems();
                }
                return;
            }
            Log.w("SignupActivity", "setLanguage  failed, invalid state");
        }

        public void showSignIn()
        {
            Log.d("SignupActivity", "Show SignIn: ");
            mSignupMenuItem = true;
            updateMenuItems();
        }

        public void showSignOut()
        {
            Log.d("SignupActivity", "Show SignOut");
            mSignupMenuItem = false;
            updateMenuItems();
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
            startNextActivity(LoginActivity.createStartIntent(SignupActivity.this));
            finish();
        }

        public NFAndroidJS()
        {
            this$0 = SignupActivity.this;
            super();
        }
    }

    private class signUpWebChromeClient extends WebChromeClient
    {

        final SignupActivity this$0;

        public boolean onConsoleMessage(ConsoleMessage consolemessage)
        {
            Log.i("JavaScript", (new StringBuilder()).append(consolemessage.message()).append(" -- From line ").append(consolemessage.lineNumber()).append(" of ").append(consolemessage.sourceId()).toString());
            return true;
        }

        private signUpWebChromeClient()
        {
            this$0 = SignupActivity.this;
            super();
        }

    }


    private static final String BOOTURL = "booturl";
    private static final String DEFAULT_LOCALE = "en";
    private static final String TAG = "SignupActivity";
    private final SimpleManagerCallback loginQueryCallback = new SimpleManagerCallback() {

        final SignupActivity this$0;

        public void onLoginComplete(final int statusCode, String s)
        {
            runOnUiThread(s. new Runnable() {

                final _cls7 this$1;
                final String val$msg;
                final int val$statusCode;

                public void run()
                {
                    handleLoginComplete(statusCode, msg);
                }

            
            {
                this$1 = final__pcls7;
                statusCode = i;
                msg = String.this;
                super();
            }
            });
        }

            
            {
                this$0 = SignupActivity.this;
                super();
            }
    };
    private NFAndroidJS mAndroidJS;
    private String mDeviceCategory;
    private String mESN;
    private String mESNPrefix;
    private String mErrHandler;
    private ViewFlipper mFlipper;
    Runnable mHandleError;
    private Handler mHandler;
    Runnable mJumpToSignInTask;
    private SignUpParams mSignUpParams;
    private boolean mSignupLoaded;
    private boolean mSignupMenuItem;
    private boolean mSignupOngoing;
    private String mSoftwareVersion;
    private Bootloader mUiBoot;
    private WebView mWebView;
    private SignUpWebViewClient mWebViewClient;
    private boolean mWebViewVisibility;

    public SignupActivity()
    {
        mWebViewVisibility = false;
        mSignupMenuItem = true;
        mSignupLoaded = false;
        mSignupOngoing = false;
        mJumpToSignInTask = new Runnable() {

            final SignupActivity this$0;

            public void run()
            {
                Log.d("SignupActivity", "Timeout triggered, switching to LoginActivity");
                if (!mSignupLoaded)
                {
                    startNextActivity(LoginActivity.createStartIntent(SignupActivity.this));
                    finish();
                }
            }

            
            {
                this$0 = SignupActivity.this;
                super();
            }
        };
        mHandleError = new Runnable() {

            final SignupActivity this$0;

            public void run()
            {
                Log.d("SignupActivity", "Handling error during signup");
                clearCookies();
                startNextActivity(LoginActivity.createStartIntent(SignupActivity.this));
                finish();
            }

            
            {
                this$0 = SignupActivity.this;
                super();
            }
        };
    }

    public static Intent createStartIntent(Context context, Intent intent)
    {
        return new Intent(context, com/netflix/mediaclient/ui/signup/SignupActivity);
    }

    private void handleLoginComplete(int i, String s)
    {
        if (s == null)
        {
            s = "";
        }
        mSignupOngoing = false;
        Log.d("SignupActivity", (new StringBuilder()).append("Login Complete - Status: ").append(i).append(" DisplayMsg: ").append(s).toString());
        if (i == 0 || i == -41)
        {
            showToast(0x7f0c0160);
            clearCookies();
        } else
        {
            provideDialog((new StringBuilder()).append(getString(0x7f0c019a)).append(" (").append(i).append(")").toString(), mHandleError);
            if (mErrHandler != null)
            {
                s = (new StringBuilder()).append("javascript:").append(mErrHandler).append("('").append(i).append("')").toString();
                Log.d("SignupActivity", (new StringBuilder()).append("Executing the following javascript:").append(s).toString());
                mWebView.loadUrl(s);
                mErrHandler = null;
                return;
            }
        }
    }

    private void noConnectivityWarning()
    {
        runOnUiThread(new Runnable() );
    }

    private void reloadSignUp(boolean flag)
    {
        if (flag)
        {
            clearCookies();
        }
        mWebViewClient.clearHistory();
        mWebView.loadUrl(mUiBoot.getUrl());
    }

    private void setUpSignInView(ServiceManager servicemanager)
    {
        setContentView(0x7f03007d);
        mWebView = (WebView)findViewById(0x7f070199);
        mFlipper = (ViewFlipper)findViewById(0x7f070149);
        mESN = servicemanager.getESNProvider().getEsn();
        mESNPrefix = servicemanager.getESNProvider().getESNPrefix();
        mSoftwareVersion = servicemanager.getSoftwareVersion();
        mDeviceCategory = servicemanager.getDeviceCategory().getValue();
        mSignUpParams = servicemanager.getSignUpParams();
        String s = mSignUpParams.getSignUpBootloader();
        if (getIntent().getExtras() == null);
        WebSettings websettings = mWebView.getSettings();
        websettings.setJavaScriptEnabled(true);
        websettings.setSupportZoom(false);
        websettings.setBuiltInZoomControls(false);
        mAndroidJS = new NFAndroidJS();
        mWebView.addJavascriptInterface(mAndroidJS, "nfandroid");
        mWebView.setWebChromeClient(new signUpWebChromeClient());
        mWebViewClient = new SignUpWebViewClient(this);
        mWebView.setWebViewClient(mWebViewClient);
        mWebView.setOnTouchListener(new android.view.View.OnTouchListener() {

            final SignupActivity this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                motionevent.getAction();
                JVM INSTR tableswitch 0 1: default 28
            //                           0 30
            //                           1 30;
                   goto _L1 _L2 _L2
_L1:
                return false;
_L2:
                if (!view.hasFocus())
                {
                    view.requestFocus();
                }
                if (true) goto _L1; else goto _L3
_L3:
            }

            
            {
                this$0 = SignupActivity.this;
                super();
            }
        });
        mUiBoot = new Bootloader(servicemanager, s, getDeviceLanguage(), AndroidUtils.isNetflixPreloaded(this));
        mWebView.loadUrl(mUiBoot.getUrl());
        Log.d("SignupActivity", "Adding timeout for webview to load");
        mHandler.postDelayed(mJumpToSignInTask, mSignUpParams.getSignUpTimeout());
    }

    private void showToast(int i)
    {
        showToast(getString(i));
    }

    private void startNextActivity(Intent intent)
    {
        startActivity(intent);
        Log.d("SignupActivity", "Removing jumpToSignIn");
        mHandler.removeCallbacks(mJumpToSignInTask);
        overridePendingTransition(0, 0);
    }

    private void updateMenuItems()
    {
        runOnUiThread(new Runnable() {

            final SignupActivity this$0;

            public void run()
            {
                invalidateOptionsMenu();
            }

            
            {
                this$0 = SignupActivity.this;
                super();
            }
        });
    }

    public void clearCookies()
    {
        Log.d("SignupActivity", "Removing cookies");
        CookieSyncManager.createInstance(getBaseContext());
        CookieManager.getInstance().removeAllCookie();
    }

    protected ManagerStatusListener createManagerStatusListener()
    {
        return new ManagerStatusListener() {

            final SignupActivity this$0;

            public void onManagerReady(ServiceManager servicemanager, int i)
            {
                Log.d("SignupActivity", (new StringBuilder()).append("ServiceManager ready: ").append(i).toString());
                ThreadUtils.assertOnMain();
                setUpSignInView(servicemanager);
            }

            public void onManagerUnavailable(ServiceManager servicemanager, int i)
            {
                Log.e("SignupActivity", "NetflixService is NOT available!");
            }

            
            {
                this$0 = SignupActivity.this;
                super();
            }
        };
    }

    public String getDeviceLanguage()
    {
        ServiceManager servicemanager = getServiceManager();
        if (servicemanager != null && servicemanager.isReady())
        {
            return servicemanager.getCurrentAppLocale();
        } else
        {
            return "en";
        }
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.nmLanding;
    }

    protected void handleProfileReadyToSelect()
    {
        Log.i("SignupActivity", "New profile requested - starting profile selection activity...");
        startActivity(ProfileSelectionActivity.createStartIntent(this));
        finishAllAccountActivities(this);
    }

    public void onBackPressed()
    {
        if (mWebView == null || !mWebView.canGoBackOrForward(-1))
        {
            super.onBackPressed();
            return;
        }
        if (!mWebView.canGoBackOrForward(-2) && mSignupMenuItem)
        {
            mWebView.goBack();
            return;
        } else
        {
            provideTwoButtonDialog(getString(0x7f0c019b), new Runnable() {

                final SignupActivity this$0;

                public void run()
                {
                    reloadSignUp(false);
                }

            
            {
                this$0 = SignupActivity.this;
                super();
            }
            });
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mHandler = new Handler();
        getNetflixActionBar().setBackgroundResource(0x7f02005d);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        Object obj;
        if (mSignupMenuItem)
        {
            obj = menu.add(getString(0x7f0c0140));
            ((MenuItem) (obj)).setShowAsAction(1);
            ((MenuItem) (obj)).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() {

                final SignupActivity this$0;

                public boolean onMenuItemClick(MenuItem menuitem)
                {
                    Log.d("SignupActivity", "User tapped sign-in button");
                    LogUtils.reportLoginActionStarted(SignupActivity.this, null, getUiScreen());
                    startNextActivity(LoginActivity.createStartIntent(SignupActivity.this));
                    return true;
                }

            
            {
                this$0 = SignupActivity.this;
                super();
            }
            });
        } else
        {
            obj = menu.add(getString(0x7f0c0141));
            ((MenuItem) (obj)).setShowAsAction(1);
            ((MenuItem) (obj)).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() {

                final SignupActivity this$0;

                public boolean onMenuItemClick(MenuItem menuitem)
                {
                    reloadSignUp(true);
                    return true;
                }

            
            {
                this$0 = SignupActivity.this;
                super();
            }
            });
        }
        if (obj != null)
        {
            obj = ((MenuItem) (obj)).getActionView();
            if (obj != null && !((View) (obj)).isInTouchMode())
            {
                ((View) (obj)).requestFocus();
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onStop()
    {
        super.onStop();
        mHandler.removeCallbacks(mJumpToSignInTask);
    }

    void provideDialog(String s, Runnable runnable)
    {
        s = new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(null, s, getString(0x104000a), runnable);
        displayDialog(AlertDialogFactory.createDialog(this, handler, s));
    }

    void provideTwoButtonDialog(String s, Runnable runnable)
    {
        s = new com.netflix.mediaclient.android.widget.AlertDialogFactory.TwoButtonAlertDialogDescriptor(null, s, getString(0x104000a), runnable, getString(0x1040000), null);
        displayDialog(AlertDialogFactory.createDialog(this, handler, s));
    }

    void showToast(String s)
    {
        Log.v("SignupActivity", (new StringBuilder()).append("Showing toast: ").append(s).toString());
    }

    void webViewVisibility(boolean flag)
    {
        if (flag != mWebViewVisibility)
        {
            Log.d("SignupActivity", (new StringBuilder()).append("WebView visibility:").append(mWebViewVisibility).toString());
            mFlipper.showNext();
            if (!mWebViewVisibility)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mWebViewVisibility = flag;
        }
    }





/*
    static boolean access$1002(SignupActivity signupactivity, boolean flag)
    {
        signupactivity.mSignupOngoing = flag;
        return flag;
    }

*/


/*
    static String access$1102(SignupActivity signupactivity, String s)
    {
        signupactivity.mErrHandler = s;
        return s;
    }

*/








/*
    static boolean access$202(SignupActivity signupactivity, boolean flag)
    {
        signupactivity.mSignupLoaded = flag;
        return flag;
    }

*/


/*
    static boolean access$302(SignupActivity signupactivity, boolean flag)
    {
        signupactivity.mSignupMenuItem = flag;
        return flag;
    }

*/






}
