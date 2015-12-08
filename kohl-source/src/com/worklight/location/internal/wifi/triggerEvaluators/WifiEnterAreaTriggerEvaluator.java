// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi.triggerEvaluators;

import com.worklight.location.api.wifi.triggers.WLWifiEnterTrigger;
import com.worklight.location.internal.wifi.triggers.AbstractWifiAreaTrigger;

// Referenced classes of package com.worklight.location.internal.wifi.triggerEvaluators:
//            AbstractWifiAreaTriggerEvaluator, WifiInternalLocation

public class WifiEnterAreaTriggerEvaluator extends AbstractWifiAreaTriggerEvaluator
{

    public WifiEnterAreaTriggerEvaluator(WLWifiEnterTrigger wlwifientertrigger)
    {
        super(wlwifientertrigger, true, true);
    }

    public volatile boolean evaluate(WifiInternalLocation wifiinternallocation)
    {
        return super.evaluate(wifiinternallocation);
    }

    public volatile AbstractWifiAreaTrigger getTriggerDefinition()
    {
        return super.getTriggerDefinition();
    }
}
