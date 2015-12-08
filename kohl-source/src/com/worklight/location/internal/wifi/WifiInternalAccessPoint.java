// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi;

import com.worklight.location.api.wifi.WLWifiAccessPoint;

public class WifiInternalAccessPoint extends WLWifiAccessPoint
{

    private final boolean isConnected;
    private final int strength;

    public WifiInternalAccessPoint(String s, String s1, int i, boolean flag)
    {
        super(s, s1);
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("strength must be a non-negative integer, was ").append(i).toString());
        } else
        {
            strength = i;
            isConnected = flag;
            return;
        }
    }

    public WLWifiAccessPoint getPublicVersion()
    {
        return new WLWifiAccessPoint(getSSID(), getMAC());
    }

    public WLWifiAccessPoint getPublicVersionNoMAC()
    {
        return new WLWifiAccessPoint(getSSID(), null);
    }

    public int getStrength()
    {
        return strength;
    }

    public boolean isConnected()
    {
        return isConnected;
    }
}
