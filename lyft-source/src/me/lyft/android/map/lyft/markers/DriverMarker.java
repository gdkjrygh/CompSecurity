// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.markers;

import com.google.android.gms.maps.model.BitmapDescriptor;
import java.util.List;
import me.lyft.android.domain.location.Location;
import me.lyft.android.map.core.markers.IMarker;
import me.lyft.android.map.lyft.animation.MarkerDirectionalAnimation;

// Referenced classes of package me.lyft.android.map.lyft.markers:
//            Marker

public class DriverMarker extends Marker
{

    private final MarkerDirectionalAnimation markerDirectionalAnimation;

    public DriverMarker(String s, IMarker imarker)
    {
        super(s, imarker);
        markerDirectionalAnimation = new MarkerDirectionalAnimation(imarker);
    }

    public void setLocation(Location location)
    {
        if (getLocation().isNull())
        {
            super.setLocation(location);
        }
        location = location.getBearing();
        float f;
        if (location != null)
        {
            f = location.floatValue();
        } else
        {
            f = 0.0F;
        }
        setRotation(f);
    }

    public void setRecentLocations(List list)
    {
        markerDirectionalAnimation.addLocations(list);
        markerDirectionalAnimation.start();
    }

    public void updateIcon(BitmapDescriptor bitmapdescriptor)
    {
        setIcon(bitmapdescriptor);
    }
}
