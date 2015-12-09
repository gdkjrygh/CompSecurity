// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm;

import com.netflix.mediaclient.service.logging.apm.model.UserSessionEndedEvent;
import com.netflix.mediaclient.service.logging.apm.model.UserSessionStartedEvent;
import com.netflix.mediaclient.service.logging.client.model.DataContext;

// Referenced classes of package com.netflix.mediaclient.service.logging.apm:
//            BaseApmSession

public final class UserSession extends BaseApmSession
{

    public static final String NAME = "userSession";
    private UserSessionEndedEvent mPendingEndEvent;
    private boolean waitingOnSessionId;

    public UserSession()
    {
    }

    public UserSessionEndedEvent createEndedEvent(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.EndReason endreason, long l, DataContext datacontext, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        long l1 = System.currentTimeMillis();
        long l2 = mStarted;
        UserSessionEndedEvent usersessionendedevent = new UserSessionEndedEvent(mId, l1 - l2, endreason, l);
        usersessionendedevent.setCategory(getCategory());
        usersessionendedevent.setModalView(modalview);
        usersessionendedevent.setDataContext(datacontext);
        endreason = usersessionendedevent;
        if (waitingOnSessionId)
        {
            mPendingEndEvent = usersessionendedevent;
            endreason = null;
        }
        return endreason;
    }

    public UserSessionStartedEvent createStartEvent(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger trigger, long l)
    {
        trigger = new UserSessionStartedEvent(trigger, l);
        trigger.setCategory(getCategory());
        return trigger;
    }

    public String getName()
    {
        return "userSession";
    }

    public UserSessionEndedEvent getPendingEndEvent()
    {
        return mPendingEndEvent;
    }

    public boolean isWaitingOnSessionId()
    {
        return waitingOnSessionId;
    }

    public void setId(long l)
    {
        super.setId(l);
        waitingOnSessionId = false;
    }
}
