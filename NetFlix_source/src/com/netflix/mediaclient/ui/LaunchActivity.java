// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui;

import android.app.ActionBar;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.LoadingView;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.SignUpParams;
import com.netflix.mediaclient.servicemgr.UserProfile;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.login.LoginActivity;
import com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity;
import com.netflix.mediaclient.ui.signup.SignupActivity;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.ViewUtils;

// Referenced classes of package com.netflix.mediaclient.ui:
//            ServiceErrorsHandler

public class LaunchActivity extends NetflixActivity
{

    private static final boolean HANG_ON_LOADING_SCREEN = false;
    private static final boolean START_DETAILS_ACTIVITY_ON_LAUNCH = false;
    private static final String TAG = "LaunchActivity";
    private static final Video sampleVideo = new Video() {

        public String getBoxshotURL()
        {
            return null;
        }

        public VideoType getErrorType()
        {
            return null;
        }

        public String getHorzDispUrl()
        {
            return null;
        }

        public String getId()
        {
            return "70140457";
        }

        public String getSquareUrl()
        {
            return null;
        }

        public String getTitle()
        {
            return "Dummy Title";
        }

        public String getTvCardUrl()
        {
            return null;
        }

        public VideoType getType()
        {
            return VideoType.SHOW;
        }

    };
    private boolean isLoading;
    private long mSplashScreenStarted;
    private long mStarted;
    private final BroadcastReceiver nflxBroadcastReceiver = new BroadcastReceiver() {

        final LaunchActivity this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (Log.isLoggable("LaunchActivity", 2))
            {
                Log.v("LaunchActivity", (new StringBuilder()).append("Received intent ").append(intent).toString());
            }
            context = intent.getAction();
            if ("com.netflix.mediaclient.intent.action.NFLX_HANDLER_RESULT".equals(context))
            {
                Log.d("LaunchActivity", "Delayed nflx action completed, finish activity");
                finish();
            } else
            if (Log.isLoggable("LaunchActivity", 3))
            {
                Log.d("LaunchActivity", (new StringBuilder()).append("We do not support action ").append(context).toString());
                return;
            }
        }

            
            {
                this$0 = LaunchActivity.this;
                super();
            }
    };
    private final NflxHandler nflxHandler = new NflxHandler();

    public LaunchActivity()
    {
        isLoading = true;
    }

    private com.netflix.mediaclient.protocol.nflx.NflxHandler.Response canHandleIntent()
    {
        com.netflix.mediaclient.protocol.nflx.NflxHandler.Response response;
        try
        {
            response = nflxHandler.handleNflxIntent(this, getServiceManager(), getIntent(), mStarted);
        }
        catch (Throwable throwable)
        {
            Log.e("LaunchActivity", "Failed to parse nflx url ", throwable);
            return com.netflix.mediaclient.protocol.nflx.NflxHandler.Response.NOT_HANDLING;
        }
        return response;
    }

    private void createContentView()
    {
        setContentView(0x7f030080);
        ImageView imageview = (ImageView)findViewById(0x7f07019e);
        int i;
        if (DeviceUtils.isTabletByContext(this))
        {
            i = 0x7f02016d;
        } else
        {
            i = 0x7f02016c;
        }
        imageview.setImageResource(i);
        if (DeviceUtils.getScreenResolutionDpi(this) >= 320 && DeviceUtils.getScreenSizeCategory(this) == 4)
        {
            manipulateSplashBackground();
        }
    }

    private void handleManagerReady(ServiceManager servicemanager)
    {
        ApplicationPerformanceMetricsLogging applicationperformancemetricslogging = getServiceManager().getClientLogging().getApplicationPerformanceMetricsLogging();
        boolean flag = servicemanager.isUserLoggedIn();
        boolean flag1 = servicemanager.getSignUpParams().isSignUpEnabled();
        if (mSplashScreenStarted > 0L)
        {
            Log.d("LaunchActivity", "Splash screen was displayed, reporting");
            applicationperformancemetricslogging.uiViewChanged(DeviceUtils.isPortrait(this), com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.appLoading, mSplashScreenStarted);
        }
        com.netflix.mediaclient.service.logging.apm.model.Display display = LogUtils.getDisplay(this);
        if (!flag)
        {
            if (flag1 && !getNetflixApplication().hasSignedUpOnce())
            {
                Log.d("LaunchActivity", "User has not signed up, redirect to Signup screen");
                if (shouldCreateUiSessions())
                {
                    applicationperformancemetricslogging.startUiStartupSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger.touchGesture, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.signupPrompt, Long.valueOf(mStarted), display);
                }
                startNextActivity(SignupActivity.createStartIntent(this, getIntent()));
            } else
            {
                Log.d("LaunchActivity", "User is NOT logged in, redirect to Login screen");
                if (shouldCreateUiSessions())
                {
                    applicationperformancemetricslogging.startUiStartupSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger.touchGesture, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.login, Long.valueOf(mStarted), display);
                }
                startNextActivity(LoginActivity.createStartIntent(this));
            }
            if (shouldCreateUiSessions())
            {
                applicationperformancemetricslogging.startUiBrowseStartupSession(mStarted);
            }
            finish();
            return;
        }
        com.netflix.mediaclient.protocol.nflx.NflxHandler.Response response = null;
        if (servicemanager.getCurrentProfile() != null)
        {
            response = canHandleIntent();
        }
        if (response != null && response == com.netflix.mediaclient.protocol.nflx.NflxHandler.Response.HANDLING)
        {
            Log.d("LaunchActivity", "Handled by nflx workflow");
            finish();
            return;
        }
        if (response != null && response == com.netflix.mediaclient.protocol.nflx.NflxHandler.Response.HANDLING_WITH_DELAY)
        {
            Log.d("LaunchActivity", "Handled by nflx workflow with delay. Stay on splash screen...");
            return;
        }
        if (servicemanager.getCurrentProfile() == null)
        {
            if (shouldCreateUiSessions())
            {
                applicationperformancemetricslogging.startUiStartupSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger.touchGesture, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.profilesGate, Long.valueOf(mStarted), display);
                applicationperformancemetricslogging.startUiBrowseStartupSession(mStarted);
            }
            startNextActivity(ProfileSelectionActivity.createStartIntent(this));
            finish();
            return;
        }
        Log.d("LaunchActivity", String.format("Redirect to home with profile %s, %s", new Object[] {
            servicemanager.getCurrentProfile().getProfileName(), servicemanager.getCurrentProfile().getProfileId()
        }));
        startNextActivity(HomeActivity.createStartIntent(this));
        if (shouldCreateUiSessions())
        {
            applicationperformancemetricslogging.startUiStartupSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger.touchGesture, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.homeScreen, Long.valueOf(mStarted), display);
            applicationperformancemetricslogging.startUiBrowseStartupSession(mStarted);
        }
        finish();
    }

    private void manipulateSplashBackground()
    {
        final ImageView bg = (ImageView)findViewById(0x7f07019e);
        final ImageView logo = (ImageView)findViewById(0x7f0700d4);
        final ProgressBar progress = (ProgressBar)findViewById(0x7f0700d5);
        bg.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final LaunchActivity this$0;
            final ImageView val$bg;
            final ImageView val$logo;
            final ProgressBar val$progress;

            public void onGlobalLayout()
            {
                if (bg.getWidth() <= 0)
                {
                    return;
                }
                Log.v("LaunchActivity", (new StringBuilder()).append("Manipulating splash bg, scale factor: ").append(2).toString());
                android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)bg.getLayoutParams();
                layoutparams.width = bg.getWidth() * 2;
                layoutparams.height = bg.getHeight() * 2;
                bg.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                layoutparams = (android.widget.RelativeLayout.LayoutParams)logo.getLayoutParams();
                layoutparams.topMargin = layoutparams.topMargin * 2;
                if (DeviceUtils.isLandscape(LaunchActivity.this))
                {
                    android.widget.RelativeLayout.LayoutParams layoutparams1 = (android.widget.RelativeLayout.LayoutParams)progress.getLayoutParams();
                    layoutparams1.topMargin = layoutparams1.topMargin * 2;
                }
                ViewUtils.removeGlobalLayoutListener(bg, this);
            }

            
            {
                this$0 = LaunchActivity.this;
                bg = imageview;
                logo = imageview1;
                progress = progressbar;
                super();
            }
        });
    }

    private void registerNflxReceiver()
    {
        Log.d("LaunchActivity", "Register receiver");
        IntentFilter intentfilter = new IntentFilter("com.netflix.mediaclient.intent.action.NFLX_HANDLER_RESULT");
        intentfilter.addCategory("LocalIntentNflxUi");
        intentfilter.setPriority(999);
        try
        {
            LocalBroadcastManager.getInstance(this).registerReceiver(nflxBroadcastReceiver, intentfilter);
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("LaunchActivity", "Failed to register ", throwable);
        }
    }

    private void startNextActivity(Intent intent)
    {
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    private void unregisterNflxReceiver()
    {
        Log.d("LaunchActivity", "Unregistering Nflx receiver");
        try
        {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(nflxBroadcastReceiver);
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("LaunchActivity", "Failed to unregister ", throwable);
        }
    }

    protected ManagerStatusListener createManagerStatusListener()
    {
        return new ManagerStatusListener() {

            final LaunchActivity this$0;

            public void onManagerReady(ServiceManager servicemanager, int i)
            {
                isLoading = false;
                if (ServiceErrorsHandler.handleManagerResponse(LaunchActivity.this, i))
                {
                    return;
                } else
                {
                    handleManagerReady(servicemanager);
                    return;
                }
            }

            public void onManagerUnavailable(ServiceManager servicemanager, int i)
            {
                isLoading = false;
                ServiceErrorsHandler.handleManagerResponse(LaunchActivity.this, i);
            }

            
            {
                this$0 = LaunchActivity.this;
                super();
            }
        };
    }

    public void finish()
    {
        super.finish();
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        return null;
    }

    public boolean isLoadingData()
    {
        return isLoading;
    }

    protected void onCreate(Bundle bundle)
    {
        mStarted = System.currentTimeMillis();
        super.onCreate(bundle);
        if (Log.isLoggable("LaunchActivity", 3))
        {
            AndroidUtils.logIntent("LaunchActivity", getIntent());
            Log.d("LaunchActivity", (new StringBuilder()).append("Time: ").append(System.nanoTime()).toString());
        }
        bundle = getActionBar();
        if (bundle != null)
        {
            bundle.hide();
        }
        registerNflxReceiver();
        if (getNetflixApplication().isReady())
        {
            Log.d("LaunchActivity", "Service is ready, just use loading view...");
            setContentView(new LoadingView(this));
            return;
        } else
        {
            Log.d("LaunchActivity", "Service is NOT ready, use splash screen...");
            mSplashScreenStarted = System.currentTimeMillis();
            createContentView();
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        unregisterNflxReceiver();
    }

    protected void onNewIntent(Intent intent)
    {
        Log.d("LaunchActivity", "Received new intent:");
        AndroidUtils.logIntent("LaunchActivity", intent);
        super.onNewIntent(intent);
    }

    protected boolean shouldCreateUiSessions()
    {
        return true;
    }

    protected boolean shouldFinishOnManagerError()
    {
        return false;
    }

    protected boolean showMdxInMenu()
    {
        return false;
    }



/*
    static boolean access$002(LaunchActivity launchactivity, boolean flag)
    {
        launchactivity.isLoading = flag;
        return flag;
    }

*/

}
