// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.receivers;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.gcm.GcmReceiver;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.model.SparksEvent;

public class BroadcastReceiverConnectionChange extends GcmReceiver
{

    private static int a = -1;

    public BroadcastReceiverConnectionChange()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!ManagerApp.f()) goto _L2; else goto _L1
_L1:
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null) goto _L2; else goto _L3
_L3:
        int j = context.getType();
        if (j == a) goto _L2; else goto _L4
_L4:
        intent = new SparksEvent("Device.ChangeNetwork");
        if (context.getType() != 0)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        ((TelephonyManager)ManagerApp.c().getSystemService("phone")).getNetworkType();
        JVM INSTR tableswitch 0 15: default 148
    //                   0 259
    //                   1 211
    //                   2 181
    //                   3 253
    //                   4 175
    //                   5 193
    //                   6 199
    //                   7 169
    //                   8 217
    //                   9 235
    //                   10 223
    //                   11 241
    //                   12 205
    //                   13 247
    //                   14 187
    //                   15 229;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L5:
        context = "Unknown";
_L22:
        intent.put("networkType", context);
        com.tinder.managers.a.a(intent);
_L23:
        a = j;
_L2:
        return;
_L13:
        context = "1xRTT";
          goto _L22
_L10:
        context = "CDMA";
          goto _L22
_L8:
        context = "EDGE";
          goto _L22
_L20:
        context = "eHRPD";
          goto _L22
_L11:
        context = "EVDO rev. 0";
          goto _L22
_L12:
        context = "EVDO rev. A";
          goto _L22
_L18:
        context = "EVDO rev. B";
          goto _L22
_L7:
        context = "GPRS";
          goto _L22
_L14:
        context = "HSDPA";
          goto _L22
_L16:
        context = "HSPA";
          goto _L22
_L21:
        context = "HSPA+";
          goto _L22
_L15:
        context = "HSUPA";
          goto _L22
_L17:
        context = "iDen";
          goto _L22
_L19:
        context = "LTE";
          goto _L22
_L9:
        context = "UMTS";
          goto _L22
_L6:
        context = "Unknown";
          goto _L22
        if (context.getType() == 1)
        {
            WifiInfo wifiinfo = ((WifiManager)ManagerApp.c().getSystemService("wifi")).getConnectionInfo();
            int i;
            if (wifiinfo != null)
            {
                i = wifiinfo.getLinkSpeed();
            } else
            {
                i = -1;
            }
            intent.put("networkType", (new StringBuilder()).append(context.getTypeName()).append(' ').append(i).append(" Mbps").toString());
            com.tinder.managers.a.a(intent);
        }
          goto _L23
    }

}
