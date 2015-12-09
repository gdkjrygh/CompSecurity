// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            dc

public final class dd extends dk.a
{

    private final Object a = new Object();
    private df.a b;
    private dc c;

    public dd()
    {
    }

    public void a()
    {
        synchronized (a)
        {
            if (c != null)
            {
                c.zzaX();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(int i)
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

    public void a(dc dc1)
    {
        synchronized (a)
        {
            c = dc1;
        }
        return;
        dc1;
        obj;
        JVM INSTR monitorexit ;
        throw dc1;
    }

    public void a(df.a a1)
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

    public void b()
    {
        synchronized (a)
        {
            if (c != null)
            {
                c.zzaY();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c()
    {
        synchronized (a)
        {
            if (c != null)
            {
                c.zzaZ();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void d()
    {
        synchronized (a)
        {
            if (c != null)
            {
                c.zzba();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void e()
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
            c.zzbb();
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
