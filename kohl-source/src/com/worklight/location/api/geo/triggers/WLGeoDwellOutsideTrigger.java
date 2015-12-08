// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.geo.triggers;

import com.worklight.location.api.WLConfidenceLevel;
import com.worklight.location.api.WLTriggerCallback;
import com.worklight.location.api.geo.WLArea;
import com.worklight.location.internal.AbstractTrigger;
import com.worklight.location.internal.geo.triggers.AbstractGeoAreaTrigger;
import com.worklight.location.internal.geo.triggers.AbstractGeoDwellTrigger;
import org.json.JSONObject;

public class WLGeoDwellOutsideTrigger extends AbstractGeoDwellTrigger
{

    public WLGeoDwellOutsideTrigger()
    {
    }

    public WLGeoDwellOutsideTrigger clone()
    {
        return (new WLGeoDwellOutsideTrigger()).setArea(getArea()).setBufferZoneWidth(getBufferZoneWidth()).setCallback(getCallback()).setConfidenceLevel(getConfidenceLevel()).setEvent(cloneEvent()).setDwellingTime(getDwellingTime()).setTransmitImmediately(isTransmitImmediately());
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

    public WLGeoDwellOutsideTrigger setArea(WLArea wlarea)
    {
        return (WLGeoDwellOutsideTrigger)super.setArea(wlarea);
    }

    public volatile AbstractGeoAreaTrigger setArea(WLArea wlarea)
    {
        return setArea(wlarea);
    }

    public WLGeoDwellOutsideTrigger setBufferZoneWidth(double d)
    {
        return (WLGeoDwellOutsideTrigger)super.setBufferZoneWidth(d);
    }

    public volatile AbstractGeoAreaTrigger setBufferZoneWidth(double d)
    {
        return setBufferZoneWidth(d);
    }

    public WLGeoDwellOutsideTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return (WLGeoDwellOutsideTrigger)super.setCallback(wltriggercallback);
    }

    public volatile AbstractTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return setCallback(wltriggercallback);
    }

    public WLGeoDwellOutsideTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        return (WLGeoDwellOutsideTrigger)super.setConfidenceLevel(wlconfidencelevel);
    }

    public volatile AbstractGeoAreaTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        return setConfidenceLevel(wlconfidencelevel);
    }

    public WLGeoDwellOutsideTrigger setDwellingTime(long l)
    {
        return (WLGeoDwellOutsideTrigger)super.setDwellingTime(l);
    }

    public volatile AbstractGeoDwellTrigger setDwellingTime(long l)
    {
        return setDwellingTime(l);
    }

    public WLGeoDwellOutsideTrigger setEvent(JSONObject jsonobject)
    {
        return (WLGeoDwellOutsideTrigger)super.setEvent(jsonobject);
    }

    public volatile AbstractTrigger setEvent(JSONObject jsonobject)
    {
        return setEvent(jsonobject);
    }

    public WLGeoDwellOutsideTrigger setTransmitImmediately(boolean flag)
    {
        return (WLGeoDwellOutsideTrigger)super.setTransmitImmediately(flag);
    }

    public volatile AbstractTrigger setTransmitImmediately(boolean flag)
    {
        return setTransmitImmediately(flag);
    }
}
