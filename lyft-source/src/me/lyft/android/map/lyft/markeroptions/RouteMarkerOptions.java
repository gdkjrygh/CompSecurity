// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.markeroptions;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.map.core.markers.IMarker;
import me.lyft.android.map.core.markers.MarkerOptions;
import me.lyft.android.map.lyft.markers.Marker;
import me.lyft.android.map.lyft.markers.RouteMarker;

public class RouteMarkerOptions extends MarkerOptions
{

    private static final float COURIER_MAP_PIN_X_OFFSET = 0.26F;
    private static final float COURIER_MAP_PIN_Y_OFFSET = 0.825F;
    private static final float MARKER_OFFSET = 0.5F;
    private final Stop stop;

    public RouteMarkerOptions(Stop stop1)
    {
        stop = stop1;
        setLocation(stop1.getLocation());
        if (stop1.getPassenger().isSelf())
        {
            setAnchor(0.26F, 0.825F);
            int i;
            if (stop1.isPickup())
            {
                i = 0x7f020184;
            } else
            {
                i = 0x7f020183;
            }
            setIcon(BitmapDescriptorFactory.a(i));
            return;
        } else
        {
            setAnchor(0.5F, 0.5F);
            setIcon(BitmapDescriptorFactory.a(0x7f02017b));
            return;
        }
    }

    public volatile Marker create(IMarker imarker)
    {
        return create(imarker);
    }

    public RouteMarker create(IMarker imarker)
    {
        return new RouteMarker(getMarkerId(), imarker, getLocation());
    }

    public String getMarkerId()
    {
        return stop.getStopId();
    }

    public Class getMarkerType()
    {
        return me/lyft/android/map/lyft/markers/RouteMarker;
    }
}
