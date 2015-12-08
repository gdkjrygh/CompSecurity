// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.wifi;

import com.worklight.location.internal.AbstractPosition;
import com.worklight.location.internal.wifi.AccessPointComparator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.worklight.location.api.wifi:
//            WLWifiAccessPoint

public class WLWifiLocation extends AbstractPosition
{

    private final List accessPoints;
    private final WLWifiAccessPoint connectedAccessPoint;
    private final Integer connectedSignalStrength;

    protected WLWifiLocation()
    {
        accessPoints = null;
        connectedAccessPoint = null;
        connectedSignalStrength = null;
    }

    public WLWifiLocation(Collection collection, WLWifiAccessPoint wlwifiaccesspoint, Integer integer, long l)
    {
        super(l);
        if (collection == null)
        {
            throw new IllegalArgumentException("accessPoints is null");
        } else
        {
            accessPoints = new ArrayList(collection);
            connectedAccessPoint = wlwifiaccesspoint;
            connectedSignalStrength = integer;
            Collections.sort(accessPoints, new AccessPointComparator());
            return;
        }
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
        obj = (WLWifiLocation)obj;
        List list = getAccessPoints();
        List list1 = ((WLWifiLocation) (obj)).getAccessPoints();
        if (list == null)
        {
            if (list1 != null)
            {
                return false;
            }
        } else
        if (!list.equals(list1))
        {
            return false;
        }
        if (connectedAccessPoint != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((WLWifiLocation) (obj)).connectedAccessPoint == null) goto _L1; else goto _L3
_L3:
        return false;
        if (connectedAccessPoint.equals(((WLWifiLocation) (obj)).connectedAccessPoint)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public List getAccessPoints()
    {
        return new ArrayList(accessPoints);
    }

    public WLWifiAccessPoint getConnectedAccessPoint()
    {
        return connectedAccessPoint;
    }

    public Integer getConnectedSignalStrength()
    {
        return connectedSignalStrength;
    }

    public int hashCode()
    {
        int j = 0;
        int k = super.hashCode();
        int i;
        if (accessPoints == null)
        {
            i = 0;
        } else
        {
            i = accessPoints.hashCode();
        }
        if (connectedAccessPoint != null)
        {
            j = connectedAccessPoint.hashCode();
        }
        return (k * 31 + i) * 31 + j;
    }

    public String toString()
    {
        return (new StringBuilder()).append("WLWifiLocation: ").append(accessPoints.toString()).toString();
    }
}
