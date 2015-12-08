// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.y.j;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            an

public final class bx
{

    public static double a(double d)
    {
        return Math.toDegrees(d / 6371009D);
    }

    public static double a(double d, double d1)
    {
        d = Math.abs(d - d1);
        return Math.min(d, 360D - d);
    }

    public static double a(LatLng latlng, double d)
    {
        return Math.toDegrees(d / (Math.cos(Math.toRadians(latlng.b)) * 6371009D));
    }

    public static ae a(List list)
    {
        com.google.android.m4b.maps.aa.ae.a a1;
        LinkedList linkedlist;
        a1 = ae.g();
        linkedlist = f.b(list);
        if (linkedlist.isEmpty())
        {
            return ae.e();
        }
          goto _L1
_L5:
        LatLng latlng;
        Object obj;
        boolean flag;
        if (latlng.b == -((LatLng) (obj)).b && Math.abs(latlng.c - ((LatLng) (obj)).c) == 180D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            list = new LatLng(0.0D, (latlng.c + ((LatLng) (obj)).c) / 2D);
        } else
        {
            list = an.a(latlng);
            obj = an.a(((LatLng) (obj)));
            double d = (((an) (list)).a + ((an) (obj)).a) / 2D;
            double d1 = (((an) (list)).b + ((an) (obj)).b) / 2D;
            double d2 = ((an) (list)).c;
            list = new an(d, d1, (((an) (obj)).c + d2) / 2D);
            if (((an) (list)).a == 0.0D && ((an) (list)).b == 0.0D && ((an) (list)).c == 0.0D)
            {
                throw new ArithmeticException();
            }
            d1 = Math.atan2(((an) (list)).c, Math.sqrt(((an) (list)).a * ((an) (list)).a + ((an) (list)).b * ((an) (list)).b));
            if (((an) (list)).b == 0.0D && ((an) (list)).a == 0.0D)
            {
                d = 0.0D;
            } else
            {
                d = Math.atan2(((an) (list)).b, ((an) (list)).a);
            }
            list = new LatLng(Math.toDegrees(d1), Math.toDegrees(d));
        }
        linkedlist.addFirst(list);
_L3:
        if (linkedlist.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (LatLng)linkedlist.getFirst();
        if (Math.max(Math.abs(latlng.b - ((LatLng) (obj)).b), a(latlng.c, ((LatLng) (obj)).c)) >= 4D)
        {
            continue; /* Loop/switch isn't completed */
        }
        a1.c(latlng);
_L1:
        latlng = (LatLng)linkedlist.removeFirst();
        if (true) goto _L3; else goto _L2
_L2:
        a1.c(latlng);
        return a1.a();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static LatLngBounds a(LatLng latlng, double d, double d1, double d2, double d3)
    {
        j.a(latlng, "Null anchor");
        double d4;
        double d5;
        double d6;
        double d7;
        boolean flag;
        if (d2 >= 0.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag, "Negative latSpan: %s", new Object[] {
            Double.valueOf(d2)
        });
        if (d3 >= 0.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag, "Negative lngSpan: %s", new Object[] {
            Double.valueOf(d3)
        });
        d3 = Math.min(359.999999D, d3);
        d4 = latlng.b;
        d5 = latlng.b;
        d6 = latlng.c;
        d7 = latlng.c;
        return new LatLngBounds(new LatLng(d5 - (1.0D - d1) * d2, d6 - d3 * d), new LatLng(d4 + d2 * d1, d3 * (1.0D - d) + d7));
    }

    public static ae b(LatLng latlng, double d)
    {
        com.google.android.m4b.maps.aa.ae.a a1 = ae.g();
        double d4 = Math.toRadians(latlng.b);
        double d1 = Math.toRadians(latlng.c);
        double d2 = d / 6371009D;
        d = Math.cos(d2);
        d2 = Math.sin(d2);
        double d3 = Math.cos(d4);
        d4 = Math.sin(d4);
        for (int i = 0; i < 100; i++)
        {
            double d5 = (6.2831853071795862D * (double)i) / 99D;
            double d6 = Math.cos(d5);
            d5 = Math.sin(d5);
            double d7 = d6 * (d3 * d2) + d4 * d;
            d6 = Math.asin(d7);
            d5 = Math.atan2(d5 * d2 * d3, d - d7 * d4);
            a1.c(new LatLng(Math.toDegrees(d6), Math.toDegrees(d5 + d1)));
        }

        return a1.a();
    }
}
