// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.camera;

import me.lyft.android.domain.location.Location;

// Referenced classes of package me.lyft.android.map.core.camera:
//            IMapPosition

public class MapPosition
    implements IMapPosition
{

    private float bearing;
    private Location location;
    private float tilt;
    private float zoom;

    public MapPosition(Location location1, float f, float f1, float f2)
    {
        location = location1;
        zoom = f;
        tilt = f1;
        bearing = f2;
    }

    public float getBearing()
    {
        return bearing;
    }

    public Location getLocation()
    {
        return location;
    }

    public float getTilt()
    {
        return tilt;
    }

    public float getZoom()
    {
        return zoom;
    }

    public boolean isNull()
    {
        return false;
    }
}
