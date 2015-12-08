// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//            ae

private final class a
    implements a
{

    static final boolean c;
    final Runnable a;
    boolean b;
    final ae d;
    private c e;
    private c f;

    final a a(a a1)
    {
        if (!c && e == null)
        {
            throw new AssertionError();
        }
        if (!c && f == null)
        {
            throw new AssertionError();
        }
        a a2 = a1;
        if (a1 == this)
        {
            if (e == this)
            {
                a2 = null;
            } else
            {
                a2 = e;
            }
        }
        e.f = f;
        f.e = e;
        f = null;
        e = null;
        return a2;
    }

    final e a(e e1, boolean flag)
    {
        if (!c && e != null)
        {
            throw new AssertionError();
        }
        if (!c && f != null)
        {
            throw new AssertionError();
        }
        if (e1 == null)
        {
            f = this;
            e = this;
            e1 = this;
        } else
        {
            e = e1;
            f = e1.f;
            e e2 = e;
            f.e = this;
            e2.f = this;
        }
        if (flag)
        {
            return this;
        } else
        {
            return e1;
        }
    }

    public final boolean a()
    {
        Object obj = ae.a(d);
        obj;
        JVM INSTR monitorenter ;
        if (b)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        ae.b(d, a(ae.b(d)));
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (ae.a(d))
        {
            if (!b)
            {
                ae.b(d, a(ae.b(d)));
                ae.b(d, a(ae.b(d), true));
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!com/facebook/internal/ae.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }

    (ae ae1, Runnable runnable)
    {
        d = ae1;
        super();
        a = runnable;
    }
}
