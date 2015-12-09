// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.bumptech.glide.load.engine.executor:
//            FifoPriorityThreadPoolExecutor

public static class a
    implements ThreadFactory
{

    int a;

    public Thread newThread(Runnable runnable)
    {
        runnable = new faultThreadFactory._cls1(runnable, (new StringBuilder()).append("fifo-pool-thread-").append(a).toString());
        a = a + 1;
        return runnable;
    }

    public faultThreadFactory._cls1.a()
    {
        a = 0;
    }

    // Unreferenced inner class com/bumptech/glide/load/engine/executor/FifoPriorityThreadPoolExecutor$DefaultThreadFactory$1

/* anonymous class */
    class FifoPriorityThreadPoolExecutor.DefaultThreadFactory._cls1 extends Thread
    {

        final FifoPriorityThreadPoolExecutor.a a;

        public void run()
        {
            Process.setThreadPriority(10);
            super.run();
        }

            
            {
                a = FifoPriorityThreadPoolExecutor.a.this;
                super(runnable, s);
            }
    }

}
