// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.markeroptions;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.shortcuts.Shortcut;
import me.lyft.android.map.core.markers.IMarker;
import me.lyft.android.map.core.markers.MarkerOptions;
import me.lyft.android.map.lyft.markers.Marker;
import me.lyft.android.map.lyft.markers.ShortcutMarker;

public class ShortcutMarkerOptions extends MarkerOptions
{

    private static final float MARKER_OFFSET = 0.5F;
    private final BitmapDescriptor selectedIcon;
    private final BitmapDescriptor unselectedIcon;

    public ShortcutMarkerOptions(Shortcut shortcut)
    {
        int i;
        if (shortcut.isHome())
        {
            i = 0x7f020185;
        } else
        {
            i = 0x7f020187;
        }
        unselectedIcon = BitmapDescriptorFactory.a(i);
        if (shortcut.isHome())
        {
            i = 0x7f020186;
        } else
        {
            i = 0x7f020188;
        }
        selectedIcon = BitmapDescriptorFactory.a(i);
        setAnchor(0.5F, 0.5F);
        setIcon(unselectedIcon);
        setLocation(shortcut.getLocation());
    }

    public volatile Marker create(IMarker imarker)
    {
        return create(imarker);
    }

    public ShortcutMarker create(IMarker imarker)
    {
        return new ShortcutMarker(getMarkerId(), imarker, getLocation(), unselectedIcon, selectedIcon);
    }

    public String getMarkerId()
    {
        return getLocation().toQueryString();
    }

    public Class getMarkerType()
    {
        return me/lyft/android/map/lyft/markers/ShortcutMarker;
    }
}
