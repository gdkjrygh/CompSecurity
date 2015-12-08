// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.apm.ApplicationSession;
import com.netflix.mediaclient.service.logging.client.model.DataContext;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            ApmLoggingImpl, EventHandler

class ew
    implements Runnable
{

    final ApmLoggingImpl this$0;
    final DataContext val$dataContext;
    final com.netflix.mediaclient.servicemgr.dalView val$ui;

    public void run()
    {
        Log.d("nf_log_apm", "Application session ended");
        if (ApmLoggingImpl.access$200(ApmLoggingImpl.this) == null)
        {
            Log.w("nf_log_apm", "Application session does NOT exist!");
            return;
        } else
        {
            ApmLoggingImpl.access$100(ApmLoggingImpl.this).removeSession(ApmLoggingImpl.access$200(ApmLoggingImpl.this));
            Log.d("nf_log_apm", "Application session end event posting...");
            com.netflix.mediaclient.service.logging.apm.model.AppSessionEndedEvent appsessionendedevent = ApmLoggingImpl.access$200(ApmLoggingImpl.this).createEndedEvent();
            ApmLoggingImpl.access$300(ApmLoggingImpl.this, appsessionendedevent, val$dataContext, val$ui);
            ApmLoggingImpl.access$100(ApmLoggingImpl.this).post(appsessionendedevent);
            ApmLoggingImpl.access$202(ApmLoggingImpl.this, null);
            Log.d("nf_log_apm", "Application session end event posted.");
            return;
        }
    }

    ew()
    {
        this$0 = final_apmloggingimpl;
        val$dataContext = datacontext;
        val$ui = com.netflix.mediaclient.servicemgr.dalView.this;
        super();
    }
}
