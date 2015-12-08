// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.k;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.al;
import com.google.android.m4b.maps.bx.j;
import com.google.android.m4b.maps.cg.ai;
import com.google.android.m4b.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            l, b, m

public final class n
    implements l, com.google.android.m4b.maps.cg.ai.a
{

    private final ai a;
    private k b;
    private List c;
    private al d;
    private float e;
    private d f;
    private j g;
    private final m h;

    public n(m m1, ai ai1)
    {
        h = m1;
        a = ai1;
        a(-1);
    }

    private static k a(List list)
    {
        Object obj = new com.google.android.m4b.maps.bo.k.a();
        for (list = list.iterator(); list.hasNext(); ((com.google.android.m4b.maps.bo.k.a) (obj)).a(com.google.android.m4b.maps.aq.b.b((LatLng)list.next()))) { }
        list = ((com.google.android.m4b.maps.bo.k.a) (obj)).a();
        obj = list.c(list.e());
        long l1 = 0L;
        int i1 = ((k) (obj)).a.length / 3;
        for (int i = 0; i < i1 - 1; i++)
        {
            g g1 = ((k) (obj)).a(i);
            g g3 = ((k) (obj)).a(i + 1);
            long l2 = g1.a;
            long l4 = g3.b;
            long l5 = g3.a;
            l1 += l2 * l4 - (long)g1.b * l5;
        }

        long l3 = l1;
        if (!((k) (obj)).d())
        {
            g g2 = ((k) (obj)).b();
            obj = ((k) (obj)).a(0);
            l3 = l1 + ((long)g2.a * (long)((g) (obj)).b - (long)((g) (obj)).a * (long)g2.b);
        }
        int j;
        if (l3 > 0L)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j == 0)
        {
            int j1 = ((k) (list)).a.length;
            int ai1[] = new int[j1];
            int ai2[] = ((k) (list)).a;
            for (j = 0; j < ((k) (list)).a.length; j += 3)
            {
                ai1[j] = ai2[j1 - j - 3];
                ai1[j + 1] = ai2[j1 - j - 2];
                ai1[j + 2] = ai2[j1 - j - 1];
            }

            return new k(ai1);
        } else
        {
            return list;
        }
    }

    public final void a()
    {
        synchronized (h)
        {
            h.a(this);
        }
        h.b();
        return;
        exception;
        m1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i)
    {
        if ((i & 3) != 0)
        {
            b = a(((List) (a.c())));
            c = new ArrayList();
            List list;
            for (com.google.android.m4b.maps.aa.x x = a.d().a(); x.hasNext(); c.add(a(list)))
            {
                list = (List)x.next();
            }

            d = new al(b, c, (int)a.e(), com.google.android.m4b.maps.aq.b.a(a.f()), com.google.android.m4b.maps.aq.b.a(a.g()));
            if (f != null && g != null)
            {
                d.a(f, g);
            }
        }
        if ((i & 0x10) == 0) goto _L2; else goto _L1
_L1:
        al al1;
        int j;
        al1 = d;
        j = com.google.android.m4b.maps.aq.b.a(a.g());
        obj = al1.f;
        obj;
        JVM INSTR monitorenter ;
        if (!al.b(al1.e) || al.b(j))
        {
            break MISSING_BLOCK_LABEL_248;
        }
        synchronized (al1.a)
        {
            al1.b = com.google.android.m4b.maps.bk.k.a();
            al1.d = true;
        }
        al1.c = true;
        al1.e = j;
        obj;
        JVM INSTR monitorexit ;
_L2:
        if ((i & 8) != 0)
        {
            d.c(com.google.android.m4b.maps.aq.b.a(a.f()));
        }
        if ((i & 4) != 0)
        {
            d.d((int)a.e());
        }
        if ((i & 0x40) != 0)
        {
            synchronized (h)
            {
                e = a.i();
                h.c();
            }
        }
        h.b();
        return;
        exception2;
        obj1;
        JVM INSTR monitorexit ;
        throw exception2;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
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
        d.a(b1, d1);
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
        d.a(d1, b1, ab);
        if (true) goto _L2; else goto _L4
_L4:
        d1;
        throw d1;
    }

    public final void a(d d1, j j)
    {
        this;
        JVM INSTR monitorenter ;
        f = d1;
        g = j;
        d.a(d1, j);
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
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
        if (a == null || !a.h()) goto _L2; else goto _L1
_L1:
        boolean flag = d.e();
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
    }

    public final String e()
    {
        return a.a();
    }

    public final float f()
    {
        return e;
    }
}
