// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;

public class PassengerAnalytics
{

    public PassengerAnalytics()
    {
    }

    public static void trackCancellationDismiss()
    {
        UiAnalytics.trackDismiss(UiElement.PASSENGER_CANCELLATION_DIALOG, Category.PASSENGER);
    }

    public static void trackCancellationShown()
    {
        UiAnalytics.trackShown(UiElement.PASSENGER_CANCELLATION_DIALOG, Category.PASSENGER);
    }

    public static void trackMapMove()
    {
        UiAnalytics.trackTap(UiElement.PASSENGER_MAP_MOVE, Category.PASSENGER);
    }

    public static void trackTextDriverTap()
    {
        UiAnalytics.trackTap(UiElement.TEXT_DRIVER, Category.PASSENGER);
    }

    public static void trackZoomButtonTap()
    {
        UiAnalytics.trackTap(UiElement.PASSENGER_MAP_ZOOM_BUTTON, Category.PASSENGER);
    }
}
