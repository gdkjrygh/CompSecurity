// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;

public class DriverAnalytics
{

    public DriverAnalytics()
    {
    }

    public static AsyncActionAnalytics createDriverStatsRequestAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.DRIVER_STATS, Category.DRIVER);
    }

    public static void trackDriverDefenseButtonTap()
    {
        UiAnalytics.trackTap(UiElement.DRIVER_DEFENSE_BUTTON, Category.DRIVER);
    }

    public static void trackDriverDefenseDragToDismiss()
    {
        UiAnalytics.trackDismiss(UiElement.DRIVER_DEFENSE_BUTTON, Category.DRIVER, "dragged");
    }

    public static void trackDriverDefenseShown()
    {
        UiAnalytics.trackShown(UiElement.DRIVER_DEFENSE_BUTTON, Category.DRIVER);
    }

    public static AsyncActionAnalytics trackDriverLapseRoute()
    {
        AsyncActionAnalytics asyncactionanalytics = new AsyncActionAnalytics(ActionName.DRIVER_RIDE_LAPSE, Category.DRIVER);
        asyncactionanalytics.trackRequest();
        return asyncactionanalytics;
    }

    public static void trackDriverReroute()
    {
        UiAnalytics.trackShown(UiElement.DRIVER_REROUTE, Category.DRIVER);
    }

    public static AsyncActionAnalytics trackDriverRideAccept()
    {
        AsyncActionAnalytics asyncactionanalytics = new AsyncActionAnalytics(ActionName.DRIVER_RIDE_ACCEPT, Category.DRIVER);
        asyncactionanalytics.trackRequest();
        return asyncactionanalytics;
    }

    public static void trackDriverStatsDismiss()
    {
        UiAnalytics.trackDismiss(UiElement.DRIVER_STATS, Category.DRIVER);
    }

    public static void trackDriverStatsShown()
    {
        UiAnalytics.trackShown(UiElement.DRIVER_STATS, Category.DRIVER);
    }

    public static AsyncActionAnalytics trackEnterLastRide()
    {
        AsyncActionAnalytics asyncactionanalytics = new AsyncActionAnalytics(ActionName.DRIVER_ENTER_LAST_RIDE, Category.DRIVER);
        asyncactionanalytics.trackRequest();
        return asyncactionanalytics;
    }

    public static AsyncActionAnalytics trackExitLastRide()
    {
        AsyncActionAnalytics asyncactionanalytics = new AsyncActionAnalytics(ActionName.DRIVER_EXIT_LAST_RIDE, Category.DRIVER);
        asyncactionanalytics.trackRequest();
        return asyncactionanalytics;
    }

    public static void trackIncomingRequest()
    {
        UiAnalytics.trackShown(UiElement.RIDE_REQUEST, Category.DRIVER);
    }

    public static void trackModeToggleTap()
    {
        UiAnalytics.trackTap(UiElement.MODE_TOGGLE, Category.DRIVER);
    }

    public static void trackPrimeTimeShown(int i)
    {
        if (i == 0)
        {
            UiAnalytics.trackShown(UiElement.DRIVER_PRIME_TIME_BANNER, Category.DRIVER, null);
            return;
        } else
        {
            UiAnalytics.trackShown(UiElement.DRIVER_PRIME_TIME_BANNER, Category.DRIVER, String.valueOf(i));
            return;
        }
    }

    public static void trackRequestMissed()
    {
        UiAnalytics.trackShown(UiElement.RIDE_REQUEST_MISSED, Category.DRIVER);
    }
}
