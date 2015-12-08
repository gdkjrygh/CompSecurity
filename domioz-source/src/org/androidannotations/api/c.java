// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api;

import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package org.androidannotations.api:
//            a

public abstract class c
    implements Runnable
{

    private boolean executionAsked;
    private Future future;
    private String id;
    private AtomicBoolean managed;
    private int remainingDelay;
    private String serial;
    private long targetTimeMillis;

    public c(String s, int i, String s1)
    {
        managed = new AtomicBoolean();
        if (!"".equals(s))
        {
            id = s;
        }
        if (i > 0)
        {
            remainingDelay = i;
            targetTimeMillis = System.currentTimeMillis() + (long)i;
        }
        if (!"".equals(s1))
        {
            serial = s1;
        }
    }

    private void postExecute()
    {
        if (id == null && serial == null)
        {
            return;
        }
        a.a().set(null);
        org/androidannotations/api/a;
        JVM INSTR monitorenter ;
        c c1;
        a.b().remove(this);
        if (serial == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        c1 = a.a(serial);
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (c1.remainingDelay != 0)
        {
            c1.remainingDelay = Math.max(0, (int)(targetTimeMillis - System.currentTimeMillis()));
        }
        a.a(c1);
        org/androidannotations/api/a;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        org/androidannotations/api/a;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public abstract void execute();

    public void run()
    {
        if (managed.getAndSet(true))
        {
            return;
        }
        a.a().set(serial);
        execute();
        postExecute();
        return;
        Exception exception;
        exception;
        postExecute();
        throw exception;
    }




/*
    static boolean access$102(c c1, boolean flag)
    {
        c1.executionAsked = flag;
        return flag;
    }

*/





/*
    static Future access$402(c c1, Future future1)
    {
        c1.future = future1;
        return future1;
    }

*/


}
