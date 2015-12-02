// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aed extends aeq
{

    private final Object a = new Object();
    private aeg b;
    private aec c;

    public aed()
    {
    }

    public final void a()
    {
        synchronized (a)
        {
            if (c != null)
            {
                c.o();
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

    public final void a(aec aec1)
    {
        synchronized (a)
        {
            c = aec1;
        }
        return;
        aec1;
        obj;
        JVM INSTR monitorexit ;
        throw aec1;
    }

    public final void a(aeg aeg1)
    {
        synchronized (a)
        {
            b = aeg1;
        }
        return;
        aeg1;
        obj;
        JVM INSTR monitorexit ;
        throw aeg1;
    }

    public final void b()
    {
        synchronized (a)
        {
            if (c != null)
            {
                c.p();
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
                c.q();
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
                c.r();
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
            c.s();
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
