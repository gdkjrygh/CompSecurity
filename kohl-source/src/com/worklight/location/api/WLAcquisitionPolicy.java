// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api;

import com.worklight.location.api.geo.WLGeoAcquisitionPolicy;
import com.worklight.location.api.wifi.WLWifiAcquisitionPolicy;

public class WLAcquisitionPolicy
    implements Cloneable
{

    private WLGeoAcquisitionPolicy geoPolicy;
    private WLWifiAcquisitionPolicy wifiPolicy;

    public WLAcquisitionPolicy()
    {
    }

    public WLAcquisitionPolicy clone()
    {
        Object obj1 = null;
        WLAcquisitionPolicy wlacquisitionpolicy = new WLAcquisitionPolicy();
        Object obj;
        if (wifiPolicy != null)
        {
            obj = wifiPolicy.clone();
        } else
        {
            obj = null;
        }
        wlacquisitionpolicy = wlacquisitionpolicy.setWifiPolicy(((WLWifiAcquisitionPolicy) (obj)));
        obj = obj1;
        if (geoPolicy != null)
        {
            obj = geoPolicy.clone();
        }
        return wlacquisitionpolicy.setGeoPolicy(((WLGeoAcquisitionPolicy) (obj)));
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (WLAcquisitionPolicy)obj;
        if (geoPolicy == null)
        {
            if (((WLAcquisitionPolicy) (obj)).geoPolicy != null)
            {
                return false;
            }
        } else
        if (!geoPolicy.equals(((WLAcquisitionPolicy) (obj)).geoPolicy))
        {
            return false;
        }
        if (wifiPolicy != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((WLAcquisitionPolicy) (obj)).wifiPolicy == null) goto _L1; else goto _L3
_L3:
        return false;
        if (wifiPolicy.equals(((WLAcquisitionPolicy) (obj)).wifiPolicy)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public WLGeoAcquisitionPolicy getGeoPolicy()
    {
        return geoPolicy;
    }

    public WLWifiAcquisitionPolicy getWifiPolicy()
    {
        return wifiPolicy;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (geoPolicy == null)
        {
            i = 0;
        } else
        {
            i = geoPolicy.hashCode();
        }
        if (wifiPolicy != null)
        {
            j = wifiPolicy.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public WLAcquisitionPolicy setGeoPolicy(WLGeoAcquisitionPolicy wlgeoacquisitionpolicy)
    {
        geoPolicy = wlgeoacquisitionpolicy;
        return this;
    }

    public WLAcquisitionPolicy setWifiPolicy(WLWifiAcquisitionPolicy wlwifiacquisitionpolicy)
    {
        wifiPolicy = wlwifiacquisitionpolicy;
        return this;
    }
}
