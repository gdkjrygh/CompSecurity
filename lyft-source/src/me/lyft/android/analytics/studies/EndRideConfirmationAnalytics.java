// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;

public class EndRideConfirmationAnalytics
{

    public EndRideConfirmationAnalytics()
    {
    }

    public static void trackCancelRide()
    {
        UiAnalytics.trackTap(UiElement.CANCEL_RIDE, Category.END_RIDE_CONFIRMATION);
    }

    public static void trackDontEndOrCancel()
    {
        UiAnalytics.trackTap(UiElement.DONT_END_OR_CANCEL, Category.END_RIDE_CONFIRMATION);
    }

    public static void trackEndRide()
    {
        UiAnalytics.trackTap(UiElement.END_RIDE, Category.END_RIDE_CONFIRMATION);
    }
}
