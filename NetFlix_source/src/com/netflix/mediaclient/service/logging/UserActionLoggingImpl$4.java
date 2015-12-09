// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.service.logging.uiaction.NavigationSession;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            UserActionLoggingImpl, EventHandler

class 
    implements Runnable
{

    final UserActionLoggingImpl this$0;
    final DataContext val$dataContext;
    final UIError val$error;
    final com.netflix.mediaclient.servicemgr.nReason val$reason;
    final com.netflix.mediaclient.servicemgr. val$view;

    public void run()
    {
        Log.d("nf_log", "Navigation session ended");
        NavigationSession navigationsession = UserActionLoggingImpl.access$500(UserActionLoggingImpl.this);
        if (navigationsession == null)
        {
            Log.w("nf_log", "Navigation session does NOT exist!");
            return;
        }
        com.netflix.mediaclient.service.logging.uiaction.model.NavigationEndedEvent navigationendedevent = navigationsession.createEndedEvent(val$view, val$reason, val$error);
        if (navigationendedevent == null)
        {
            Log.d("nf_log", "We stayed in same view, cancel session.");
        } else
        {
            Log.d("nf_log", "Navigation session end event posting...");
            UserActionLoggingImpl.access$100(UserActionLoggingImpl.this, navigationendedevent, val$dataContext, UserActionLoggingImpl.access$500(UserActionLoggingImpl.this).getView());
            UserActionLoggingImpl.access$200(UserActionLoggingImpl.this).post(navigationendedevent);
            Log.d("nf_log", "Navigation session end event posted.");
        }
        UserActionLoggingImpl.access$200(UserActionLoggingImpl.this).removeSession(navigationsession);
        UserActionLoggingImpl.access$502(UserActionLoggingImpl.this, null);
    }

    ()
    {
        this$0 = final_useractionloggingimpl;
        val$view = ;
        val$reason = nreason;
        val$error = uierror;
        val$dataContext = DataContext.this;
        super();
    }
}
