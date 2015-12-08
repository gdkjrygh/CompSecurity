// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi.triggerEvaluators;

import com.worklight.location.api.wifi.triggers.WLWifiDisconnectTrigger;

// Referenced classes of package com.worklight.location.internal.wifi.triggerEvaluators:
//            WifiFilterTriggerEvaluator, WifiInternalLocation

public class WifiDisconnectTriggerEvaluator extends WifiFilterTriggerEvaluator
{

    private boolean isConnected;

    public WifiDisconnectTriggerEvaluator(WLWifiDisconnectTrigger wlwifidisconnecttrigger)
    {
        super(wlwifidisconnecttrigger);
        isConnected = false;
    }

    public boolean evaluate(WifiInternalLocation wifiinternallocation)
    {
        boolean flag = isConnected;
        isConnected = super.isConnected(wifiinternallocation);
        return flag && !isConnected;
    }
}
