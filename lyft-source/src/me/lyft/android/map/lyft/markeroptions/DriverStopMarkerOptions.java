// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.markeroptions;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.map.core.markers.IMarker;
import me.lyft.android.map.core.markers.MarkerOptions;
import me.lyft.android.map.lyft.markers.DriverStopMarker;
import me.lyft.android.map.lyft.markers.Marker;

public class DriverStopMarkerOptions extends MarkerOptions
{

    private static final float MARKER_OFFSET = 0.5F;
    private final Stop stop;

    public DriverStopMarkerOptions(Stop stop1)
    {
        stop = stop1;
        setAnchor(0.5F, 0.5F);
        setIcon(BitmapDescriptorFactory.a(0x7f020196));
    }

    public DriverStopMarker create(IMarker imarker)
    {
        return new DriverStopMarker(getMarkerId(), imarker, stop.getLocation());
    }

    public volatile Marker create(IMarker imarker)
    {
        return create(imarker);
    }

    public String getMarkerId()
    {
        return stop.getLocation().toQueryString();
    }

    public Class getMarkerType()
    {
        return me/lyft/android/map/lyft/markers/DriverStopMarker;
    }
}
