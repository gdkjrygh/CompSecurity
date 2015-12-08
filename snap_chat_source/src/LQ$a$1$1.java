// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

final class .Object
    implements Runnable
{

    final ueTime this$1;
    final long val$enqueueTime;

    public final void run()
    {
        long l = System.currentTimeMillis();
        uiLatencyAggregator.a(l - val$enqueueTime);
    }

    .Object()
    {
        this$1 = final_obj;
        val$enqueueTime = J.this;
        super();
    }

    // Unreferenced inner class LQ$a$1

/* anonymous class */
    final class LQ.a._cls1
        implements Runnable
    {

        final LQ.a this$0;
        final AtomicBoolean val$isRunning;
        final long val$maxTimes;
        final long val$sleepDuration;
        final LP val$uiLatencyAggregator;

        public final void run()
        {
            int j;
            for (int i = 0; isRunning.get(); i = j)
            {
                j = i;
                if (maxTimes >= 0L)
                {
                    if ((long)i >= maxTimes)
                    {
                        break;
                    }
                    j = i + 1;
                }
                long l = System.currentTimeMillis();
                mUiHandler.post(l. new LQ.a._cls1._cls1());
                PG.a(sleepDuration);
            }

        }

            
            {
                this$0 = final_a1;
                isRunning = atomicboolean;
                maxTimes = l;
                uiLatencyAggregator = lp;
                sleepDuration = J.this;
                super();
            }
    }

}
