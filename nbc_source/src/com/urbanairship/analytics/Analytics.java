// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.util.UAStringUtil;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.urbanairship.analytics:
//            ActivityMonitor, LifeCycleCallbacks, ActivityStartedEvent, ActivityStoppedEvent, 
//            Event, AppBackgroundEvent, AppForegroundEvent, EventService

public class Analytics
{

    public static final String ACTION_APP_BACKGROUND = (new StringBuilder()).append(UAirship.getPackageName()).append(".urbanairship.analytics.APP_BACKGROUND").toString();
    public static final String ACTION_APP_FOREGROUND = (new StringBuilder()).append(UAirship.getPackageName()).append(".urbanairship.analytics.APP_FOREGROUND").toString();
    private final ActivityMonitor activityMonitor;
    private boolean analyticsEnabled;
    private BroadcastReceiver appStateChangeReceiver = new BroadcastReceiver() {

        final Analytics this$0;

        public void onReceive(Context context, Intent intent)
        {
            Logger.verbose(intent.getAction());
            if (Analytics.ACTION_APP_BACKGROUND.equals(intent.getAction()))
            {
                inBackground = true;
            } else
            if (Analytics.ACTION_APP_FOREGROUND.equals(intent.getAction()))
            {
                inBackground = false;
                return;
            }
        }

            
            {
                this$0 = Analytics.this;
                super();
            }
    };
    private String conversionPushId;
    Executor executor;
    private boolean inBackground;
    private int minSdkVersion;
    private String sessionId;
    private boolean stickyBroadcastAllowed;
    private boolean useLifeCycleCallbacks;

    public Analytics(Application application)
    {
        this(application, null);
    }

    Analytics(Application application, ActivityMonitor activitymonitor)
    {
        executor = Executors.newSingleThreadExecutor();
        stickyBroadcastAllowed = false;
        useLifeCycleCallbacks = false;
        minSdkVersion = UAirship.shared().getAirshipConfigOptions().minSdkVersion;
        analyticsEnabled = UAirship.shared().getAirshipConfigOptions().analyticsEnabled;
        inBackground = true;
        String s = UAirship.shared().getAirshipConfigOptions().analyticsServer;
        if (analyticsEnabled && UAStringUtil.isEmpty(s))
        {
            Logger.error("Unable to send analytics to an empty server. Disabling analytics.");
            analyticsEnabled = false;
        }
        generateNewSessionId();
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            registerLifeCycleCallbacks(application);
            useLifeCycleCallbacks = true;
        }
        if (activitymonitor == null)
        {
            activityMonitor = new ActivityMonitor(minSdkVersion, android.os.Build.VERSION.SDK_INT, analyticsEnabled);
        } else
        {
            activityMonitor = activitymonitor;
        }
        activityMonitor.setListener(new ActivityMonitor.Listener() {

            final Analytics this$0;

            public void onBackground()
            {
                inBackground = true;
                addEvent(new AppBackgroundEvent());
                sendBackgroundBroadcast();
                conversionPushId = null;
            }

            public void onForeground()
            {
                generateNewSessionId();
                inBackground = false;
                sendForegroundBroadcast();
                addEvent(new AppForegroundEvent());
            }

            
            {
                this$0 = Analytics.this;
                super();
            }
        });
        registerBroadcastReceiver();
    }

    private void generateNewSessionId()
    {
        sessionId = UUID.randomUUID().toString();
        Logger.verbose((new StringBuilder()).append("New session: ").append(sessionId).toString());
    }

    private void registerBroadcastReceiver()
    {
        if (UAirship.getPackageManager().checkPermission("android.permission.BROADCAST_STICKY", UAirship.getPackageName()) == 0)
        {
            stickyBroadcastAllowed = true;
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(ACTION_APP_BACKGROUND);
        intentfilter.addAction(ACTION_APP_FOREGROUND);
        intentfilter.addCategory(UAirship.getPackageName());
        UAirship.shared().getApplicationContext().registerReceiver(appStateChangeReceiver, intentfilter);
    }

    private void registerLifeCycleCallbacks(Application application)
    {
        LifeCycleCallbacks.registerCallback(application, new LifeCycleCallbacks.Callback() {

            final Analytics this$0;

            public void onStart(Activity activity)
            {
                addEvent(new ActivityStartedEvent(activity));
                activityMonitor.activityStarted(activity, ActivityMonitor.Source.AUTO_INSTRUMENTATION);
            }

            public void onStop(Activity activity)
            {
                addEvent(new ActivityStoppedEvent(activity));
                activityMonitor.activityStopped(activity, ActivityMonitor.Source.AUTO_INSTRUMENTATION);
            }

            
            {
                this$0 = Analytics.this;
                super();
            }
        });
    }

    private void sendBackgroundBroadcast()
    {
        Intent intent = new Intent(ACTION_APP_BACKGROUND);
        intent.addCategory(UAirship.getPackageName());
        if (stickyBroadcastAllowed)
        {
            UAirship.shared().getApplicationContext().sendStickyBroadcast(intent);
            return;
        } else
        {
            UAirship.shared().getApplicationContext().sendBroadcast(intent);
            return;
        }
    }

    private void sendForegroundBroadcast()
    {
        Intent intent = new Intent(ACTION_APP_FOREGROUND);
        intent.addCategory(UAirship.getPackageName());
        if (stickyBroadcastAllowed)
        {
            UAirship.shared().getApplicationContext().sendStickyBroadcast(intent);
            return;
        } else
        {
            UAirship.shared().getApplicationContext().sendBroadcast(intent);
            return;
        }
    }

    public void activityStarted(Activity activity)
    {
        if (useLifeCycleCallbacks) goto _L2; else goto _L1
_L1:
        addEvent(new ActivityStartedEvent(activity));
_L4:
        activityMonitor.activityStarted(activity, ActivityMonitor.Source.MANUAL_INSTRUMENTATION);
        return;
_L2:
        if (minSdkVersion >= 14 && analyticsEnabled)
        {
            Logger.warn("activityStarted call is no longer necessary starting with SDK 14 - ICE CREAM SANDWICH. Analytics is auto-instrumented for you.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void activityStopped(Activity activity)
    {
        if (useLifeCycleCallbacks) goto _L2; else goto _L1
_L1:
        addEvent(new ActivityStoppedEvent(activity));
_L4:
        activityMonitor.activityStopped(activity, ActivityMonitor.Source.MANUAL_INSTRUMENTATION);
        return;
_L2:
        if (minSdkVersion >= 14 && analyticsEnabled)
        {
            Logger.warn("activityStopped call is no longer necessary starting with SDK 14 - ICE CREAM SANDWICH. Analytics is auto-instrumented for you.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void addEvent(final Event event)
    {
        if (analyticsEnabled && event != null)
        {
            executor.execute(new Runnable() {

                final Analytics this$0;
                final Event val$event;

                public void run()
                {
                    Logger.verbose((new StringBuilder()).append("Adding event: ").append(event).toString());
                    EventService.sendAddEventIntent(event);
                }

            
            {
                this$0 = Analytics.this;
                event = event1;
                super();
            }
            });
        }
    }

    public String getConversionPushId()
    {
        return conversionPushId;
    }

    String getSessionId()
    {
        return sessionId;
    }

    public boolean isAppInForeground()
    {
        return !inBackground;
    }

    public void setConversionPushId(String s)
    {
        Logger.debug((new StringBuilder()).append("Setting push conversion id: ").append(s).toString());
        conversionPushId = s;
    }




/*
    static boolean access$102(Analytics analytics, boolean flag)
    {
        analytics.inBackground = flag;
        return flag;
    }

*/




/*
    static String access$402(Analytics analytics, String s)
    {
        analytics.conversionPushId = s;
        return s;
    }

*/

}
