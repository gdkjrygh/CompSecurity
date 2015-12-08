// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            AsyncTask

class rkerRunnable extends rkerRunnable
{

    final AsyncTask this$0;

    public Object call()
        throws Exception
    {
        AsyncTask.access$200(AsyncTask.this).set(true);
        Process.setThreadPriority(10);
        return AsyncTask.access$300(AsyncTask.this, doInBackground(params));
    }

    rkerRunnable()
    {
        this$0 = AsyncTask.this;
        super(null);
    }
}
