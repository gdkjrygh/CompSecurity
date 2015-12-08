// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import android.graphics.Point;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.by.b;
import com.google.android.m4b.maps.by.g;
import com.google.android.m4b.maps.by.j;
import com.google.android.m4b.maps.cg.bc;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.x.e;
import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.bt:
//            k

final class i
{

    private static int a(double d)
    {
        return (int)Math.round(10000000D * d);
    }

    private static int a(int l, double d)
    {
        return Math.min((int)Math.ceil((double)l / d), (int)Math.floor(2048D / d));
    }

    public static String a(a a1, k k1, int l, bc bc1, String s)
    {
        a a2;
        try
        {
            a2 = c.a(a1);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new IllegalStateException(a1);
        }
        a(a2, k1);
        if (bc1 != null)
        {
            if (bc1.b)
            {
                a1 = "RoadmapAmbiactiveLowBit";
            } else
            {
                a1 = "RoadmapAmbiactive";
            }
            b(a2, 0);
            k1 = new a(j.a);
            k1.a(1, 68L);
            bc1 = new a(j.b);
            bc1.b(1, "set");
            bc1.b(2, a1);
            k1.a(2, bc1);
            a1 = new a(g.a);
            a1.a(12, k1);
            a2.a(3, a1);
        } else
        {
            a(a2, l);
        }
        return a(a2, s);
    }

    public static String a(a a1, k k1, int l, String s)
    {
        try
        {
            a1 = c.a(a1);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new IllegalStateException(a1);
        }
        a1.e(5, 0);
        a1.a(4, 5L);
        a(a1, k1);
        a(a1, l);
        return a(a1, s);
    }

    private static String a(a a1, String s)
    {
        try
        {
            a1 = a1.c();
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new IllegalStateException(a1);
        }
        a1 = String.valueOf(com.google.android.m4b.maps.c.a.b().a(a1));
        return (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(a1).length())).append(s).append("bpb=").append(a1).toString();
    }

    private static void a(a a1, int l)
    {
        a a2;
        a a3;
        boolean flag;
        if (l != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.a(flag, "Shouldn't fetch for MAP_TYPE_NONE");
        a3 = a1.f(3);
        a2 = a3;
        if (a3 == null)
        {
            a2 = new a(g.a);
        }
        switch (l)
        {
        default:
            b(a1, 0);
            return;

        case 2: // '\002'
            b(a1, 1);
            return;

        case 4: // '\004'
            b(a1, 1);
            b(a1, 0);
            a1 = new a(j.a);
            a1.a(1, 4L);
            a2.a(12, a1);
            return;

        case 3: // '\003'
            b(a1, 4);
            b(a1, 0);
            a1 = new a(j.a);
            a1.a(1, 5L);
            a2.a(12, a1);
            return;
        }
    }

    private static void a(a a1, k k1)
    {
        int l = (int)k1.e.c;
        a a2 = new a(com.google.android.m4b.maps.by.i.a);
        a a3 = new a(com.google.android.m4b.maps.by.i.b);
        a3.a(2, l);
        a a4 = new a(com.google.android.m4b.maps.by.i.c);
        a4.a(1, a(k1.f, k1.h));
        a4.a(2, a(k1.g, k1.h));
        a3.b(1, a4);
        a4 = new a(e.a);
        if (k1.a == k1.c && k1.b == k1.d)
        {
            k1 = k1.e.b;
        } else
        {
            k1 = k1.a(new Point(k1.f / 2, k1.g / 2));
        }
        a4.a(1, a(((LatLng) (k1)).b));
        a4.a(2, a(((LatLng) (k1)).c));
        a3.b(3, a4);
        a2.b(4, a3);
        a1.a(1, a2);
    }

    private static void b(a a1, int l)
    {
        a a2 = new a(b.a);
        a2.a(1, l);
        a2.a(3, 0xf423fL);
        a1.a(2, a2);
    }
}
