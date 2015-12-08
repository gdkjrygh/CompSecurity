// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.wifi.triggers;

import com.worklight.location.api.WLConfidenceLevel;
import com.worklight.location.api.WLTriggerCallback;
import com.worklight.location.internal.AbstractTrigger;
import com.worklight.location.internal.wifi.triggers.AbstractWifiAreaTrigger;
import com.worklight.location.internal.wifi.triggers.AbstractWifiDwellTrigger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class WLWifiDwellInsideTrigger extends AbstractWifiDwellTrigger
{

    public WLWifiDwellInsideTrigger()
    {
    }

    public WLWifiDwellInsideTrigger clone()
    {
        return (new WLWifiDwellInsideTrigger()).setCallback(getCallback()).setEvent(cloneEvent()).setTransmitImmediately(isTransmitImmediately()).setAreaAccessPoints(new ArrayList(getAreaAccessPoints())).setOtherAccessPointsAllowed(areOtherAccessPointsAllowed()).setConfidenceLevel(getConfidenceLevel()).setDwellingTime(getDwellingTime());
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

    public WLWifiDwellInsideTrigger setAreaAccessPoints(List list)
    {
        return (WLWifiDwellInsideTrigger)super.setAreaAccessPoints(list);
    }

    public volatile AbstractWifiAreaTrigger setAreaAccessPoints(List list)
    {
        return setAreaAccessPoints(list);
    }

    public WLWifiDwellInsideTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return (WLWifiDwellInsideTrigger)super.setCallback(wltriggercallback);
    }

    public volatile AbstractTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return setCallback(wltriggercallback);
    }

    public WLWifiDwellInsideTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        return (WLWifiDwellInsideTrigger)super.setConfidenceLevel(wlconfidencelevel);
    }

    public volatile AbstractWifiAreaTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        return setConfidenceLevel(wlconfidencelevel);
    }

    public WLWifiDwellInsideTrigger setDwellingTime(long l)
    {
        return (WLWifiDwellInsideTrigger)super.setDwellingTime(l);
    }

    public volatile AbstractWifiDwellTrigger setDwellingTime(long l)
    {
        return setDwellingTime(l);
    }

    public WLWifiDwellInsideTrigger setEvent(JSONObject jsonobject)
    {
        return (WLWifiDwellInsideTrigger)super.setEvent(jsonobject);
    }

    public volatile AbstractTrigger setEvent(JSONObject jsonobject)
    {
        return setEvent(jsonobject);
    }

    public WLWifiDwellInsideTrigger setOtherAccessPointsAllowed(boolean flag)
    {
        return (WLWifiDwellInsideTrigger)super.setOtherAccessPointsAllowed(flag);
    }

    public volatile AbstractWifiAreaTrigger setOtherAccessPointsAllowed(boolean flag)
    {
        return setOtherAccessPointsAllowed(flag);
    }

    public WLWifiDwellInsideTrigger setTransmitImmediately(boolean flag)
    {
        return (WLWifiDwellInsideTrigger)super.setTransmitImmediately(flag);
    }

    public volatile AbstractTrigger setTransmitImmediately(boolean flag)
    {
        return setTransmitImmediately(flag);
    }
}
