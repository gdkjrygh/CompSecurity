// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            iw, if, ik, iy

public final class ig extends iw
{

    private final Object a = new Object();
    private ik b;
    private if c;

    public ig()
    {
    }

    public final void a()
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

    public final void a(if if1)
    {
        synchronized (a)
        {
            c = if1;
        }
        return;
        if1;
        obj;
        JVM INSTR monitorexit ;
        throw if1;
    }

    public final void a(ik ik1)
    {
        synchronized (a)
        {
            b = ik1;
        }
        return;
        ik1;
        obj;
        JVM INSTR monitorexit ;
        throw ik1;
    }

    public final void a(iy iy)
    {
label0:
        {
            synchronized (a)
            {
                if (b == null)
                {
                    break label0;
                }
                b.a(iy);
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
        iy;
        obj;
        JVM INSTR monitorexit ;
        throw iy;
    }

    public final void b()
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

    public final void c()
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

    public final void d()
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
