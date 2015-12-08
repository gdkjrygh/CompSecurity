// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.SystemClock;

public class ClockWidgetScheduler
{

    private int pendingIntentRequestCode;

    public ClockWidgetScheduler()
    {
    }

    private PendingIntent getClockTickIntent(Context context)
    {
        return PendingIntent.getBroadcast(context, pendingIntentRequestCode, new Intent("com.accuweather.android.widget.CLOCK_WIDGET_UPDATE"), 0x10000000);
    }

    private PendingIntent getWidgetContentUpdateIntent(Context context)
    {
        return PendingIntent.getBroadcast(context, pendingIntentRequestCode, new Intent("accuwx.intent.action.UPDATE_WIDGET_DATA"), 0x10000000);
    }

    private void setAlarm(Context context, PendingIntent pendingintent, long l, long l1)
    {
        context = (AlarmManager)context.getSystemService("alarm");
        context.cancel(pendingintent);
        context.setRepeating(1, l, l1, pendingintent);
    }

    public void cancelClockTimeUpdate(Context context)
    {
        ((AlarmManager)context.getSystemService("alarm")).cancel(getClockTickIntent(context));
    }

    public void cancelWeatherUpdate(Context context)
    {
        ((AlarmManager)context.getSystemService("alarm")).cancel(getWidgetContentUpdateIntent(context));
    }

    public void scheduleWidgetClockUpdateAlarm(Context context)
    {
        setAlarm(context, getClockTickIntent(context), SystemClock.getSystemMillisecondsForTopOfNextMinute(), 60000L);
    }

    public void scheduleWidgetContentUpdateAlarm(Context context)
    {
        setAlarm(context, getWidgetContentUpdateIntent(context), 1000L + (new SystemClock()).getCurrentTimeInMillis(), 0x493e0L);
        Logger.d(getClass().getName(), "In scheduleWidgetContentUpdateAlarm(), alarm scheduled for ");
    }

    public void setPendingIntentRequestCode(int i)
    {
        pendingIntentRequestCode = i;
    }
}
