// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.AsyncTask;
import java.text.DateFormat;
import java.util.Date;

// Referenced classes of package com.amazon.device.associates:
//            bo, p, y, bj

abstract class al extends AsyncTask
{

    protected bj a;
    private boolean b;
    private boolean c;
    private final long d;
    private final String e;

    public al(String s, long l)
    {
        b = false;
        c = false;
        e = s;
        d = l;
    }

    protected void a(bj bj1)
    {
        if (!e())
        {
            return;
        }
        try
        {
            p.c("AbstractCacheAgentLog", (new StringBuilder()).append("Writing Templates to cache bucket at ").append(bo.a.format(new Date())).append(". Path=").append(g()).toString());
            if (y.a(bj1, g()))
            {
                p.c("AbstractCacheAgentLog", (new StringBuilder()).append("Wrote Templates to xml at ").append(bo.a.format(new Date())).append(". Path=").append(g()).toString());
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (bj bj1)
        {
            p.c("AbstractCacheAgentLog", "Writing Templates to local cache failed. Ex=", new Object[] {
                bj1
            });
            return;
        }
        p.c("AbstractCacheAgentLog", (new StringBuilder()).append("Wrote Templates to xml at ").append(bo.a.format(new Date())).append(". Path=").append(g()).append(" failed.").toString());
        return;
    }

    protected void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        b = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected abstract bj b();

    protected void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        c = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String c()
    {
        return e;
    }

    protected boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    protected boolean e()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    protected long f()
    {
        return d;
    }

    protected String g()
    {
        return (new StringBuilder()).append(bo.b).append(c()).toString();
    }

    protected void h()
    {
        this;
        JVM INSTR monitorenter ;
        if (getStatus() != android.os.AsyncTask.Status.PENDING) goto _L2; else goto _L1
_L1:
        p.c("AbstractCacheAgentLog", "Task has still not started, starting it.");
        execute(new al[] {
            this
        });
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (getStatus() == android.os.AsyncTask.Status.FINISHED)
        {
            p.c("AbstractCacheAgentLog", "Task might have failed, creating new task");
            ((al)getClass().newInstance()).execute(new al[] {
                this
            });
        }
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        p.b("Service Failure", (new StringBuilder()).append("Exception in MobileAssociateService: ").append(getClass()).toString(), new Object[] {
            obj
        });
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }

    protected long i()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null || a.d() == -1L || a.d() <= 0L) goto _L2; else goto _L1
_L1:
        long l;
        p.a("AbstractCacheAgentLog", (new StringBuilder()).append("Returning the cacheRefreshRate:").append(a.d()).toString());
        l = a.d();
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        p.a("AbstractCacheAgentLog", (new StringBuilder()).append("Returning the SDK hardcoded cacheRefreshRate:").append(f()).toString());
        l = f();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected bj j()
    {
        this;
        JVM INSTR monitorenter ;
        long l = System.currentTimeMillis();
        if (!d() || a == null) goto _L2; else goto _L1
_L1:
        long l1 = i();
        if (l - a.c() >= l1) goto _L2; else goto _L3
_L3:
        bj bj1;
        p.c("AbstractCacheAgentLog", (new StringBuilder()).append("Cache refresh not needed! LapseTime:").append(l - a.c()).append(" refreshRate:").append(l1).toString());
        bj1 = a;
_L9:
        this;
        JVM INSTR monitorexit ;
        return bj1;
_L2:
        p.c("AbstractCacheAgentLog", "Checking to load from Cache");
        a = (bj)y.a(g());
        if (a == null) goto _L5; else goto _L4
_L4:
        l1 = i();
        p.c("AbstractCacheAgentLog", "Cache loaded from local file...need to see if refresh is needed for not!");
        if (l - a.c() < l1)
        {
            p.c("AbstractCacheAgentLog", (new StringBuilder()).append("Cache refresh not needed! LapseTime:").append(l - a.c()).append(" refreshRate:").append(l1).toString());
            a(true);
            bj1 = a;
            continue; /* Loop/switch isn't completed */
        }
        p.c("AbstractCacheAgentLog", (new StringBuilder()).append("Cache refresh needed as lapse time:").append(l - a.c()).append(" Refresh-Rate:").append(l1).toString());
_L7:
        h();
        if (a == null)
        {
            a = b();
        }
        bj1 = a;
        continue; /* Loop/switch isn't completed */
_L5:
        p.c("AbstractCacheAgentLog", "Load Cache failed and got a null object. Hence deleting the local copy");
        y.b(g());
        if (true) goto _L7; else goto _L6
_L6:
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected volatile void onPostExecute(Object obj)
    {
        a((bj)obj);
    }
}
