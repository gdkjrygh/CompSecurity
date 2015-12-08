// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.markeroptions;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import me.lyft.android.domain.location.Location;
import me.lyft.android.map.core.markers.IMarker;
import me.lyft.android.map.core.markers.MarkerOptions;
import me.lyft.android.map.lyft.markers.HotspotMarker;
import me.lyft.android.map.lyft.markers.Marker;

public class HotspotMarkerOptions extends MarkerOptions
{

    private static final float MARKER_OFFSET = 0.5F;
    private final BitmapDescriptor selectedIcon = BitmapDescriptorFactory.a(0x7f020180);
    private final BitmapDescriptor unselectedIcon = BitmapDescriptorFactory.a(0x7f02017f);

    public HotspotMarkerOptions(Location location)
    {
        setAnchor(0.5F, 0.5F);
        setIcon(unselectedIcon);
        setLocation(location);
    }

    public HotspotMarker create(IMarker imarker)
    {
        return new HotspotMarker(getMarkerId(), imarker, getLocation(), unselectedIcon, selectedIcon);
    }

    public volatile Marker create(IMarker imarker)
    {
        return create(imarker);
    }

    public String getMarkerId()
    {
        return getLocation().toQueryString();
    }

    public Class getMarkerType()
    {
        return me/lyft/android/map/lyft/markers/HotspotMarker;
    }
}
