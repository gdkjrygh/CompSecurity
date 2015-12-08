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

class ew
    implements Runnable
{

    final ApmLoggingImpl this$0;
    final DataContext val$dataContext;
    final String val$dialogId;
    final boolean val$portrait;
    final com.netflix.mediaclient.servicemgr.dalView val$ui;
    final com.netflix.mediaclient.servicemgr.dalView val$view;

    public void run()
    {
        if (Log.isLoggable("nf_log_apm", 3))
        {
            Log.d("nf_log_apm", (new StringBuilder()).append("UI modeless session created for ").append(val$view).append(". In portrait ").append(val$portrait).append(". Session ID: ").append(val$dialogId).toString());
        }
        Object obj = new UIModelessViewSession();
        ApmLoggingImpl.access$900(ApmLoggingImpl.this).put(val$dialogId, obj);
        ApmLoggingImpl.access$100(ApmLoggingImpl.this).addSession(((com.netflix.mediaclient.service.logging.client.LoggingSession) (obj)));
        Log.d("nf_log_apm", "UI modeless session start event posting...");
        obj = ((UIModelessViewSession) (obj)).createStartEvent(val$portrait, val$view);
        ApmLoggingImpl.access$300(ApmLoggingImpl.this, ((com.netflix.mediaclient.service.logging.client.model.Event) (obj)), val$dataContext, val$ui);
        ApmLoggingImpl.access$100(ApmLoggingImpl.this).post(((com.netflix.mediaclient.service.logging.client.model.Event) (obj)));
        Log.d("nf_log_apm", "UI modeless session start event posted.");
    }

    ew()
    {
        this$0 = final_apmloggingimpl;
        val$view = dalview;
        val$portrait = flag;
        val$dialogId = s;
        val$dataContext = datacontext;
        val$ui = com.netflix.mediaclient.servicemgr.dalView.this;
        super();
    }
}
