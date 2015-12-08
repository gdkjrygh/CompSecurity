// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.az.i;
import com.google.android.m4b.maps.bb.l;
import com.google.android.m4b.maps.bn.a;
import com.google.android.m4b.maps.bn.c;
import com.google.android.m4b.maps.bn.e;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bn.m;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ak;
import com.google.android.m4b.maps.bo.av;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bo.d;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.t;
import com.google.android.m4b.maps.bx.ab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            d

public final class b extends com.google.android.m4b.maps.cc.d
{
    static final class a
    {

        int a;
        int b;
        int c;
        int d;

        a()
        {
        }
    }


    private static final g c = new g(46340, 46340, 0);
    private static final Comparator d = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (av)obj;
            return ((av)obj1).d - ((av) (obj)).d;
        }

    };
    private final k e;
    private final com.google.android.m4b.maps.bn.a f;
    private l g;
    private final c h;
    private final c i;
    private final com.google.android.m4b.maps.bn.d j;
    private final g k = new g();
    private final g l = new g();
    private final g m = new g();
    private final g n = new g();
    private final g o = new g();
    private final g p = new g();
    private final g q = new g();
    private final g r = new g();
    private final g s = new g();

    private b(a a1, Set set)
    {
        super(set);
        g = new l();
        e = new m(a1.a);
        f = new com.google.android.m4b.maps.bn.b(a1.a);
        h = new e(a1.c + a1.b);
        i = new e(a1.d);
        j = new c(a1.c);
    }

    private static int a(int i1)
    {
        return Math.min(i1 >> 24 & 0xff, 160) << 24 | 0xffffff & i1;
    }

    public static b a(ac ac1, String as[], com.google.android.m4b.maps.bo.ap.b b1)
    {
        com.google.android.m4b.maps.az.c c1 = com.google.android.m4b.maps.az.i.a().f;
        ArrayList arraylist = new ArrayList(128);
        a a1 = new a();
        HashSet hashset = new HashSet();
        while (b1.hasNext()) 
        {
            bb bb1 = b1.a();
            if (!(bb1 instanceof av))
            {
                break;
            }
            av av1 = (av)bb1;
            int j1 = av1.b.a();
            int i1 = av1.c();
            j1 *= 3;
            int k1 = i1 * 4 + (a1.a + j1);
            int ai[];
            if (k1 > 16384 && a1.a > 0)
            {
                i1 = 0;
            } else
            {
                a1.a = k1;
                a1.b = j1 + a1.b;
                a1.c = a1.c + i1 * 6;
                a1.d = a1.d + i1 * 2;
                i1 = 1;
            }
            if (i1 == 0)
            {
                break;
            }
            ai = bb1.f();
            j1 = ai.length;
            for (i1 = 0; i1 < j1; i1++)
            {
                k1 = ai[i1];
                if (k1 >= 0 && k1 < as.length)
                {
                    hashset.add(as[k1]);
                }
            }

            boolean flag;
            if (com.google.android.m4b.maps.bo.d.a(av1.f, 4) || c1 != null && c1.a(av1.a))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                arraylist.add(av1);
            }
            b1.next();
        }
        Collections.sort(arraylist, d);
        ac1 = ac1.d();
        float f1 = (float)com.google.android.m4b.maps.bo.g.a(ac1.c().b());
        as = new b(a1, hashset);
        for (b1 = arraylist.iterator(); b1.hasNext(); as.a(((com.google.android.m4b.maps.bo.m) (ac1)), (av)b1.next(), f1)) { }
        ((b) (as)).h.a((c)((b) (as)).j, 0, ((b) (as)).j.b());
        ((c)((b) (as)).j).a(null);
        return as;
    }

    public static void a(com.google.android.m4b.maps.bm.d d1, int i1)
    {
        GL10 gl10 = d1.a;
        if ((d1.d & 0x20) == 0)
        {
            d1.k = true;
            d1.a.glEnable(2929);
            d1.a(32, true);
        }
        if ((d1.d & 0x40) == 0)
        {
            d1.a.glEnable(32823);
            d1.a(64, true);
        }
        gl10.glPolygonOffsetx(0x10000, 0x10000);
        if (i1 == 11)
        {
            gl10.glBlendFunc(0, 1);
            gl10.glDepthFunc(513);
        } else
        if (i1 == 12)
        {
            d1.a();
            gl10.glDepthFunc(515);
            gl10.glBlendFunc(770, 771);
            gl10.glLineWidthx(0x10000);
            return;
        }
    }

    private void a(g g1, g g2, g g3, g g4, int i1, int j1)
    {
        int k1 = e.a();
        e.a(g1, i1);
        e.a(g3, i1);
        e.a(g2, i1);
        e.a(g4, i1);
        j.a(k1 + 1, k1, k1 + 3, k1 + 2);
        i.a((short)(k1 + 1), (short)(k1 + 3));
        com.google.android.m4b.maps.bo.g.b(g2, g1, s);
        g1 = f;
        g2 = s;
        k1 = (int)(com.google.android.m4b.maps.bo.g.b(g2, c) / g2.e());
        i1 = k1;
        if (k1 < 0)
        {
            i1 = -k1;
        }
        i1 = (i1 * 19660 >> 16) + 45875;
        g1.b(i1 * (j1 & 0xff) >> 16 | (0xff000000 & j1 | ((j1 >> 16 & 0xff) * i1 >> 16) << 16 | ((j1 >> 8 & 0xff) * i1 >> 16) << 8), 4);
    }

    private void a(com.google.android.m4b.maps.bo.m m1, av av1, float f1)
    {
        t t1 = av1.c;
        ak ak1 = av1.b;
        int k1 = ak1.a();
        int i1 = t1.c();
        if (k1 != 0 && i1 != 0)
        {
            g g1 = m1.c();
            int l1 = m1.f();
            int j1 = av1.d;
            int i2 = av1.e;
            q.a(0, 0, (int)((float)j1 * f1));
            int j2 = a(t1.b[0]);
            if (i1 > 1)
            {
                i1 = a(t1.b[1]);
            } else
            {
                i1 = ((j2 >> 16 & 0xff) + 765 >> 2) << 16 | 0xff000000 & j2 | ((j2 >> 8 & 0xff) + 765 >> 2) << 8 | (j2 & 0xff) + 765 >> 2;
            }
            j1 = 0;
            while (j1 < k1) 
            {
                int k2 = e.a();
                ak1.a(j1, k, l, m);
                com.google.android.m4b.maps.bo.g.b(k, g1, k);
                com.google.android.m4b.maps.bo.g.b(l, g1, l);
                com.google.android.m4b.maps.bo.g.b(m, g1, m);
                if (i2 != 0)
                {
                    r.a(0, 0, (int)((float)i2 * f1));
                    com.google.android.m4b.maps.bo.g.a(k, r, k);
                    com.google.android.m4b.maps.bo.g.a(l, r, l);
                    com.google.android.m4b.maps.bo.g.a(m, r, m);
                }
                com.google.android.m4b.maps.bo.g.a(k, q, n);
                com.google.android.m4b.maps.bo.g.a(l, q, o);
                com.google.android.m4b.maps.bo.g.a(m, q, p);
                e.a(n, l1);
                e.a(o, l1);
                e.a(p, l1);
                f.b(i1, 3);
                h.a((short)k2, (short)(k2 + 1), (short)(k2 + 2));
                if (av1.a(j1, 0))
                {
                    a(k, l, n, o, l1, j2);
                }
                if (av1.a(j1, 1))
                {
                    a(l, m, o, p, l1, j2);
                }
                if (av1.a(j1, 2))
                {
                    a(m, k, p, n, l1, j2);
                }
                j1++;
            }
        }
    }

    public final int a()
    {
        int i1 = e.c();
        int j1 = f.a();
        int k1 = h.c();
        int l1 = i.c();
        return ((c)j).c() + (l1 + (i1 + j1 + k1));
    }

    public final void a(com.google.android.m4b.maps.bm.d d1, com.google.android.m4b.maps.bi.b b1, ab ab1)
    {
        if (e.a() != 0)
        {
            e.d(d1);
            f.c(d1);
            int i1;
            if (g != null)
            {
                b1 = g;
                long l1 = d1.j;
                if (!((l) (b1)).a.hasStarted())
                {
                    ((l) (b1)).a.start();
                }
                ((l) (b1)).a.b(l1);
                i1 = ((Integer)((l) (b1)).a.b()).intValue();
                if (!((l) (b1)).a.hasEnded())
                {
                    d1.h = true;
                }
                if (i1 == 0x10000)
                {
                    g = null;
                } else
                {
                    d1.a.glScalex(0x10000, 0x10000, i1);
                }
            } else
            {
                i1 = 0x10000;
            }
            if (ab1.b == 11)
            {
                h.a(d1, 4);
                return;
            }
            if (ab1.b == 12)
            {
                h.a(d1, 4);
                if (i1 == 0x10000)
                {
                    i.a(d1, 1);
                    return;
                }
            }
        }
    }

    public final int b()
    {
        int i1 = e.d();
        int j1 = f.b();
        int k1 = h.d();
        int l1 = i.d();
        return ((c)j).d() + (l1 + (i1 + 352 + j1 + k1));
    }

    public final void b(com.google.android.m4b.maps.bm.d d1)
    {
        e.b(d1);
        f.a(d1);
        h.b(d1);
        i.b(d1);
    }

    public final void c(com.google.android.m4b.maps.bm.d d1)
    {
        e.c(d1);
        f.b(d1);
        h.c(d1);
        i.c(d1);
    }

}
