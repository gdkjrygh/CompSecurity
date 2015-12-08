// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.analytics.tracking.android:
//            ParameterLoader, Log, GoogleAnalytics, Tracker, 
//            ServiceManager, ExceptionReporter, Clock, GAServiceManager, 
//            ParameterLoaderImpl, ExceptionParser, Transaction

public class EasyTracker
{
    class NoopTracker extends Tracker
    {

        private String mAppId;
        private String mAppInstallerId;
        private ExceptionParser mExceptionParser;
        private boolean mIsAnonymizeIp;
        private boolean mIsUseSecure;
        private double mSampleRate;
        final EasyTracker this$0;

        public void close()
        {
        }

        public Map constructEvent(String s, String s1, String s2, Long long1)
        {
            return new HashMap();
        }

        public Map constructException(String s, boolean flag)
        {
            return new HashMap();
        }

        public Map constructRawException(String s, Throwable throwable, boolean flag)
        {
            return new HashMap();
        }

        public Map constructSocial(String s, String s1, String s2)
        {
            return new HashMap();
        }

        public Map constructTiming(String s, long l, String s1, String s2)
        {
            return new HashMap();
        }

        public Map constructTransaction(Transaction transaction)
        {
            return new HashMap();
        }

        public String get(String s)
        {
            return "";
        }

        public String getAppId()
        {
            return mAppId;
        }

        public String getAppInstallerId()
        {
            return mAppInstallerId;
        }

        public ExceptionParser getExceptionParser()
        {
            return mExceptionParser;
        }

        public double getSampleRate()
        {
            return mSampleRate;
        }

        public String getTrackingId()
        {
            return "";
        }

        public boolean isAnonymizeIpEnabled()
        {
            return mIsAnonymizeIp;
        }

        public boolean isUseSecure()
        {
            return mIsUseSecure;
        }

        public void send(String s, Map map)
        {
        }

        public void sendEvent(String s, String s1, String s2, Long long1)
        {
        }

        public void sendException(String s, Throwable throwable, boolean flag)
        {
        }

        public void sendException(String s, boolean flag)
        {
        }

        public void sendSocial(String s, String s1, String s2)
        {
        }

        public void sendTiming(String s, long l, String s1, String s2)
        {
        }

        public void sendTransaction(Transaction transaction)
        {
        }

        public void sendView()
        {
        }

        public void sendView(String s)
        {
        }

        public void set(String s, String s1)
        {
        }

        public void setAnonymizeIp(boolean flag)
        {
            mIsAnonymizeIp = flag;
        }

        public void setAppId(String s)
        {
            mAppId = s;
        }

        public void setAppInstallerId(String s)
        {
            mAppInstallerId = s;
        }

        public void setAppName(String s)
        {
        }

        public void setAppScreen(String s)
        {
        }

        public void setAppVersion(String s)
        {
        }

        public void setCampaign(String s)
        {
        }

        public void setCustomDimension(int i, String s)
        {
        }

        public void setCustomDimensionsAndMetrics(Map map, Map map1)
        {
        }

        public void setCustomMetric(int i, Long long1)
        {
        }

        public void setExceptionParser(ExceptionParser exceptionparser)
        {
            mExceptionParser = exceptionparser;
        }

        public void setReferrer(String s)
        {
        }

        public void setSampleRate(double d)
        {
            mSampleRate = d;
        }

        public void setStartSession(boolean flag)
        {
        }

        public void setUseSecure(boolean flag)
        {
            mIsUseSecure = flag;
        }

        NoopTracker()
        {
            this$0 = EasyTracker.this;
            super();
            mSampleRate = 100D;
        }
    }

    private class NotInForegroundTimerTask extends TimerTask
    {

        final EasyTracker this$0;

        public void run()
        {
            mIsInForeground = false;
        }

        private NotInForegroundTimerTask()
        {
            this$0 = EasyTracker.this;
            super();
        }

    }


    static final int NUM_MILLISECONDS_TO_WAIT_FOR_OPEN_ACTIVITY = 1000;
    private static EasyTracker sInstance;
    private int mActivitiesActive;
    private final Map mActivityNameMap = new HashMap();
    private GoogleAnalytics mAnalyticsInstance;
    private String mAppName;
    private String mAppVersion;
    private Clock mClock;
    private Context mContext;
    private boolean mDebug;
    private int mDispatchPeriod;
    private Thread.UncaughtExceptionHandler mExceptionHandler;
    private boolean mIsAnonymizeIpEnabled;
    private boolean mIsAutoActivityTracking;
    private boolean mIsEnabled;
    private boolean mIsInForeground;
    private boolean mIsReportUncaughtExceptionsEnabled;
    private long mLastOnStopTime;
    private ParameterLoader mParameterFetcher;
    private Double mSampleRate;
    private ServiceManager mServiceManager;
    private long mSessionTimeout;
    private Timer mTimer;
    private TimerTask mTimerTask;
    private Tracker mTracker;
    private String mTrackingId;

    private EasyTracker()
    {
        mIsEnabled = false;
        mDispatchPeriod = 1800;
        mIsAutoActivityTracking = false;
        mActivitiesActive = 0;
        mTracker = null;
        mIsInForeground = false;
        mClock = new Clock() {

            final EasyTracker this$0;

            public long currentTimeMillis()
            {
                return System.currentTimeMillis();
            }

            
            {
                this$0 = EasyTracker.this;
                super();
            }
        };
    }

    private void clearExistingTimer()
    {
        this;
        JVM INSTR monitorenter ;
        if (mTimer != null)
        {
            mTimer.cancel();
            mTimer = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void clearTracker()
    {
        sInstance = null;
    }

    private String getActivityName(Activity activity)
    {
        String s = activity.getClass().getCanonicalName();
        if (mActivityNameMap.containsKey(s))
        {
            return (String)mActivityNameMap.get(s);
        }
        String s1 = mParameterFetcher.getString(s);
        activity = s1;
        if (s1 == null)
        {
            activity = s;
        }
        mActivityNameMap.put(s, activity);
        return activity;
    }

    public static EasyTracker getInstance()
    {
        if (sInstance == null)
        {
            sInstance = new EasyTracker();
        }
        return sInstance;
    }

    public static Tracker getTracker()
    {
        if (getInstance().mContext == null)
        {
            throw new IllegalStateException("You must call EasyTracker.getInstance().setContext(context) or startActivity(activity) before calling getTracker()");
        } else
        {
            return getInstance().mTracker;
        }
    }

    private void loadParameters()
    {
        boolean flag1;
        flag1 = true;
        mTrackingId = mParameterFetcher.getString("ga_trackingId");
        if (!TextUtils.isEmpty(mTrackingId)) goto _L2; else goto _L1
_L1:
        mTrackingId = mParameterFetcher.getString("ga_api_key");
        if (!TextUtils.isEmpty(mTrackingId)) goto _L2; else goto _L3
_L3:
        Log.e("EasyTracker requested, but missing required ga_trackingId");
        mTracker = new NoopTracker();
_L5:
        return;
_L2:
        mIsEnabled = true;
        mAppName = mParameterFetcher.getString("ga_appName");
        mAppVersion = mParameterFetcher.getString("ga_appVersion");
        mDebug = mParameterFetcher.getBoolean("ga_debug");
        mSampleRate = mParameterFetcher.getDoubleFromString("ga_sampleFrequency");
        if (mSampleRate == null)
        {
            mSampleRate = new Double(mParameterFetcher.getInt("ga_sampleRate", 100));
        }
        mDispatchPeriod = mParameterFetcher.getInt("ga_dispatchPeriod", 1800);
        mSessionTimeout = mParameterFetcher.getInt("ga_sessionTimeout", 30) * 1000;
        boolean flag = flag1;
        if (!mParameterFetcher.getBoolean("ga_autoActivityTracking"))
        {
            if (mParameterFetcher.getBoolean("ga_auto_activity_tracking"))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        mIsAutoActivityTracking = flag;
        mIsAnonymizeIpEnabled = mParameterFetcher.getBoolean("ga_anonymizeIp");
        mIsReportUncaughtExceptionsEnabled = mParameterFetcher.getBoolean("ga_reportUncaughtExceptions");
        mTracker = mAnalyticsInstance.getTracker(mTrackingId);
        if (!TextUtils.isEmpty(mAppName))
        {
            Log.i((new StringBuilder()).append("setting appName to ").append(mAppName).toString());
            mTracker.setAppName(mAppName);
        }
        if (mAppVersion != null)
        {
            mTracker.setAppVersion(mAppVersion);
        }
        mTracker.setAnonymizeIp(mIsAnonymizeIpEnabled);
        mTracker.setSampleRate(mSampleRate.doubleValue());
        mAnalyticsInstance.setDebug(mDebug);
        mServiceManager.setDispatchPeriod(mDispatchPeriod);
        if (mIsReportUncaughtExceptionsEnabled)
        {
            Thread.UncaughtExceptionHandler uncaughtexceptionhandler = mExceptionHandler;
            Object obj = uncaughtexceptionhandler;
            if (uncaughtexceptionhandler == null)
            {
                obj = new ExceptionReporter(mTracker, mServiceManager, Thread.getDefaultUncaughtExceptionHandler(), mContext);
            }
            Thread.setDefaultUncaughtExceptionHandler(((Thread.UncaughtExceptionHandler) (obj)));
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void activityStart(Activity activity)
    {
        setContext(activity);
        if (mIsEnabled)
        {
            clearExistingTimer();
            if (!mIsInForeground && mActivitiesActive == 0 && checkForNewSession())
            {
                mTracker.setStartSession(true);
                if (mIsAutoActivityTracking);
            }
            mIsInForeground = true;
            mActivitiesActive = mActivitiesActive + 1;
            if (mIsAutoActivityTracking)
            {
                mTracker.sendView(getActivityName(activity));
                return;
            }
        }
    }

    public void activityStop(Activity activity)
    {
        setContext(activity);
        if (mIsEnabled)
        {
            mActivitiesActive = mActivitiesActive - 1;
            mActivitiesActive = Math.max(0, mActivitiesActive);
            mLastOnStopTime = mClock.currentTimeMillis();
            if (mActivitiesActive == 0)
            {
                clearExistingTimer();
                mTimerTask = new NotInForegroundTimerTask();
                mTimer = new Timer("waitForActivityStart");
                mTimer.schedule(mTimerTask, 1000L);
                return;
            }
        }
    }

    boolean checkForNewSession()
    {
        return mSessionTimeout == 0L || mSessionTimeout > 0L && mClock.currentTimeMillis() > mLastOnStopTime + mSessionTimeout;
    }

    public void dispatch()
    {
        if (mIsEnabled)
        {
            mServiceManager.dispatch();
        }
    }

    int getActivitiesActive()
    {
        return mActivitiesActive;
    }

    void setClock(Clock clock)
    {
        mClock = clock;
    }

    public void setContext(Context context)
    {
        if (context == null)
        {
            Log.e("Context cannot be null");
            return;
        } else
        {
            GAServiceManager gaservicemanager = GAServiceManager.getInstance();
            setContext(context, ((ParameterLoader) (new ParameterLoaderImpl(context.getApplicationContext()))), GoogleAnalytics.getInstance(context.getApplicationContext()), ((ServiceManager) (gaservicemanager)));
            return;
        }
    }

    void setContext(Context context, ParameterLoader parameterloader, GoogleAnalytics googleanalytics, ServiceManager servicemanager)
    {
        if (context == null)
        {
            Log.e("Context cannot be null");
        }
        if (mContext == null)
        {
            mContext = context.getApplicationContext();
            mAnalyticsInstance = googleanalytics;
            mServiceManager = servicemanager;
            mParameterFetcher = parameterloader;
            loadParameters();
        }
    }

    void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        mExceptionHandler = uncaughtexceptionhandler;
    }


/*
    static boolean access$102(EasyTracker easytracker, boolean flag)
    {
        easytracker.mIsInForeground = flag;
        return flag;
    }

*/
}
