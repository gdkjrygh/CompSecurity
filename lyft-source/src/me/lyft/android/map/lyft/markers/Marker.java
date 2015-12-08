// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.markers;

import com.google.android.gms.maps.model.BitmapDescriptor;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.map.core.markers.IMarker;
import me.lyft.android.map.core.markers.NullMarker;
import rx.functions.Func1;

public abstract class Marker
{

    private static final Func1 MARKER_TO_LOCATION_FUNC = new Func1() {

        public volatile Object call(Object obj)
        {
            return call((Marker)obj);
        }

        public Location call(Marker marker1)
        {
            return marker1.getLocation();
        }

    };
    private final String id;
    private Location location;
    protected IMarker marker;

    protected Marker(String s, IMarker imarker)
    {
        marker = NullMarker.getInstance();
        location = NullLocation.getInstance();
        marker = imarker;
        id = s;
    }

    public static Func1 funcToLocation()
    {
        return MARKER_TO_LOCATION_FUNC;
    }

    public boolean consumeClick()
    {
        return true;
    }

    public String getClickId()
    {
        return marker.getClickId();
    }

    protected String getId()
    {
        return id;
    }

    public Location getLocation()
    {
        return location;
    }

    protected void hideInfoWindow()
    {
        marker.hideInfoWindow();
    }

    protected boolean isVisible()
    {
        return marker.isVisible();
    }

    public void remove()
    {
        IMarker imarker = marker;
        marker = NullMarker.getInstance();
        imarker.remove();
    }

    protected void setAlpha(float f)
    {
        marker.setAlpha(f);
    }

    protected void setIcon(BitmapDescriptor bitmapdescriptor)
    {
        marker.setIcon(bitmapdescriptor);
    }

    public void setLocation(Location location1)
    {
        location = location1;
        marker.setPosition(location1.getLat().doubleValue(), location1.getLng().doubleValue());
    }

    protected void setRotation(float f)
    {
        marker.setRotation(f);
    }

    protected void setText(String s)
    {
        marker.setText(s);
    }

    protected void setVisibility(boolean flag)
    {
        marker.setVisibility(flag);
    }

    protected void showInfoWindow()
    {
        marker.showInfoWindow();
    }

}
