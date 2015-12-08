// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.rsa.mobilesdk.sdk;

import android.net.wifi.WifiInfo;

// Referenced classes of package com.rsa.mobilesdk.sdk:
//            DeviceInfo

public class SSID
{

    public String BBSID;
    public String Channel;
    public String SSID;
    public int SignalStrength;
    public String StationName;
    final DeviceInfo this$0;

    public void reset()
    {
        StationName = null;
        BBSID = null;
        SignalStrength = 0;
        Channel = null;
        SSID = null;
    }

    public void set(WifiInfo wifiinfo)
    {
        StationName = null;
        BBSID = wifiinfo.getBSSID();
        SignalStrength = wifiinfo.getRssi();
        Channel = null;
        SSID = wifiinfo.getSSID();
    }

    public void setNoPermission()
    {
        StationName = "-1";
        BBSID = "-1";
        SignalStrength = -1;
        Channel = "-1";
        SSID = "-1";
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("Station Name: ");
        if (StationName != null)
        {
            stringbuffer.append(StationName);
        } else
        {
            stringbuffer.append("unavailable");
        }
        stringbuffer.append("\n");
        stringbuffer.append("BBSID: ");
        if (BBSID != null)
        {
            stringbuffer.append(BBSID);
        } else
        {
            stringbuffer.append("unavailable");
        }
        stringbuffer.append("\n");
        stringbuffer.append("Signal Strength: ");
        stringbuffer.append(SignalStrength);
        stringbuffer.append("\n");
        stringbuffer.append("Channel: ");
        if (Channel != null)
        {
            stringbuffer.append(Channel);
        } else
        {
            stringbuffer.append("unavailable");
        }
        stringbuffer.append("\n");
        stringbuffer.append("SSID: ");
        if (SSID != null)
        {
            stringbuffer.append(SSID);
        } else
        {
            stringbuffer.append("unavailable");
        }
        stringbuffer.append("\n");
        return stringbuffer.toString();
    }

    public ()
    {
        this$0 = DeviceInfo.this;
        super();
        StationName = null;
        BBSID = null;
        SignalStrength = 0;
        Channel = null;
        SSID = null;
    }
}
