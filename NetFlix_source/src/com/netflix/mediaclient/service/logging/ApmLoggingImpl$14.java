// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.apm.UIAssetRequestSession;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.Error;
import com.netflix.mediaclient.service.logging.client.model.HttpResponse;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            ApmLoggingImpl, EventHandler

class w
    implements Runnable
{

    final ApmLoggingImpl this$0;
    final com.netflix.mediaclient.servicemgr.pletionReason val$completionReason;
    final DataContext val$dataContext;
    final Error val$error;
    final HttpResponse val$httpResponse;
    final com.netflix.mediaclient.servicemgr.alView val$ui;
    final String val$url;

    public void run()
    {
        Object obj = (UIAssetRequestSession)ApmLoggingImpl.access$1100(ApmLoggingImpl.this).remove(val$url);
        if (obj == null)
        {
            if (Log.isLoggable("nf_log_apm", 3))
            {
                Log.d("nf_log_apm", (new StringBuilder()).append("UI Asset Request session does not exist (probably due to sampling) - url: ").append(val$url).toString());
            }
            return;
        } else
        {
            ApmLoggingImpl.access$100(ApmLoggingImpl.this).removeSession(((com.netflix.mediaclient.service.logging.client.LoggingSession) (obj)));
            Log.d("nf_log_apm", "Asset request session end event posting...");
            obj = ((UIAssetRequestSession) (obj)).createEndedEvent(val$completionReason, val$httpResponse, val$error);
            ApmLoggingImpl.access$300(ApmLoggingImpl.this, ((com.netflix.mediaclient.service.logging.client.model.Event) (obj)), val$dataContext, val$ui);
            ApmLoggingImpl.access$100(ApmLoggingImpl.this).post(((com.netflix.mediaclient.service.logging.client.model.Event) (obj)));
            Log.d("nf_log_apm", "Asset request session end event posted.");
            return;
        }
    }

    w()
    {
        this$0 = final_apmloggingimpl;
        val$url = s;
        val$completionReason = pletionreason;
        val$httpResponse = httpresponse;
        val$error = error1;
        val$dataContext = datacontext;
        val$ui = com.netflix.mediaclient.servicemgr.alView.this;
        super();
    }
}
