// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.markers;

import com.google.android.gms.maps.model.BitmapDescriptor;
import me.lyft.android.domain.location.Location;
import me.lyft.android.map.core.markers.IMarker;

// Referenced classes of package me.lyft.android.map.lyft.markers:
//            Marker

public abstract class SelectableMarker extends Marker
{

    private final BitmapDescriptor selectedIcon;
    private final BitmapDescriptor unselectedIcon;

    public SelectableMarker(String s, IMarker imarker, Location location, BitmapDescriptor bitmapdescriptor, BitmapDescriptor bitmapdescriptor1)
    {
        super(s, imarker);
        setLocation(location);
        unselectedIcon = bitmapdescriptor;
        selectedIcon = bitmapdescriptor1;
    }

    public void select()
    {
        setIcon(selectedIcon);
    }

    public void unselect()
    {
        setIcon(unselectedIcon);
    }
}
