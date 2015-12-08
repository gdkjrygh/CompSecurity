// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.wifi.triggers;

import com.worklight.location.api.WLTriggerCallback;
import com.worklight.location.api.wifi.WLWifiAccessPointFilter;
import com.worklight.location.internal.AbstractTrigger;
import com.worklight.location.internal.wifi.triggers.AbstractWifiFilterTrigger;
import org.json.JSONObject;

public class WLWifiConnectTrigger extends AbstractWifiFilterTrigger
{

    public WLWifiConnectTrigger()
    {
    }

    public WLWifiConnectTrigger clone()
    {
        return (new WLWifiConnectTrigger()).setCallback(getCallback()).setEvent(cloneEvent()).setTransmitImmediately(isTransmitImmediately()).setConnectedAccessPoint(getConnectedAccessPoint());
    }

    public volatile AbstractTrigger clone()
    {
        return clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public WLWifiConnectTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return (WLWifiConnectTrigger)super.setCallback(wltriggercallback);
    }

    public volatile AbstractTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return setCallback(wltriggercallback);
    }

    public WLWifiConnectTrigger setConnectedAccessPoint(WLWifiAccessPointFilter wlwifiaccesspointfilter)
    {
        return (WLWifiConnectTrigger)super.setConnectedAccessPoint(wlwifiaccesspointfilter);
    }

    public volatile AbstractWifiFilterTrigger setConnectedAccessPoint(WLWifiAccessPointFilter wlwifiaccesspointfilter)
    {
        return setConnectedAccessPoint(wlwifiaccesspointfilter);
    }

    public WLWifiConnectTrigger setEvent(JSONObject jsonobject)
    {
        return (WLWifiConnectTrigger)super.setEvent(jsonobject);
    }

    public volatile AbstractTrigger setEvent(JSONObject jsonobject)
    {
        return setEvent(jsonobject);
    }

    public WLWifiConnectTrigger setTransmitImmediately(boolean flag)
    {
        return (WLWifiConnectTrigger)super.setTransmitImmediately(flag);
    }

    public volatile AbstractTrigger setTransmitImmediately(boolean flag)
    {
        return setTransmitImmediately(flag);
    }
}
