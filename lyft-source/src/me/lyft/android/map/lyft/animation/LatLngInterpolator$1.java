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
        imarker.setPosition((location1.getLat().doubleValue() - location.getLat().doubleValue()) * (double)f + location.getLat().doubleValue(), (location1.getLng().doubleValue() - location.getLng().doubleValue()) * (double)f + location.getLng().doubleValue());
    }

    ()
    {
    }
}
