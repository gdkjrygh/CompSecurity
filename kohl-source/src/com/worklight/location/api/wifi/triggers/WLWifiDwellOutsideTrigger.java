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

public class WLWifiDwellOutsideTrigger extends AbstractWifiDwellTrigger
{

    public WLWifiDwellOutsideTrigger()
    {
    }

    public WLWifiDwellOutsideTrigger clone()
    {
        return (new WLWifiDwellOutsideTrigger()).setCallback(getCallback()).setEvent(cloneEvent()).setTransmitImmediately(isTransmitImmediately()).setAreaAccessPoints(new ArrayList(getAreaAccessPoints())).setOtherAccessPointsAllowed(areOtherAccessPointsAllowed()).setDwellingTime(getDwellingTime());
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

    public WLWifiDwellOutsideTrigger setAreaAccessPoints(List list)
    {
        return (WLWifiDwellOutsideTrigger)super.setAreaAccessPoints(list);
    }

    public volatile AbstractWifiAreaTrigger setAreaAccessPoints(List list)
    {
        return setAreaAccessPoints(list);
    }

    public WLWifiDwellOutsideTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return (WLWifiDwellOutsideTrigger)super.setCallback(wltriggercallback);
    }

    public volatile AbstractTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return setCallback(wltriggercallback);
    }

    public AbstractWifiAreaTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        throw new UnsupportedOperationException();
    }

    public WLWifiDwellOutsideTrigger setDwellingTime(long l)
    {
        return (WLWifiDwellOutsideTrigger)super.setDwellingTime(l);
    }

    public volatile AbstractWifiDwellTrigger setDwellingTime(long l)
    {
        return setDwellingTime(l);
    }

    public WLWifiDwellOutsideTrigger setEvent(JSONObject jsonobject)
    {
        return (WLWifiDwellOutsideTrigger)super.setEvent(jsonobject);
    }

    public volatile AbstractTrigger setEvent(JSONObject jsonobject)
    {
        return setEvent(jsonobject);
    }

    public WLWifiDwellOutsideTrigger setOtherAccessPointsAllowed(boolean flag)
    {
        return (WLWifiDwellOutsideTrigger)super.setOtherAccessPointsAllowed(flag);
    }

    public volatile AbstractWifiAreaTrigger setOtherAccessPointsAllowed(boolean flag)
    {
        return setOtherAccessPointsAllowed(flag);
    }

    public WLWifiDwellOutsideTrigger setTransmitImmediately(boolean flag)
    {
        return (WLWifiDwellOutsideTrigger)super.setTransmitImmediately(flag);
    }

    public volatile AbstractTrigger setTransmitImmediately(boolean flag)
    {
        return setTransmitImmediately(flag);
    }
}
