// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.apm.model.UIModalViewChangedEvent;
import com.netflix.mediaclient.service.logging.client.model.DataContext;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            ApmLoggingImpl, EventHandler

class w
    implements Runnable
{

    final ApmLoggingImpl this$0;
    final DataContext val$dataContext;
    final boolean val$portrait;
    final com.netflix.mediaclient.servicemgr.alView val$ui;
    final com.netflix.mediaclient.servicemgr.alView val$view;

    public void run()
    {
        if (Log.isLoggable("nf_log_apm", 3))
        {
            Log.d("nf_log_apm", (new StringBuilder()).append("UI view changed ").append(val$view).toString());
        }
        UIModalViewChangedEvent uimodalviewchangedevent = new UIModalViewChangedEvent(val$portrait, val$view);
        ApmLoggingImpl.access$300(ApmLoggingImpl.this, uimodalviewchangedevent, val$dataContext, val$ui);
        ApmLoggingImpl.access$100(ApmLoggingImpl.this).post(uimodalviewchangedevent);
        Log.d("nf_log_apm", "UI view changed event posted.");
    }

    w()
    {
        this$0 = final_apmloggingimpl;
        val$view = alview;
        val$portrait = flag;
        val$dataContext = datacontext;
        val$ui = com.netflix.mediaclient.servicemgr.alView.this;
        super();
    }
}
