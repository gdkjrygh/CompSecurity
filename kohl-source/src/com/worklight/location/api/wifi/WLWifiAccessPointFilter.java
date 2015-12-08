// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.wifi;


// Referenced classes of package com.worklight.location.api.wifi:
//            WLWifiAccessPoint

public class WLWifiAccessPointFilter
{

    public static final String WILDCARD = "*";
    private final String mac;
    private final String ssid;

    public WLWifiAccessPointFilter(String s)
    {
        this(s, null);
    }

    public WLWifiAccessPointFilter(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("ssid is null");
        } else
        {
            ssid = s;
            mac = s1;
            return;
        }
    }

    private static boolean matchesInternal(String s, String s1)
    {
        return s == null || s.equals("*") || s.equals(s1);
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
        obj = (WLWifiAccessPointFilter)obj;
        if (mac == null)
        {
            if (((WLWifiAccessPointFilter) (obj)).mac != null)
            {
                return false;
            }
        } else
        if (!mac.equals(((WLWifiAccessPointFilter) (obj)).mac))
        {
            return false;
        }
        if (ssid != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((WLWifiAccessPointFilter) (obj)).ssid == null) goto _L1; else goto _L3
_L3:
        return false;
        if (ssid.equals(((WLWifiAccessPointFilter) (obj)).ssid)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getMac()
    {
        return mac;
    }

    public String getSsid()
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

    public boolean isIntersectionNotEmpty(WLWifiAccessPointFilter wlwifiaccesspointfilter)
    {
        return (matchesInternal(wlwifiaccesspointfilter.mac, mac) || matchesInternal(mac, wlwifiaccesspointfilter.mac)) && (matchesInternal(wlwifiaccesspointfilter.ssid, ssid) || matchesInternal(ssid, wlwifiaccesspointfilter.ssid));
    }

    public boolean matches(WLWifiAccessPoint wlwifiaccesspoint)
    {
        if (wlwifiaccesspoint == null)
        {
            throw new IllegalArgumentException("point is null");
        }
        return matchesInternal(mac, wlwifiaccesspoint.getMAC()) && matchesInternal(ssid, wlwifiaccesspoint.getSSID());
    }

    public String toString()
    {
        return String.format("Filter: (SSID: %s, MAC: %s)", new Object[] {
            ssid, mac
        });
    }
}
