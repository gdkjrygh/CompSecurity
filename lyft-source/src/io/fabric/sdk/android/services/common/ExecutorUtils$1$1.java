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

    final Runnable a;
    final a b;

    public void a()
    {
        a.run();
    }

    Runnable(Runnable runnable, Runnable runnable1)
    {
        b = runnable;
        a = runnable1;
        super();
    }

    // Unreferenced inner class io/fabric/sdk/android/services/common/ExecutorUtils$1

/* anonymous class */
    final class ExecutorUtils._cls1
        implements ThreadFactory
    {

        final String a;
        final AtomicLong b;

        public Thread newThread(Runnable runnable)
        {
            runnable = Executors.defaultThreadFactory().newThread(new ExecutorUtils._cls1._cls1(this, runnable));
            runnable.setName((new StringBuilder()).append(a).append(b.getAndIncrement()).toString());
            return runnable;
        }

            
            {
                a = s;
                b = atomiclong;
                super();
            }
    }

}
