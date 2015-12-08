// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.rt;


public class WiFiNetworkStatus
{

    public String bssid;
    public boolean connected;
    public String hwAddress;
    public String ssid;

    WiFiNetworkStatus(boolean flag, String s, String s1, String s2)
    {
        connected = flag;
        if (s == null)
        {
            s = "";
        }
        hwAddress = s;
        if (s1 == null)
        {
            s1 = "";
        }
        ssid = s1;
        if (s2 == null)
        {
            s2 = "";
        }
        bssid = s2;
    }
}
