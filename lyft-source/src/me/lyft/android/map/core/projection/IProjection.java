// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.projection;

import android.graphics.Point;
import me.lyft.android.common.INullable;
import me.lyft.android.domain.location.Location;

public interface IProjection
    extends INullable
{

    public abstract Location fromSreenLocation(Point point);

    public abstract Point toScreenLocation(Location location);
}
