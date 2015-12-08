// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiaction;

import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.service.logging.uiaction.model.StartPlayEndedEvent;

// Referenced classes of package com.netflix.mediaclient.service.logging.uiaction:
//            BaseUIActionSession

public final class StartPlaySession extends BaseUIActionSession
{

    public static final String NAME = "startPlay";

    public StartPlaySession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        super(commandname, modalview);
    }

    public StartPlayEndedEvent createEndedEvent(com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror, Integer integer)
    {
        long l = System.currentTimeMillis();
        long l1 = mStarted;
        completionreason = new StartPlayEndedEvent(mId, l - l1, mView, mAction, completionreason, uierror, integer);
        completionreason.setCategory(getCategory());
        completionreason.setSessionId(mId);
        return completionreason;
    }

    public String getName()
    {
        return "startPlay";
    }
}
