// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.common.executor;

import android.os.AsyncTask;

// Referenced classes of package com.google.zxing.client.android.common.executor:
//            AsyncTaskExecInterface

public final class HoneycombAsyncTaskExecInterface
    implements AsyncTaskExecInterface
{

    public HoneycombAsyncTaskExecInterface()
    {
    }

    public transient void execute(AsyncTask asynctask, Object aobj[])
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            asynctask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, aobj);
            return;
        } else
        {
            asynctask.execute(aobj);
            return;
        }
    }
}
