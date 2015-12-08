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

public class WLGeoDwellInsideTrigger extends AbstractGeoDwellTrigger
{

    public WLGeoDwellInsideTrigger()
    {
    }

    public WLGeoDwellInsideTrigger clone()
    {
        return (new WLGeoDwellInsideTrigger()).setArea(getArea()).setBufferZoneWidth(getBufferZoneWidth()).setCallback(getCallback()).setConfidenceLevel(getConfidenceLevel()).setEvent(cloneEvent()).setDwellingTime(getDwellingTime()).setTransmitImmediately(isTransmitImmediately());
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

    public WLGeoDwellInsideTrigger setArea(WLArea wlarea)
    {
        return (WLGeoDwellInsideTrigger)super.setArea(wlarea);
    }

    public volatile AbstractGeoAreaTrigger setArea(WLArea wlarea)
    {
        return setArea(wlarea);
    }

    public WLGeoDwellInsideTrigger setBufferZoneWidth(double d)
    {
        return (WLGeoDwellInsideTrigger)super.setBufferZoneWidth(d);
    }

    public volatile AbstractGeoAreaTrigger setBufferZoneWidth(double d)
    {
        return setBufferZoneWidth(d);
    }

    public WLGeoDwellInsideTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return (WLGeoDwellInsideTrigger)super.setCallback(wltriggercallback);
    }

    public volatile AbstractTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return setCallback(wltriggercallback);
    }

    public WLGeoDwellInsideTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        return (WLGeoDwellInsideTrigger)super.setConfidenceLevel(wlconfidencelevel);
    }

    public volatile AbstractGeoAreaTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        return setConfidenceLevel(wlconfidencelevel);
    }

    public WLGeoDwellInsideTrigger setDwellingTime(long l)
    {
        return (WLGeoDwellInsideTrigger)super.setDwellingTime(l);
    }

    public volatile AbstractGeoDwellTrigger setDwellingTime(long l)
    {
        return setDwellingTime(l);
    }

    public WLGeoDwellInsideTrigger setEvent(JSONObject jsonobject)
    {
        return (WLGeoDwellInsideTrigger)super.setEvent(jsonobject);
    }

    public volatile AbstractTrigger setEvent(JSONObject jsonobject)
    {
        return setEvent(jsonobject);
    }

    public WLGeoDwellInsideTrigger setTransmitImmediately(boolean flag)
    {
        return (WLGeoDwellInsideTrigger)super.setTransmitImmediately(flag);
    }

    public volatile AbstractTrigger setTransmitImmediately(boolean flag)
    {
        return setTransmitImmediately(flag);
    }
}
