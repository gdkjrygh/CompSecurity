// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.geo.triggers;

import com.worklight.location.api.WLConfidenceLevel;
import com.worklight.location.api.WLTriggerCallback;
import com.worklight.location.api.geo.WLArea;
import com.worklight.location.internal.AbstractTrigger;
import com.worklight.location.internal.geo.triggers.AbstractGeoAreaTrigger;
import org.json.JSONObject;

public class WLGeoEnterTrigger extends AbstractGeoAreaTrigger
{

    public WLGeoEnterTrigger()
    {
    }

    public WLGeoEnterTrigger clone()
    {
        return (new WLGeoEnterTrigger()).setArea(getArea()).setBufferZoneWidth(getBufferZoneWidth()).setCallback(getCallback()).setConfidenceLevel(getConfidenceLevel()).setEvent(cloneEvent()).setTransmitImmediately(isTransmitImmediately());
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

    public WLGeoEnterTrigger setArea(WLArea wlarea)
    {
        return (WLGeoEnterTrigger)super.setArea(wlarea);
    }

    public volatile AbstractGeoAreaTrigger setArea(WLArea wlarea)
    {
        return setArea(wlarea);
    }

    public WLGeoEnterTrigger setBufferZoneWidth(double d)
    {
        return (WLGeoEnterTrigger)super.setBufferZoneWidth(d);
    }

    public volatile AbstractGeoAreaTrigger setBufferZoneWidth(double d)
    {
        return setBufferZoneWidth(d);
    }

    public WLGeoEnterTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return (WLGeoEnterTrigger)super.setCallback(wltriggercallback);
    }

    public volatile AbstractTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return setCallback(wltriggercallback);
    }

    public WLGeoEnterTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        return (WLGeoEnterTrigger)super.setConfidenceLevel(wlconfidencelevel);
    }

    public volatile AbstractGeoAreaTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        return setConfidenceLevel(wlconfidencelevel);
    }

    public WLGeoEnterTrigger setEvent(JSONObject jsonobject)
    {
        return (WLGeoEnterTrigger)super.setEvent(jsonobject);
    }

    public volatile AbstractTrigger setEvent(JSONObject jsonobject)
    {
        return setEvent(jsonobject);
    }

    public WLGeoEnterTrigger setTransmitImmediately(boolean flag)
    {
        return (WLGeoEnterTrigger)super.setTransmitImmediately(flag);
    }

    public volatile AbstractTrigger setTransmitImmediately(boolean flag)
    {
        return setTransmitImmediately(flag);
    }
}
