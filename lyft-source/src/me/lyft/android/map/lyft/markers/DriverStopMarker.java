// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.markers;

import me.lyft.android.domain.location.Location;
import me.lyft.android.map.core.markers.IMarker;

// Referenced classes of package me.lyft.android.map.lyft.markers:
//            Marker

public class DriverStopMarker extends Marker
{

    public DriverStopMarker(String s, IMarker imarker, Location location)
    {
        super(s, imarker);
        setLocation(location);
    }
}
