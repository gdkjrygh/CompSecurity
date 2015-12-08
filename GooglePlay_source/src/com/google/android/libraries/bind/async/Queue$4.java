// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.async;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.libraries.bind.async:
//            Queue, JankLock, AsyncUtil

final class this._cls0 extends ThreadPoolExecutor
{

    final Queue this$0;
    final boolean val$jankLocked = true;

    protected final void beforeExecute(Thread thread, Runnable runnable)
    {
label0:
        {
            super.beforeExecute(thread, runnable);
            if (val$jankLocked)
            {
                thread = JankLock.global;
                if (!JankLock.DISABLED && !AsyncUtil.isMainThread())
                {
                    break label0;
                }
            }
            return;
        }
        ((JankLock) (thread)).pauseLock.lock();
        while (((JankLock) (thread)).isPaused) 
        {
            ((JankLock) (thread)).unpaused.awaitUninterruptibly();
        }
        break MISSING_BLOCK_LABEL_66;
        runnable;
        ((JankLock) (thread)).pauseLock.unlock();
        throw runnable;
        ((JankLock) (thread)).pauseLock.unlock();
        return;
    }

    l(int j, TimeUnit timeunit, BlockingQueue blockingqueue, ThreadFactory threadfactory, boolean flag)
    {
        this$0 = final_queue;
        super(I.this, j, 10L, timeunit, blockingqueue, threadfactory);
    }
}
