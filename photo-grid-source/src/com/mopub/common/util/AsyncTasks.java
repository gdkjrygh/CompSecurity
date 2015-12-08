// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;

import android.os.AsyncTask;
import com.mopub.common.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AsyncTasks
{

    private static Executor a;

    public AsyncTasks()
    {
    }

    public static transient void safeExecuteOnExecutor(AsyncTask asynctask, Object aobj[])
    {
        Preconditions.checkNotNull(asynctask, "Unable to execute null AsyncTask.");
        Preconditions.checkUiThread("AsyncTask must be executed on the main thread");
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            asynctask.executeOnExecutor(a, aobj);
            return;
        } else
        {
            asynctask.execute(aobj);
            return;
        }
    }

    public static void setExecutor(Executor executor)
    {
        a = executor;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = AsyncTask.THREAD_POOL_EXECUTOR;
        } else
        {
            a = Executors.newSingleThreadExecutor();
        }
    }
}
