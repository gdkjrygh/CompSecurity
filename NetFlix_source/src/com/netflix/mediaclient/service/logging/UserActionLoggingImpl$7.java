// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.service.logging.uiaction.RemoveFromPlaylistSession;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            UserActionLoggingImpl, EventHandler

class 
    implements Runnable
{

    final UserActionLoggingImpl this$0;
    final DataContext val$dataContext;
    final UIError val$error;
    final com.netflix.mediaclient.servicemgr.nReason val$reason;

    public void run()
    {
        Log.d("nf_log", "RemoveFromPlaylist session ended");
        if (UserActionLoggingImpl.access$800(UserActionLoggingImpl.this) == null)
        {
            Log.w("nf_log", "RemoveFromPlaylist session does NOT exist!");
            return;
        }
        com.netflix.mediaclient.service.logging.uiaction.model.RemoveFromPlaylistEndedEvent removefromplaylistendedevent = UserActionLoggingImpl.access$800(UserActionLoggingImpl.this).createEndedEvent(val$reason, val$error);
        if (removefromplaylistendedevent == null)
        {
            Log.d("nf_log", "RemoveFromPlaylist session still waits on session id, do not post at this time.");
            return;
        } else
        {
            UserActionLoggingImpl.access$100(UserActionLoggingImpl.this, removefromplaylistendedevent, val$dataContext, UserActionLoggingImpl.access$800(UserActionLoggingImpl.this).getView());
            UserActionLoggingImpl.access$200(UserActionLoggingImpl.this).removeSession(UserActionLoggingImpl.access$800(UserActionLoggingImpl.this));
            Log.d("nf_log", "RemoveFromPlaylist session end event posting...");
            UserActionLoggingImpl.access$200(UserActionLoggingImpl.this).post(removefromplaylistendedevent);
            UserActionLoggingImpl.access$802(UserActionLoggingImpl.this, null);
            Log.d("nf_log", "RemoveFromPlaylist session end event posted.");
            return;
        }
    }

    ()
    {
        this$0 = final_useractionloggingimpl;
        val$reason = nreason;
        val$error = uierror;
        val$dataContext = DataContext.this;
        super();
    }
}
