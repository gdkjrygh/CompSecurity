// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.wifi;


public class WLWifiAccessPoint
{

    private final String mac;
    private final String ssid;

    public WLWifiAccessPoint(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("SSID is null");
        } else
        {
            ssid = s;
            mac = s1;
            return;
        }
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
        obj = (WLWifiAccessPoint)obj;
        if (mac == null)
        {
            if (((WLWifiAccessPoint) (obj)).mac != null)
            {
                return false;
            }
        } else
        if (!mac.equals(((WLWifiAccessPoint) (obj)).mac))
        {
            return false;
        }
        if (ssid != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((WLWifiAccessPoint) (obj)).ssid == null) goto _L1; else goto _L3
_L3:
        return false;
        if (ssid.equals(((WLWifiAccessPoint) (obj)).ssid)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getMAC()
    {
        return mac;
    }

    public String getSSID()
    {
        return ssid;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (mac == null)
        {
            i = 0;
        } else
        {
            i = mac.hashCode();
        }
        if (ssid != null)
        {
            j = ssid.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public String toString()
    {
        return String.format("AccessPoint: (SSID: %s, MAC: %s)", new Object[] {
            ssid, mac
        });
    }
}
