// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.apm.UIStartupSession;
import com.netflix.mediaclient.service.logging.apm.model.Display;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            ApmLoggingImpl, EventHandler

class val.started
    implements Runnable
{

    final ApmLoggingImpl this$0;
    final Map val$activeABTests;
    final com.netflix.mediaclient.servicemgr.dalView val$destination;
    final Display val$display;
    final String val$searchTerm;
    final Long val$started;
    final int val$trackId;
    final com.netflix.mediaclient.servicemgr.manceMetricsLogging.UiStartupTrigger val$trigger;

    public void run()
    {
        Log.d("nf_log_apm", "UI startup session created");
        UIStartupSession uistartupsession = new UIStartupSession(val$trigger, val$destination, val$trackId, val$searchTerm, val$activeABTests, val$display);
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
        val$trackId = i;
        val$searchTerm = s;
        val$activeABTests = map;
        val$display = display1;
        val$started = Long.this;
        super();
    }
}
