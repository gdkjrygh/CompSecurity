// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.markers;

import com.google.android.gms.maps.model.BitmapDescriptor;

// Referenced classes of package me.lyft.android.map.core.markers:
//            IMarker

public class NullMarker
    implements IMarker
{

    private static final IMarker INSTANCE = new NullMarker();

    private NullMarker()
    {
    }

    public static IMarker getInstance()
    {
        return INSTANCE;
    }

    public boolean consumeClick()
    {
        return true;
    }

    public String getClickId()
    {
        return "";
    }

    public String getId()
    {
        return "";
    }

    public void hideInfoWindow()
    {
    }

    public boolean isNull()
    {
        return true;
    }

    public boolean isVisible()
    {
        return false;
    }

    public void remove()
    {
    }

    public void setAlpha(float f)
    {
    }

    public void setIcon(BitmapDescriptor bitmapdescriptor)
    {
    }

    public void setPosition(double d, double d1)
    {
    }

    public void setRotation(float f)
    {
    }

    public void setText(String s)
    {
    }

    public void setVisibility(boolean flag)
    {
    }

    public void showInfoWindow()
    {
    }

}
