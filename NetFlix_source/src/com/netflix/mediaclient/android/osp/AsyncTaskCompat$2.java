// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.osp;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.android.osp:
//            AsyncTaskCompat

class rkerRunnable extends rkerRunnable
{

    final AsyncTaskCompat this$0;

    public Object call()
        throws Exception
    {
        AsyncTaskCompat.access$200(AsyncTaskCompat.this).set(true);
        Process.setThreadPriority(10);
        return AsyncTaskCompat.access$300(AsyncTaskCompat.this, doInBackground(mParams));
    }

    rkerRunnable()
    {
        this$0 = AsyncTaskCompat.this;
        super(null);
    }
}
