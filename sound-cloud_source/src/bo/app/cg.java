// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.d;

public class cg
{

    private static final String c;
    volatile boolean a;
    volatile boolean b;
    private Object d;
    private final Object e = new Object();

    public cg(Object obj, boolean flag)
    {
        a = false;
        b = false;
        b = flag;
        d = obj;
    }

    public final Object a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = d;
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        d = obj;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public final void b()
    {
        synchronized (e)
        {
            boolean flag = a;
            a = true;
        }
    }

    public final void c()
    {
        synchronized (e)
        {
            a = false;
            boolean flag = b;
            b = true;
        }
    }

    public final void d()
    {
        synchronized (e)
        {
            a = false;
            boolean flag = b;
        }
    }

    static 
    {
        c = String.format("%s.%s", new Object[] {
            d.a, bo/app/cg.getName()
        });
    }
}
