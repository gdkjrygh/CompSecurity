// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiaction;

import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.service.logging.uiaction.model.UpgradeStreamsEndedEvent;

// Referenced classes of package com.netflix.mediaclient.service.logging.uiaction:
//            BaseUIActionSession

public final class UpgradeStreamsSession extends BaseUIActionSession
{

    public static final String NAME = "upgradeStreams";
    private com.netflix.mediaclient.servicemgr.UserActionLogging.Streams mCurrentStreams;

    public UpgradeStreamsSession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, com.netflix.mediaclient.servicemgr.UserActionLogging.Streams streams)
    {
        super(commandname, modalview);
    }

    public UpgradeStreamsEndedEvent createEndedEvent(com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror, com.netflix.mediaclient.servicemgr.UserActionLogging.Streams streams)
    {
        long l = System.currentTimeMillis();
        long l1 = mStarted;
        completionreason = new UpgradeStreamsEndedEvent(mId, l - l1, mView, mAction, completionreason, uierror, mCurrentStreams, streams);
        completionreason.setCategory(getCategory());
        completionreason.setSessionId(mId);
        return completionreason;
    }

    public String getName()
    {
        return "upgradeStreams";
    }
}
