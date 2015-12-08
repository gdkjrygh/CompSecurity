// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.markeroptions;

import me.lyft.android.map.core.markers.IMarker;
import me.lyft.android.map.lyft.markers.DriverMarker;
import me.lyft.android.map.lyft.markers.Marker;

// Referenced classes of package me.lyft.android.map.lyft.markeroptions:
//            DriverMarkerOptions

public class NearbyDriverMarkerOptions extends DriverMarkerOptions
{

    public NearbyDriverMarkerOptions(String s)
    {
        super(s);
    }

    public DriverMarker create(IMarker imarker)
    {
        return new DriverMarker(getMarkerId(), imarker);
    }

    public volatile Marker create(IMarker imarker)
    {
        return create(imarker);
    }

    public Class getMarkerType()
    {
        return me/lyft/android/map/lyft/markers/DriverMarker;
    }
}
