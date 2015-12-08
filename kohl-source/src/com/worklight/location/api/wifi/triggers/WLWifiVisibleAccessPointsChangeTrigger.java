// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.wifi.triggers;

import com.worklight.location.api.WLTriggerCallback;
import com.worklight.location.api.wifi.WLWifiAcquisitionPolicy;
import com.worklight.location.internal.AbstractTrigger;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.worklight.location.api.wifi.triggers:
//            WLWifiTrigger

public class WLWifiVisibleAccessPointsChangeTrigger extends WLWifiTrigger
{

    public WLWifiVisibleAccessPointsChangeTrigger()
    {
    }

    public WLWifiVisibleAccessPointsChangeTrigger clone()
    {
        return (new WLWifiVisibleAccessPointsChangeTrigger()).setCallback(getCallback()).setEvent(cloneEvent()).setTransmitImmediately(isTransmitImmediately());
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

    public WLWifiVisibleAccessPointsChangeTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return (WLWifiVisibleAccessPointsChangeTrigger)super.setCallback(wltriggercallback);
    }

    public volatile AbstractTrigger setCallback(WLTriggerCallback wltriggercallback)
    {
        return setCallback(wltriggercallback);
    }

    public WLWifiVisibleAccessPointsChangeTrigger setEvent(JSONObject jsonobject)
    {
        return (WLWifiVisibleAccessPointsChangeTrigger)super.setEvent(jsonobject);
    }

    public volatile AbstractTrigger setEvent(JSONObject jsonobject)
    {
        return setEvent(jsonobject);
    }

    public WLWifiVisibleAccessPointsChangeTrigger setTransmitImmediately(boolean flag)
    {
        return (WLWifiVisibleAccessPointsChangeTrigger)super.setTransmitImmediately(flag);
    }

    public volatile AbstractTrigger setTransmitImmediately(boolean flag)
    {
        return setTransmitImmediately(flag);
    }

    public boolean validate(WLWifiAcquisitionPolicy wlwifiacquisitionpolicy)
    {
        return !wlwifiacquisitionpolicy.getAccessPointFilters().isEmpty();
    }
}
