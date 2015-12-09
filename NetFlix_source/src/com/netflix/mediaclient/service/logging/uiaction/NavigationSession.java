// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiaction;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.service.logging.uiaction.model.NavigationEndedEvent;

// Referenced classes of package com.netflix.mediaclient.service.logging.uiaction:
//            BaseUIActionSession

public final class NavigationSession extends BaseUIActionSession
{

    public static final String NAME = "navigate";
    private static final String TAG = "nf_log";

    public NavigationSession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        super(commandname, modalview);
    }

    public NavigationEndedEvent createEndedEvent(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror)
    {
        if (modalview == mView)
        {
            if (Log.isLoggable("nf_log", 3))
            {
                Log.d("nf_log", (new StringBuilder()).append("We stayed in same view, do not report ").append(modalview).toString());
            }
            return null;
        }
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("We started from ").append(modalview).append(" and ended up on ").append(mView).toString());
        }
        long l = System.currentTimeMillis();
        long l1 = mStarted;
        modalview = new NavigationEndedEvent(mId, l - l1, mAction, completionreason, uierror, modalview, mView);
        modalview.setCategory(getCategory());
        modalview.setSessionId(mId);
        return modalview;
    }

    public String getName()
    {
        return "navigate";
    }
}
