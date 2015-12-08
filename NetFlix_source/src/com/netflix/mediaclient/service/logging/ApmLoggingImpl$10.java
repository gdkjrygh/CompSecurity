// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.apm.UIModelessViewSession;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            ApmLoggingImpl, EventHandler

class w
    implements Runnable
{

    final ApmLoggingImpl this$0;
    final DataContext val$dataContext;
    final String val$requestId;
    final com.netflix.mediaclient.servicemgr.alView val$ui;

    public void run()
    {
        Log.d("nf_log_apm", "UI modeless session ended");
        Object obj = (UIModelessViewSession)ApmLoggingImpl.access$900(ApmLoggingImpl.this).get(val$requestId);
        if (obj == null)
        {
            Log.w("nf_log_apm", (new StringBuilder()).append("UI modeless session does NOT exist for request ID:").append(val$requestId).toString());
            return;
        } else
        {
            ApmLoggingImpl.access$100(ApmLoggingImpl.this).removeSession(((com.netflix.mediaclient.service.logging.client.LoggingSession) (obj)));
            Log.d("nf_log_apm", "UI modeless session end event posting...");
            obj = ((UIModelessViewSession) (obj)).createEndedEvent();
            ApmLoggingImpl.access$300(ApmLoggingImpl.this, ((com.netflix.mediaclient.service.logging.client.model.Event) (obj)), val$dataContext, val$ui);
            ApmLoggingImpl.access$100(ApmLoggingImpl.this).post(((com.netflix.mediaclient.service.logging.client.model.Event) (obj)));
            Log.d("nf_log_apm", "UI modeless session end event posted.");
            return;
        }
    }

    w()
    {
        this$0 = final_apmloggingimpl;
        val$requestId = s;
        val$dataContext = datacontext;
        val$ui = com.netflix.mediaclient.servicemgr.alView.this;
        super();
    }
}
