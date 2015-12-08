// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.markeroptions;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import me.lyft.android.domain.ride.RideType;
import me.lyft.android.map.core.markers.MarkerOptions;

public abstract class DriverMarkerOptions extends MarkerOptions
{

    private static final float MARKER_OFFSET = 0.5F;
    private final String driverId;

    public DriverMarkerOptions(String s)
    {
        driverId = s;
        setAnchor(0.5F, 0.5F);
    }

    public static BitmapDescriptor resolveNearbyDriverMarker(RideType ridetype)
    {
        if (ridetype.isCourier())
        {
            return BitmapDescriptorFactory.a(0x7f0201e2);
        }
        if (ridetype.isPlus())
        {
            return BitmapDescriptorFactory.a(0x7f020208);
        }
        if (ridetype.isStandard())
        {
            return BitmapDescriptorFactory.a(0x7f0201e8);
        } else
        {
            return BitmapDescriptorFactory.a(0x7f0201e8);
        }
    }

    public String getMarkerId()
    {
        return driverId;
    }
}
