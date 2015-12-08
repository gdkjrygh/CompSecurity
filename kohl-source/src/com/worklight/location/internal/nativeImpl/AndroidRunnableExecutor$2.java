// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.nativeImpl;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.worklight.location.internal.nativeImpl:
//            AndroidRunnableExecutor

class val.ran
    implements Runnable
{

    final AndroidRunnableExecutor this$0;
    final Runnable val$r;
    final AtomicBoolean val$ran;

    public void run()
    {
        val$r.run();
        synchronized (AndroidRunnableExecutor.this)
        {
            val$ran.set(true);
            notifyAll();
        }
        return;
        exception;
        androidrunnableexecutor;
        JVM INSTR monitorexit ;
        throw exception;
        Exception exception1;
        exception1;
        synchronized (AndroidRunnableExecutor.this)
        {
            val$ran.set(true);
            notifyAll();
        }
        throw exception1;
        exception2;
        androidrunnableexecutor1;
        JVM INSTR monitorexit ;
        throw exception2;
    }

    ()
    {
        this$0 = final_androidrunnableexecutor;
        val$r = runnable;
        val$ran = AtomicBoolean.this;
        super();
    }
}
