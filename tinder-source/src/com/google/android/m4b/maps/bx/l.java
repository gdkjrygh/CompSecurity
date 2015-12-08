// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.m4b.maps.aa.al;
import com.google.android.m4b.maps.aa.bo;
import com.google.android.m4b.maps.ax.d;
import com.google.android.m4b.maps.ax.g;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.az.h;
import com.google.android.m4b.maps.az.i;
import com.google.android.m4b.maps.bf.c;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ag;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.aq;
import com.google.android.m4b.maps.bo.bd;
import com.google.android.m4b.maps.bo.bj;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.bq.f;
import com.google.android.m4b.maps.br.b;
import com.google.android.m4b.maps.bw.a;
import com.google.android.m4b.maps.bw.e;
import com.google.android.m4b.maps.cc.q;
import com.google.android.m4b.maps.cc.r;
import com.google.android.m4b.maps.cc.t;
import com.google.android.m4b.maps.y.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            r, i, b, y, 
//            m, ae, ab, ag, 
//            n, ai, h, j, 
//            f

public class l extends com.google.android.m4b.maps.bx.r
{
    public static interface a
    {

        public abstract boolean a();
    }

    public static final class b
        implements Comparator
    {

        int a;
        int b;

        public final int compare(Object obj, Object obj1)
        {
            obj = (ac)obj;
            obj1 = (ac)obj1;
            int i1 = ((ac) (obj)).a;
            int j1 = ((ac) (obj1)).a;
            if (i1 != j1)
            {
                return j1 - i1;
            } else
            {
                i1 = 0x20000000 >> i1;
                int i2 = ((ac) (obj)).e;
                int j2 = ((ac) (obj)).f;
                int l1 = ((ac) (obj1)).e;
                int k1 = ((ac) (obj1)).f;
                i2 = Math.abs((i2 + i1) - a);
                j2 = Math.abs((j2 + i1) - b);
                l1 = Math.abs((l1 + i1) - a);
                return (i2 + j2) - (Math.abs((i1 + k1) - b) + l1);
            }
        }

        public b()
        {
        }
    }


    private static final com.google.android.m4b.maps.ax.h M = new g();
    private static final com.google.android.m4b.maps.bw.a a;
    private static final com.google.android.m4b.maps.bw.a b;
    private final ArrayList A;
    private final int B[];
    private final b C;
    private com.google.android.m4b.maps.ax.e D;
    private boolean E;
    private final Set F;
    private final e G;
    private final com.google.android.m4b.maps.bo.g H;
    private long I;
    private long J;
    private long K;
    private boolean L;
    private final Set N;
    private final ag O;
    private WeakReference P;
    private final com.google.android.m4b.maps.bw.g Q;
    final r.a c;
    boolean d;
    public final ah e;
    public final c f;
    final ArrayList g;
    com.google.android.m4b.maps.ax.f h;
    protected volatile com.google.android.m4b.maps.bx.j i;
    volatile boolean j;
    com.google.android.m4b.maps.bi.c k;
    final boolean l;
    final boolean m;
    protected volatile boolean n;
    public final com.google.android.m4b.maps.ax.h o;
    protected final com.google.android.m4b.maps.br.b p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final ArrayList y;
    private final int z[];

    l(ah ah1, c c1, com.google.android.m4b.maps.ax.h h1, int i1, int j1, int k1, r.a a1, 
            int l1, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5, 
            com.google.android.m4b.maps.bw.g g1)
    {
        C = new b();
        F = Collections.synchronizedSet(new HashSet());
        G = new e(80);
        H = new com.google.android.m4b.maps.bo.g();
        I = 0L;
        J = -1L;
        K = -1L;
        n = false;
        N = bo.a();
        e = ah1;
        f = c1;
        o = h1;
        q = i1;
        r = j1;
        c = a1;
        s = 256;
        t = l1;
        x = flag;
        u = flag1;
        v = flag2;
        w = flag3;
        l = flag4;
        m = flag5;
        O = new ag();
        f.g = O;
        if (l && !ah1.e())
        {
            p = new com.google.android.m4b.maps.br.b(toString());
        } else
        {
            p = null;
        }
        g = new ArrayList();
        y = new ArrayList();
        z = new int[i1];
        A = new ArrayList(k1);
        for (i1 = 0; i1 < k1; i1++)
        {
            A.add(new HashSet());
        }

        B = new int[k1 + 1];
        c1 = f;
        h1 = new com.google.android.m4b.maps.bf.c.d() {

            private l a;

            public final void a(ac ac1, q q1, boolean flag6)
            {
                c c2 = com.google.android.m4b.maps.bx.l.a(a);
                c2;
                JVM INSTR monitorenter ;
                if (com.google.android.m4b.maps.bx.l.b(a).d(ac1) == null || q1 == null)
                {
                    break MISSING_BLOCK_LABEL_36;
                }
                q1.f();
                c2;
                JVM INSTR monitorexit ;
                ac1 = a.i;
                if (ac1 != null && (q1 != null || !flag6))
                {
                    ac1.a(true, false);
                }
                return;
                ac1;
                c2;
                JVM INSTR monitorexit ;
                throw ac1;
            }

            
            {
                a = l.this;
                super();
            }
        };
        synchronized (c1.k)
        {
            c1.k.remove(h1);
            c1.k.add(h1);
        }
        Q = g1;
        return;
        c1;
        ah1;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public static int a(Resources resources)
    {
        return ((int)Math.floor((float)resources.getDisplayMetrics().widthPixels / 128F) + 2) * ((int)Math.floor((float)resources.getDisplayMetrics().heightPixels / 128F) + 2);
    }

    public static int a(Resources resources, int i1)
    {
        int k1 = resources.getDisplayMetrics().widthPixels * resources.getDisplayMetrics().heightPixels;
        int j1 = k1;
        if (k1 < 0x64140)
        {
            j1 = 0x64140;
        }
        float f1 = i1 / 256;
        return (int)((float)((j1 * 24) / 0x64140) / (f1 * f1));
    }

    private int a(com.google.android.m4b.maps.bi.b b1, com.google.android.m4b.maps.bx.i i1, int j1, int k1)
    {
        int l1 = 0;
        if (i1 != com.google.android.m4b.maps.bx.i.f)
        {
            int i2 = 0;
            l1 = j1;
            for (j1 = i2; l1 < k1; j1 = i2 | j1)
            {
                z[l1] = ((q)g.get(l1)).a(b1, i1);
                i2 = z[l1];
                l1++;
            }

            l1 = e.a(j1, i1);
        }
        return l1;
    }

    static c a(l l1)
    {
        return l1.f;
    }

    public static l a(Resources resources, i i1, com.google.android.m4b.maps.bs.e e1, com.google.android.m4b.maps.bw.g g1)
    {
        int j1 = a(resources, 256) * 2;
        int k1 = j1 * 2;
        resources = new com.google.android.m4b.maps.bf.a(4, k1, false, true);
        resources = new com.google.android.m4b.maps.bx.b(new c(ah.n, resources, e1, g1), M, j1, k1, com.google.android.m4b.maps.bx.r.a.g, i1, g1);
        ((com.google.android.m4b.maps.bx.b) (resources)).a.a.put(resources, null);
        ((com.google.android.m4b.maps.bx.b) (resources)).b.a.add(resources);
        ((com.google.android.m4b.maps.bx.b) (resources)).a.f.a(resources);
        return resources;
    }

    public static l a(com.google.android.m4b.maps.ax.h h1, ah ah1, Resources resources, com.google.android.m4b.maps.bs.e e1, com.google.android.m4b.maps.bw.g g1)
    {
        int i1 = a(resources, 256);
        int j1 = i1 * 2;
        resources = new com.google.android.m4b.maps.bf.a(0, j1, false, false);
        return new y(ah1, new c(ah1, new com.google.android.m4b.maps.bh.a.d(ah1, null, a), resources, a, e1, g1), h1, i1, j1, com.google.android.m4b.maps.bx.r.a.i, g1);
    }

    public static l a(ah ah1, Resources resources, com.google.android.m4b.maps.bs.e e1, com.google.android.m4b.maps.bw.g g1)
    {
        return a(ah1, ((ah) (null)), resources, e1, g1);
    }

    public static l a(ah ah1, ah ah2, Resources resources, com.google.android.m4b.maps.bs.e e1, com.google.android.m4b.maps.bw.g g1)
    {
        Object obj;
        Object obj1;
        com.google.android.m4b.maps.bf.a a1;
        boolean flag;
        int i1;
        int j1;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (ah1 == ah.a || ah1 == ah.b || ah1 == ah.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = a(resources, 256);
        j1 = i1 * 2;
        if (flag || ah1 == ah.j)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 || ah1 == ah.o || ah1 == ah.p)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag)
        {
            resources = b;
        } else
        {
            resources = com.google.android.m4b.maps.bw.a.a;
        }
        if (flag1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        a1 = new com.google.android.m4b.maps.bf.a(8, j1, flag3, false);
        obj1 = null;
        obj = obj1;
        if (ah2 != null)
        {
            if (com.google.android.m4b.maps.bq.l.a(ah2))
            {
                obj = com.google.android.m4b.maps.bq.l.b(ah2);
                if (obj instanceof f)
                {
                    obj = (f)obj;
                } else
                {
                    obj = obj1;
                    if (ab.a("TileOverlay", 6))
                    {
                        ah2 = String.valueOf(ah2);
                        Log.e("TileOverlay", (new StringBuilder(String.valueOf(ah2).length() + 32)).append("Tile store not a Prefetcher for ").append(ah2).toString());
                        obj = obj1;
                    }
                }
            } else
            {
                obj = obj1;
                if (ab.a("TileOverlay", 6))
                {
                    ah2 = String.valueOf(ah2);
                    Log.e("TileOverlay", (new StringBuilder(String.valueOf(ah2).length() + 41)).append("Cannot pre-fetch unregistered tile type: ").append(ah2).toString());
                    obj = obj1;
                }
            }
        }
        if (obj == null)
        {
            ah2 = new c(ah1, new com.google.android.m4b.maps.bh.a.d(ah1, null, resources), a1, resources, e1, g1);
        } else
        {
            ah2 = new com.google.android.m4b.maps.bf.d(ah1, ((f) (obj)), new com.google.android.m4b.maps.bh.a.d(ah1, null, resources), a1, resources, e1, g1);
        }
        return new l(ah1, ah2, new d(), i1, j1, 8, com.google.android.m4b.maps.bx.r.a.c, 256, false, false, flag1, flag1, true, flag2, g1);
    }

    public static com.google.android.m4b.maps.bx.m a(Resources resources, ah ah1, com.google.android.m4b.maps.bs.e e1, com.google.android.m4b.maps.bw.g g1)
    {
        int i1 = a(resources, 256);
        int j1 = i1 * 2;
        return new com.google.android.m4b.maps.bx.m(new c(ah1, new com.google.android.m4b.maps.bf.a(0, j1, false, true), e1, g1), M, i1, j1, com.google.android.m4b.maps.bx.r.a.f, g1);
    }

    static e b(l l1)
    {
        return l1.G;
    }

    public static l b(ah ah1, Resources resources, com.google.android.m4b.maps.bs.e e1, com.google.android.m4b.maps.bw.g g1)
    {
        int i1 = a(resources, 256);
        int j1 = i1 * 2;
        resources = com.google.android.m4b.maps.bw.a.a;
        com.google.android.m4b.maps.bf.a a1 = new com.google.android.m4b.maps.bf.a(8, j1, false, false);
        return new l(ah1, new c(ah1, new com.google.android.m4b.maps.bh.a.d(ah1, null, resources), a1, resources, e1, g1), new d(), i1, j1, 8, com.google.android.m4b.maps.bx.r.a.c, 256, false, false, false, false, false, false, g1);
    }

    public static l c(ah ah1, Resources resources, com.google.android.m4b.maps.bs.e e1, com.google.android.m4b.maps.bw.g g1)
    {
        int i1 = a(resources);
        int j1 = i1 * 2;
        return new l(ah1, new c(ah1, new com.google.android.m4b.maps.bf.a(4, j1, false, true), e1, g1), M, i1, j1, 4, com.google.android.m4b.maps.bx.r.a.b, 384, true, true, false, false, false, false, g1);
    }

    public static ae d(ah ah1, Resources resources, com.google.android.m4b.maps.bs.e e1, com.google.android.m4b.maps.bw.g g1)
    {
        int i1 = a(resources);
        int j1 = i1 * 2;
        return new ae(ah1, new c(ah1, new com.google.android.m4b.maps.bf.a(4, j1, false, true), e1, g1), M, i1, j1, com.google.android.m4b.maps.bx.r.a.h, resources, g1);
    }

    public int a(aq aq1, com.google.android.m4b.maps.bx.f f1, Set set)
    {
        Iterator iterator = g.iterator();
        int i1 = 0;
label0:
        do
        {
            Object obj;
            int j1;
label1:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                obj = (q)iterator.next();
                j1 = i1;
                if (obj == null)
                {
                    break label1;
                }
                if (aq1 != null)
                {
                    j1 = i1;
                    if (!aq1.b(((q) (obj)).b().d()))
                    {
                        break label1;
                    }
                }
                ((q) (obj)).a(p);
                j1 = i1;
                if (((q) (obj)).a(f1))
                {
                    j1 = Math.max(i1, ((q) (obj)).b().a);
                }
            }
            i1 = j1;
            if (obj instanceof t)
            {
                obj = (t)obj;
                i1 = j1;
                if (((t) (obj)).b != null)
                {
                    set.addAll(((t) (obj)).b);
                    obj.b = null;
                    i1 = j1;
                }
            }
        } while (true);
        return i1;
    }

    protected Set a(com.google.android.m4b.maps.bi.b b1)
    {
        return al.f();
    }

    public final void a(int i1)
    {
        boolean flag;
        if ((i1 & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        E = flag;
    }

    protected void a(com.google.android.m4b.maps.ax.f f1)
    {
        h = f1;
        J = -1L;
    }

    public final void a(com.google.android.m4b.maps.bi.b b1, com.google.android.m4b.maps.bx.i i1, HashSet hashset, HashSet hashset1, int ai1[])
    {
        int j1 = -1;
        a(b1, i1, g.size(), 0);
        b1 = g.iterator();
        do
        {
            if (!b1.hasNext())
            {
                break;
            }
            i1 = (q)b1.next();
            i1.a(hashset);
            i1.b(hashset1);
            int k1 = i1.g();
            if (k1 > j1)
            {
                j1 = k1;
            }
        } while (true);
        if (ai1 != null && ai1.length > 0)
        {
            ai1[0] = j1;
        }
    }

    public void a(com.google.android.m4b.maps.bm.d d1)
    {
        P = null;
        i = null;
        d1 = f;
        if (((c) (d1)).b != null)
        {
            ((c) (d1)).b.b(((c) (d1)).n, ((c) (d1)).d);
            d1.a();
        }
        j = true;
    }

    public void a(com.google.android.m4b.maps.bm.d d1, com.google.android.m4b.maps.bi.b b1, com.google.android.m4b.maps.bx.ab ab1)
    {
        if (ab1.b <= 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        com.google.android.m4b.maps.bx.i i1;
        com.google.android.m4b.maps.bx.ag ag1;
        com.google.android.m4b.maps.bx.ab ab2;
        i1 = ab1.a;
        ag1 = ab1.c;
        ab2 = new com.google.android.m4b.maps.bx.ab(ab1);
        if (!ag1.d)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        if (j) goto _L4; else goto _L3
_L3:
        Iterator iterator = g.iterator();
_L8:
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L5:
        q q2;
        q2 = (q)iterator.next();
        com.google.android.m4b.maps.ay.k.a();
        if (!q2.c()) goto _L8; else goto _L7
_L7:
        boolean flag = true;
_L10:
        if (flag)
        {
            j = true;
        }
_L4:
        if (j && !E)
        {
            a(b1, d1);
        }
        if (y.size() <= 0 || (((q)y.get(0)).a(b1, i1) & 1) == 0)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        d1.f();
        ab2.b = 1;
        ((q)y.get(0)).b(d1, b1, ab2);
        for (Iterator iterator1 = y.iterator(); iterator1.hasNext(); ((q)iterator1.next()).a(d1, b1, ab1)) { }
        break; /* Loop/switch isn't completed */
_L6:
        flag = false;
        if (true) goto _L10; else goto _L9
_L9:
        d1.g();
        if (L)
        {
            ab1 = f;
            Object obj1 = g;
            ArrayList arraylist = com.google.android.m4b.maps.aa.f.c(((List) (obj1)).size());
            obj1 = ((List) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                q q4 = (q)((Iterator) (obj1)).next();
                if (q4 != c.a)
                {
                    arraylist.add(q4.b());
                }
            } while (true);
            ((c) (ab1)).b.a(((c) (ab1)).n, ((c) (ab1)).d, arraylist);
        }
        int l1;
        int i2;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        int j2;
        boolean flag4;
        if (v && (i1 == com.google.android.m4b.maps.bx.i.a || i1 == com.google.android.m4b.maps.bx.i.c) && (!y.isEmpty() || B[0] < g.size()) && ag1.a())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (d1.m > 0 && e.e() && m && d1.n)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!flag2 && d1.m > 0 && (e.equals(ah.x) || e.equals(ah.w)))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag2 || flag3)
        {
            d1.d();
        }
        i2 = g.size();
        j2 = A.size();
        l1 = 0;
        flag4 = ag1.b();
        if (flag3)
        {
            d1.a.glStencilOp(7681, 7681, 7681);
            d1.a.glStencilMask(127);
            for (int j1 = g.size() - 1; j1 >= 0; j1--)
            {
                ab1 = (q)g.get(j1);
                d1.a.glStencilFunc(512, ab1.b().a, 127);
                d1.a.glPushMatrix();
                ab1 = ab1.b().d();
                com.google.android.m4b.maps.bx.n.a(d1, b1, ab1.c(), ab1.f());
                com.google.android.m4b.maps.cc.r.a(d1);
                d1.a.glPopMatrix();
            }

            d1.a.glStencilOp(7680, 7680, 7680);
        }
_L12:
        int k1;
        if (j2 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (B[j2] <= 0)
        {
            break MISSING_BLOCK_LABEL_1518;
        }
        k1 = i2 - B[j2];
        if (flag1)
        {
            for (int k2 = k1; k2 < i2; k2++)
            {
                ab1 = (q)g.get(k2);
                if (!ab1.e() && ab1.b().a >= 14)
                {
                    ac ac1 = ab1.b();
                    ab1 = d1.a;
                    int j3 = ac1.a;
                    ab1.glPushMatrix();
                    com.google.android.m4b.maps.bx.n.a(d1, b1, ac1.b(), 0x40000000 >> j3);
                    d1.r.d(d1);
                    int ai1[] = com.google.android.m4b.maps.bx.ai.a(i1);
                    ab1.glColor4x(ai1[0], ai1[1], ai1[2], ai1[3]);
                    ab1.glDrawArrays(5, 0, 4);
                    ab1.glPopMatrix();
                }
            }

        }
        if (flag2)
        {
            d1.a.glStencilOp(7681, 7681, 7681);
            d1.a.glStencilMask(127);
            for (int l2 = k1; l2 < i2; l2++)
            {
                ab1 = (q)g.get(l2);
                d1.a.glStencilFunc(512, l2 + 1, 127);
                d1.a.glPushMatrix();
                ab1 = ab1.b().d();
                com.google.android.m4b.maps.bx.n.a(d1, b1, ab1.c(), ab1.f());
                com.google.android.m4b.maps.cc.r.a(d1);
                d1.a.glPopMatrix();
            }

            d1.a.glStencilOp(7680, 7680, 7680);
        }
        int i3 = a(b1, i1, k1, i2);
        int k3 = 0;
        while (i3 != 0) 
        {
            int l3 = l1;
            if ((i3 & 1) != 0)
            {
                d1.f();
                ab2.b = k3;
                ((q)g.get(k1)).b(d1, b1, ab2);
                l3 = k1;
                while (l3 < i2) 
                {
                    q q3 = (q)g.get(l3);
                    af af1 = q3.b().d;
                    Object obj = null;
                    ab1 = obj;
                    if (e == ah.n)
                    {
                        ab1 = obj;
                        if (af1 != null)
                        {
                            ab1 = (bj)af1.a(com.google.android.m4b.maps.bo.bd.a.d);
                            com.google.android.m4b.maps.bo.g g1;
                            if (ab1 == null)
                            {
                                ab1 = null;
                            } else
                            {
                                ab1 = ((bj) (ab1)).a.a;
                            }
                            ab1 = ag1.a(ab1);
                            if (ab1 == null)
                            {
                                continue;
                            }
                        }
                    }
                    if ((z[l3] & 1 << k3) == 0)
                    {
                        continue;
                    }
                    if (flag2)
                    {
                        d1.a.glStencilFunc(514, l3 + 1, 127);
                    }
                    if (flag3)
                    {
                        d1.a.glStencilFunc(514, q3.b().a, 127);
                        q3.f();
                    }
                    d1.f();
                    g1 = q3.b().d().c();
                    if (ab1 != null)
                    {
                        ab1.a(d1, b1, ab2, g1);
                    }
                    q3.a(d1, b1, ab2);
                    if (ab1 != null)
                    {
                        ab1.a(d1, ab2);
                    }
                    l1 = 1;
                    d1.g();
                    l3++;
                }
                d1.g();
                l3 = l1;
            }
            k3++;
            i3 >>>= 1;
            l1 = l3;
        }
        if (flag4 && l1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L13:
        j2--;
        i2 = k1;
        if (true) goto _L12; else goto _L11
_L11:
        if (flag2 || flag3)
        {
            d1.e();
        }
        if (ag1.e && L)
        {
            d1 = f;
            ab1 = g;
            b1 = com.google.android.m4b.maps.aa.f.c(ab1.size());
            ab1 = ab1.iterator();
            do
            {
                if (!ab1.hasNext())
                {
                    break;
                }
                q q1 = (q)ab1.next();
                if (q1 != c.a)
                {
                    b1.add(q1.b());
                }
            } while (true);
            ((c) (d1)).b.b(((c) (d1)).n, ((c) (d1)).d, b1);
            L = false;
            return;
        }
          goto _L1
        k1 = i2;
          goto _L13
    }

    public final void a(com.google.android.m4b.maps.bm.d d1, com.google.android.m4b.maps.bx.j j1)
    {
label0:
        {
            P = new WeakReference(d1);
            c c1 = f;
            com.google.android.m4b.maps.y.j.a(d1, "GLState should not be null");
            c1.n = d1;
            com.google.android.m4b.maps.bh.a.a(new k());
            c1.b = com.google.android.m4b.maps.bh.a.a();
            i = j1;
            if (h == null)
            {
                a(o.a(e, t, x, O, Q));
                D = o.a(e, x, O, Q);
                if (D == null)
                {
                    if (!(h instanceof com.google.android.m4b.maps.ax.e))
                    {
                        break label0;
                    }
                    D = (com.google.android.m4b.maps.ax.e)h;
                }
            }
            return;
        }
        throw new IllegalStateException("Bad out-of-bounds coord generator");
    }

    public final void a(a a1)
    {
        F.add(a1);
    }

    public void a(Set set, Map map)
    {
        set.add(p);
    }

    public final void a(boolean flag)
    {
        c c1 = f;
        if (c1.b != null)
        {
            c1.b.a(flag);
        }
        j = true;
    }

    public boolean a(com.google.android.m4b.maps.bi.b b1, com.google.android.m4b.maps.bm.d d1)
    {
        Object obj;
        List list;
        HashSet hashset;
        com.google.android.m4b.maps.bh.a a1;
        int i1;
        int j1;
        int k1;
        int l1;
        n = false;
        L = true;
        b1.a(H);
        list = h.a(b1);
        if (list.size() > 1)
        {
            d1 = C;
            com.google.android.m4b.maps.bo.g g1 = com.google.android.m4b.maps.bo.g.a(b1.b.a);
            d1.a = g1.a;
            d1.b = g1.b;
            Collections.sort(list, C);
        }
        k1 = (int)((float)s * b1.j);
        N.addAll(g);
        g.clear();
        y.clear();
        Arrays.fill(B, 0);
        l1 = A.size();
        hashset = new HashSet();
        boolean flag = f.a();
        if (E)
        {
            d1 = k;
            k = null;
            ac ac3;
            Object obj1;
            int ai1[];
            if (d1 != null)
            {
                d1 = new com.google.android.m4b.maps.bi.b(d1, b1.h, b1.h, b1.j);
                f.a(h, new com.google.android.m4b.maps.bo.g(com.google.android.m4b.maps.bo.g.a(((com.google.android.m4b.maps.bi.b) (d1)).d)), h.a(d1), null, E);
            } else
            {
                f.l.a();
            }
        } else
        if (I != b1.p || J != h.a() || K != O.b() || j || flag)
        {
            d1 = a(b1);
            f.a(h, new com.google.android.m4b.maps.bo.g(com.google.android.m4b.maps.bo.g.a(b1.d)), list, d1, E);
            I = b1.p;
            J = h.a();
            K = O.b();
        }
        j1 = f.i.get();
        a1 = com.google.android.m4b.maps.bh.a.a();
        a1;
        JVM INSTR monitorenter ;
        d1 = f;
        ((c) (d1)).b.d(((c) (d1)).n, ((c) (d1)).d);
        i1 = 0;
        obj = list;
          goto _L1
_L20:
        obj = ((Collection) (obj)).iterator();
_L8:
        if (!((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        ac3 = (ac)((Iterator) (obj)).next();
        obj1 = f.a(ac3);
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        g.add(obj1);
        P.get();
        if (!N.remove(obj1))
        {
            ((q) (obj1)).a(true);
        }
        ai1 = B;
        ai1[i1] = ai1[i1] + 1;
        if (g.size() == q) goto _L3; else goto _L5
_L5:
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        if (!((q) (obj1)).e()) goto _L8; else goto _L7
_L7:
        if (d1 == null) goto _L10; else goto _L9
_L9:
        obj1 = h.a(ac3, H);
        if (obj1 == null) goto _L10; else goto _L11
_L11:
        d1.add(obj1);
_L10:
        if (i1 != 0) goto _L8; else goto _L12
_L12:
        hashset.add(ac3);
          goto _L8
        b1;
        a1;
        JVM INSTR monitorexit ;
        throw b1;
_L18:
        d1 = (Set)A.get(i1);
        d1.clear();
        continue; /* Loop/switch isn't completed */
_L3:
        if (g.size() == q || d1 == null) goto _L14; else goto _L13
_L13:
        if (d1.size() == 0) goto _L14; else goto _L15
_L15:
        i1++;
        obj = d1;
          goto _L1
_L14:
        d1 = f;
        if (com.google.android.m4b.maps.ao.b.a)
        {
            ((c) (d1)).b.c(((c) (d1)).n, ((c) (d1)).d);
        }
        a1;
        JVM INSTR monitorexit ;
        if (ab.a("TileOverlay", 3))
        {
            d1 = String.valueOf(e);
            i1 = list.size();
            l1 = B[0];
            Log.d("TileOverlay", (new StringBuilder(String.valueOf(d1).length() + 66)).append("TileType: ").append(d1).append(", expected: ").append(i1).append(", numTilesAtLevel[0]: ").append(l1).toString());
        }
        boolean flag1;
        if (B[0] == list.size())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        n = flag1;
        if (d)
        {
            ac ac1;
            for (d1 = hashset.iterator(); d1.hasNext(); y.add(new com.google.android.m4b.maps.cc.e(ac1, k1 << i1)))
            {
                ac1 = (ac)d1.next();
                i1 = Math.max(0, Math.round(b1.b.b) - ac1.a);
            }

            ac ac2;
            for (d1 = D.b(b1).iterator(); d1.hasNext(); y.add(new com.google.android.m4b.maps.cc.e(ac2, k1 << i1)))
            {
                ac2 = (ac)d1.next();
                i1 = Math.max(0, Math.round(b1.b.b) - ac2.a);
            }

        }
        j = E;
        i1 = f.i.get();
        if (!j && i1 - j1 == 0)
        {
            synchronized (F)
            {
                d1 = new ArrayList(F);
            }
            for (b1 = d1.iterator(); b1.hasNext(); d1.a())
            {
                d1 = (a)b1.next();
                g.isEmpty();
            }

        }
        break MISSING_BLOCK_LABEL_1096;
        d1;
        b1;
        JVM INSTR monitorexit ;
        throw d1;
        for (b1 = N.iterator(); b1.hasNext(); ((q)b1.next()).a(false)) { }
        N.clear();
        return true;
_L1:
        if (i1 > l1) goto _L14; else goto _L16
_L16:
        if (i1 != l1) goto _L18; else goto _L17
_L17:
        d1 = null;
        if (true) goto _L20; else goto _L19
_L19:
    }

    public final boolean a(bd bd)
    {
        return O.a(bd);
    }

    public final r.a d()
    {
        return c;
    }

    public final boolean e()
    {
        return n;
    }

    protected ag.a i()
    {
        return com.google.android.m4b.maps.bx.ag.a.a;
    }

    public final void l_()
    {
        c c1 = f;
        if (c1.b != null)
        {
            c1.b.b();
        }
        j = true;
    }

    public String toString()
    {
        return com.google.android.m4b.maps.y.h.a(this).a("tileType", e).a("isBase", m).a("maxTilesPerView", q).a("maxTilesToFetch", r).a("drawOrder", c).a("fetchMissingAncestorTiles", u).a("allowMultiZoom", x).a("prefetchAncestors", w).a("tileSize", s).a("allowMultiZoom", x).a("isContributingLabels", l).a("maxTileSize", t).toString();
    }

    static 
    {
        a = com.google.android.m4b.maps.bw.a.a(new int[] {
            4
        });
        b = com.google.android.m4b.maps.bw.a.a(t.a, a);
    }
}
