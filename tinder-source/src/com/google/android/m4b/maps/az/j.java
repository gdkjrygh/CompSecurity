// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.az;

import android.util.Log;
import com.google.android.m4b.maps.aa.al;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bg.a;
import com.google.android.m4b.maps.bg.b;
import com.google.android.m4b.maps.bg.c;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ar;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.m;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.m4b.maps.az:
//            c, e

public final class j
    implements com.google.android.m4b.maps.az.c, b
{
    static final class a
    {

        final e a;
        final ar b;
        final ar c;

        a()
        {
            a = new e();
            b = ar.a(new m(new g(), new g()));
            c = ar.a(new m(new g(), new g()));
        }

        a(e e1, ar ar1, ar ar2)
        {
            a = e1;
            b = ar1;
            c = ar2;
        }
    }


    private final String b;
    private final g c;
    private final g d;
    private volatile boolean e;
    private volatile g f;
    private final CopyOnWriteArrayList g;
    private volatile a h;

    public j(String s)
    {
        this(s, new g(0x4c4b40, 0x4c4b40), new g(0x3d0900, 0x3d0900));
    }

    private j(String s, g g1, g g2)
    {
        b = s;
        c = g1;
        if (g1.a >= g2.a && g1.b >= g2.b)
        {
            d = g2;
        } else
        {
            d = c;
        }
        g = new CopyOnWriteArrayList();
        f = new g();
        h = new a();
    }

    private static ar a(g g1, g g2)
    {
        g g3 = ac.b(g1.f(g2)).b();
        g2 = ac.b(g1.e(g2)).c();
        g1 = g2;
        if (g3.a > g2.a)
        {
            g1 = g2.e(new g(0x40000000, 0));
        }
        return ar.a(new m(g3, g1));
    }

    static void a(j j1)
    {
        c c1 = com.google.android.m4b.maps.bg.c.a();
        if (c1 != null)
        {
            j1.a(c1.a(j1.b, j1));
        }
    }

    public final Collection a(ac ac1)
    {
        m m1;
        a a1;
        if (ac1.a < 15)
        {
            return al.f();
        }
        m1 = ac1.d();
        a1 = h;
        if (e || a1.c.a(m1)) goto _L2; else goto _L1
_L1:
        g g1 = m1.e();
        this;
        JVM INSTR monitorenter ;
        if (!e) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
_L2:
        if (a1.b.a(m1))
        {
            return a1.a.a(ac1);
        } else
        {
            return a;
        }
_L4:
        e = true;
        this;
        JVM INSTR monitorexit ;
        f = g1;
        if (ab.a("LazyBuildingBoundProvider", 3))
        {
            Log.d("LazyBuildingBoundProvider", "fetch thread is scheduled");
        }
        (new Thread(new Runnable() {

            private j a;

            public final void run()
            {
                com.google.android.m4b.maps.az.j.a(a);
            }

            
            {
                a = j.this;
                super();
            }
        })).start();
          goto _L2
        ac1;
        this;
        JVM INSTR monitorexit ;
        throw ac1;
    }

    public final void a(c.a a1)
    {
        if (a1 != null)
        {
            g.add(a1);
        }
    }

    public final void a(com.google.android.m4b.maps.bg.a a1)
    {
        if (a1 == null)
        {
            return;
        }
        a1;
        JVM INSTR monitorenter ;
        if (e)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        a1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
        if (!a1.a()) goto _L2; else goto _L1
_L1:
        if (ab.a("LazyBuildingBoundProvider", 3))
        {
            String s = String.valueOf(f);
            Log.d("LazyBuildingBoundProvider", (new StringBuilder(String.valueOf(s).length() + 39)).append("start fetchBuildingBoundMap : center = ").append(s).toString());
        }
        if (a1.b != 3) goto _L4; else goto _L3
_L3:
        Object obj = a1.d;
_L7:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        int i = obj.length;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        ar ar1 = a(f, c);
        ar ar2 = a(f, d);
        if (ab.a("LazyBuildingBoundProvider", 3))
        {
            double d1 = ar1.b.b();
            double d3 = ar1.b.d();
            double d5 = ar1.c.b();
            double d7 = ar1.c.d();
            Log.d("LazyBuildingBoundProvider", (new StringBuilder(119)).append("Active Area: (").append(d1).append(", ").append(d3).append("), (").append(d5).append(", ").append(d7).append(")").toString());
        }
        if (ab.a("LazyBuildingBoundProvider", 3))
        {
            double d2 = ar2.b.b();
            double d4 = ar2.b.d();
            double d6 = ar2.c.b();
            double d8 = ar2.c.d();
            Log.d("LazyBuildingBoundProvider", (new StringBuilder(123)).append("No Refetch Area: (").append(d2).append(", ").append(d4).append("), (").append(d6).append(", ").append(d8).append(")").toString());
        }
        h = new a(com.google.android.m4b.maps.az.e.a(new InputStreamReader(new ByteArrayInputStream(((byte []) (obj))), "UTF-8"), ar1), ar1, ar2);
_L5:
        e = false;
        for (obj = g.iterator(); ((Iterator) (obj)).hasNext(); ((c.a)((Iterator) (obj)).next()).a()) { }
          goto _L2
        obj;
        ((IOException) (obj)).printStackTrace();
          goto _L5
_L2:
        a1;
        JVM INSTR monitorexit ;
        return;
_L4:
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean a(com.google.android.m4b.maps.ak.a a1)
    {
        return h.a.a(a1);
    }

    public final void b(c.a a1)
    {
        if (a1 != null)
        {
            g.remove(a1);
        }
    }
}
