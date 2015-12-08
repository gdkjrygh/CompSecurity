// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm;

import com.netflix.mediaclient.service.logging.apm.model.MobileNetworkConnectionSessionEndedEvent;
import com.netflix.mediaclient.service.logging.apm.model.MobileNetworkConnectionSessionStartedEvent;
import com.netflix.mediaclient.service.logging.client.model.Event;

// Referenced classes of package com.netflix.mediaclient.service.logging.apm:
//            NetworkConnectionSession

public class MobileNetworkConnectionSession extends NetworkConnectionSession
{

    public static final String NAME = "mobileNetworkConnection";

    public MobileNetworkConnectionSession()
    {
    }

    public MobileNetworkConnectionSessionEndedEvent createEndedEvent()
    {
        long l = System.currentTimeMillis();
        long l1 = mStarted;
        MobileNetworkConnectionSessionEndedEvent mobilenetworkconnectionsessionendedevent = new MobileNetworkConnectionSessionEndedEvent(mId, l - l1);
        mobilenetworkconnectionsessionendedevent.setCategory(getCategory());
        return mobilenetworkconnectionsessionendedevent;
    }

    public volatile Event createEndedEvent()
    {
        return createEndedEvent();
    }

    public MobileNetworkConnectionSessionStartedEvent createStartEvent()
    {
        MobileNetworkConnectionSessionStartedEvent mobilenetworkconnectionsessionstartedevent = new MobileNetworkConnectionSessionStartedEvent();
        mobilenetworkconnectionsessionstartedevent.setCategory(getCategory());
        mobilenetworkconnectionsessionstartedevent.setSessionId(mId);
        return mobilenetworkconnectionsessionstartedevent;
    }

    public volatile Event createStartEvent()
    {
        return createStartEvent();
    }

    public String getName()
    {
        return "mobileNetworkConnection";
    }
}
