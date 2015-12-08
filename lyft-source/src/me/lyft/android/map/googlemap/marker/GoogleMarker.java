// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.googlemap.marker;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import me.lyft.android.map.core.markers.IMarker;

public class GoogleMarker
    implements IMarker
{

    private static final float CENTER_INFO_WINDOW_ANCHOR = 0.5F;
    protected final Marker marker;

    public GoogleMarker(Marker marker1)
    {
        marker = marker1;
        marker1.a(0.5F, 0.5F);
    }

    public boolean consumeClick()
    {
        return true;
    }

    public final String getClickId()
    {
        return marker.b();
    }

    public String getId()
    {
        return "raw_marker";
    }

    public void hideInfoWindow()
    {
        marker.e();
    }

    public boolean isNull()
    {
        return false;
    }

    public boolean isVisible()
    {
        return marker.f();
    }

    public void remove()
    {
        marker.a();
    }

    public void setAlpha(float f)
    {
        marker.b(f);
    }

    public void setIcon(BitmapDescriptor bitmapdescriptor)
    {
        marker.a(bitmapdescriptor);
    }

    public void setPosition(double d, double d1)
    {
        marker.a(new LatLng(d, d1));
    }

    public void setRotation(float f)
    {
        marker.a(f);
    }

    public void setText(String s)
    {
        marker.a(s);
    }

    public void setVisibility(boolean flag)
    {
        marker.a(flag);
    }

    public void showInfoWindow()
    {
        marker.d();
    }
}
