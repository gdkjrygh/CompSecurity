// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi.triggerEvaluators;

import com.worklight.location.api.WLConfidenceLevel;
import com.worklight.location.api.wifi.WLWifiAccessPointFilter;
import com.worklight.location.api.wifi.triggers.WLWifiTrigger;
import com.worklight.location.internal.AbstractTrigger;
import com.worklight.location.internal.wifi.WifiInternalAccessPoint;
import com.worklight.location.internal.wifi.triggers.AbstractWifiAreaTrigger;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.worklight.location.internal.wifi.triggerEvaluators:
//            WifiTriggerEvaluator, WifiInternalLocation

abstract class WifiAreaTriggerEvaluator extends WifiTriggerEvaluator
{

    private static final int HIGH_CONFIDENCE = 80;
    private static final int MEDIUM_CONFIDENCE = 50;
    private final boolean considerStrength;
    private boolean isInside;

    public WifiAreaTriggerEvaluator(AbstractWifiAreaTrigger abstractwifiareatrigger, boolean flag)
    {
        super(abstractwifiareatrigger);
        considerStrength = flag;
    }

    private static boolean matchesArea(WifiInternalAccessPoint wifiinternalaccesspoint, List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (((WLWifiAccessPointFilter)list.next()).matches(wifiinternalaccesspoint))
            {
                return true;
            }
        }

        return false;
    }

    private static boolean matchesPosition(WLWifiAccessPointFilter wlwifiaccesspointfilter, WifiInternalLocation wifiinternallocation, WLConfidenceLevel wlconfidencelevel, boolean flag, boolean flag1)
    {
        for (wifiinternallocation = wifiinternallocation.getAccessPoints().iterator(); wifiinternallocation.hasNext();)
        {
            WifiInternalAccessPoint wifiinternalaccesspoint = (WifiInternalAccessPoint)wifiinternallocation.next();
            if ((!flag || flag1 || (wlconfidencelevel != WLConfidenceLevel.MEDIUM || wifiinternalaccesspoint.getStrength() >= 50) && (wlconfidencelevel != WLConfidenceLevel.HIGH || wifiinternalaccesspoint.getStrength() >= 80)) && wlwifiaccesspointfilter.matches(wifiinternalaccesspoint))
            {
                return true;
            }
        }

        return false;
    }

    public volatile WLWifiTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }

    public volatile AbstractTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }

    public AbstractWifiAreaTrigger getTriggerDefinition()
    {
        return (AbstractWifiAreaTrigger)super.getTriggerDefinition();
    }

    protected boolean isInside()
    {
        return isInside;
    }

    protected void updatePosition(WifiInternalLocation wifiinternallocation)
    {
label0:
        {
            if (wifiinternallocation == null)
            {
                throw new IllegalArgumentException("position is null");
            }
            if (getTriggerDefinition().areOtherAccessPointsAllowed())
            {
                break label0;
            }
            Iterator iterator = wifiinternallocation.getAccessPoints().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (matchesArea((WifiInternalAccessPoint)iterator.next(), getTriggerDefinition().getAreaAccessPoints()));
            isInside = false;
            return;
        }
        for (Iterator iterator1 = getTriggerDefinition().getAreaAccessPoints().iterator(); iterator1.hasNext();)
        {
            if (!matchesPosition((WLWifiAccessPointFilter)iterator1.next(), wifiinternallocation, getTriggerDefinition().getConfidenceLevel(), considerStrength, isInside))
            {
                isInside = false;
                return;
            }
        }

        isInside = true;
    }
}
