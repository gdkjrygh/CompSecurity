// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.ay.n;
import com.google.android.m4b.maps.cq.af;
import com.google.android.m4b.maps.cq.s;
import com.google.android.m4b.maps.model.LatLng;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.OutputStream;

public final class ap extends n
{
    public static interface a
    {

        public abstract void a(ap ap1);
    }

    public static final class b
    {

        private final String a[];
        private final int b;
        private final com.google.android.m4b.maps.ac.a c;

        public final String a()
        {
            String s1;
            String s2;
            if (a.length > 0)
            {
                s1 = a[0];
            } else
            {
                s1 = "";
            }
            if (a.length > 1)
            {
                s2 = a[1];
            } else
            {
                s2 = "";
            }
            return (new StringBuilder(String.valueOf(s1).length() + 2 + String.valueOf(s2).length())).append(s1).append(", ").append(s2).toString();
        }

        public b(int j, String as[], com.google.android.m4b.maps.ac.a a1)
        {
            b = j;
            a = as;
            c = a1;
        }
    }


    public a a;
    private final LatLng b;
    private final double c = 9.9999999999999995E-07D;
    private final double d = 9.9999999999999995E-07D;
    private final float e;
    private volatile boolean f;
    private int g;
    private b h[];

    public ap(LatLng latlng, float f1)
    {
        f = false;
        h = null;
        b = latlng;
        e = f1;
    }

    private static int a(double d1)
    {
        return (int)Math.round(1000000D * d1);
    }

    private static com.google.android.m4b.maps.ac.a a(LatLng latlng)
    {
        com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a(s.d);
        a1.a(1, 1L);
        com.google.android.m4b.maps.ac.a a2 = new com.google.android.m4b.maps.ac.a(s.a);
        a2.a(1, a(latlng.b));
        a2.a(2, a(latlng.c));
        a1.b(2, a2);
        return a1;
    }

    private static String a(int j, com.google.android.m4b.maps.ac.a a1)
    {
        if (a1 == null)
        {
            return "";
        }
        if (a1.j(2) > j)
        {
            return a1.d(2, j);
        } else
        {
            return "";
        }
    }

    public final void a(DataOutput dataoutput)
    {
        com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a(af.a);
        a1.b(1, a(b));
        LatLng latlng = b;
        float f1 = e;
        com.google.android.m4b.maps.ac.a a2 = new com.google.android.m4b.maps.ac.a(s.e);
        a2.b(1, a(latlng));
        a2.a(2, a(9.9999999999999995E-07D));
        a2.a(3, a(9.9999999999999995E-07D));
        if (f1 > 0.0F)
        {
            a2.a(4, (int)f1);
        }
        a1.b(3, a2);
        a1.a(4, true);
        a1.a((OutputStream)dataoutput, true);
    }

    public final boolean a(DataInput datainput)
    {
        com.google.android.m4b.maps.ac.a a1;
        a1 = com.google.android.m4b.maps.ac.c.a(af.b, datainput);
        g = a1.d(1);
        g;
        JVM INSTR tableswitch 0 0: default 40
    //                   0 47;
           goto _L1 _L2
_L1:
        f = true;
        return true;
_L2:
        int k = a1.j(2);
        h = new b[k];
        int j = 0;
        while (j < k) 
        {
            datainput = a1.c(2, j);
            int l = datainput.f(1).d(1);
            String s1 = a(0, ((com.google.android.m4b.maps.ac.a) (datainput)));
            String s2 = a(1, ((com.google.android.m4b.maps.ac.a) (datainput)));
            if (datainput.i(3))
            {
                datainput = datainput.f(3);
            } else
            {
                datainput = null;
            }
            datainput = new b(l, new String[] {
                s1, s2
            }, datainput);
            h[j] = datainput;
            j++;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void b()
    {
        super.b();
        if (a != null)
        {
            a.a(this);
        }
    }

    public final int g()
    {
        return 50;
    }

    public final b h()
    {
        if (h.length <= 0)
        {
            return null;
        } else
        {
            return h[0];
        }
    }

    public final int i()
    {
        if (h != null)
        {
            return h.length;
        } else
        {
            return 0;
        }
    }
}
