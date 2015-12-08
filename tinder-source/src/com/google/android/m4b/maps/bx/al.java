// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.graphics.Color;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bk.k;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.aq;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            r, aj, ab, n, 
//            j

public final class al extends r
{
    final class a
        implements Runnable
    {

        private al a;

        public final void run()
        {
            ArrayList arraylist;
            synchronized (al.a(a))
            {
                arraylist = com.google.android.m4b.maps.aa.f.a(com.google.android.m4b.maps.bx.al.b(a));
            }
            obj = com.google.android.m4b.maps.bk.f.a(arraylist, com.google.android.m4b.maps.bk.f.a.b);
_L2:
            synchronized (al.a(a))
            {
                al.a(a, ((k) (obj)));
                com.google.android.m4b.maps.bx.al.d(a);
                al.e(a);
                if (com.google.android.m4b.maps.bx.al.f(a) != null)
                {
                    com.google.android.m4b.maps.bx.al.f(a).a(true, false);
                }
            }
            return;
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
            com.google.android.m4b.maps.bk.e.b b1;
            b1;
            b1 = com.google.android.m4b.maps.aa.f.a(com.google.android.m4b.maps.bx.al.c(a));
            obj1 = b1.iterator();
            int i1 = 0;
            while (((Iterator) (obj1)).hasNext()) 
            {
                i1 = ((com.google.android.m4b.maps.bo.k)((Iterator) (obj1)).next()).a.length / 3 + i1;
            }
            if (i1 < 2000)
            {
                try
                {
                    b1 = com.google.android.m4b.maps.bk.f.a(b1, com.google.android.m4b.maps.bk.f.a.c);
                }
                catch (com.google.android.m4b.maps.bk.e.b b2)
                {
                    b2 = com.google.android.m4b.maps.bk.k.a();
                }
                continue; /* Loop/switch isn't completed */
            }
            b1 = com.google.android.m4b.maps.bk.k.a();
            if (true) goto _L2; else goto _L1
_L1:
            exception;
            obj1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private a()
        {
            a = al.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final g g = new g(0xc0000000, 0);
    private static final g h = new g(0x40000000, 0);
    public final Object a = new Object();
    public k b;
    public boolean c;
    public boolean d;
    public int e;
    public final Object f = new Object();
    private final List i = new ArrayList();
    private final m j;
    private final List k = new ArrayList();
    private boolean l;
    private m m;
    private float n;
    private float o;
    private byte p;
    private com.google.android.m4b.maps.bn.k q;
    private com.google.android.m4b.maps.bn.c r;
    private m s;
    private int t;
    private int u;
    private final List v = new ArrayList();
    private boolean w;
    private j x;

    public al(com.google.android.m4b.maps.bo.k k1, List list, int i1, int j1, int l1)
    {
        b = com.google.android.m4b.maps.bk.k.a();
        l = false;
        w = false;
        int i2 = k1.e();
        i.add(k1.c(i2));
        for (k1 = list.iterator(); k1.hasNext(); i.add(list.c(i2)))
        {
            list = (com.google.android.m4b.maps.bo.k)k1.next();
        }

        j = ((com.google.android.m4b.maps.bo.k)i.get(0)).a();
        u = i1;
        t = j1;
        for (k1 = i.iterator(); k1.hasNext(); v.add(new aj(list, u, t, true)))
        {
            list = (com.google.android.m4b.maps.bo.k)k1.next();
        }

        e = l1;
        w = true;
        b = com.google.android.m4b.maps.bk.k.a();
    }

    private static byte a(m m1, m m2)
    {
        int j1 = 0;
        if (m2.a(m1))
        {
            j1 = 1;
        }
        g g1 = h;
        int i1 = j1;
        if ((new m(m2.c().e(g1), m2.d().e(g1))).a(m1))
        {
            i1 = (byte)(j1 | 4);
        }
        j1 = i1;
        if ((new m(m2.c().f(g1), m2.d().f(g1))).a(m1))
        {
            j1 = (byte)(i1 | 2);
        }
        return j1;
    }

    static int a(int i1, boolean flag)
    {
        if (!flag)
        {
            return (2 << 30 - i1) / 256;
        } else
        {
            return (1 << 30 - i1) / 256 / 2;
        }
    }

    static k a(al al1, k k1)
    {
        al1.b = k1;
        return k1;
    }

    static Object a(al al1)
    {
        return al1.a;
    }

    private void a(b b1, boolean flag)
    {
        int k1 = 1;
        if (flag) goto _L2; else goto _L1
_L1:
        if (m == null) goto _L4; else goto _L3
_L3:
        int i1;
        float f1;
        m m1;
        int j1;
        if (a(j, m) == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (a(j, b(b1)) == 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (i1 == j1) goto _L5; else goto _L4
_L4:
        i1 = 1;
_L11:
        if (i1 != 0) goto _L2; else goto _L6
_L6:
        if (b1.e < n / 2.0F)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L7; else goto _L2
_L2:
        i1 = 1;
        break MISSING_BLOCK_LABEL_88;
_L5:
        i1 = 0;
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = 0;
        if (true) goto _L9; else goto _L8
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
_L9:
        if (i1 != 0)
        {
            m1 = b(b1);
            synchronized (a)
            {
                k.clear();
                if (a(j, m1) != 0)
                {
                    k.addAll(i);
                }
                m = m1;
            }
        }
        ArrayList arraylist;
        if (i1 == 0)
        {
            f1 = b1.e;
            i1 = k1;
            if (f1 <= n * 2.0F)
            {
                if (f1 < n / 2.0F)
                {
                    i1 = k1;
                } else
                {
                    i1 = 0;
                }
            }
            if (i1 == 0)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        synchronized (a)
        {
            arraylist = com.google.android.m4b.maps.aa.f.a(k);
        }
        j1 = a((int)b1.b.b + 1, w);
        k1 = arraylist.size();
        for (i1 = 0; i1 < k1; i1++)
        {
            arraylist.set(i1, ((com.google.android.m4b.maps.bo.k)arraylist.get(i1)).b(j1));
        }

        synchronized (a)
        {
            k.clear();
            k.addAll(arraylist);
        }
        n = b1.e;
        synchronized (a)
        {
            l = true;
        }
        (new Thread(new a((byte)0))).start();
_L8:
        return;
        b1;
        obj1;
        JVM INSTR monitorexit ;
        throw b1;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private boolean a(b b1)
    {
label0:
        {
            synchronized (a)
            {
                if (!d)
                {
                    break label0;
                }
                d = false;
            }
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        float f1 = b1.e;
        return p != a(j, b(b1)) || f1 > o * 1.25F || f1 < o / 1.25F;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }

    private static m b(b b1)
    {
        Object obj = b1.h().d;
        int i1 = ((m) (obj)).f();
        int j1 = ((m) (obj)).g();
        if (i1 > 0x71c71c7 || j1 > 0x71c71c7)
        {
            b1 = new g(((m) (obj)).e().a - 0x20000000, 0xe0000000);
            obj = new g((((m) (obj)).e().a + 0x20000000) - 1, 0x1fffffff);
        } else
        {
            g g1 = new g(i1 * 4, j1 * 4);
            b1 = ((m) (obj)).c().f(g1);
            obj = ((m) (obj)).d().e(g1);
        }
        return new m(b1, ((g) (obj)));
    }

    static List b(al al1)
    {
        return al1.k;
    }

    public static boolean b(int i1)
    {
        return Color.alpha(i1) == 0;
    }

    static List c(al al1)
    {
        return al1.i;
    }

    private boolean c()
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (!b(e))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static boolean d(al al1)
    {
        al1.d = true;
        return true;
    }

    static boolean e(al al1)
    {
        al1.l = false;
        return false;
    }

    static j f(al al1)
    {
        return al1.x;
    }

    public final void a(d d1)
    {
        b(d1);
    }

    public final void a(d d1, b b1, ab ab1)
    {
        if (ab1.b != 0)
        {
            break MISSING_BLOCK_LABEL_603;
        }
        if (c())
        {
            boolean flag1;
            synchronized (f)
            {
                flag1 = c;
                c = false;
            }
            if (m == null)
            {
                a(b1, flag1);
            }
            if (a(b1))
            {
                obj = b(b1);
                Object obj1;
                synchronized (a)
                {
                    obj1 = b;
                }
                byte byte0 = a(j, ((m) (obj)));
                com.google.android.m4b.maps.bn.c c1;
                g g1;
                int i1;
                int j1;
                int k1;
                boolean flag;
                int l1;
                int i2;
                if ((byte0 & 1) != 0)
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                if (k1 != 0)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if ((byte0 & 2) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i1 = j1;
                if (flag)
                {
                    i1 = j1 + 1;
                }
                if ((byte0 & 4) != 0)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                l1 = i1;
                if (j1 != 0)
                {
                    l1 = i1 + 1;
                }
                i2 = ((k) (obj1)).d();
                obj2 = new com.google.android.m4b.maps.bn.k(i2 * l1);
                c1 = new com.google.android.m4b.maps.bn.c(l1 * (((k) (obj1)).c() * 3));
                i1 = 0;
                g1 = ((m) (obj)).c();
                l1 = ((m) (obj)).f();
                if (k1 != 0)
                {
                    com.google.android.m4b.maps.bk.f.a(((k) (obj1)), c1, 0);
                    com.google.android.m4b.maps.bk.f.a(((k) (obj1)), ((com.google.android.m4b.maps.bn.l) (obj2)), g1, l1);
                    i1 = 1;
                }
                k1 = i1;
                if (flag)
                {
                    com.google.android.m4b.maps.bk.f.a(((k) (obj1)), c1, i2 * i1);
                    com.google.android.m4b.maps.bk.f.a(((k) (obj1)), ((com.google.android.m4b.maps.bn.l) (obj2)), g1.e(g), l1);
                    k1 = i1 + 1;
                }
                if (j1 != 0)
                {
                    com.google.android.m4b.maps.bk.f.a(((k) (obj1)), c1, k1 * i2);
                    com.google.android.m4b.maps.bk.f.a(((k) (obj1)), ((com.google.android.m4b.maps.bn.l) (obj2)), g1.e(h), l1);
                }
                q = ((com.google.android.m4b.maps.bn.k) (obj2));
                r = c1;
                s = new m(((m) (obj)).c(), ((m) (obj)).d());
                o = b1.e;
                p = byte0;
            }
            obj1 = d1.a;
            ((GL10) (obj1)).glPushMatrix();
            if (q != null && q.a() > 0)
            {
                obj2 = d1.a;
                com.google.android.m4b.maps.bx.n.b(d1, b1, s.c(), s.f());
                ((GL10) (obj2)).glBlendFunc(1, 771);
                q.d(d1);
                synchronized (f)
                {
                    com.google.android.m4b.maps.bm.c.a(((GL10) (obj2)), e);
                }
                r.a(d1, 4);
            }
            ((GL10) (obj1)).glPopMatrix();
        }
        d1.g();
        obj = v;
        obj;
        JVM INSTR monitorenter ;
        for (obj1 = v.iterator(); ((Iterator) (obj1)).hasNext(); d1.g())
        {
            obj2 = (aj)((Iterator) (obj1)).next();
            d1.f();
            ((aj) (obj2)).a(d1, b1, ab1);
        }

        break MISSING_BLOCK_LABEL_596;
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
        d1;
        obj2;
        JVM INSTR monitorexit ;
        throw d1;
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
        obj;
        JVM INSTR monitorexit ;
        d1.f();
    }

    public final void a(d d1, j j1)
    {
        synchronized (a)
        {
            x = j1;
        }
        return;
        j1;
        d1;
        JVM INSTR monitorexit ;
        throw j1;
    }

    public final boolean a(b b1, d d1)
    {
        if (c())
        {
            boolean flag;
            synchronized (f)
            {
                flag = c;
                c = false;
            }
            a(b1, flag);
        }
        obj = v;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = v.iterator(); iterator.hasNext(); ((aj)iterator.next()).a(b1, d1)) { }
        break MISSING_BLOCK_LABEL_91;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
        obj;
        JVM INSTR monitorexit ;
        return true;
    }

    public final void b(d d1)
    {
        if (q != null)
        {
            q.c(d1);
            r.c(d1);
        }
    }

    public final void c(int i1)
    {
        t = i1;
        List list = v;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = v.iterator(); iterator.hasNext(); ((aj)iterator.next()).b(i1)) { }
        break MISSING_BLOCK_LABEL_52;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
    }

    public final r.a d()
    {
        return r.a.a;
    }

    public final void d(int i1)
    {
        u = i1;
        List list = v;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = v.iterator(); iterator.hasNext(); ((aj)iterator.next()).a(i1)) { }
        break MISSING_BLOCK_LABEL_53;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
    }

    public final boolean e()
    {
        for (Iterator iterator = v.iterator(); iterator.hasNext();)
        {
            if (!((aj)iterator.next()).e())
            {
                return false;
            }
        }

        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (!l && !d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
