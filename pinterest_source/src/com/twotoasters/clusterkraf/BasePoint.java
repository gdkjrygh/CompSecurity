// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import android.graphics.Point;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.twotoasters.clusterkraf.util.Distance;

abstract class BasePoint
{

    protected LatLng a;
    private Point b;

    BasePoint()
    {
    }

    final double a(BasePoint basepoint)
    {
        return Distance.a(b, basepoint.b);
    }

    public LatLng a()
    {
        return a;
    }

    final void a(Point point)
    {
        b = point;
    }

    final void a(Projection projection)
    {
        if (projection != null && a != null)
        {
            b = projection.toScreenLocation(a);
        }
    }

    public void a(Marker marker)
    {
    }

    final Point b()
    {
        return b;
    }

    void c()
    {
        b = null;
    }
}
