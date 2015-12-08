// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

// Referenced classes of package com.worklight.common:
//            Logger

static final class 
    implements RejectedExecutionHandler
{

    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadpoolexecutor)
    {
        try
        {
            threadpoolexecutor.getQueue().put(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            return;
        }
    }

    ()
    {
    }
}
