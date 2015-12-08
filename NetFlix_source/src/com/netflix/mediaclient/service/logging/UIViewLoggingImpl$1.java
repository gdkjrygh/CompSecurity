// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.uiview.CommandSession;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            UIViewLoggingImpl, EventHandler

class text
    implements Runnable
{

    final UIViewLoggingImpl this$0;
    final DataContext val$dataContext;

    public void run()
    {
        Log.d("nf_log", "uiView command session ended");
        if (UIViewLoggingImpl.access$000(UIViewLoggingImpl.this) == null)
        {
            Log.w("nf_log", "uiView command session does NOT exist!");
            return;
        }
        com.netflix.mediaclient.service.logging.uiview.model.CommandEndedEvent commandendedevent = UIViewLoggingImpl.access$000(UIViewLoggingImpl.this).createEndedEvent();
        if (commandendedevent == null)
        {
            Log.d("nf_log", "uiView command session still waits on session id, do not post at this time.");
            return;
        } else
        {
            UIViewLoggingImpl.access$100(UIViewLoggingImpl.this, commandendedevent, val$dataContext, UIViewLoggingImpl.access$000(UIViewLoggingImpl.this).getView());
            UIViewLoggingImpl.access$200(UIViewLoggingImpl.this).removeSession(UIViewLoggingImpl.access$000(UIViewLoggingImpl.this));
            Log.d("nf_log", "uiView command session end event posting...");
            UIViewLoggingImpl.access$200(UIViewLoggingImpl.this).post(commandendedevent);
            UIViewLoggingImpl.access$002(UIViewLoggingImpl.this, null);
            Log.d("nf_log", "uiView command session end event posted.");
            return;
        }
    }

    text()
    {
        this$0 = final_uiviewloggingimpl;
        val$dataContext = DataContext.this;
        super();
    }
}
