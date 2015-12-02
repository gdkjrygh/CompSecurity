// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.facebook.auth.f.b;
import com.facebook.contacts.a.a;
import com.facebook.l.j;
import com.facebook.l.k;
import com.google.common.a.es;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            f

public class e
    implements b, a
{

    private final com.facebook.common.time.a a;
    private final k b;
    private final javax.inject.a c;
    private es d;
    private long e;
    private es f;
    private long g;
    private boolean h;
    private boolean i;
    private es j;
    private long k;
    private es l;
    private long m;
    private es n;
    private long o;

    public e(com.facebook.common.time.a a1, k k1, javax.inject.a a2)
    {
        a = a1;
        b = k1;
        c = a2;
    }

    static boolean a(e e1, boolean flag)
    {
        e1.h = flag;
        return flag;
    }

    private void h()
    {
        if (d != null && a.a() - e > 0x36ee80L)
        {
            d = null;
        }
        if (f == null) goto _L2; else goto _L1
_L1:
        if (((j)c.b()).shouldShowPresence()) goto _L4; else goto _L3
_L3:
        f = null;
_L2:
        if (j != null && a.a() - k > 0x36ee80L)
        {
            j = null;
        }
        if (l != null && a.a() - m > 0x36ee80L)
        {
            l = null;
        }
        if (n != null && a.a() - o > 0x36ee80L)
        {
            n = null;
        }
        return;
_L4:
        if (a.a() - g > 0x493e0L)
        {
            f = null;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        d = null;
        f = null;
        j = null;
        l = null;
        n = null;
        e = 0L;
        g = 0L;
        k = 0L;
        m = 0L;
        o = 0L;
        h = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(es es)
    {
        this;
        JVM INSTR monitorenter ;
        d = es;
        e = a.a();
        this;
        JVM INSTR monitorexit ;
        return;
        es;
        throw es;
    }

    public es b()
    {
        this;
        JVM INSTR monitorenter ;
        es es;
        h();
        es = d;
        this;
        JVM INSTR monitorexit ;
        return es;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(es es)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = ((j)c.b()).shouldShowPresence();
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f = es;
        g = a.a();
        h = false;
        if (!i)
        {
            b.a(new f(this));
            i = true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        es;
        throw es;
    }

    public es c()
    {
        this;
        JVM INSTR monitorenter ;
        es es;
        h();
        es = l;
        this;
        JVM INSTR monitorexit ;
        return es;
        Exception exception;
        exception;
        throw exception;
    }

    public void c(es es)
    {
        this;
        JVM INSTR monitorenter ;
        l = es;
        m = a.a();
        this;
        JVM INSTR monitorexit ;
        return;
        es;
        throw es;
    }

    public void d()
    {
        a();
    }

    public void d(es es)
    {
        this;
        JVM INSTR monitorenter ;
        j = es;
        k = a.a();
        this;
        JVM INSTR monitorexit ;
        return;
        es;
        throw es;
    }

    public es e()
    {
        this;
        JVM INSTR monitorenter ;
        es es;
        h();
        es = f;
        this;
        JVM INSTR monitorexit ;
        return es;
        Exception exception;
        exception;
        throw exception;
    }

    public void e(es es)
    {
        this;
        JVM INSTR monitorenter ;
        n = es;
        o = a.a();
        this;
        JVM INSTR monitorexit ;
        return;
        es;
        throw es;
    }

    public es f()
    {
        this;
        JVM INSTR monitorenter ;
        es es;
        h();
        es = j;
        this;
        JVM INSTR monitorexit ;
        return es;
        Exception exception;
        exception;
        throw exception;
    }

    public es g()
    {
        this;
        JVM INSTR monitorenter ;
        es es;
        h();
        es = n;
        this;
        JVM INSTR monitorexit ;
        return es;
        Exception exception;
        exception;
        throw exception;
    }
}
