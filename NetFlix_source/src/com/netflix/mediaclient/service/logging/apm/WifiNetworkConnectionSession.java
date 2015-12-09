// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm;

import com.netflix.mediaclient.service.logging.apm.model.WifiNetworkConnectionSessionEndedEvent;
import com.netflix.mediaclient.service.logging.apm.model.WifiNetworkConnectionSessionStartedEvent;
import com.netflix.mediaclient.service.logging.client.model.Event;

// Referenced classes of package com.netflix.mediaclient.service.logging.apm:
//            NetworkConnectionSession

public class WifiNetworkConnectionSession extends NetworkConnectionSession
{

    public static final String NAME = "wifiNetworkConnection";

    public WifiNetworkConnectionSession()
    {
    }

    public WifiNetworkConnectionSessionEndedEvent createEndedEvent()
    {
        long l = System.currentTimeMillis();
        long l1 = mStarted;
        WifiNetworkConnectionSessionEndedEvent wifinetworkconnectionsessionendedevent = new WifiNetworkConnectionSessionEndedEvent(mId, l - l1);
        wifinetworkconnectionsessionendedevent.setCategory(getCategory());
        return wifinetworkconnectionsessionendedevent;
    }

    public volatile Event createEndedEvent()
    {
        return createEndedEvent();
    }

    public WifiNetworkConnectionSessionStartedEvent createStartEvent()
    {
        WifiNetworkConnectionSessionStartedEvent wifinetworkconnectionsessionstartedevent = new WifiNetworkConnectionSessionStartedEvent();
        wifinetworkconnectionsessionstartedevent.setCategory(getCategory());
        wifinetworkconnectionsessionstartedevent.setSessionId(mId);
        return wifinetworkconnectionsessionstartedevent;
    }

    public volatile Event createStartEvent()
    {
        return createStartEvent();
    }

    public String getName()
    {
        return "wifiNetworkConnection";
    }
}
