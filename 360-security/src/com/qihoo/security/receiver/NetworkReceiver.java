// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.qihoo.security.appbox.core.a;
import com.qihoo.security.locale.language.b;
import com.qihoo360.mobilesafe.b.h;

public class NetworkReceiver extends BroadcastReceiver
{

    public NetworkReceiver()
    {
    }

    private android.net.NetworkInfo.State a(Context context, int i)
    {
        context = ((ConnectivityManager)b.a(context, "connectivity")).getNetworkInfo(i);
        if (context == null)
        {
            return android.net.NetworkInfo.State.UNKNOWN;
        } else
        {
            return context.getState();
        }
    }

    private void a(Context context)
    {
        com.qihoo.security.appbox.core.a.a(context);
        com.qihoo.security.support.b.a();
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        if (!"android.net.wifi.WIFI_STATE_CHANGED".equals(s)) goto _L2; else goto _L1
_L1:
        h.a(intent, "wifi_state", 0);
        JVM INSTR tableswitch 0 4: default 56
    //                   0 56
    //                   1 56
    //                   2 56
    //                   3 57
    //                   4 56;
           goto _L3 _L3 _L3 _L3 _L4 _L3
_L3:
        return;
_L4:
        a(context);
        return;
_L2:
        if (!"android.net.wifi.STATE_CHANGE".equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            context = intent.getParcelableExtra("networkInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context != null && ((NetworkInfo)context).isAvailable())
        {
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(s)) goto _L3; else goto _L5
_L5:
        intent = a(context, 1);
        if (android.net.NetworkInfo.State.CONNECTED == intent)
        {
            a(context);
        }
        intent = a(context, 0);
        if (android.net.NetworkInfo.State.CONNECTED == intent)
        {
            a(context);
            return;
        }
        if (true) goto _L3; else goto _L6
_L6:
    }
}
