// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            bh, ar, ax

public final class at extends bh
{

    private final Object a = new Object();
    private ax b;
    private ar c;

    public at()
    {
    }

    public final void a()
    {
        synchronized (a)
        {
            if (c != null)
            {
                c.j();
            }
        }
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
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(ar ar1)
    {
        synchronized (a)
        {
            c = ar1;
        }
    }

    public final void a(ax ax1)
    {
        synchronized (a)
        {
            b = ax1;
        }
    }

    public final void b()
    {
        synchronized (a)
        {
            if (c != null)
            {
                c.k();
            }
        }
    }

    public final void c()
    {
        synchronized (a)
        {
            if (c != null)
            {
                c.l();
            }
        }
    }

    public final void d()
    {
        synchronized (a)
        {
            if (c != null)
            {
                c.m();
            }
        }
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
            c.n();
        }
        obj;
        JVM INSTR monitorexit ;
    }
}
