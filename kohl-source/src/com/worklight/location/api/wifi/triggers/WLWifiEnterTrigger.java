// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.wifi.triggers;

import com.worklight.location.api.WLConfidenceLevel;
import com.worklight.location.api.WLTriggerCallback;
import com.worklight.location.internal.AbstractTrigger;
import com.worklight.location.internal.wifi.triggers.AbstractWifiAreaTrigger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class WLWifiEnterTrigger extends AbstractWifiAreaTrigger
{

    public WLWifiEnterTrigger()
    {
    }

    public WLWifiEnterTrigger clone()
    {
        return (new WLWifiEnterTrigger()).setCallback(getCallback()).setEvent(cloneEvent()).setTransmitImmediately(isTransmitImmediately()).setAreaAccessPoints(new ArrayList(getAreaAccessPoints())).setConfidenceLevel(getConfidenceLevel()).setOtherAccessPointsAllowed(areOtherAccessPointsAllowed());
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

    public WLWifiEnterTrigger setAreaAccessPoints(List list)
    {
        return (WLWifiEnterTrigger)super.setAreaAccessPoints(list);
    }

    public volatile AbstractWifiAreaTrigger setAreaAccessPoints(List list)
    {
        return setAreaAccessPoints(list);
    }

    public WLWifiEnterTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return (WLWifiEnterTrigger)super.setCallback(wltriggercallback);
    }

    public volatile AbstractTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return setCallback(wltriggercallback);
    }

    public WLWifiEnterTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        return (WLWifiEnterTrigger)super.setConfidenceLevel(wlconfidencelevel);
    }

    public volatile AbstractWifiAreaTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        return setConfidenceLevel(wlconfidencelevel);
    }

    public WLWifiEnterTrigger setEvent(JSONObject jsonobject)
    {
        return (WLWifiEnterTrigger)super.setEvent(jsonobject);
    }

    public volatile AbstractTrigger setEvent(JSONObject jsonobject)
    {
        return setEvent(jsonobject);
    }

    public WLWifiEnterTrigger setOtherAccessPointsAllowed(boolean flag)
    {
        return (WLWifiEnterTrigger)super.setOtherAccessPointsAllowed(flag);
    }

    public volatile AbstractWifiAreaTrigger setOtherAccessPointsAllowed(boolean flag)
    {
        return setOtherAccessPointsAllowed(flag);
    }

    public WLWifiEnterTrigger setTransmitImmediately(boolean flag)
    {
        return (WLWifiEnterTrigger)super.setTransmitImmediately(flag);
    }

    public volatile AbstractTrigger setTransmitImmediately(boolean flag)
    {
        return setTransmitImmediately(flag);
    }
}
