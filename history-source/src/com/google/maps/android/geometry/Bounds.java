// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.geometry;


// Referenced classes of package com.google.maps.android.geometry:
//            Point

public class Bounds
{

    public final double maxX;
    public final double maxY;
    public final double midX;
    public final double midY;
    public final double minX;
    public final double minY;

    public Bounds(double d, double d1, double d2, double d3)
    {
        minX = d;
        minY = d2;
        maxX = d1;
        maxY = d3;
        midX = (d + d1) / 2D;
        midY = (d2 + d3) / 2D;
    }

    public boolean contains(double d, double d1)
    {
        return minX <= d && d <= maxX && minY <= d1 && d1 <= maxY;
    }

    public boolean contains(Bounds bounds)
    {
        return bounds.minX >= minX && bounds.maxX <= maxX && bounds.minY >= minY && bounds.maxY <= maxY;
    }

    public boolean contains(Point point)
    {
        return contains(point.x, point.y);
    }

    public boolean intersects(double d, double d1, double d2, double d3)
    {
        return d < maxX && minX < d1 && d2 < maxY && minY < d3;
    }

    public boolean intersects(Bounds bounds)
    {
        return intersects(bounds.minX, bounds.maxX, bounds.minY, bounds.maxY);
    }
}
