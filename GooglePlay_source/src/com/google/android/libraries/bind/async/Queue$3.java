// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.async;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.libraries.bind.async:
//            Queue

final class this._cls0
    implements ThreadFactory
{

    private final AtomicInteger createdCount = new AtomicInteger(1);
    final Queue this$0;

    public final Thread newThread(final Runnable r)
    {
        r = new Runnable() {

            final Queue._cls3 this$1;
            final Runnable val$r;

            public final void run()
            {
                Process.setThreadPriority(10);
                r.run();
            }

            
            {
                this$1 = Queue._cls3.this;
                r = runnable;
                super();
            }
        };
        String s = (new StringBuilder()).append(Queue.this).append(" #").append(createdCount.getAndIncrement()).toString();
        r = new Thread(threadGroup, r, s);
        r.setPriority(1);
        return r;
    }

    _cls1.val.r()
    {
        this$0 = Queue.this;
        super();
    }
}
