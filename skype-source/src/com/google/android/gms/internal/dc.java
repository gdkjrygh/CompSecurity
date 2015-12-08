// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            db

public final class dc extends dj.a
{

    private final Object a = new Object();
    private de.a b;
    private db c;

    public dc()
    {
    }

    public final void a()
    {
        synchronized (a)
        {
            if (c != null)
            {
                c.s();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        Exception exception;
        if (i == 3)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        b.a(i);
        b = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(db db1)
    {
        synchronized (a)
        {
            c = db1;
        }
        return;
        db1;
        obj;
        JVM INSTR monitorexit ;
        throw db1;
    }

    public final void a(de.a a1)
    {
        synchronized (a)
        {
            b = a1;
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void b()
    {
        synchronized (a)
        {
            if (c != null)
            {
                c.t();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        synchronized (a)
        {
            if (c != null)
            {
                c.u();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void d()
    {
        synchronized (a)
        {
            if (c != null)
            {
                c.v();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void e()
    {
label0:
        {
            synchronized (a)
            {
                if (b == null)
                {
                    break label0;
                }
                b.a(0);
                b = null;
            }
            return;
        }
        if (c != null)
        {
            c.w();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
