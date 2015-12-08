// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.animation;

import me.lyft.android.domain.location.Location;
import me.lyft.android.map.core.markers.IMarker;

// Referenced classes of package me.lyft.android.map.lyft.animation:
//            LatLngInterpolator

final class 
    implements LatLngInterpolator
{

    double computeAngleBetween(double d, double d1, double d2, double d3)
    {
        double d4 = Math.pow(Math.sin((d - d2) / 2D), 2D);
        d = Math.cos(d);
        d2 = Math.cos(d2);
        return Math.asin(Math.sqrt(d4 + Math.pow(Math.sin((d1 - d3) / 2D), 2D) * (d * d2))) * 2D;
    }

    public void interpolate(IMarker imarker, float f, Location location, Location location1)
    {
        double d2 = Math.toRadians(location.getLat().doubleValue());
        double d4 = Math.toRadians(location.getLng().doubleValue());
        double d = Math.toRadians(location1.getLat().doubleValue());
        double d5 = Math.toRadians(location1.getLng().doubleValue());
        double d6 = Math.cos(d2);
        double d7 = Math.cos(d);
        double d3 = computeAngleBetween(d2, d4, d, d5);
        double d8 = Math.sin(d3);
        if (d8 < 9.9999999999999995E-07D)
        {
            imarker.setPosition(location.getLat().doubleValue(), location.getLng().doubleValue());
            return;
        } else
        {
            double d1 = Math.sin((double)(1.0F - f) * d3) / d8;
            d8 = Math.sin(d3 * (double)f) / d8;
            d3 = d1 * d6 * Math.cos(d4) + d8 * d7 * Math.cos(d5);
            d4 = Math.sin(d4) * (d6 * d1) + Math.sin(d5) * (d8 * d7);
            d2 = Math.sin(d2);
            d = Math.atan2(d8 * Math.sin(d) + d2 * d1, Math.sqrt(d3 * d3 + d4 * d4));
            d1 = Math.atan2(d4, d3);
            imarker.setPosition(Math.toDegrees(d), Math.toDegrees(d1));
            return;
        }
    }

    ()
    {
    }
}
