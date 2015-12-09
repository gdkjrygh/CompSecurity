// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.service.logging.uiaction.UpgradeStreamsSession;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            UserActionLoggingImpl, EventHandler

class val.dataContext
    implements Runnable
{

    final UserActionLoggingImpl this$0;
    final DataContext val$dataContext;
    final com.netflix.mediaclient.servicemgr. val$endStreams;
    final UIError val$error;
    final com.netflix.mediaclient.servicemgr.Reason val$reason;

    public void run()
    {
        Log.d("nf_log", "UpgradeStreams session ended");
        if (UserActionLoggingImpl.access$1200(UserActionLoggingImpl.this) == null)
        {
            Log.w("nf_log", "UpgradeStreams session does NOT exist!");
            return;
        }
        com.netflix.mediaclient.service.logging.uiaction.model.UpgradeStreamsEndedEvent upgradestreamsendedevent = UserActionLoggingImpl.access$1200(UserActionLoggingImpl.this).createEndedEvent(val$reason, val$error, val$endStreams);
        if (upgradestreamsendedevent == null)
        {
            Log.d("nf_log", "User session still waits on session id, do not post at this time.");
            return;
        } else
        {
            UserActionLoggingImpl.access$100(UserActionLoggingImpl.this, upgradestreamsendedevent, val$dataContext, UserActionLoggingImpl.access$1200(UserActionLoggingImpl.this).getView());
            UserActionLoggingImpl.access$200(UserActionLoggingImpl.this).removeSession(UserActionLoggingImpl.access$1200(UserActionLoggingImpl.this));
            Log.d("nf_log", "UpgradeStreams session end event posting...");
            UserActionLoggingImpl.access$200(UserActionLoggingImpl.this).post(upgradestreamsendedevent);
            UserActionLoggingImpl.access$1202(UserActionLoggingImpl.this, null);
            Log.d("nf_log", "UpgradeStreams session end event posted.");
            return;
        }
    }

    n()
    {
        this$0 = final_useractionloggingimpl;
        val$reason = reason1;
        val$error = uierror;
        val$endStreams = ;
        val$dataContext = DataContext.this;
        super();
    }
}
