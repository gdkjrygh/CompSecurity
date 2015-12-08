// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifierAutoDetect

static class mWifiManager
{

    private final WifiManager mWifiManager;

    String getWifiSSID()
    {
        Object obj = mWifiManager.getConnectionInfo();
        if (obj == null)
        {
            obj = "";
        } else
        {
            String s = ((WifiInfo) (obj)).getSSID();
            obj = s;
            if (s == null)
            {
                return "";
            }
        }
        return ((String) (obj));
    }

    ()
    {
        mWifiManager = null;
    }

    mWifiManager(Context context)
    {
        mWifiManager = (WifiManager)context.getSystemService("wifi");
    }
}
