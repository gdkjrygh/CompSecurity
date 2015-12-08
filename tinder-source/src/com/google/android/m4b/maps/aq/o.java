// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.k;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.aj;
import com.google.android.m4b.maps.bx.j;
import com.google.android.m4b.maps.cg.ai;
import com.google.android.m4b.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            l, b, m

public final class o
    implements l, com.google.android.m4b.maps.cg.ai.a
{

    private final ai a;
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private float d;
    private final m e;

    public o(m m1, ai ai1)
    {
        e = m1;
        a = ai1;
        a(-1);
    }

    private static void a(List list, float f1, int i, List list1)
    {
        list1.clear();
        i = com.google.android.m4b.maps.aq.b.a(i);
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            k k1 = (k)list.next();
            if (k1.a.length / 3 > 0)
            {
                list1.add(new aj(k1, f1, i));
            }
        } while (true);
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        List list;
        Iterator iterator;
        com.google.android.m4b.maps.aa.ae ae = a.c();
        list = b;
        list.clear();
        obj = new com.google.android.m4b.maps.bo.k.a();
        iterator = ae.iterator();
        g g1 = null;
_L2:
        g g2;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_424;
        }
        g2 = com.google.android.m4b.maps.aq.b.b((LatLng)iterator.next());
        if (g1 == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        if (Math.abs(g2.a - g1.a) > 0x20000000)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        ((com.google.android.m4b.maps.bo.k.a) (obj)).a(g2);
        break MISSING_BLOCK_LABEL_468;
        if (g2.a - g1.a > 0x20000000)
        {
            float f1 = (float)(g2.b - g1.b) / (float)(g2.a - g1.a - 0x40000000);
            float f3 = g1.b;
            g g3 = new g(0xe0000000, (int)((float)(0xe0000000 - g1.a) * f1 + f3));
            f3 = g2.b;
            g1 = new g(0x1fffffff, (int)(f1 * (float)(0x20000000 - g2.a) + f3));
            ((com.google.android.m4b.maps.bo.k.a) (obj)).a(g3);
            list.add(((com.google.android.m4b.maps.bo.k.a) (obj)).a());
            obj = new com.google.android.m4b.maps.bo.k.a();
            ((com.google.android.m4b.maps.bo.k.a) (obj)).a(g1);
            ((com.google.android.m4b.maps.bo.k.a) (obj)).a(g2);
            break MISSING_BLOCK_LABEL_468;
        }
        break MISSING_BLOCK_LABEL_263;
        obj;
        throw obj;
        if (g2.a - g1.a < 0xe0000000)
        {
            float f2 = (float)(g1.b - g2.b) / (float)(g1.a - g2.a - 0x40000000);
            float f4 = g1.b;
            g g4 = new g(0x1fffffff, (int)((float)(0x1fffffff - g1.a) * f2 + f4));
            f4 = g2.b;
            g1 = new g(0xe0000000, (int)(f2 * (float)(0xe0000000 - g2.a) + f4));
            ((com.google.android.m4b.maps.bo.k.a) (obj)).a(g4);
            list.add(((com.google.android.m4b.maps.bo.k.a) (obj)).a());
            obj = new com.google.android.m4b.maps.bo.k.a();
            ((com.google.android.m4b.maps.bo.k.a) (obj)).a(g1);
            ((com.google.android.m4b.maps.bo.k.a) (obj)).a(g2);
            break MISSING_BLOCK_LABEL_468;
        }
        throw new AssertionError();
        list.add(((com.google.android.m4b.maps.bo.k.a) (obj)).a());
        a(b, a.e(), a.f(), c);
        this;
        JVM INSTR monitorexit ;
        return;
        g1 = g2;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a()
    {
        synchronized (e)
        {
            e.a(this);
        }
        e.b();
        return;
        exception;
        m1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i)
    {
        if ((i & 1) != 0)
        {
            g();
        }
        if ((i & 8) != 0)
        {
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((aj)iterator.next()).b(com.google.android.m4b.maps.aq.b.a(a.f()))) { }
        }
        if ((i & 4) != 0)
        {
            for (Iterator iterator1 = c.iterator(); iterator1.hasNext(); ((aj)iterator1.next()).a(a.e())) { }
        }
        if ((i & 0x40) != 0)
        {
            synchronized (e)
            {
                d = a.i();
                e.c();
            }
            e.b();
        }
        e.b();
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
        this;
        JVM INSTR monitorenter ;
        if (a == null) goto _L2; else goto _L1
_L1:
        boolean flag = a.h();
        if (flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) 
        {
            ((aj)iterator.next()).a(b1, d1);
        }
        if (true) goto _L2; else goto _L4
_L4:
        b1;
        throw b1;
    }

    public final void a(d d1)
    {
    }

    public final void a(d d1, b b1, ab ab)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null) goto _L2; else goto _L1
_L1:
        boolean flag = a.h();
        if (flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) 
        {
            ((aj)iterator.next()).a(d1, b1, ab);
        }
        if (true) goto _L2; else goto _L4
_L4:
        d1;
        throw d1;
    }

    public final void a(d d1, j j)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public final void a(boolean flag)
    {
    }

    public final boolean a(g g1, b b1)
    {
        return false;
    }

    public final void b()
    {
    }

    public final void b(int i)
    {
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null) goto _L2; else goto _L1
_L1:
        boolean flag = a.h();
        if (flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        Iterator iterator = c.iterator();
_L4:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_70;
        }
        flag = ((aj)iterator.next()).e();
        if (!flag)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public final void d()
    {
    }

    public final String e()
    {
        return a.a();
    }

    public final float f()
    {
        return d;
    }
}
