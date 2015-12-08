// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            ExecutorUtils, BackgroundPriorityRunnable

final class b
    implements ThreadFactory
{

    final String a;
    final AtomicLong b;

    public Thread newThread(Runnable runnable)
    {
        runnable = Executors.defaultThreadFactory().newThread(new BackgroundPriorityRunnable(runnable) {

            final Runnable a;
            final ExecutorUtils._cls1 b;

            public void a()
            {
                a.run();
            }

            
            {
                b = ExecutorUtils._cls1.this;
                a = runnable;
                super();
            }
        });
        runnable.setName((new StringBuilder()).append(a).append(b.getAndIncrement()).toString());
        return runnable;
    }

    tyRunnable(String s, AtomicLong atomiclong)
    {
        a = s;
        b = atomiclong;
        super();
    }
}
