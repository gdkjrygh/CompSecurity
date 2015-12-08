// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.service.logging.uiaction.SearchSession;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            UserActionLoggingImpl, EventHandler

class 
    implements Runnable
{

    final UserActionLoggingImpl this$0;
    final DataContext val$dataContext;
    final UIError val$error;
    final com.netflix.mediaclient.servicemgr.nReason val$reason;
    final long val$requestId;

    public void run()
    {
        Log.d("nf_log", "Search session ended");
        SearchSession searchsession = (SearchSession)UserActionLoggingImpl.access$900(UserActionLoggingImpl.this).get(Long.valueOf(val$requestId));
        if (searchsession == null)
        {
            Log.w("nf_log", (new StringBuilder()).append("Search session does NOT exist for ").append(val$requestId).toString());
            return;
        }
        com.netflix.mediaclient.service.logging.uiaction.model.SearchEndedEvent searchendedevent = searchsession.createEndedEvent(val$reason, val$error);
        if (searchendedevent == null)
        {
            Log.d("nf_log", "Search session still waits on session id, do not post at this time.");
            return;
        } else
        {
            UserActionLoggingImpl.access$100(UserActionLoggingImpl.this, searchendedevent, val$dataContext, searchsession.getView());
            UserActionLoggingImpl.access$200(UserActionLoggingImpl.this).removeSession(searchsession);
            Log.d("nf_log", "Search session end event posting...");
            UserActionLoggingImpl.access$200(UserActionLoggingImpl.this).post(searchendedevent);
            Log.d("nf_log", "Search session end event posted.");
            return;
        }
    }

    ()
    {
        this$0 = final_useractionloggingimpl;
        val$requestId = l;
        val$reason = nreason;
        val$error = uierror;
        val$dataContext = DataContext.this;
        super();
    }
}
