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

    public void interpolate(IMarker imarker, float f, Location location, Location location1)
    {
        double d2 = location1.getLat().doubleValue();
        double d3 = location.getLat().doubleValue();
        double d4 = f;
        double d5 = location.getLat().doubleValue();
        double d1 = location1.getLng().doubleValue() - location.getLng().doubleValue();
        double d = d1;
        if (Math.abs(d1) > 180D)
        {
            d = d1 - Math.signum(d1) * 360D;
        }
        imarker.setPosition(d5 + (d2 - d3) * d4, d * (double)f + location.getLng().doubleValue());
    }

    ()
    {
    }
}
