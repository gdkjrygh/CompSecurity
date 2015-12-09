// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.async;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.libraries.bind.async:
//            JankLock

final class this._cls1
    implements Runnable
{

    final l.runnable this$1;

    public final void run()
    {
        if (isPaused())
        {
            blockingQueue.execute(terRunnable);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    l.executor()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/libraries/bind/async/JankLock$2

/* anonymous class */
    final class JankLock._cls2
        implements Runnable
    {

        final Runnable deliveringRunnable = new JankLock._cls2._cls1();
        final Runnable outerRunnable = this;
        final JankLock this$0;
        final Executor val$blockingQueue;
        final Executor val$executor;
        final Runnable val$runnable;

        public final void run()
        {
            executor.execute(deliveringRunnable);
        }

            
            {
                this$0 = final_janklock;
                blockingQueue = executor1;
                runnable = runnable1;
                executor = Executor.this;
                super();
            }
    }

}
