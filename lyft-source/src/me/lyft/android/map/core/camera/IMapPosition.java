// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.camera;

import me.lyft.android.common.INullable;
import me.lyft.android.domain.location.Location;

public interface IMapPosition
    extends INullable
{

    public abstract float getBearing();

    public abstract Location getLocation();

    public abstract float getTilt();

    public abstract float getZoom();
}
