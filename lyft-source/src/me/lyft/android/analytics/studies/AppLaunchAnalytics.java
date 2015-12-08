// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.SpanningAnalytics;
import me.lyft.android.common.DeviceClock;

public class AppLaunchAnalytics
{

    private static final ActionAnalytics APP_LAUNCH_ANALYTICS;
    private static final long TIMER_STOPPED = 0L;
    private static long applicationCreateTime = 0L;

    public AppLaunchAnalytics()
    {
    }

    public static void onCreateApplication()
    {
        applicationCreateTime = DeviceClock.getElapsedTimeMs();
    }

    public static void onCreateMainActivity()
    {
        if (applicationCreateTime != 0L)
        {
            long l = DeviceClock.getElapsedTimeMs();
            long l1 = applicationCreateTime;
            APP_LAUNCH_ANALYTICS.setValue(l - l1).trackInitiation();
        }
    }

    public static void onLoadingAnimationComplete()
    {
        if (applicationCreateTime != 0L)
        {
            long l = DeviceClock.getElapsedTimeMs();
            long l1 = applicationCreateTime;
            APP_LAUNCH_ANALYTICS.setValue(l - l1).trackSuccess();
            applicationCreateTime = 0L;
        }
    }

    static 
    {
        APP_LAUNCH_ANALYTICS = new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.APP_LAUNCH);
    }
}
