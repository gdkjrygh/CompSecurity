// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.a;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import com.facebook.common.e.h;
import com.facebook.common.executors.ForUiThread;
import com.facebook.common.process.c;
import com.facebook.common.process.d;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.facebook.inject.t;
import com.google.common.base.FinalizableReferenceQueue;
import com.google.common.d.a.i;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.facebook.base.a:
//            i, k, b

public abstract class a
    implements com.facebook.base.a.i
{

    private static final String b = com/facebook/base/a/a.getName();
    protected final Application a;
    private t c;
    private final com.facebook.config.a.a d;

    public a(Application application, com.facebook.config.a.a a1)
    {
        a = application;
        d = a1;
    }

    static t a(a a1)
    {
        return a1.c;
    }

    static void a(a a1, t t1, c c1)
    {
        a1.a(t1, c1);
    }

    private void a(t t1, c c1)
    {
        if (c1 == null)
        {
            ((h)t1.a(com/facebook/common/e/h)).a("INVALID_PROCESS_NAME", "Invalid process name.");
        }
    }

    private c g()
    {
        ActivityManager activitymanager = (ActivityManager)a.getSystemService("activity");
        javax.inject.a a1 = com.google.inject.b.a.a(Integer.valueOf(Process.myPid()));
        return (new com.facebook.common.process.a(a, activitymanager, a1)).b();
    }

    private void h()
    {
        com.facebook.debug.log.b.a(b, "Forcing initialization of AsyncTask");
        try
        {
            Class.forName("android.os.AsyncTask");
            return;
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            com.facebook.debug.log.b.c(b, "Exception trying to initialize AsyncTask", classnotfoundexception);
        }
    }

    public Application a()
    {
        return a;
    }

    protected boolean a(c c1)
    {
        return false;
    }

    public com.facebook.config.a.a b()
    {
        return d;
    }

    protected abstract List b(c c1);

    public void c()
    {
        e e1;
        Logger.getLogger(com/google/common/base/FinalizableReferenceQueue.getName()).setLevel(Level.SEVERE);
        com.facebook.debug.d.e.b(5L);
        e1 = com.facebook.debug.d.e.a("Application startup");
        h();
        c c1 = g();
        this;
        JVM INSTR monitorenter ;
        if (a(c1))
        {
            d();
            System.exit(0);
        }
        List list = b(c1);
        c = t.a(a(), list);
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        c(c1);
        i.a(((k)c.a(com/facebook/base/a/k)).a(), new com.facebook.base.a.b(this, e1, c1), (Executor)c.a(java/util/concurrent/Executor, com/facebook/common/executors/ForUiThread));
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void c(c c1)
    {
    }

    protected void d()
    {
    }

    public void e()
    {
    }

    public final t f()
    {
        this;
        JVM INSTR monitorenter ;
        while (c == null) 
        {
            wait();
        }
        break MISSING_BLOCK_LABEL_31;
        Object obj;
        obj;
        throw new RuntimeException(((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        t t1 = c;
        this;
        JVM INSTR monitorexit ;
        return t1;
    }

}
