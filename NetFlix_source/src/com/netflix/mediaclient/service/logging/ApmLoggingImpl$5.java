// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.apm.UIStartupSession;
import com.netflix.mediaclient.service.logging.apm.model.Display;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            ApmLoggingImpl, EventHandler

class val.started
    implements Runnable
{

    final ApmLoggingImpl this$0;
    final com.netflix.mediaclient.servicemgr.dalView val$destination;
    final Display val$display;
    final Long val$started;
    final com.netflix.mediaclient.servicemgr.manceMetricsLogging.UiStartupTrigger val$trigger;

    public void run()
    {
        if (ApmLoggingImpl.access$700(ApmLoggingImpl.this) != null)
        {
            Log.e("nf_log_apm", "UI startup session already exist, we do not recreate it!");
            return;
        }
        Log.d("nf_log_apm", "UI startup session created");
        UIStartupSession uistartupsession = new UIStartupSession(val$trigger, val$destination, val$display);
        if (val$started != null)
        {
            uistartupsession.setStarted(val$started.longValue());
        }
        ApmLoggingImpl.access$100(ApmLoggingImpl.this).removeSession(ApmLoggingImpl.access$700(ApmLoggingImpl.this));
        ApmLoggingImpl.access$702(ApmLoggingImpl.this, uistartupsession);
        ApmLoggingImpl.access$100(ApmLoggingImpl.this).addSession(uistartupsession);
    }

    ()
    {
        this$0 = final_apmloggingimpl;
        val$trigger = uistartuptrigger;
        val$destination = dalview;
        val$display = display1;
        val$started = Long.this;
        super();
    }
}
