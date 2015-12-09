// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.apm.UserSession;
import com.netflix.mediaclient.service.logging.client.model.DataContext;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            ApmLoggingImpl, EventHandler

class ew
    implements Runnable
{

    final ApmLoggingImpl this$0;
    final DataContext val$dataContext;
    final com.netflix.mediaclient.servicemgr.manceMetricsLogging.EndReason val$endReason;
    final long val$lastUserActivityTime;
    final com.netflix.mediaclient.servicemgr.dalView val$ui;

    public void run()
    {
        Log.d("nf_log_apm", "User session ended");
        if (ApmLoggingImpl.access$400(ApmLoggingImpl.this) == null)
        {
            Log.w("nf_log_apm", "User session does NOT exist!");
            return;
        }
        com.netflix.mediaclient.service.logging.apm.model.UserSessionEndedEvent usersessionendedevent = ApmLoggingImpl.access$400(ApmLoggingImpl.this).createEndedEvent(val$endReason, val$lastUserActivityTime, val$dataContext, val$ui);
        if (usersessionendedevent == null)
        {
            Log.d("nf_log_apm", "User session still waits on session id, do not post at this time.");
            return;
        } else
        {
            ApmLoggingImpl.access$100(ApmLoggingImpl.this).removeSession(ApmLoggingImpl.access$400(ApmLoggingImpl.this));
            Log.d("nf_log_apm", "User session end event posting...");
            ApmLoggingImpl.access$100(ApmLoggingImpl.this).post(usersessionendedevent);
            ApmLoggingImpl.access$402(ApmLoggingImpl.this, null);
            Log.d("nf_log_apm", "User session end event posted.");
            return;
        }
    }

    ew()
    {
        this$0 = final_apmloggingimpl;
        val$endReason = endreason;
        val$lastUserActivityTime = l;
        val$dataContext = datacontext;
        val$ui = com.netflix.mediaclient.servicemgr.dalView.this;
        super();
    }
}
