// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.markers;

import com.google.android.gms.maps.model.BitmapDescriptor;
import me.lyft.android.domain.location.Location;
import me.lyft.android.map.lyft.markers.Marker;

// Referenced classes of package me.lyft.android.map.core.markers:
//            IMarker

public interface IMarkerOptions
{

    public abstract Marker create(IMarker imarker);

    public abstract BitmapDescriptor getIcon();

    public abstract Location getLocation();

    public abstract String getMarkerId();

    public abstract Class getMarkerType();

    public abstract float getRotation();

    public abstract float getXOffset();

    public abstract float getYOffset();

    public abstract IMarkerOptions setAnchor(float f, float f1);

    public abstract IMarkerOptions setIcon(BitmapDescriptor bitmapdescriptor);

    public abstract IMarkerOptions setRotation(float f);
}
