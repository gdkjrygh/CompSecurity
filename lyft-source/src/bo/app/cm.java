// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.support.AppboyLogger;

public class cm
{

    private static final String c;
    volatile boolean a;
    volatile boolean b;
    private Object d;
    private final Object e = new Object();

    public cm(Object obj, boolean flag)
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
                AppboyLogger.e(c, "Warning: called dispatch() on field already in dispatch.  Please report this to Appboy.");
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
                AppboyLogger.e(c, "Erroneously got processSuccessfulDispatch call in DispatchOnceField with mHasSentSuccessfully already true. Please report this to Appboy.");
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
                AppboyLogger.e(c, "Erroneously got processFailedDispatch call in DispatchOnceField with mHasSentSuccessfully already true. Please report this to Appboy.");
            }
        }
    }

    static 
    {
        c = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/cm.getName()
        });
    }
}
