// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi;

import com.worklight.location.api.wifi.WLWifiAccessPointFilter;
import com.worklight.location.api.wifi.WLWifiAcquisitionPolicy;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.worklight.location.internal.wifi:
//            WifiInternalAccessPoint

public class WifiPolicyFilterer
{

    private final WLWifiAcquisitionPolicy policy;

    public WifiPolicyFilterer(WLWifiAcquisitionPolicy wlwifiacquisitionpolicy)
    {
        policy = wlwifiacquisitionpolicy;
    }

    private boolean findMatch(WifiInternalAccessPoint wifiinternalaccesspoint, boolean flag)
    {
        if (policy != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator = policy.getAccessPointFilters().iterator();
        WLWifiAccessPointFilter wlwifiaccesspointfilter;
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            wlwifiaccesspointfilter = (WLWifiAccessPointFilter)iterator.next();
        } while (flag && wlwifiaccesspointfilter.getMac() == null || !wlwifiaccesspointfilter.matches(wifiinternalaccesspoint) || !wifiinternalaccesspoint.isConnected() && wifiinternalaccesspoint.getStrength() < policy.getSignalStrengthThreshold());
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public WLWifiAcquisitionPolicy getPolicy()
    {
        return policy;
    }

    public boolean matches(WifiInternalAccessPoint wifiinternalaccesspoint)
    {
        return findMatch(wifiinternalaccesspoint, false);
    }

    public boolean matchesWithSpecifiedMac(WifiInternalAccessPoint wifiinternalaccesspoint)
    {
        return findMatch(wifiinternalaccesspoint, true);
    }
}
