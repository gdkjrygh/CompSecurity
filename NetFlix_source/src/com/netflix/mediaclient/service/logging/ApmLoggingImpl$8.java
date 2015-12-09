// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.apm.UIBrowseStartupSession;
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
    final long val$timeToBrowseInteractive;
    final com.netflix.mediaclient.servicemgr.dalView val$ui;

    public void run()
    {
        Log.d("nf_log_apm", "UI browse startup session ended");
        if (ApmLoggingImpl.access$800(ApmLoggingImpl.this) == null)
        {
            Log.w("nf_log_apm", "UI browse startup session does NOT exist!");
            return;
        } else
        {
            ApmLoggingImpl.access$100(ApmLoggingImpl.this).removeSession(ApmLoggingImpl.access$800(ApmLoggingImpl.this));
            Log.d("nf_log_apm", "UI browse startup session end event posting...");
            com.netflix.mediaclient.service.logging.apm.model.UIBrowseStartupSessionEndedEvent uibrowsestartupsessionendedevent = ApmLoggingImpl.access$800(ApmLoggingImpl.this).createEndedEvent(val$timeToBrowseInteractive, val$success, val$error);
            ApmLoggingImpl.access$300(ApmLoggingImpl.this, uibrowsestartupsessionendedevent, val$dataContext, val$ui);
            ApmLoggingImpl.access$100(ApmLoggingImpl.this).post(uibrowsestartupsessionendedevent);
            ApmLoggingImpl.access$802(ApmLoggingImpl.this, null);
            Log.d("nf_log_apm", "UI browse startup session end event posted.");
            return;
        }
    }

    ew()
    {
        this$0 = final_apmloggingimpl;
        val$timeToBrowseInteractive = l;
        val$success = flag;
        val$error = uierror;
        val$dataContext = datacontext;
        val$ui = com.netflix.mediaclient.servicemgr.dalView.this;
        super();
    }
}
