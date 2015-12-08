// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.app.AlarmManager;
import android.app.Application;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Autopilot;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import java.util.Map;

// Referenced classes of package com.urbanairship.analytics:
//            EventAPIClient, Analytics, EventDataManager, AnalyticsPreferences, 
//            Event, EventResponse

public class EventService extends IntentService
{

    public static final String ACTION_ADD = "com.urbanairship.analytics.ADD";
    public static final String ACTION_SEND = "com.urbanairship.analytics.SEND";
    public static final String EVENT_CONTENT_VALUES_EXTRA = "com.urbanairship.analytics.CONTENT_VALUES_EXTRA";
    public static final String EVENT_TYPE_EXTRA = "com.urbanairship.analytics.TYPE_EXTRA";
    private static long backoffMs = 0L;
    private EventAPIClient eventClient;

    public EventService()
    {
        this("EventService");
    }

    public EventService(String s)
    {
        this(s, new EventAPIClient());
    }

    EventService(String s, EventAPIClient eventapiclient)
    {
        super(s);
        eventClient = eventapiclient;
    }

    private void addEventFromIntent(Intent intent)
    {
        AnalyticsPreferences analyticspreferences = UAirship.shared().getAnalytics().getPreferences();
        EventDataManager eventdatamanager = UAirship.shared().getAnalytics().getDataManager();
        String s = intent.getStringExtra("com.urbanairship.analytics.TYPE_EXTRA");
        intent = (ContentValues)intent.getParcelableExtra("com.urbanairship.analytics.CONTENT_VALUES_EXTRA");
        if (s == null || intent == null)
        {
            Logger.warn("Event service unable to add event without the event type or values defined.");
        } else
        {
            if (eventdatamanager.getDatabaseSize() > analyticspreferences.getMaxTotalDbSize())
            {
                Logger.info("Event database size exceeded. Deleting oldest session.");
                String s1 = eventdatamanager.getOldestSessionId();
                if (s1 != null && s1.length() > 0)
                {
                    eventdatamanager.deleteSession(s1);
                }
            }
            if (eventdatamanager.insertEvent(intent) <= 0L)
            {
                Logger.error("Unable to insert event into database.");
            }
            if ("location".equals(s))
            {
                long l = System.currentTimeMillis() - analyticspreferences.getLastSendTime();
                long l1 = UAirship.shared().getAirshipConfigOptions().backgroundReportingIntervalMS;
                if (!UAirship.shared().getAnalytics().isAppInForeground() && l < l1)
                {
                    Logger.info((new StringBuilder()).append("LocationEvent was inserted, but may not be updated until ").append(l1 - l).append(" ms have passed").toString());
                    return;
                }
            }
        }
    }

    private long getNextSendTime()
    {
        AnalyticsPreferences analyticspreferences = UAirship.shared().getAnalytics().getPreferences();
        return analyticspreferences.getLastSendTime() + (long)analyticspreferences.getMinBatchInterval() + backoffMs;
    }

    private void scheduleEventUpload(long l)
    {
        Context context = UAirship.getApplicationContext();
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        Intent intent = new Intent(context, com/urbanairship/analytics/EventService);
        intent.setAction("com.urbanairship.analytics.SEND");
        alarmmanager.set(1, l, PendingIntent.getService(context, 0, intent, 0x8000000));
    }

    public static void sendAddEventIntent(Event event)
    {
        Context context = UAirship.getApplicationContext();
        Intent intent = new Intent("com.urbanairship.analytics.ADD");
        intent.setClass(context, com/urbanairship/analytics/EventService);
        intent.putExtra("com.urbanairship.analytics.TYPE_EXTRA", event.getType());
        intent.putExtra("com.urbanairship.analytics.CONTENT_VALUES_EXTRA", event.getContentValues());
        if (context.startService(intent) == null)
        {
            Logger.error("Unable to start analytics service. Check that the event service is added to the manifest.");
        }
    }

    private void uploadEvents()
    {
        AnalyticsPreferences analyticspreferences = UAirship.shared().getAnalytics().getPreferences();
        EventDataManager eventdatamanager = UAirship.shared().getAnalytics().getDataManager();
        analyticspreferences.setLastSendTime(System.currentTimeMillis());
        int j = eventdatamanager.getEventCount();
        if (j <= 0)
        {
            Logger.debug("No events to send. Ending analytics upload.");
        } else
        {
            int i = eventdatamanager.getDatabaseSize() / j;
            Map map = eventdatamanager.getEvents(analyticspreferences.getMaxBatchSize() / i);
            EventResponse eventresponse = eventClient.sendEvents(map.values());
            boolean flag;
            if (eventresponse != null && eventresponse.getStatus() == 200)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                eventdatamanager.deleteEvents(map.keySet());
                backoffMs = 0L;
            } else
            if (backoffMs == 0L)
            {
                backoffMs = analyticspreferences.getMinBatchInterval();
            } else
            {
                backoffMs = Math.min(backoffMs * 2L, analyticspreferences.getMaxWait());
            }
            if (!flag || j - map.size() > 0)
            {
                Logger.verbose("Scheduling next event batch upload.");
                scheduleEventUpload(getNextSendTime());
            }
            if (eventresponse != null)
            {
                Logger.info((new StringBuilder()).append("Warp 9 response: ").append(eventresponse.getStatus()).toString());
                analyticspreferences.setMaxTotalDbSize(eventresponse.getMaxTotalSize().intValue());
                analyticspreferences.setMaxBatchSize(eventresponse.getMaxBatchSize().intValue());
                analyticspreferences.setMaxWait(eventresponse.getMaxWait().intValue());
                analyticspreferences.setMinBatchInterval(eventresponse.getMinBatchInterval().intValue());
                return;
            }
        }
    }

    public void onCreate()
    {
        super.onCreate();
        Autopilot.automaticTakeOff((Application)getApplicationContext());
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        if ("com.urbanairship.analytics.ADD".equals(intent.getAction()))
        {
            addEventFromIntent(intent);
        }
        if (getNextSendTime() > System.currentTimeMillis())
        {
            scheduleEventUpload(getNextSendTime());
            return;
        } else
        {
            uploadEvents();
            return;
        }
    }

}
