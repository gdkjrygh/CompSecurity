// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.wifi.triggers;

import com.worklight.location.api.WLTriggerCallback;
import com.worklight.location.api.wifi.WLWifiAccessPointFilter;
import com.worklight.location.internal.AbstractTrigger;
import com.worklight.location.internal.wifi.triggers.AbstractWifiFilterTrigger;
import org.json.JSONObject;

public class WLWifiDisconnectTrigger extends AbstractWifiFilterTrigger
{

    public WLWifiDisconnectTrigger()
    {
    }

    public WLWifiDisconnectTrigger clone()
    {
        return (new WLWifiDisconnectTrigger()).setCallback(getCallback()).setEvent(cloneEvent()).setTransmitImmediately(isTransmitImmediately()).setConnectedAccessPoint(getConnectedAccessPoint());
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

    public WLWifiDisconnectTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return (WLWifiDisconnectTrigger)super.setCallback(wltriggercallback);
    }

    public volatile AbstractTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return setCallback(wltriggercallback);
    }

    public WLWifiDisconnectTrigger setConnectedAccessPoint(WLWifiAccessPointFilter wlwifiaccesspointfilter)
    {
        return (WLWifiDisconnectTrigger)super.setConnectedAccessPoint(wlwifiaccesspointfilter);
    }

    public volatile AbstractWifiFilterTrigger setConnectedAccessPoint(WLWifiAccessPointFilter wlwifiaccesspointfilter)
    {
        return setConnectedAccessPoint(wlwifiaccesspointfilter);
    }

    public WLWifiDisconnectTrigger setEvent(JSONObject jsonobject)
    {
        return (WLWifiDisconnectTrigger)super.setEvent(jsonobject);
    }

    public volatile AbstractTrigger setEvent(JSONObject jsonobject)
    {
        return setEvent(jsonobject);
    }

    public WLWifiDisconnectTrigger setTransmitImmediately(boolean flag)
    {
        return (WLWifiDisconnectTrigger)super.setTransmitImmediately(flag);
    }

    public volatile AbstractTrigger setTransmitImmediately(boolean flag)
    {
        return setTransmitImmediately(flag);
    }
}
