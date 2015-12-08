// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.markers;

import com.google.android.gms.maps.model.BitmapDescriptor;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.NullLocation;

// Referenced classes of package me.lyft.android.map.core.markers:
//            IMarkerOptions

public abstract class MarkerOptions
    implements IMarkerOptions
{

    private Location position;
    private BitmapDescriptor primaryIcon;
    private float rotation;
    private float xOffset;
    private float yOffset;

    protected MarkerOptions()
    {
        position = NullLocation.getInstance();
    }

    public BitmapDescriptor getIcon()
    {
        return primaryIcon;
    }

    public Location getLocation()
    {
        return position;
    }

    public float getRotation()
    {
        return rotation;
    }

    public float getXOffset()
    {
        return xOffset;
    }

    public float getYOffset()
    {
        return yOffset;
    }

    public IMarkerOptions setAnchor(float f, float f1)
    {
        xOffset = f;
        yOffset = f1;
        return this;
    }

    public IMarkerOptions setIcon(BitmapDescriptor bitmapdescriptor)
    {
        primaryIcon = bitmapdescriptor;
        return this;
    }

    protected IMarkerOptions setLocation(Location location)
    {
        position = location;
        return this;
    }

    public IMarkerOptions setRotation(float f)
    {
        rotation = f;
        return this;
    }
}
