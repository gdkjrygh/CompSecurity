// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import com.kik.g.p;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

// Referenced classes of package com.kik.cards.usermedia:
//            n

final class m extends java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy
{

    m()
    {
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadpoolexecutor)
    {
        if (!threadpoolexecutor.isShutdown())
        {
            ((n)threadpoolexecutor.getQueue().poll()).a.a(null);
            threadpoolexecutor.execute(runnable);
        }
    }
}
