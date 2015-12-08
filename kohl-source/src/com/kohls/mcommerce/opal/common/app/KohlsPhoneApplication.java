// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.support.multidex.MultiDex;
import com.analytics.AnalyticsMain;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.crashlytics.android.Crashlytics;
import com.kohls.mcommerce.opal.common.ui.toast.KohlsToast;
import com.kohls.mcommerce.opal.common.util.AnalyticsUtil;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import com.worklight.common.WLConfig;
import com.worklight.wlclient.api.WLClient;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import java.io.IOException;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.kohls.mcommerce.opal.common.app:
//            KohlsActivityLifecycleCallbacks

public class KohlsPhoneApplication extends Application
{

    private static KohlsPhoneApplication mInstance;
    private final long ACT_TRANSISTION_TIME = 2000L;
    private final int INDEX_HPROF = 0;
    private final String TAG = com/kohls/mcommerce/opal/common/app/KohlsPhoneApplication.getSimpleName();
    Timer appBackgroundTimer;
    TimerTask appBackgroundTimerTask;
    private ConfigurationUtils configurationUtils;
    private boolean enableAnalyticsCalls;
    private boolean isAppBackground;
    private boolean isAppGoingToBackground;
    private KohlsActivityLifecycleCallbacks kohlsActivityLifecycleCallbacks;
    private Activity mActivity;
    private AuthUtil mAuthenticationUtils;
    private WLClient mClient;
    private boolean mIsClientConnect;
    private AnalyticsMain mKohlsAnalytics;
    private PreferenceHelper mKohlsPref;
    private KohlsToast mKohlsToast;
    private RequestQueue mRequestQueue;

    public KohlsPhoneApplication()
    {
        configurationUtils = null;
    }

    private void checkAndRefreshWLVersion()
    {
        String s = WLConfig.getInstance().readWLPref("wlAppVersion");
        Object obj = new Properties();
        try
        {
            ((Properties) (obj)).load(getAssets().open("wlclient.properties"));
            obj = ((Properties) (obj)).getProperty("wlAppVersion");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("WLConfig(): Can't load wlclient.properties file");
        }
        if (s != null && obj != null && s.length() > 0 && !s.equalsIgnoreCase(((String) (obj))))
        {
            WLConfig.getInstance().writeWLPref("wlAppVersion", null);
        }
    }

    private void checkAppVersion()
    {
        try
        {
            Object obj = getPackageManager().getPackageInfo(getPackageName(), 0);
            String s = ((PackageInfo) (obj)).versionName;
            int i = ((PackageInfo) (obj)).versionCode;
            obj = (new StringBuilder()).append(s).append("").append(i).toString();
            if (!mKohlsPref.isAppVersionChanged().equalsIgnoreCase(((String) (obj))))
            {
                mKohlsPref.setAppVersionFlag(getApplicationContext());
                mKohlsPref.clearApptentiveAndForsee();
            }
            return;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception.printStackTrace();
        }
    }

    public static Context getContext()
    {
        return mInstance.getApplicationContext();
    }

    public static KohlsPhoneApplication getInstance()
    {
        return mInstance;
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    public AnalyticsMain getAnalytics()
    {
        if (mKohlsAnalytics == null)
        {
            mKohlsAnalytics = AnalyticsUtil.initializeAnalytics();
        }
        return mKohlsAnalytics;
    }

    public AuthUtil getAuthenticationUtils()
    {
        return mAuthenticationUtils;
    }

    public ConfigurationUtils getConfigurationUtils()
    {
        return configurationUtils;
    }

    public Activity getCurrentActivity()
    {
        return mActivity;
    }

    public KohlsActivityLifecycleCallbacks getKohlsActivityLifecycleCallbacks()
    {
        return kohlsActivityLifecycleCallbacks;
    }

    public PreferenceHelper getKohlsPref()
    {
        return mKohlsPref;
    }

    public KohlsToast getKohlsToast()
    {
        if (mKohlsToast == null)
        {
            mKohlsToast = new KohlsToast(getContext());
        }
        return mKohlsToast;
    }

    public RequestQueue getRequestQueue()
    {
        if (mRequestQueue == null)
        {
            mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return mRequestQueue;
    }

    public WLClient getWLClient()
    {
        if (mClient == null)
        {
            mClient = WLClient.createInstance(getContext());
            checkAndRefreshWLVersion();
        }
        return mClient;
    }

    public void initOmniture(boolean flag)
    {
    }

    public boolean isAppBackground()
    {
        return isAppBackground;
    }

    public boolean isAppGoingToBackground()
    {
        return isAppGoingToBackground;
    }

    public boolean isClientConnect()
    {
        return mIsClientConnect;
    }

    public boolean isEnableAnalyticsCalls()
    {
        return enableAnalyticsCalls;
    }

    public void onCreate()
    {
        super.onCreate();
        mInstance = this;
        kohlsActivityLifecycleCallbacks = new KohlsActivityLifecycleCallbacks();
        registerActivityLifecycleCallbacks(kohlsActivityLifecycleCallbacks);
        Fabric.with(getApplicationContext(), new Kit[] {
            new Crashlytics()
        });
        mKohlsPref = new PreferenceHelper(mInstance);
        setAuthenticationUtils();
        mIsClientConnect = false;
        configurationUtils = new ConfigurationUtils();
        checkAppVersion();
        isAppBackground = true;
        getAnalytics();
    }

    public void onLowMemory()
    {
        System.gc();
        super.onLowMemory();
    }

    public void onTerminate()
    {
        super.onTerminate();
    }

    public void setApplicationBackground()
    {
        appBackgroundTimer = new Timer();
        isAppGoingToBackground = true;
        appBackgroundTimerTask = new TimerTask() {

            final KohlsPhoneApplication this$0;

            public void run()
            {
                isAppBackground = true;
            }

            
            {
                this$0 = KohlsPhoneApplication.this;
                super();
            }
        };
        appBackgroundTimer.schedule(appBackgroundTimerTask, 2000L);
    }

    public void setApplicationForeground()
    {
        if (appBackgroundTimerTask != null)
        {
            appBackgroundTimerTask.cancel();
        }
        if (appBackgroundTimer != null)
        {
            appBackgroundTimer.cancel();
        }
        isAppBackground = false;
        isAppGoingToBackground = false;
    }

    public void setAuthenticationUtils()
    {
        mAuthenticationUtils = AuthUtil.getInstance(getContext());
        if (mAuthenticationUtils.isUserSignedIn())
        {
            mAuthenticationUtils.startSigninTimer();
        }
    }

    public void setClientConnect(boolean flag)
    {
        mIsClientConnect = flag;
    }

    public void setCurrentActivity(Activity activity)
    {
        mActivity = activity;
    }

    public void setEnableAnalytics(boolean flag)
    {
        enableAnalyticsCalls = flag;
    }

    public void setWLClient(WLClient wlclient)
    {
        mClient = wlclient;
    }


/*
    static boolean access$002(KohlsPhoneApplication kohlsphoneapplication, boolean flag)
    {
        kohlsphoneapplication.isAppBackground = flag;
        return flag;
    }

*/
}
