// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm;

import com.netflix.mediaclient.service.logging.apm.model.AppSessionEndedEvent;
import com.netflix.mediaclient.service.logging.apm.model.AppSessionStartedEvent;
import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;

// Referenced classes of package com.netflix.mediaclient.service.logging.apm:
//            BaseApmSession

public class ApplicationSession extends BaseApmSession
{

    public static final String NAME = "appSession";
    private DeviceUniqueId mId;

    public ApplicationSession()
    {
    }

    public AppSessionEndedEvent createEndedEvent()
    {
        AppSessionEndedEvent appsessionendedevent = new AppSessionEndedEvent(System.currentTimeMillis() - mStarted);
        appsessionendedevent.setCategory(getCategory());
        appsessionendedevent.setSessionId(mId);
        return appsessionendedevent;
    }

    public AppSessionStartedEvent createStartEvent(boolean flag)
    {
        AppSessionStartedEvent appsessionstartedevent = new AppSessionStartedEvent();
        appsessionstartedevent.setLastShutdownGraceful(flag);
        appsessionstartedevent.setCategory(getCategory());
        appsessionstartedevent.setSessionId(mId);
        return appsessionstartedevent;
    }

    public String getName()
    {
        return "appSession";
    }
}
