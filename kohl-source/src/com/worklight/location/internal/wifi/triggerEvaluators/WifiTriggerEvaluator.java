// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi.triggerEvaluators;

import com.worklight.location.api.wifi.triggers.WLWifiTrigger;
import com.worklight.location.internal.AbstractTrigger;
import com.worklight.location.internal.AbstractTriggerEvaluator;

// Referenced classes of package com.worklight.location.internal.wifi.triggerEvaluators:
//            WifiInternalLocation

public abstract class WifiTriggerEvaluator extends AbstractTriggerEvaluator
{

    public WifiTriggerEvaluator(WLWifiTrigger wlwifitrigger)
    {
        super(wlwifitrigger);
    }

    public abstract boolean evaluate(WifiInternalLocation wifiinternallocation);

    public WLWifiTrigger getTriggerDefinition()
    {
        return (WLWifiTrigger)super.getTriggerDefinition();
    }

    public volatile AbstractTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }
}
