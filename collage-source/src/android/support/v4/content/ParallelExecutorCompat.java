// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import java.util.concurrent.Executor;

// Referenced classes of package android.support.v4.content:
//            ExecutorCompatHoneycomb, ModernAsyncTask

public class ParallelExecutorCompat
{

    public ParallelExecutorCompat()
    {
    }

    public static Executor getParallelExecutor()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return ExecutorCompatHoneycomb.getParallelExecutor();
        } else
        {
            return ModernAsyncTask.THREAD_POOL_EXECUTOR;
        }
    }
}
