// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi.triggerEvaluators;

import com.worklight.location.api.wifi.WLWifiAccessPoint;
import com.worklight.location.api.wifi.WLWifiLocation;
import com.worklight.location.internal.AbstractPosition;
import com.worklight.location.internal.wifi.WifiInternalAccessPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class WifiInternalLocation extends AbstractPosition
{

    private final List accessPoints;
    private final WLWifiAccessPoint connectedAccessPoint;
    private final Integer connectedSignalStrength;

    public WifiInternalLocation(Collection collection, WLWifiAccessPoint wlwifiaccesspoint, Integer integer, long l)
    {
        super(l);
        accessPoints = new ArrayList(collection);
        connectedAccessPoint = wlwifiaccesspoint;
        connectedSignalStrength = integer;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!super.equals(obj))
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (WifiInternalLocation)obj;
        if (accessPoints == null)
        {
            if (((WifiInternalLocation) (obj)).accessPoints != null)
            {
                return false;
            }
        } else
        if (!accessPoints.equals(((WifiInternalLocation) (obj)).accessPoints))
        {
            return false;
        }
        if (connectedAccessPoint == null)
        {
            if (((WifiInternalLocation) (obj)).connectedAccessPoint != null)
            {
                return false;
            }
        } else
        if (!connectedAccessPoint.equals(((WifiInternalLocation) (obj)).connectedAccessPoint))
        {
            return false;
        }
        if (connectedSignalStrength != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((WifiInternalLocation) (obj)).connectedSignalStrength == null) goto _L1; else goto _L3
_L3:
        return false;
        if (connectedSignalStrength.equals(((WifiInternalLocation) (obj)).connectedSignalStrength)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public List getAccessPoints()
    {
        return accessPoints;
    }

    public WLWifiAccessPoint getConnectedAccessPoint()
    {
        return connectedAccessPoint;
    }

    public Integer getConnectedSignalStrength()
    {
        return connectedSignalStrength;
    }

    public WLWifiLocation getPublicVersion()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = accessPoints.iterator(); iterator.hasNext(); arraylist.add(((WifiInternalAccessPoint)iterator.next()).getPublicVersion())) { }
        return new WLWifiLocation(arraylist, connectedAccessPoint, connectedSignalStrength, super.getTimestamp().longValue());
    }

    public int hashCode()
    {
        int k = 0;
        int l = super.hashCode();
        int i;
        int j;
        if (accessPoints == null)
        {
            i = 0;
        } else
        {
            i = accessPoints.hashCode();
        }
        if (connectedAccessPoint == null)
        {
            j = 0;
        } else
        {
            j = connectedAccessPoint.hashCode();
        }
        if (connectedSignalStrength != null)
        {
            k = connectedSignalStrength.hashCode();
        }
        return ((l * 31 + i) * 31 + j) * 31 + k;
    }
}
