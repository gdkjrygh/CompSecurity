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
import android.location.Location;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.PreferenceDataStore;
import com.urbanairship.UAirship;
import com.urbanairship.location.LocationRequestOptions;
import com.urbanairship.util.UAStringUtil;
import java.util.UUID;

// Referenced classes of package com.urbanairship.analytics:
//            ActivityMonitor, AnalyticsPreferences, EventDataManager, LifeCycleCallbacks, 
//            EventService, LocationEvent, Event, AppBackgroundEvent, 
//            AppForegroundEvent

public class Analytics
{

    public static final String ACTION_APP_BACKGROUND = (new StringBuilder()).append(UAirship.getPackageName()).append(".urbanairship.analytics.APP_BACKGROUND").toString();
    public static final String ACTION_APP_FOREGROUND = (new StringBuilder()).append(UAirship.getPackageName()).append(".urbanairship.analytics.APP_FOREGROUND").toString();
    private static LifeCycleCallbacks lifeCycleCallbacks;
    private final ActivityMonitor activityMonitor;
    private boolean analyticsEnabled;
    private BroadcastReceiver appStateChangeReceiver = new BroadcastReceiver() {

        final Analytics this$0;

        public void onReceive(Context context2, Intent intent)
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
    private Context context;
    private String conversionSendId;
    private final EventDataManager dataManager;
    private boolean inBackground;
    private int minSdkVersion;
    private final AnalyticsPreferences preferences;
    private String sessionId;
    private boolean stickyBroadcastAllowed;

    public Analytics(Context context1, PreferenceDataStore preferencedatastore, AirshipConfigOptions airshipconfigoptions)
    {
        this(context1, preferencedatastore, airshipconfigoptions, new ActivityMonitor(airshipconfigoptions.minSdkVersion, android.os.Build.VERSION.SDK_INT, airshipconfigoptions.analyticsEnabled));
    }

    Analytics(Context context1, PreferenceDataStore preferencedatastore, AirshipConfigOptions airshipconfigoptions, ActivityMonitor activitymonitor)
    {
        stickyBroadcastAllowed = false;
        preferences = new AnalyticsPreferences(preferencedatastore);
        context = context1.getApplicationContext();
        dataManager = new EventDataManager();
        minSdkVersion = airshipconfigoptions.minSdkVersion;
        inBackground = true;
        analyticsEnabled = airshipconfigoptions.analyticsEnabled;
        preferencedatastore = airshipconfigoptions.analyticsServer;
        if (analyticsEnabled && UAStringUtil.isEmpty(preferencedatastore))
        {
            Logger.error("Unable to send analytics to an empty server. Disabling analytics.");
            analyticsEnabled = false;
        }
        generateNewSessionId();
        activityMonitor = activitymonitor;
        activityMonitor.setListener(new ActivityMonitor.Listener() {

            final Analytics this$0;

            public void onBackground(long l)
            {
                inBackground = true;
                addEvent(new AppBackgroundEvent(l));
                sendBackgroundBroadcast();
                conversionSendId = null;
            }

            public void onForeground(long l)
            {
                generateNewSessionId();
                inBackground = false;
                sendForegroundBroadcast();
                addEvent(new AppForegroundEvent(l));
            }

            
            {
                this$0 = Analytics.this;
                super();
            }
        });
        registerBroadcastReceiver(context1);
    }

    public static void activityStarted(Activity activity)
    {
        UAirship.shared(new com.urbanairship.UAirship.OnReadyCallback(activity, System.currentTimeMillis()) {

            final Activity val$activity;
            final long val$timeMS;

            public void onAirshipReady(UAirship uairship)
            {
                uairship.getAnalytics().reportActivityStarted(activity, ActivityMonitor.Source.MANUAL_INSTRUMENTATION, timeMS);
            }

            
            {
                activity = activity1;
                timeMS = l;
                super();
            }
        });
    }

    public static void activityStopped(Activity activity)
    {
        UAirship.shared(new com.urbanairship.UAirship.OnReadyCallback(activity, System.currentTimeMillis()) {

            final Activity val$activity;
            final long val$timeMS;

            public void onAirshipReady(UAirship uairship)
            {
                uairship.getAnalytics().reportActivityStopped(activity, ActivityMonitor.Source.MANUAL_INSTRUMENTATION, timeMS);
            }

            
            {
                activity = activity1;
                timeMS = l;
                super();
            }
        });
    }

    private void generateNewSessionId()
    {
        sessionId = UUID.randomUUID().toString();
        Logger.verbose((new StringBuilder()).append("New session: ").append(sessionId).toString());
    }

    private void registerBroadcastReceiver(Context context1)
    {
        if (UAirship.getPackageManager().checkPermission("android.permission.BROADCAST_STICKY", UAirship.getPackageName()) == 0)
        {
            stickyBroadcastAllowed = true;
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(ACTION_APP_BACKGROUND);
        intentfilter.addAction(ACTION_APP_FOREGROUND);
        intentfilter.addCategory(UAirship.getPackageName());
        context1.registerReceiver(appStateChangeReceiver, intentfilter);
    }

    public static void registerLifeCycleCallbacks(Application application)
    {
        if (android.os.Build.VERSION.SDK_INT > 14 && lifeCycleCallbacks == null)
        {
            lifeCycleCallbacks = new LifeCycleCallbacks() {

                public void onActivityStarted(final Activity activity)
                {
                    UAirship.shared(System.currentTimeMillis(). new com.urbanairship.UAirship.OnReadyCallback() {

                        final _cls5 this$0;
                        final Activity val$activity;
                        final long val$timeStamp;

                        public void onAirshipReady(UAirship uairship)
                        {
                            uairship.getAnalytics().reportActivityStarted(activity, ActivityMonitor.Source.AUTO_INSTRUMENTATION, timeStamp);
                        }

            
            {
                this$0 = final__pcls5;
                activity = activity1;
                timeStamp = J.this;
                super();
            }
                    });
                }

                public void onActivityStopped(final Activity activity)
                {
                    UAirship.shared(System.currentTimeMillis(). new com.urbanairship.UAirship.OnReadyCallback() {

                        final _cls5 this$0;
                        final Activity val$activity;
                        final long val$timeStamp;

                        public void onAirshipReady(UAirship uairship)
                        {
                            uairship.getAnalytics().reportActivityStopped(activity, ActivityMonitor.Source.AUTO_INSTRUMENTATION, timeStamp);
                        }

            
            {
                this$0 = final__pcls5;
                activity = activity1;
                timeStamp = J.this;
                super();
            }
                    });
                }

            };
            lifeCycleCallbacks.register(application);
        }
    }

    private void reportActivityStarted(Activity activity, ActivityMonitor.Source source, long l)
    {
        if (minSdkVersion >= 14 && analyticsEnabled && ActivityMonitor.Source.MANUAL_INSTRUMENTATION == source)
        {
            Logger.warn("activityStarted call is no longer necessary starting with SDK 14 - ICE CREAM SANDWICH. Analytics is auto-instrumented for you.");
        }
        activityMonitor.activityStarted(activity, source, l);
    }

    private void reportActivityStopped(Activity activity, ActivityMonitor.Source source, long l)
    {
        if (minSdkVersion >= 14 && analyticsEnabled && ActivityMonitor.Source.MANUAL_INSTRUMENTATION == source)
        {
            Logger.warn("activityStopped call is no longer necessary starting with SDK 14 - ICE CREAM SANDWICH. Analytics is auto-instrumented for you.");
        }
        activityMonitor.activityStopped(activity, source, l);
    }

    private void sendBackgroundBroadcast()
    {
        Intent intent = new Intent(ACTION_APP_BACKGROUND);
        intent.addCategory(UAirship.getPackageName());
        if (stickyBroadcastAllowed)
        {
            context.sendStickyBroadcast(intent);
            return;
        } else
        {
            context.sendBroadcast(intent);
            return;
        }
    }

    private void sendForegroundBroadcast()
    {
        Intent intent = new Intent(ACTION_APP_FOREGROUND);
        intent.addCategory(UAirship.getPackageName());
        if (stickyBroadcastAllowed)
        {
            context.sendStickyBroadcast(intent);
            return;
        } else
        {
            context.sendBroadcast(intent);
            return;
        }
    }

    public static void unregisterLifeCycleCallbacks(Application application)
    {
        if (android.os.Build.VERSION.SDK_INT > 14 && lifeCycleCallbacks != null)
        {
            lifeCycleCallbacks.unregister(application);
        }
    }

    public void addEvent(Event event)
    {
        if (analyticsEnabled && event != null)
        {
            Logger.verbose((new StringBuilder()).append("Adding event: ").append(event).toString());
            EventService.sendAddEventIntent(event);
        }
    }

    public String getConversionSendId()
    {
        return conversionSendId;
    }

    EventDataManager getDataManager()
    {
        return dataManager;
    }

    AnalyticsPreferences getPreferences()
    {
        return preferences;
    }

    String getSessionId()
    {
        return sessionId;
    }

    public boolean isAppInForeground()
    {
        return !inBackground;
    }

    public void recordLocation(Location location)
    {
        recordLocation(location, null, LocationEvent.UpdateType.SINGLE);
    }

    public void recordLocation(Location location, LocationRequestOptions locationrequestoptions, LocationEvent.UpdateType updatetype)
    {
        byte byte0;
        int i;
        if (locationrequestoptions == null)
        {
            byte0 = -1;
            i = -1;
        } else
        {
            i = (int)locationrequestoptions.getMinDistance();
            if (locationrequestoptions.getPriority() == 1)
            {
                byte0 = 1;
            } else
            {
                byte0 = 2;
            }
        }
        addEvent(new LocationEvent(location, updatetype, byte0, i));
    }

    public void setConversionSendId(String s)
    {
        Logger.debug((new StringBuilder()).append("Setting conversion send id: ").append(s).toString());
        conversionSendId = s;
    }



/*
    static boolean access$002(Analytics analytics, boolean flag)
    {
        analytics.inBackground = flag;
        return flag;
    }

*/





/*
    static String access$402(Analytics analytics, String s)
    {
        analytics.conversionSendId = s;
        return s;
    }

*/


}
