// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.apm.ApplicationSession;
import com.netflix.mediaclient.service.logging.apm.model.AppSessionStartedEvent;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            ApmLoggingImpl, EventHandler

class ew
    implements Runnable
{

    final ApmLoggingImpl this$0;
    final DataContext val$dataContext;
    final boolean val$lastShutdownGraceful;
    final com.netflix.mediaclient.servicemgr.dalView val$ui;

    public void run()
    {
        Log.d("nf_log_apm", "Application session created");
        Object obj = ApmLoggingImpl.access$100(ApmLoggingImpl.this).getApplicationId();
        if (Log.isLoggable("nf_log_apm", 3))
        {
            Log.d("nf_log_apm", (new StringBuilder()).append("startApplicationSession: Application id ").append(((String) (obj))).toString());
        }
        long l = Long.parseLong(((String) (obj)));
        ApmLoggingImpl.access$202(ApmLoggingImpl.this, new ApplicationSession());
        ApmLoggingImpl.access$200(ApmLoggingImpl.this).setId(l);
        ApmLoggingImpl.access$100(ApmLoggingImpl.this).addSession(ApmLoggingImpl.access$200(ApmLoggingImpl.this));
        Log.d("nf_log_apm", "Application session start event posting...");
        obj = ApmLoggingImpl.access$200(ApmLoggingImpl.this).createStartEvent(val$lastShutdownGraceful);
        ApmLoggingImpl.access$300(ApmLoggingImpl.this, ((com.netflix.mediaclient.service.logging.client.model.Event) (obj)), val$dataContext, val$ui);
        ((AppSessionStartedEvent) (obj)).setSessionId(new DeviceUniqueId(l));
        ApmLoggingImpl.access$100(ApmLoggingImpl.this).post(((com.netflix.mediaclient.service.logging.client.model.Event) (obj)));
        Log.d("nf_log_apm", "Application session start event posted.");
    }

    ew()
    {
        this$0 = final_apmloggingimpl;
        val$lastShutdownGraceful = flag;
        val$dataContext = datacontext;
        val$ui = com.netflix.mediaclient.servicemgr.dalView.this;
        super();
    }
}
