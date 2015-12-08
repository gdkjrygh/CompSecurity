// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter;

import com.apptentive.android.sdk.module.metric.MetricModule;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter:
//            MessagePollingWorker

static final class 
    implements nHandler
{

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        MetricModule.sendError(MessagePollingWorker.access$100(), throwable, null, null);
    }

    ()
    {
    }
}
