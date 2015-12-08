// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import java.util.LinkedList;
import java.util.concurrent.Executor;

class SequentialExecutor
    implements Executor
{

    private final Runnable executeRunnables = new Runnable() {

        final SequentialExecutor this$0;

        public final void run()
        {
_L2:
            Object obj = lock;
            obj;
            JVM INSTR monitorenter ;
            Runnable runnable = (Runnable)runnableQueue.poll();
            if (runnable != null)
            {
                break MISSING_BLOCK_LABEL_40;
            }
            executingRunnables = false;
            obj;
            JVM INSTR monitorexit ;
            return;
            obj;
            JVM INSTR monitorexit ;
            Exception exception;
            try
            {
                runnable.run();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                underlyingExecutor.execute(this);
                throw obj;
            }
            catch (Error error)
            {
                underlyingExecutor.execute(this);
                throw error;
            }
            catch (Throwable throwable)
            {
                underlyingExecutor.execute(this);
                throw new Error(throwable);
            }
            if (true) goto _L2; else goto _L1
_L1:
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                this$0 = SequentialExecutor.this;
                super();
            }
    };
    private boolean executingRunnables;
    private final Object lock = new Object();
    private final LinkedList runnableQueue = new LinkedList();
    private final Executor underlyingExecutor;

    SequentialExecutor(Executor executor)
    {
        executingRunnables = false;
        underlyingExecutor = executor;
    }

    public void execute(Runnable runnable)
    {
        boolean flag = false;
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        runnableQueue.add(runnable);
        if (executingRunnables)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        executingRunnables = true;
        flag = true;
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            underlyingExecutor.execute(executeRunnables);
        }
        return;
        runnable;
        obj;
        JVM INSTR monitorexit ;
        throw runnable;
    }




/*
    static boolean access$202(SequentialExecutor sequentialexecutor, boolean flag)
    {
        sequentialexecutor.executingRunnables = flag;
        return flag;
    }

*/

}
