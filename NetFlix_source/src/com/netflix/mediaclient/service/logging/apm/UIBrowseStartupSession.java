// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm;

import com.netflix.mediaclient.service.logging.apm.model.UIBrowseStartupSessionEndedEvent;
import com.netflix.mediaclient.service.logging.client.model.UIError;

// Referenced classes of package com.netflix.mediaclient.service.logging.apm:
//            BaseApmSession

public final class UIBrowseStartupSession extends BaseApmSession
{

    public static final String NAME = "uiBrowseStartup";

    public UIBrowseStartupSession()
    {
    }

    public UIBrowseStartupSessionEndedEvent createEndedEvent(long l, boolean flag, UIError uierror)
    {
        UIBrowseStartupSessionEndedEvent uibrowsestartupsessionendedevent = new UIBrowseStartupSessionEndedEvent(System.currentTimeMillis() - mStarted, l);
        uibrowsestartupsessionendedevent.setCategory(getCategory());
        uibrowsestartupsessionendedevent.setSessionId(mId);
        uibrowsestartupsessionendedevent.setError(uierror);
        uibrowsestartupsessionendedevent.setSuccess(flag);
        return uibrowsestartupsessionendedevent;
    }

    public String getName()
    {
        return "uiBrowseStartup";
    }
}
