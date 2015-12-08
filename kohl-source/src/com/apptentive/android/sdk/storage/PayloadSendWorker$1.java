// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.storage;

import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.module.metric.MetricModule;

// Referenced classes of package com.apptentive.android.sdk.storage:
//            PayloadSendWorker

static final class 
    implements tionHandler
{

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Log.e("Error in PayloadSendWorker.", throwable, new Object[0]);
        MetricModule.sendError(PayloadSendWorker.access$100(), throwable, null, null);
    }

    ()
    {
    }
}
