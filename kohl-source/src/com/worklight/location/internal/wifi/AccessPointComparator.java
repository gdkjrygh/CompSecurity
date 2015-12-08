// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi;

import com.worklight.location.api.wifi.WLWifiAccessPoint;
import java.util.Comparator;

public final class AccessPointComparator
    implements Comparator
{

    public AccessPointComparator()
    {
    }

    public int compare(WLWifiAccessPoint wlwifiaccesspoint, WLWifiAccessPoint wlwifiaccesspoint1)
    {
        int i = wlwifiaccesspoint.getSSID().compareTo(wlwifiaccesspoint1.getSSID());
        if (i != 0)
        {
            return i;
        }
        if (wlwifiaccesspoint.getMAC() != null)
        {
            if (wlwifiaccesspoint1.getMAC() == null)
            {
                return 1;
            } else
            {
                return wlwifiaccesspoint.getMAC().compareTo(wlwifiaccesspoint1.getMAC());
            }
        }
        return wlwifiaccesspoint1.getMAC() != null ? -1 : 0;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((WLWifiAccessPoint)obj, (WLWifiAccessPoint)obj1);
    }
}
