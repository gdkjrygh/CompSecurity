// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.geo.triggers;

import com.worklight.location.api.WLTriggerCallback;
import com.worklight.location.internal.AbstractTrigger;
import org.json.JSONObject;

// Referenced classes of package com.worklight.location.api.geo.triggers:
//            WLGeoTrigger

public class WLGeoPositionChangeTrigger extends WLGeoTrigger
{

    private double minChangeDistance;

    public WLGeoPositionChangeTrigger()
    {
        minChangeDistance = 0.0D;
    }

    public WLGeoPositionChangeTrigger clone()
    {
        return (new WLGeoPositionChangeTrigger()).setCallback(getCallback()).setEvent(cloneEvent()).setTransmitImmediately(isTransmitImmediately()).setMinChangeDistance(getMinChangeDistance());
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

    public double getMinChangeDistance()
    {
        return minChangeDistance;
    }

    public WLGeoPositionChangeTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return (WLGeoPositionChangeTrigger)super.setCallback(wltriggercallback);
    }

    public volatile AbstractTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return setCallback(wltriggercallback);
    }

    public WLGeoPositionChangeTrigger setEvent(JSONObject jsonobject)
    {
        return (WLGeoPositionChangeTrigger)super.setEvent(jsonobject);
    }

    public volatile AbstractTrigger setEvent(JSONObject jsonobject)
    {
        return setEvent(jsonobject);
    }

    public WLGeoPositionChangeTrigger setMinChangeDistance(double d)
    {
        minChangeDistance = d;
        return this;
    }

    public WLGeoPositionChangeTrigger setTransmitImmediately(boolean flag)
    {
        return (WLGeoPositionChangeTrigger)super.setTransmitImmediately(flag);
    }

    public volatile AbstractTrigger setTransmitImmediately(boolean flag)
    {
        return setTransmitImmediately(flag);
    }
}
