// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.apm.UIStartupSession;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.UIError;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            ApmLoggingImpl, EventHandler

class ew
    implements Runnable
{

    final ApmLoggingImpl this$0;
    final DataContext val$dataContext;
    final UIError val$error;
    final boolean val$success;
    final com.netflix.mediaclient.servicemgr.dalView val$ui;

    public void run()
    {
        Log.d("nf_log_apm", "UI startup session ended");
        if (ApmLoggingImpl.access$700(ApmLoggingImpl.this) == null)
        {
            Log.w("nf_log_apm", "UI startup session does NOT exist!");
            return;
        } else
        {
            ApmLoggingImpl.access$100(ApmLoggingImpl.this).removeSession(ApmLoggingImpl.access$700(ApmLoggingImpl.this));
            Log.d("nf_log_apm", "UI startup session end event posting...");
            com.netflix.mediaclient.service.logging.apm.model.UIStartupSessionEndedEvent uistartupsessionendedevent = ApmLoggingImpl.access$700(ApmLoggingImpl.this).createEndedEvent(val$success, val$error);
            ApmLoggingImpl.access$300(ApmLoggingImpl.this, uistartupsessionendedevent, val$dataContext, val$ui);
            ApmLoggingImpl.access$100(ApmLoggingImpl.this).post(uistartupsessionendedevent);
            ApmLoggingImpl.access$702(ApmLoggingImpl.this, null);
            Log.d("nf_log_apm", "UI startup session end event posted.");
            return;
        }
    }

    ew()
    {
        this$0 = final_apmloggingimpl;
        val$success = flag;
        val$error = uierror;
        val$dataContext = datacontext;
        val$ui = com.netflix.mediaclient.servicemgr.dalView.this;
        super();
    }
}
