// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.wifi;

import java.util.ArrayList;
import java.util.List;

public class WLWifiAcquisitionPolicy
    implements Cloneable
{

    private List accessPointFilters;
    private int interval;
    private int signalStrengthThreshold;

    public WLWifiAcquisitionPolicy()
    {
        signalStrengthThreshold = 15;
        interval = 10000;
        accessPointFilters = new ArrayList();
    }

    public WLWifiAcquisitionPolicy clone()
    {
        return (new WLWifiAcquisitionPolicy()).setSignalStrengthThreshold(getSignalStrengthThreshold()).setInterval(getInterval()).setAccessPointFilters(new ArrayList(getAccessPointFilters()));
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (WLWifiAcquisitionPolicy)obj;
            if (accessPointFilters == null)
            {
                if (((WLWifiAcquisitionPolicy) (obj)).accessPointFilters != null)
                {
                    return false;
                }
            } else
            if (!accessPointFilters.equals(((WLWifiAcquisitionPolicy) (obj)).accessPointFilters))
            {
                return false;
            }
            if (interval != ((WLWifiAcquisitionPolicy) (obj)).interval)
            {
                return false;
            }
            if (signalStrengthThreshold != ((WLWifiAcquisitionPolicy) (obj)).signalStrengthThreshold)
            {
                return false;
            }
        }
        return true;
    }

    public List getAccessPointFilters()
    {
        return accessPointFilters;
    }

    public int getInterval()
    {
        return interval;
    }

    public int getSignalStrengthThreshold()
    {
        return signalStrengthThreshold;
    }

    public int hashCode()
    {
        int i;
        if (accessPointFilters == null)
        {
            i = 0;
        } else
        {
            i = accessPointFilters.hashCode();
        }
        return ((i + 31) * 31 + interval) * 31 + signalStrengthThreshold;
    }

    public WLWifiAcquisitionPolicy setAccessPointFilters(List list)
    {
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
        }
        accessPointFilters = ((List) (obj));
        return this;
    }

    public WLWifiAcquisitionPolicy setInterval(int i)
    {
        interval = i;
        return this;
    }

    public WLWifiAcquisitionPolicy setSignalStrengthThreshold(int i)
    {
        signalStrengthThreshold = i;
        return this;
    }
}
