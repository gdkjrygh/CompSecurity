// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.polyline;

import java.util.List;

public interface IPolylineOptions
{

    public abstract IPolylineOptions addAll(List list);

    public abstract IPolylineOptions color(int i);

    public abstract int getColor();

    public abstract List getLocations();

    public abstract float getWidth();

    public abstract IPolylineOptions width(float f);
}
