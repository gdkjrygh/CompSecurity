// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi.triggers;

import com.worklight.location.api.WLConfidenceLevel;
import com.worklight.location.api.wifi.WLWifiAccessPointFilter;
import com.worklight.location.api.wifi.WLWifiAcquisitionPolicy;
import com.worklight.location.api.wifi.triggers.WLWifiTrigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.worklight.location.internal.wifi.triggers:
//            AbstractWifiFilterTrigger

public abstract class AbstractWifiAreaTrigger extends WLWifiTrigger
{

    private List areaAccessPoints;
    private WLConfidenceLevel confidenceLevel;
    private boolean otherAccessPointsAllowed;

    public AbstractWifiAreaTrigger()
    {
        areaAccessPoints = new ArrayList();
        otherAccessPointsAllowed = false;
        confidenceLevel = WLConfidenceLevel.LOW;
    }

    public boolean areOtherAccessPointsAllowed()
    {
        return otherAccessPointsAllowed;
    }

    public List getAreaAccessPoints()
    {
        return areaAccessPoints;
    }

    public WLConfidenceLevel getConfidenceLevel()
    {
        return confidenceLevel;
    }

    public AbstractWifiAreaTrigger setAreaAccessPoints(List list)
    {
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
        }
        areaAccessPoints = ((List) (obj));
        return this;
    }

    public AbstractWifiAreaTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        confidenceLevel = wlconfidencelevel;
        return this;
    }

    public AbstractWifiAreaTrigger setOtherAccessPointsAllowed(boolean flag)
    {
        otherAccessPointsAllowed = flag;
        return this;
    }

    public boolean validate(WLWifiAcquisitionPolicy wlwifiacquisitionpolicy)
    {
        for (Iterator iterator = areaAccessPoints.iterator(); iterator.hasNext();)
        {
            if (!AbstractWifiFilterTrigger.doesPolicyIntersectWithFilter(wlwifiacquisitionpolicy, (WLWifiAccessPointFilter)iterator.next()))
            {
                return false;
            }
        }

        return true;
    }
}
