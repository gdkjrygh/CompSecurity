// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi.triggerEvaluators;

import com.worklight.location.api.wifi.WLWifiAccessPointFilter;
import com.worklight.location.api.wifi.triggers.WLWifiTrigger;
import com.worklight.location.internal.AbstractTrigger;
import com.worklight.location.internal.wifi.triggers.AbstractWifiFilterTrigger;

// Referenced classes of package com.worklight.location.internal.wifi.triggerEvaluators:
//            WifiTriggerEvaluator, WifiInternalLocation

public abstract class WifiFilterTriggerEvaluator extends WifiTriggerEvaluator
{

    public WifiFilterTriggerEvaluator(WLWifiTrigger wlwifitrigger)
    {
        super(wlwifitrigger);
    }

    public volatile WLWifiTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }

    public volatile AbstractTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }

    public AbstractWifiFilterTrigger getTriggerDefinition()
    {
        return (AbstractWifiFilterTrigger)super.getTriggerDefinition();
    }

    protected boolean isConnected(WifiInternalLocation wifiinternallocation)
    {
        return wifiinternallocation.getConnectedAccessPoint() != null && getTriggerDefinition().getConnectedAccessPoint().matches(wifiinternallocation.getConnectedAccessPoint());
    }
}
