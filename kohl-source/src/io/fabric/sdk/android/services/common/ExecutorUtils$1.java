// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            ExecutorUtils, BackgroundPriorityRunnable

static final class val.count
    implements ThreadFactory
{

    final AtomicLong val$count;
    final String val$threadNameTemplate;

    public Thread newThread(final Runnable runnable)
    {
        runnable = Executors.defaultThreadFactory().newThread(new BackgroundPriorityRunnable() {

            final ExecutorUtils._cls1 this$0;
            final Runnable val$runnable;

            public void onRun()
            {
                runnable.run();
            }

            
            {
                this$0 = ExecutorUtils._cls1.this;
                runnable = runnable1;
                super();
            }
        });
        runnable.setName((new StringBuilder()).append(val$threadNameTemplate).append(val$count.getAndIncrement()).toString());
        return runnable;
    }

    tyRunnable(String s, AtomicLong atomiclong)
    {
        val$threadNameTemplate = s;
        val$count = atomiclong;
        super();
    }
}
