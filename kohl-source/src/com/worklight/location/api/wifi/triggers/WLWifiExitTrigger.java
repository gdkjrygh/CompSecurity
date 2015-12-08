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

public class WLWifiExitTrigger extends AbstractWifiAreaTrigger
{

    public WLWifiExitTrigger()
    {
    }

    public WLWifiExitTrigger clone()
    {
        return (new WLWifiExitTrigger()).setCallback(getCallback()).setEvent(cloneEvent()).setTransmitImmediately(isTransmitImmediately()).setAreaAccessPoints(new ArrayList(getAreaAccessPoints())).setConfidenceLevel(getConfidenceLevel()).setOtherAccessPointsAllowed(areOtherAccessPointsAllowed());
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

    public WLWifiExitTrigger setAreaAccessPoints(List list)
    {
        return (WLWifiExitTrigger)super.setAreaAccessPoints(list);
    }

    public volatile AbstractWifiAreaTrigger setAreaAccessPoints(List list)
    {
        return setAreaAccessPoints(list);
    }

    public WLWifiExitTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return (WLWifiExitTrigger)super.setCallback(wltriggercallback);
    }

    public volatile AbstractTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return setCallback(wltriggercallback);
    }

    public WLWifiExitTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        return (WLWifiExitTrigger)super.setConfidenceLevel(wlconfidencelevel);
    }

    public volatile AbstractWifiAreaTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        return setConfidenceLevel(wlconfidencelevel);
    }

    public WLWifiExitTrigger setEvent(JSONObject jsonobject)
    {
        return (WLWifiExitTrigger)super.setEvent(jsonobject);
    }

    public volatile AbstractTrigger setEvent(JSONObject jsonobject)
    {
        return setEvent(jsonobject);
    }

    public WLWifiExitTrigger setOtherAccessPointsAllowed(boolean flag)
    {
        return (WLWifiExitTrigger)super.setOtherAccessPointsAllowed(flag);
    }

    public volatile AbstractWifiAreaTrigger setOtherAccessPointsAllowed(boolean flag)
    {
        return setOtherAccessPointsAllowed(flag);
    }

    public WLWifiExitTrigger setTransmitImmediately(boolean flag)
    {
        return (WLWifiExitTrigger)super.setTransmitImmediately(flag);
    }

    public volatile AbstractTrigger setTransmitImmediately(boolean flag)
    {
        return setTransmitImmediately(flag);
    }
}
