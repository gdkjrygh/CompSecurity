// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm;

import com.netflix.mediaclient.service.logging.apm.model.WiredNetworkConnectionSessionEndedEvent;
import com.netflix.mediaclient.service.logging.apm.model.WiredNetworkConnectionSessionStartedEvent;
import com.netflix.mediaclient.service.logging.client.model.Event;

// Referenced classes of package com.netflix.mediaclient.service.logging.apm:
//            NetworkConnectionSession

public class WiredNetworkConnectionSession extends NetworkConnectionSession
{

    public static final String NAME = "wiredNetworkConnection";

    public WiredNetworkConnectionSession()
    {
    }

    public WiredNetworkConnectionSessionEndedEvent createEndedEvent()
    {
        long l = System.currentTimeMillis();
        long l1 = mStarted;
        WiredNetworkConnectionSessionEndedEvent wirednetworkconnectionsessionendedevent = new WiredNetworkConnectionSessionEndedEvent(mId, l - l1);
        wirednetworkconnectionsessionendedevent.setCategory(getCategory());
        return wirednetworkconnectionsessionendedevent;
    }

    public volatile Event createEndedEvent()
    {
        return createEndedEvent();
    }

    public WiredNetworkConnectionSessionStartedEvent createStartEvent()
    {
        WiredNetworkConnectionSessionStartedEvent wirednetworkconnectionsessionstartedevent = new WiredNetworkConnectionSessionStartedEvent();
        wirednetworkconnectionsessionstartedevent.setCategory(getCategory());
        wirednetworkconnectionsessionstartedevent.setSessionId(mId);
        return wirednetworkconnectionsessionstartedevent;
    }

    public volatile Event createStartEvent()
    {
        return createStartEvent();
    }

    public String getName()
    {
        return "wiredNetworkConnection";
    }
}
