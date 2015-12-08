// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.notifications;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.accuweather.android.utilities.PreferenceUtils;

// Referenced classes of package com.accuweather.android.notifications:
//            NotificationService

public class NotificationServiceBootstrapper
{

    private static int mNotificationIntervalInMinutes = 0;

    public NotificationServiceBootstrapper()
    {
    }

    public static void bootstrap(Context context)
    {
        if (PreferenceUtils.get(context, "quick_setup_completed", false) && NotificationService.isNotificationEnabled(context))
        {
            updateAlarmManager(context);
            context.startService(new Intent(context, com/accuweather/android/notifications/NotificationService));
        }
    }

    private static PendingIntent getAlarmPendingIntent(Context context)
    {
        return PendingIntent.getBroadcast(context, 0, new Intent("accuwx.intent.action.UPDATE_NOTIFICATION"), 0x8000000);
    }

    private static int getNotificationUpdateIntervalPreference(Context context)
    {
        return Integer.parseInt(PreferenceUtils.get(context, "pref_notification_interval", "15").trim());
    }

    private static void setRepeatingAlarm(int i, Context context)
    {
        PendingIntent pendingintent = getAlarmPendingIntent(context);
        context = (AlarmManager)context.getSystemService("alarm");
        context.cancel(pendingintent);
        context.setRepeating(0, System.currentTimeMillis(), i * 60000, pendingintent);
    }

    private static void updateAlarmManager(Context context)
    {
        int i = getNotificationUpdateIntervalPreference(context);
        if (mNotificationIntervalInMinutes != i)
        {
            mNotificationIntervalInMinutes = i;
            setRepeatingAlarm(i, context);
        }
    }

}
