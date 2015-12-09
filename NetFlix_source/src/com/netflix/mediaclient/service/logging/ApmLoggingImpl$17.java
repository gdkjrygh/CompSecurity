// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.apm.WifiNetworkConnectionSession;
import com.netflix.mediaclient.service.logging.client.model.DataContext;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            ApmLoggingImpl

class w
    implements Runnable
{

    final ApmLoggingImpl this$0;
    final DataContext val$dataContext;
    final com.netflix.mediaclient.servicemgr.alView val$ui;

    public void run()
    {
        Log.d("nf_log_apm", "Wifi networking session started and posted to executor");
        ApmLoggingImpl.access$1200(ApmLoggingImpl.this, new WifiNetworkConnectionSession(), val$dataContext, val$ui);
        Log.d("nf_log_apm", "Wifi networking session start event posted.");
    }

    w()
    {
        this$0 = final_apmloggingimpl;
        val$dataContext = datacontext;
        val$ui = com.netflix.mediaclient.servicemgr.alView.this;
        super();
    }
}
