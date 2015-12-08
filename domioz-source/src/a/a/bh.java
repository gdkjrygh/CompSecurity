// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.f;
import com.appboy.f.a;

public class bh
{

    private static final String c;
    volatile boolean a;
    volatile boolean b;
    private Object d;
    private final Object e = new Object();

    public bh(Object obj, boolean flag)
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
            if (a)
            {
                com.appboy.f.a.d(c, "Warning: called dispatch() on field already in dispatch.  Please report this to Appboy.");
            }
            a = true;
        }
    }

    public final void c()
    {
        synchronized (e)
        {
            a = false;
            if (b)
            {
                com.appboy.f.a.d(c, "Erroneously got processSuccessfulDispatch call in DispatchOnceField with mHasSentSuccessfully already true. Please report this to Appboy.");
            }
            b = true;
        }
    }

    public final void d()
    {
        synchronized (e)
        {
            a = false;
            if (b)
            {
                com.appboy.f.a.d(c, "Erroneously got processFailedDispatch call in DispatchOnceField with mHasSentSuccessfully already true. Please report this to Appboy.");
            }
        }
    }

    static 
    {
        c = String.format("%s.%s", new Object[] {
            f.a, a/a/bh.getName()
        });
    }
}
