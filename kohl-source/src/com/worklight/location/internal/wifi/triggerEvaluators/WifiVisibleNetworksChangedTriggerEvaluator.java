// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi.triggerEvaluators;

import com.worklight.location.api.wifi.triggers.WLWifiVisibleAccessPointsChangeTrigger;

// Referenced classes of package com.worklight.location.internal.wifi.triggerEvaluators:
//            WifiTriggerEvaluator, WifiInternalLocation

public class WifiVisibleNetworksChangedTriggerEvaluator extends WifiTriggerEvaluator
{

    WifiInternalLocation previousPosition;

    public WifiVisibleNetworksChangedTriggerEvaluator(WLWifiVisibleAccessPointsChangeTrigger wlwifivisibleaccesspointschangetrigger)
    {
        super(wlwifivisibleaccesspointschangetrigger);
        previousPosition = null;
    }

    public boolean evaluate(WifiInternalLocation wifiinternallocation)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = true;
        WifiInternalLocation wifiinternallocation1 = previousPosition;
        if (wifiinternallocation1 == null)
        {
            if (wifiinternallocation != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            previousPosition = wifiinternallocation;
            return flag;
        }
        flag1 = previousPosition.equals(wifiinternallocation);
        if (flag1)
        {
            flag = false;
        }
        previousPosition = wifiinternallocation;
        return flag;
        Exception exception;
        exception;
        previousPosition = wifiinternallocation;
        throw exception;
    }
}
