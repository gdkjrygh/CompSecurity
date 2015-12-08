// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.az.i;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.e;
import com.google.android.m4b.maps.bn.c;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bo.aq;
import com.google.android.m4b.maps.bo.aw;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.y.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            r, al, ab, h, 
//            n

public final class aj extends r
{

    private static final g a = new g(0x40000000, 0);
    private static final g b = new g(0xc0000000, 0);
    private final com.google.android.m4b.maps.bo.k c;
    private com.google.android.m4b.maps.bo.k d;
    private com.google.android.m4b.maps.bo.k e;
    private final List f;
    private final com.google.android.m4b.maps.ak.a.c g;
    private m h;
    private float i;
    private float j;
    private final k k;
    private final c l;
    private final com.google.android.m4b.maps.bn.g m;
    private float n;
    private int o;
    private boolean p;
    private final int q;
    private boolean r;

    public aj(com.google.android.m4b.maps.bo.k k1, float f1, int i1)
    {
        this(k1, f1, i1, false);
    }

    public aj(com.google.android.m4b.maps.bo.k k1, float f1, int i1, boolean flag)
    {
        r = false;
        c = k1;
        n = f1;
        o = i1;
        f = new ArrayList();
        g = null;
        r = flag;
        ArrayList arraylist = new ArrayList();
        arraylist.add(k1);
        q = com.google.android.m4b.maps.bm.e.a(arraylist);
        k = new k(q);
        m = new com.google.android.m4b.maps.bn.g(q);
        l = new c(com.google.android.m4b.maps.bm.e.b(arraylist));
    }

    private boolean a(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!p)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        p = false;
        this;
        JVM INSTR monitorexit ;
        return true;
        this;
        JVM INSTR monitorexit ;
        float f1 = b1.e;
        return f1 > j * 1.25F || f1 < j / 1.25F;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    private void b(b b1)
    {
        Object obj;
        g g1;
        Object obj1;
        Object obj2;
        com.google.android.m4b.maps.bo.k k1;
        f.clear();
        float f1 = b1.b.b;
        com.google.android.m4b.maps.bo.k ak[];
        Iterator iterator1;
        com.google.android.m4b.maps.bo.k k3;
        int i1;
        int l1;
        if (f1 > 10F)
        {
            obj = c;
        } else
        {
            if (d == null)
            {
                d = c.b(al.a(10, r));
                e = d.b(al.a(6, r));
            }
            if (f1 > 6F)
            {
                obj = d;
            } else
            {
                obj = e;
            }
        }
        obj1 = b1.h().d;
        i1 = ((m) (obj1)).f();
        l1 = ((m) (obj1)).g();
        if (i1 > 0x71c71c7 || l1 > 0x71c71c7)
        {
            g1 = new g(((m) (obj1)).e().a - 0x20000000, 0xc0000000);
            obj1 = new g((((m) (obj1)).e().a + 0x20000000) - 1, 0x3fffffff);
        } else
        {
            obj2 = new g(i1 * 4, l1 * 4);
            g1 = ((m) (obj1)).c().f(((g) (obj2)));
            obj1 = ((m) (obj1)).d().e(((g) (obj2)));
        }
        h = new m(g1, ((g) (obj1)));
        obj2 = new ArrayList();
        k1 = ((com.google.android.m4b.maps.bo.k) (obj)).b(al.a((int)b1.b.b + 1, r));
        if (k1.a.length / 3 >= 2) goto _L2; else goto _L1
_L1:
        ak = new com.google.android.m4b.maps.bo.k[1];
        ak[0] = k1;
        com.google.android.m4b.maps.y.j.a(ak);
        obj = new ArrayList(com.google.android.m4b.maps.aa.f.a(1));
        Collections.addAll(((java.util.Collection) (obj)), ak);
_L6:
        obj = ((List) (obj)).iterator();
_L4:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = (com.google.android.m4b.maps.bo.k)((Iterator) (obj)).next();
        (new aw(h)).a(k1, ((List) (obj2)));
        f.addAll(((java.util.Collection) (obj2)));
        ((List) (obj2)).clear();
        (new aw(new m(g1.e(a), ((g) (obj1)).e(a)))).a(k1, ((List) (obj2)));
        com.google.android.m4b.maps.bo.k.a a1;
        g g2;
        g g3;
        int j1;
        int i2;
        int j2;
        int l2;
        int i3;
        int j3;
        for (iterator1 = ((List) (obj2)).iterator(); iterator1.hasNext(); f.add(k3.b(b)))
        {
            k3 = (com.google.android.m4b.maps.bo.k)iterator1.next();
        }

        ((List) (obj2)).clear();
        (new aw(new m(g1.e(b), ((g) (obj1)).e(b)))).a(k1, ((List) (obj2)));
        com.google.android.m4b.maps.bo.k k2;
        for (Iterator iterator = ((List) (obj2)).iterator(); iterator.hasNext(); f.add(k2.b(a)))
        {
            k2 = (com.google.android.m4b.maps.bo.k)iterator.next();
        }

        ((List) (obj2)).clear();
        continue; /* Loop/switch isn't completed */
_L2:
        obj = new ArrayList();
        a1 = new com.google.android.m4b.maps.bo.k.a(k1.a.length / 3);
        g2 = k1.a(0);
        a1.a(g2);
        g3 = new g();
        j1 = 1;
        while (j1 < k1.a.length / 3) 
        {
            k1.a(j1, g3);
            if (g3.a < g2.a)
            {
                j2 = g2.a;
                l2 = g3.a;
                i2 = (g3.a - g2.a) + 0x40000000;
                if (i2 < j2 - l2)
                {
                    j2 = g2.a;
                    l2 = g3.b;
                    i3 = g2.b;
                    j3 = g2.b;
                    i2 = (int)Math.round(((double)(l2 - i3) * (double)(0x20000000 - j2)) / (double)i2) + j3;
                    a1.a(new g(0x1fffffff, i2));
                    ((List) (obj)).add(a1.a());
                    a1.b = 0;
                    a1.a(new g(0xe0000000, i2));
                }
            } else
            if (g3.a > g2.a)
            {
                j2 = g3.a;
                l2 = g2.a;
                i2 = (g2.a - g3.a) + 0x40000000;
                if (i2 < j2 - l2)
                {
                    j2 = g2.a;
                    l2 = g3.b;
                    i3 = g2.b;
                    j3 = g2.b;
                    i2 = (int)Math.round(((double)(l2 - i3) * (double)(j2 + 0x20000000)) / (double)i2) + j3;
                    a1.a(new g(0xe0000000, i2));
                    ((List) (obj)).add(a1.a());
                    a1.b = 0;
                    a1.a(new g(0x1fffffff, i2));
                }
            }
            a1.a(g3);
            g2.b(g3);
            j1++;
        }
        k1 = a1.a();
        if (k1.a.length / 3 >= 2)
        {
            ((List) (obj)).add(k1);
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        i = b1.e;
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        n = f1;
        p = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(d d1)
    {
        b(d1);
    }

    public final void a(d d1, b b1, ab ab1)
    {
        Iterator iterator;
        if (ab1.b != 0)
        {
            break MISSING_BLOCK_LABEL_485;
        }
        if (h == null)
        {
            b(b1);
        }
        if (!a(b1))
        {
            break MISSING_BLOCK_LABEL_177;
        }
        k.a(d1);
        l.a(d1);
        m.a(d1);
        iterator = f.iterator();
_L2:
        com.google.android.m4b.maps.bo.k k1;
        g g1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = (com.google.android.m4b.maps.bo.k)iterator.next();
        g1 = h.c();
        int i1 = h.f();
        this;
        JVM INSTR monitorenter ;
        float f1 = 8F * ((b1.g() * n * 0.5F) / 7F);
        this;
        JVM INSTR monitorexit ;
        com.google.android.m4b.maps.bm.e.a().a(k1, f1, f1, g1, i1, 0, 0x10000, k, l, m);
        if (true) goto _L2; else goto _L1
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
_L1:
        j = b1.e;
        if (k.a() <= 0)
        {
            break MISSING_BLOCK_LABEL_485;
        }
        GL10 gl10 = d1.a;
        gl10.glPushMatrix();
        GL10 gl10_1 = d1.a;
        com.google.android.m4b.maps.az.f f2;
        int j1;
        int l1;
        int i2;
        int j2;
        if (g == null || f.size() == 0 || ((com.google.android.m4b.maps.bo.k)f.get(0)).a.length / 3 == 0)
        {
            f2 = null;
        } else
        {
            f2 = com.google.android.m4b.maps.az.i.a().a(g, false, false);
        }
        if (f2 != null)
        {
            f2.a(d1, b1, ab1, ((com.google.android.m4b.maps.bo.k)f.get(0)).a(0));
        }
        com.google.android.m4b.maps.bx.n.b(d1, b1, h.c(), h.f());
        d1.c();
        gl10_1.glBlendFunc(1, 771);
        gl10_1.glTexEnvx(8960, 8704, 8448);
        this;
        JVM INSTR monitorenter ;
        j1 = o;
        l1 = o;
        i2 = o;
        j2 = o;
        this;
        JVM INSTR monitorexit ;
        gl10_1.glColor4x(l1 >> 8 & 0xff00, i2 & 0xff00, j2 << 8 & 0xff00, j1 >> 16 & 0xff00);
        d1.C.a[24].a(d1.a);
        k.d(d1);
        m.d(d1);
        l.a(d1, 4);
        d1.a.glColor4x(0x10000, 0x10000, 0x10000, 0x10000);
        if (f2 != null)
        {
            f2.a(d1, ab1);
        }
        gl10.glPopMatrix();
        return;
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
    }

    public final boolean a(b b1, d d1)
    {
        boolean flag;
        if (h == null)
        {
            flag = true;
        } else
        {
            float f1 = b1.e;
            if (f1 > i * 2.0F || f1 < i / 2.0F)
            {
                flag = true;
            } else
            if (!h.b(b1.h().b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        b(b1);
        this;
        JVM INSTR monitorenter ;
        p = true;
        this;
        JVM INSTR monitorexit ;
_L2:
        return true;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final void b(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        o = i1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(d d1)
    {
        k.c(d1);
        l.c(d1);
        m.c(d1);
    }

    public final r.a d()
    {
        return r.a.a;
    }

}
