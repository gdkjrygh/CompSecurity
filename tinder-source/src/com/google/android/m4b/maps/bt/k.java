// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import android.graphics.Point;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.VisibleRegion;
import com.google.android.m4b.maps.y.j;
import java.util.Arrays;

public final class k
    implements com.google.android.m4b.maps.cg.al.a
{
    public static final class a
    {

        public long a;
        public long b;

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null)
                {
                    return false;
                }
                if (!(obj instanceof a))
                {
                    return false;
                }
                obj = (a)obj;
                if (!v.a(Long.valueOf(a), Long.valueOf(((a) (obj)).a)) || !v.a(Long.valueOf(b), Long.valueOf(((a) (obj)).b)))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                Long.valueOf(a), Long.valueOf(b)
            });
        }

        public a(long l, long l1)
        {
            a = l;
            b = l1;
        }
    }


    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final CameraPosition e;
    public final int f;
    public final int g;
    public final double h;
    private final double i;
    private final Point j;

    public k(CameraPosition cameraposition, int l, int i1, double d1, int j1, int k1, 
            int l1, int i2)
    {
        com.google.android.m4b.maps.y.j.a(cameraposition);
        a = j1;
        b = k1;
        c = l1;
        d = i2;
        e = cameraposition;
        f = l;
        g = i1;
        h = d1;
        i = cameraposition.c;
        j = new Point((l - j1 - l1) / 2 + j1, (i1 - k1 - i2) / 2 + k1);
    }

    public static double a(double d1, double d2)
    {
        return 256D * Math.pow(2D, d1) * d2;
    }

    public static a a(LatLng latlng, double d1, double d2)
    {
        double d3;
        double d4;
        boolean flag;
        if (d1 >= 0.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.a(flag);
        com.google.android.m4b.maps.y.j.a(latlng);
        d3 = latlng.c;
        d1 = a(d1, d2);
        d2 = d1 / 2D;
        d4 = Math.sin(Math.toRadians(latlng.b));
        d3 /= 360D;
        d4 = Math.log((1.0D + d4) / (1.0D - d4)) / 4D / 3.1415926535897931D;
        return new a((long)(d3 * d1 + d2), (long)(d2 - d1 * d4));
    }

    public final Point a(LatLng latlng)
    {
        latlng = a(latlng, i, h);
        a a1 = a(e.b, i, h);
        long l2 = ((a) (latlng)).a - a1.a;
        long l3 = b();
        long l1 = l2;
        if (l2 > l3 / 2L)
        {
            l1 = l2 - l3;
        }
        l2 = l1;
        if (l1 < -l3 / 2L)
        {
            l2 = l1 + l3;
        }
        int l = (int)(l2 + (long)j.x);
        l1 = j.y;
        return new Point(l, (int)((((a) (latlng)).b - a1.b) + l1));
    }

    public final LatLng a(Point point)
    {
        a a1 = a(e.b, i, h);
        point = new a((a1.a - (long)j.x) + (long)point.x, (a1.b - (long)j.y) + (long)point.y);
        double d1 = a(i, h);
        double d2 = (double)((a) (point)).a / d1;
        return new LatLng(Math.toDegrees(Math.atan(Math.exp(((double)(-((a) (point)).b) / d1 + 0.5D) * 6.2831853071795862D)) * 2D - 1.5707963267948966D), Math.toDegrees((d2 - 0.5D) * 6.2831853071795862D));
    }

    public final VisibleRegion a()
    {
        LatLng latlng = a(new Point(a, b));
        LatLng latlng1 = a(new Point(f - c, b));
        LatLng latlng2 = a(new Point(a, g - d));
        return new VisibleRegion(latlng2, a(new Point(f - c, g - d)), latlng, latlng1, new LatLngBounds(latlng2, latlng1));
    }

    public final long b()
    {
        return (long)a(i, h);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof k))
            {
                return false;
            }
            obj = (k)obj;
            if (!v.a(e, ((k) (obj)).e) || !v.a(Integer.valueOf(f), Integer.valueOf(((k) (obj)).f)) || !v.a(Integer.valueOf(g), Integer.valueOf(((k) (obj)).g)) || !v.a(Double.valueOf(h), Double.valueOf(((k) (obj)).h)) || !v.a(Integer.valueOf(a), Integer.valueOf(((k) (obj)).a)) || !v.a(Integer.valueOf(b), Integer.valueOf(((k) (obj)).b)) || !v.a(Integer.valueOf(c), Integer.valueOf(((k) (obj)).c)) || !v.a(Integer.valueOf(d), Integer.valueOf(((k) (obj)).d)))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            e, Integer.valueOf(f), Integer.valueOf(g), Double.valueOf(h), Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(d)
        });
    }
}
