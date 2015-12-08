// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm;

import com.netflix.mediaclient.service.logging.apm.model.UIModelessViewSessionEndedEvent;
import com.netflix.mediaclient.service.logging.apm.model.UIModelessViewSessionStartedEvent;

// Referenced classes of package com.netflix.mediaclient.service.logging.apm:
//            BaseApmSession

public final class UIModelessViewSession extends BaseApmSession
{

    public static final String NAME = "uiModelessView";
    private com.netflix.mediaclient.servicemgr.IClientLogging.ModalView mTarget;

    public UIModelessViewSession()
    {
    }

    public UIModelessViewSessionEndedEvent createEndedEvent()
    {
        long l = System.currentTimeMillis();
        long l1 = mStarted;
        UIModelessViewSessionEndedEvent uimodelessviewsessionendedevent = new UIModelessViewSessionEndedEvent(mId, l - l1, mTarget);
        uimodelessviewsessionendedevent.setCategory(getCategory());
        uimodelessviewsessionendedevent.setSessionId(mId);
        uimodelessviewsessionendedevent.setModalView(mTarget);
        return uimodelessviewsessionendedevent;
    }

    public UIModelessViewSessionStartedEvent createStartEvent(boolean flag, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        mTarget = modalview;
        UIModelessViewSessionStartedEvent uimodelessviewsessionstartedevent = new UIModelessViewSessionStartedEvent(flag, modalview);
        uimodelessviewsessionstartedevent.setCategory(getCategory());
        uimodelessviewsessionstartedevent.setSessionId(mId);
        uimodelessviewsessionstartedevent.setModalView(modalview);
        return uimodelessviewsessionstartedevent;
    }

    public String getName()
    {
        return "uiModelessView";
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getTarget()
    {
        return mTarget;
    }
}
