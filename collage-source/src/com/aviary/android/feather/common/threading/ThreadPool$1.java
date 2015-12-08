// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.threading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.aviary.android.feather.common.threading:
//            ThreadPool, b

class rker extends rker
{

    final c a;
    final Object b[];
    final ThreadPool c;

    public Object get(long l, TimeUnit timeunit)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        return null;
    }

    public void run()
    {
        Exception exception = null;
        if (i) goto _L2; else goto _L1
_L1:
        Object obj;
        try
        {
            obj = a.a(this, b);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            exception = new Exception(((Throwable) (obj)));
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        this;
        JVM INSTR monitorenter ;
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        a(exception);
        a(obj);
        e();
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        d();
        ThreadPool.a(c);
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    transient rker(ThreadPool threadpool, rker rker, b b1, Object aobj[], rker rker1, Object aobj1[])
    {
        c = threadpool;
        a = rker1;
        b = aobj1;
        super(threadpool, rker, b1, aobj);
    }
}
