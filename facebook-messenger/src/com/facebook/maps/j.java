// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.maps;

import android.location.Location;
import com.google.android.maps.GeoPoint;

public class j
{

    private static double a = 1000000D;

    public j()
    {
    }

    public static Location a(double d, double d1)
    {
        Location location = new Location("");
        location.setLatitude(d);
        location.setLongitude(d1);
        return location;
    }

    public static Location a(GeoPoint geopoint)
    {
        return a((double)geopoint.getLatitudeE6() / a, (double)geopoint.getLongitudeE6() / a);
    }

    public static GeoPoint a(Location location)
    {
        return new GeoPoint((int)(location.getLatitude() * a), (int)(location.getLongitude() * a));
    }

}
