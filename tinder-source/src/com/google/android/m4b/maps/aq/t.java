// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.content.res.Resources;
import android.util.Log;
import com.google.android.m4b.maps.aa.bo;
import com.google.android.m4b.maps.ax.f;
import com.google.android.m4b.maps.ax.g;
import com.google.android.m4b.maps.ax.h;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bh.a;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ag;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bx.l;
import com.google.android.m4b.maps.cc.q;
import com.google.android.m4b.maps.cg.bb;
import com.google.android.m4b.maps.cg.bd;
import com.google.android.m4b.maps.y.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            l, s, m

public final class t
    implements com.google.android.m4b.maps.aq.l, s.a, com.google.android.m4b.maps.cg.bd.a
{
    public static final class a
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

        public a()
        {
        }
    }


    private static final h n = new g();
    private final int a;
    private final int b = 332;
    private final boolean c = false;
    private final s d;
    private final ArrayList e = new ArrayList();
    private final a f = new a();
    private f g;
    private volatile com.google.android.m4b.maps.bx.j h;
    private boolean i;
    private volatile boolean j;
    private boolean k;
    private volatile boolean l;
    private final h m;
    private final Set o = bo.a();
    private final ag p = new ag();
    private WeakReference q;
    private float r;
    private final m s;
    private final bd t;
    private final com.google.android.m4b.maps.bw.g u;

    private t(m m1, bd bd1, s s1, h h1, int i1, com.google.android.m4b.maps.bw.g g1)
    {
        l = false;
        s = m1;
        t = bd1;
        d = s1;
        m = h1;
        a = i1;
        u = g1;
        a(-1);
    }

    public static t a(bd bd1, Resources resources, m m1, ScheduledExecutorService scheduledexecutorservice, e e1, com.google.android.m4b.maps.bw.g g1)
    {
        int i1 = com.google.android.m4b.maps.bx.l.a(resources, 332);
        boolean flag;
        if (bd1.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.a(flag, "TileOverlay.Options must specify a TileProvider");
        resources = new s(new bb(scheduledexecutorservice, new Random(), bd1.b), bd1.a(), e1);
        bd1 = new t(m1, bd1, resources, n, i1, g1);
        resources.a(bd1);
        return bd1;
    }

    public final void a()
    {
        synchronized (s)
        {
            s.a(this);
        }
        s.b();
        return;
        exception;
        m1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i1)
    {
        if ((i1 & 2) != 0)
        {
            synchronized (s)
            {
                r = t.f();
                s.c();
            }
        }
        if ((i1 & 4) != 0)
        {
            s.b();
        }
        return;
        exception;
        m1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(long l1)
    {
    }

    public final void a(b b1, d d1)
    {
        Object obj;
        boolean flag;
        boolean flag2;
        flag2 = true;
        l = false;
        if (!t.h())
        {
            return;
        }
        k = true;
        d1 = g.a(b1);
        if (d1.size() > 1)
        {
            a a1 = f;
            b1 = com.google.android.m4b.maps.bo.g.a(b1.b.a);
            a1.a = ((com.google.android.m4b.maps.bo.g) (b1)).a;
            a1.b = ((com.google.android.m4b.maps.bo.g) (b1)).b;
            Collections.sort(d1, f);
        }
        o.addAll(e);
        e.clear();
        b1 = d;
        Iterator iterator;
        boolean flag3;
        if (((s) (b1)).e != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.b(flag);
        ((s) (b1)).f.d(((s) (b1)).e, ((s) (b1)).b);
        flag3 = i;
        iterator = d1.iterator();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        obj = (ac)iterator.next();
        if (!flag3) goto _L4; else goto _L3
_L3:
        b1 = d.a(((ac) (obj)), false);
_L5:
        if (b1 != null)
        {
            e.add(b1);
            q.get();
            if (!o.remove(b1))
            {
                b1.a(true);
            }
            e.size();
            if (e.size() == a)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        b1 = d;
        s s1;
        if (((s) (b1)).e != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.b(flag);
        if (com.google.android.m4b.maps.ao.b.a)
        {
            ((s) (b1)).f.c(((s) (b1)).e, ((s) (b1)).b);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = d;
        b1 = s1.a(((ac) (obj)), true);
        if (b1 == null)
        {
            if (s1.d.add(obj))
            {
                b1 = s1.c;
                obj = new com.google.android.m4b.maps.cg.bb.b(b1, ((ac) (obj)).b, ((ac) (obj)).c, ((ac) (obj)).a, s1);
                ((bb) (b1)).b.execute(((Runnable) (obj)));
            }
            b1 = null;
        }
        if (true) goto _L5; else goto _L2
_L2:
        if (ab.a("TileOverlayRendererImpl", 3))
        {
            b1 = t.a();
            int i1 = d1.size();
            int j1 = e.size();
            Log.d("TileOverlayRendererImpl", (new StringBuilder(String.valueOf(b1).length() + 55)).append("ID: ").append(b1).append(", expected: ").append(i1).append(", mTiles.size(): ").append(j1).toString());
        }
        boolean flag1;
        if (e.size() == d1.size())
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        l = flag1;
        j = i;
        for (b1 = o.iterator(); b1.hasNext(); ((q)b1.next()).a(false)) { }
        o.clear();
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(d d1)
    {
        Object obj;
        q = null;
        h = null;
        d.a();
        obj = d;
        d1 = ((s) (obj)).g;
        d1;
        JVM INSTR monitorenter ;
        for (Iterator iterator = ((s) (obj)).g.iterator(); iterator.hasNext(); ((com.google.android.m4b.maps.cg.bb.b)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_68;
        obj;
        d1;
        JVM INSTR monitorexit ;
        throw obj;
        ((s) (obj)).g.clear();
        d1;
        JVM INSTR monitorexit ;
        j = true;
        return;
    }

    public final void a(d d1, b b1, com.google.android.m4b.maps.bx.ab ab1)
    {
        if (t.h() && ab1.b <= 0)
        {
            ab1 = new com.google.android.m4b.maps.bx.ab(ab1);
            if (j && !i)
            {
                a(b1, d1);
            }
            if (k)
            {
                s s1 = d;
                Object obj = e;
                ArrayList arraylist;
                boolean flag;
                if (s1.e != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.b(flag);
                arraylist = new ArrayList(((List) (obj)).size());
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    q q2 = (q)((Iterator) (obj)).next();
                    if (q2 != com.google.android.m4b.maps.aq.s.a)
                    {
                        arraylist.add(q2.b());
                    }
                } while (true);
                s1.f.a(s1.e, s1.b, arraylist);
            }
            if (e.size() > 0)
            {
                d1.f();
                ab1.b = 1;
                ((q)e.get(0)).b(d1, b1, ab1);
                q q1;
                for (Iterator iterator = e.iterator(); iterator.hasNext(); q1.a(d1, b1, ab1))
                {
                    q1 = (q)iterator.next();
                    if (!t.j())
                    {
                        q1.f();
                    }
                }

                d1.g();
            }
            if (k)
            {
                d.a(e);
                k = false;
                return;
            }
        }
    }

    public final void a(d d1, com.google.android.m4b.maps.bx.j j1)
    {
        q = new WeakReference(d1);
        s s1 = d;
        com.google.android.m4b.maps.y.j.a(d1, "state must not be null.");
        s1.e = d1;
        h = j1;
        if (g == null)
        {
            g = m.a(ah.d, b, c, p, u);
        }
    }

    public final void a(boolean flag)
    {
        d.f.a(flag);
        j = true;
    }

    public final boolean a(com.google.android.m4b.maps.bo.g g1, b b1)
    {
        return false;
    }

    public final void b()
    {
        d.f.b();
        j = true;
    }

    public final void b(int i1)
    {
        boolean flag;
        if ((i1 & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
    }

    public final void b(boolean flag)
    {
        com.google.android.m4b.maps.bx.j j1 = h;
        if (j1 != null && flag)
        {
            j1.a(true, false);
        }
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        if (!t.h()) goto _L2; else goto _L1
_L1:
        boolean flag = l;
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        h = null;
        d.a();
        d.a(null);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final String e()
    {
        return t.a();
    }

    public final float f()
    {
        return r;
    }

    public final void g()
    {
        s s1 = d;
        d d1 = s1.e;
        if (d1 != null)
        {
            s1.f.a(d1, s1.b);
        }
        s.b();
    }

    public final String toString()
    {
        return com.google.android.m4b.maps.y.h.a(this).a("id", t.a()).toString();
    }

}
