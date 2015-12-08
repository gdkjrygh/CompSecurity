// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.projection;

import android.graphics.Point;
import me.lyft.android.domain.location.Location;

// Referenced classes of package me.lyft.android.map.core.projection:
//            IProjection

public class NullProjection
    implements IProjection
{

    private static final IProjection INSTANCE = new NullProjection();
    private static final Location NULL_LAT_LNG = new Location(0.0D, 0.0D);
    private static final Point NULL_POINT = new Point(0, 0);

    private NullProjection()
    {
    }

    public static IProjection getInstance()
    {
        return INSTANCE;
    }

    public Location fromSreenLocation(Point point)
    {
        return NULL_LAT_LNG;
    }

    public boolean isNull()
    {
        return true;
    }

    public Point toScreenLocation(Location location)
    {
        return NULL_POINT;
    }

}
