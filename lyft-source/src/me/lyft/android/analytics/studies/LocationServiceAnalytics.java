// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;

public class LocationServiceAnalytics
{

    public LocationServiceAnalytics()
    {
    }

    public static AsyncActionAnalytics lastKnownLocation()
    {
        return new AsyncActionAnalytics(ActionName.LOCATION_SERVICE_LAST_KNOWN_LOCATION, Category.LOCATION_SERVICE);
    }

    public static AsyncActionAnalytics requestUpdates()
    {
        return new AsyncActionAnalytics(ActionName.LOCATION_SERVICE_REQUEST_UPDATES, Category.LOCATION_SERVICE);
    }
}
