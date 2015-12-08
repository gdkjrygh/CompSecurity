// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiaction;

import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.service.logging.uiaction.model.AcknowledgeSignupEndedEvent;

// Referenced classes of package com.netflix.mediaclient.service.logging.uiaction:
//            BaseUIActionSession

public final class AcknowledgeSignupSession extends BaseUIActionSession
{

    public static final String NAME = "acknowledgeSignup";

    public AcknowledgeSignupSession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        super(commandname, modalview);
    }

    public AcknowledgeSignupEndedEvent createEndedEvent(com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        long l = System.currentTimeMillis();
        long l1 = mStarted;
        completionreason = new AcknowledgeSignupEndedEvent(mId, l - l1, mView, mAction, completionreason, uierror);
        completionreason.setCategory(getCategory());
        completionreason.setSessionId(mId);
        return completionreason;
    }

    public String getName()
    {
        return "acknowledgeSignup";
    }
}
