// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.async;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.libraries.bind.async:
//            Queue

final class val.r
    implements Runnable
{

    final val.r this$1;
    final Runnable val$r;

    public final void run()
    {
        Process.setThreadPriority(10);
        val$r.run();
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$r = Runnable.this;
        super();
    }

    // Unreferenced inner class com/google/android/libraries/bind/async/Queue$3

/* anonymous class */
    final class Queue._cls3
        implements ThreadFactory
    {

        private final AtomicInteger createdCount = new AtomicInteger(1);
        final Queue this$0;

        public final Thread newThread(Runnable runnable)
        {
            runnable = runnable. new Queue._cls3._cls1();
            String s = (new StringBuilder()).append(Queue.this).append(" #").append(createdCount.getAndIncrement()).toString();
            runnable = new Thread(threadGroup, runnable, s);
            runnable.setPriority(1);
            return runnable;
        }

            
            {
                this$0 = Queue.this;
                super();
            }
    }

}
