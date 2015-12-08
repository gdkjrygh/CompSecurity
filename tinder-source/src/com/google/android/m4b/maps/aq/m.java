// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.os.RemoteException;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bw.g;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.j;
import com.google.android.m4b.maps.bx.l;
import com.google.android.m4b.maps.bx.o;
import com.google.android.m4b.maps.bx.r;
import com.google.android.m4b.maps.cg.ag;
import com.google.android.m4b.maps.cg.bd;
import com.google.android.m4b.maps.cg.cc;
import com.google.android.m4b.maps.cg.t;
import com.google.android.m4b.maps.cg.w;
import com.google.android.m4b.maps.cg.y;
import com.google.android.m4b.maps.df.ai;
import com.google.android.m4b.maps.df.z;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            v, l, n, o, 
//            t, f, i, j

public final class m extends r
    implements v.a, ag
{

    private static final com.google.android.m4b.maps.bx.r.a f;
    private static final Comparator g = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (com.google.android.m4b.maps.aq.l)obj;
            obj1 = (com.google.android.m4b.maps.aq.l)obj1;
            int i1 = Float.compare(((com.google.android.m4b.maps.aq.l) (obj)).f(), ((com.google.android.m4b.maps.aq.l) (obj1)).f());
            if (i1 != 0)
            {
                return i1;
            } else
            {
                return ((com.google.android.m4b.maps.aq.l) (obj)).e().compareTo(((com.google.android.m4b.maps.aq.l) (obj1)).e());
            }
        }

    };
    final v a;
    final List b = new ArrayList();
    ai c;
    w d;
    final com.google.android.m4b.maps.ay.m e;
    private final Set h = new HashSet();
    private final ScheduledExecutorService i;
    private j j;
    private d k;
    private long l;
    private z m;
    private final e n;
    private final g o;

    public m(v v1, ScheduledExecutorService scheduledexecutorservice, com.google.android.m4b.maps.ay.m m1, e e1, g g1)
    {
        a = v1;
        i = scheduledexecutorservice;
        e = m1;
        a.a(this);
        n = e1;
        o = g1;
    }

    static w a(m m1)
    {
        return m1.d;
    }

    static ai b(m m1)
    {
        return m1.c;
    }

    private void b(com.google.android.m4b.maps.aq.l l1)
    {
        this;
        JVM INSTR monitorenter ;
        h.add(l1);
        b.add(l1);
        c();
        if (k != null)
        {
            l1.a(k, j);
        }
        l1.a(l);
        this;
        JVM INSTR monitorexit ;
        b();
        return;
        l1;
        this;
        JVM INSTR monitorexit ;
        throw l1;
    }

    public final com.google.android.m4b.maps.cg.ai.a a(com.google.android.m4b.maps.cg.ai ai, boolean flag)
    {
        if (flag)
        {
            ai = new n(this, ai);
            b(ai);
            return ai;
        } else
        {
            ai = new com.google.android.m4b.maps.aq.o(this, ai);
            b(ai);
            return ai;
        }
    }

    public final com.google.android.m4b.maps.cg.bd.a a(bd bd)
    {
        bd = t.a(bd, a.getResources(), this, i, n, o);
        b(bd);
        return bd;
    }

    public final com.google.android.m4b.maps.cg.cc.a a(cc cc)
    {
        cc = new com.google.android.m4b.maps.aq.f(this, cc);
        b(cc);
        return cc;
    }

    public final com.google.android.m4b.maps.cg.y.a a(y y)
    {
        w w1 = d;
        android.content.Context context = a.getContext();
        android.content.res.Resources resources = a.getResources();
        ScheduledExecutorService scheduledexecutorservice = i;
        com.google.android.m4b.maps.ay.m m1 = e;
        e e1 = n;
        g g1 = o;
        com.google.android.m4b.maps.bx.o.a(ah.x, new i(m1, scheduledexecutorservice), context, resources, e1);
        y = new com.google.android.m4b.maps.aq.j(y, w1, com.google.android.m4b.maps.bx.l.d(ah.x, resources, e1, g1), this);
        b(y);
        return y;
    }

    public final void a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((com.google.android.m4b.maps.aq.l)iterator.next()).b(i1)) { }
        break MISSING_BLOCK_LABEL_44;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    final void a(com.google.android.m4b.maps.aq.l l1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = h.contains(l1);
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b.remove(l1);
        h.remove(l1);
        l1.d();
        if (true) goto _L1; else goto _L3
_L3:
        l1;
        throw l1;
    }

    public final void a(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((com.google.android.m4b.maps.aq.l)iterator.next()).a(d1)) { }
        break MISSING_BLOCK_LABEL_44;
        d1;
        throw d1;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(d d1, b b1, ab ab)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); d1.g())
        {
            com.google.android.m4b.maps.aq.l l1 = (com.google.android.m4b.maps.aq.l)iterator.next();
            d1.f();
            l1.a(d1, b1, ab);
        }

        break MISSING_BLOCK_LABEL_61;
        d1;
        throw d1;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(d d1, j j1)
    {
        this;
        JVM INSTR monitorenter ;
        k = d1;
        j = j1;
        for (d1 = b.iterator(); d1.hasNext(); ((com.google.android.m4b.maps.aq.l)d1.next()).a(k, j)) { }
        break MISSING_BLOCK_LABEL_61;
        d1;
        throw d1;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(w w1)
    {
        d = w1;
    }

    public final void a(ai ai)
    {
        c = ai;
    }

    public final void a(z z)
    {
        m = z;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((com.google.android.m4b.maps.aq.l)iterator.next()).a(flag)) { }
        break MISSING_BLOCK_LABEL_44;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public final boolean a(float f1, float f2, com.google.android.m4b.maps.bo.g g1, b b1)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = com.google.android.m4b.maps.aa.f.a(b).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        boolean flag = ((com.google.android.m4b.maps.aq.l)iterator.next()).a(g1, b1);
        if (!flag) goto _L4; else goto _L3
_L3:
        flag = true;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        g1;
        throw g1;
    }

    public final boolean a(b b1, d d1)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((com.google.android.m4b.maps.aq.l)iterator.next()).a(b1, d1)) { }
        break MISSING_BLOCK_LABEL_45;
        b1;
        throw b1;
        this;
        JVM INSTR monitorexit ;
        return true;
    }

    final void b()
    {
        a.b();
    }

    final void c()
    {
        Collections.sort(b, g);
        b();
    }

    public final com.google.android.m4b.maps.bx.r.a d()
    {
        return f;
    }

    public final boolean e()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = b.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        boolean flag = ((com.google.android.m4b.maps.aq.l)iterator.next()).c();
        if (flag) goto _L4; else goto _L3
_L3:
        flag = false;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean f()
    {
        if (d != null)
        {
            d.b();
        }
        return false;
    }

    public final void l_()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((com.google.android.m4b.maps.aq.l)iterator.next()).b()) { }
        break MISSING_BLOCK_LABEL_43;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    static 
    {
        f = com.google.android.m4b.maps.bx.r.a.e;
    }

    // Unreferenced inner class com/google/android/m4b/maps/aq/m$2

/* anonymous class */
    final class _cls2
        implements com.google.android.m4b.maps.cg.s.a
    {

        private List a;
        private List b;
        private m c;

        public final void a()
        {
            Object obj;
            if (m.a(c) != null)
            {
                obj = m.a(c);
                Object obj1 = a;
                if (((w) (obj)).i == obj1)
                {
                    if (((List) (obj1)).size() == 1)
                    {
                        ((w) (obj)).a(0);
                    } else
                    {
                        ((w) (obj)).a();
                    }
                }
            }
            if (com.google.android.m4b.maps.aq.m.b(c) == null)
            {
                break MISSING_BLOCK_LABEL_127;
            }
            obj = com.google.android.m4b.maps.aa.f.b(b.size());
            for (obj1 = b.iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add((t)((Iterator) (obj1)).next())) { }
            com.google.android.m4b.maps.aq.m.b(c).b(((List) (obj)));
            return;
            RemoteException remoteexception;
            remoteexception;
            throw new RuntimeRemoteException(remoteexception);
        }

            
            {
                c = m.this;
                a = list;
                b = list1;
                super();
            }
    }

}
