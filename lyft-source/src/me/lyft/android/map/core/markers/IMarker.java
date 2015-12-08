// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.markers;

import com.google.android.gms.maps.model.BitmapDescriptor;
import me.lyft.android.common.INullable;

public interface IMarker
    extends INullable
{

    public abstract boolean consumeClick();

    public abstract String getClickId();

    public abstract String getId();

    public abstract void hideInfoWindow();

    public abstract boolean isVisible();

    public abstract void remove();

    public abstract void setAlpha(float f);

    public abstract void setIcon(BitmapDescriptor bitmapdescriptor);

    public abstract void setPosition(double d, double d1);

    public abstract void setRotation(float f);

    public abstract void setText(String s);

    public abstract void setVisibility(boolean flag);

    public abstract void showInfoWindow();
}
