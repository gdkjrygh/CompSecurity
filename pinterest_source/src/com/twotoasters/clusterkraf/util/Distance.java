// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf.util;

import android.graphics.Point;

public class Distance
{

    public static double a(Point point, Point point1)
    {
        if (point != null && point1 != null)
        {
            double d2 = point.x;
            double d = point.y;
            double d3 = point1.x;
            double d1 = point1.y;
            d2 = Math.abs(d2 - d3);
            d = Math.abs(d - d1);
            return Math.sqrt(Math.pow(d2, 2D) + Math.pow(d, 2D));
        } else
        {
            return 0.0D;
        }
    }
}
