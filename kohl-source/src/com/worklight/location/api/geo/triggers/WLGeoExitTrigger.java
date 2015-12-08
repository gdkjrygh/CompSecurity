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

public class WLGeoExitTrigger extends AbstractGeoAreaTrigger
{

    public WLGeoExitTrigger()
    {
    }

    public WLGeoExitTrigger clone()
    {
        return (new WLGeoExitTrigger()).setArea(getArea()).setBufferZoneWidth(getBufferZoneWidth()).setCallback(getCallback()).setConfidenceLevel(getConfidenceLevel()).setEvent(cloneEvent()).setTransmitImmediately(isTransmitImmediately());
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

    public WLGeoExitTrigger setArea(WLArea wlarea)
    {
        return (WLGeoExitTrigger)super.setArea(wlarea);
    }

    public volatile AbstractGeoAreaTrigger setArea(WLArea wlarea)
    {
        return setArea(wlarea);
    }

    public WLGeoExitTrigger setBufferZoneWidth(double d)
    {
        return (WLGeoExitTrigger)super.setBufferZoneWidth(d);
    }

    public volatile AbstractGeoAreaTrigger setBufferZoneWidth(double d)
    {
        return setBufferZoneWidth(d);
    }

    public WLGeoExitTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return (WLGeoExitTrigger)super.setCallback(wltriggercallback);
    }

    public volatile AbstractTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return setCallback(wltriggercallback);
    }

    public WLGeoExitTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        return (WLGeoExitTrigger)super.setConfidenceLevel(wlconfidencelevel);
    }

    public volatile AbstractGeoAreaTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        return setConfidenceLevel(wlconfidencelevel);
    }

    public WLGeoExitTrigger setEvent(JSONObject jsonobject)
    {
        return (WLGeoExitTrigger)super.setEvent(jsonobject);
    }

    public volatile AbstractTrigger setEvent(JSONObject jsonobject)
    {
        return setEvent(jsonobject);
    }

    public WLGeoExitTrigger setTransmitImmediately(boolean flag)
    {
        return (WLGeoExitTrigger)super.setTransmitImmediately(flag);
    }

    public volatile AbstractTrigger setTransmitImmediately(boolean flag)
    {
        return setTransmitImmediately(flag);
    }
}
