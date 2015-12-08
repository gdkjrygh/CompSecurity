// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            BackgroundPriorityRunnable, ExecutorUtils

class Runnable extends BackgroundPriorityRunnable
{

    final val.runnable this$0;
    final Runnable val$runnable;

    public void onRun()
    {
        val$runnable.run();
    }

    l.count()
    {
        this$0 = final_count;
        val$runnable = Runnable.this;
        super();
    }

    // Unreferenced inner class io/fabric/sdk/android/services/common/ExecutorUtils$1

/* anonymous class */
    static final class ExecutorUtils._cls1
        implements ThreadFactory
    {

        final AtomicLong val$count;
        final String val$threadNameTemplate;

        public Thread newThread(Runnable runnable1)
        {
            runnable1 = Executors.defaultThreadFactory().newThread(runnable1. new ExecutorUtils._cls1._cls1());
            runnable1.setName((new StringBuilder()).append(threadNameTemplate).append(count.getAndIncrement()).toString());
            return runnable1;
        }

            
            {
                threadNameTemplate = s;
                count = atomiclong;
                super();
            }
    }

}
