// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi.triggers;

import com.worklight.location.api.wifi.WLWifiAccessPointFilter;
import com.worklight.location.api.wifi.WLWifiAcquisitionPolicy;
import com.worklight.location.api.wifi.triggers.WLWifiTrigger;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractWifiFilterTrigger extends WLWifiTrigger
{

    private WLWifiAccessPointFilter connectedAccessPoint;

    public AbstractWifiFilterTrigger()
    {
    }

    protected static boolean doesPolicyIntersectWithFilter(WLWifiAcquisitionPolicy wlwifiacquisitionpolicy, WLWifiAccessPointFilter wlwifiaccesspointfilter)
    {
        for (wlwifiacquisitionpolicy = wlwifiacquisitionpolicy.getAccessPointFilters().iterator(); wlwifiacquisitionpolicy.hasNext();)
        {
            if (((WLWifiAccessPointFilter)wlwifiacquisitionpolicy.next()).isIntersectionNotEmpty(wlwifiaccesspointfilter))
            {
                return true;
            }
        }

        return false;
    }

    public WLWifiAccessPointFilter getConnectedAccessPoint()
    {
        return connectedAccessPoint;
    }

    public AbstractWifiFilterTrigger setConnectedAccessPoint(WLWifiAccessPointFilter wlwifiaccesspointfilter)
    {
        connectedAccessPoint = wlwifiaccesspointfilter;
        return this;
    }

    public boolean validate(WLWifiAcquisitionPolicy wlwifiacquisitionpolicy)
    {
        for (wlwifiacquisitionpolicy = wlwifiacquisitionpolicy.getAccessPointFilters().iterator(); wlwifiacquisitionpolicy.hasNext();)
        {
            if (((WLWifiAccessPointFilter)wlwifiacquisitionpolicy.next()).isIntersectionNotEmpty(connectedAccessPoint))
            {
                return true;
            }
        }

        return false;
    }
}
