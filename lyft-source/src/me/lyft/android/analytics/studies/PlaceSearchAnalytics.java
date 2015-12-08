// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.IntentAnalytics;
import me.lyft.android.analytics.SpanningAnalytics;

public class PlaceSearchAnalytics
{

    public static final String SOURCE_CITY = "city";
    public static final String SOURCE_DESTINATION = "destination";
    public static final String SOURCE_DESTINY = "destiny";
    public static final String SOURCE_PICKUP = "pickup";
    public static final String SOURCE_SHORTCUT = "shortcut";
    private static final IntentAnalytics intentAnalytics;

    public PlaceSearchAnalytics()
    {
    }

    public static void trackCancel()
    {
        intentAnalytics.trackCanceled();
    }

    public static void trackSearchPlaces(String s)
    {
        intentAnalytics.setParameter(s).trackInitiation();
    }

    public static void trackSuccess(String s)
    {
        intentAnalytics.trackSuccess(s);
    }

    static 
    {
        intentAnalytics = new IntentAnalytics(me.lyft.android.analytics.definitions.IntentEvent.Intent.SEARCH_PLACES);
    }
}
