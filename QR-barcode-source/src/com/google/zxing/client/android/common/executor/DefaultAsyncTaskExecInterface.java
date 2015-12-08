// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.common.executor;

import android.os.AsyncTask;

// Referenced classes of package com.google.zxing.client.android.common.executor:
//            AsyncTaskExecInterface

public final class DefaultAsyncTaskExecInterface
    implements AsyncTaskExecInterface
{

    public DefaultAsyncTaskExecInterface()
    {
    }

    public transient void execute(AsyncTask asynctask, Object aobj[])
    {
        asynctask.execute(aobj);
    }
}
