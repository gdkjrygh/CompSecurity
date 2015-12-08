// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.os.AsyncTask;
import java.util.concurrent.Executor;

class ExecutorCompatHoneycomb
{

    ExecutorCompatHoneycomb()
    {
    }

    public static Executor getParallelExecutor()
    {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }
}
