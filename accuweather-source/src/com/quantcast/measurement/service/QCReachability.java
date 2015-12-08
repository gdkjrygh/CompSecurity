// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

class QCReachability
{

    QCReachability()
    {
    }

    static boolean isConnected(Context context)
    {
        if (context == null)
        {
            return true;
        }
        boolean flag = false;
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context != null)
        {
            context = context.getActiveNetworkInfo();
            if (context != null && context.isConnected())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        return flag;
    }

    static String networkType(Context context)
    {
        String s;
        Object obj;
        s = "unknown";
        obj = (ConnectivityManager)context.getSystemService("connectivity");
        context = s;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        if (obj == null || !((NetworkInfo) (obj)).isConnected())
        {
            break MISSING_BLOCK_LABEL_71;
        }
        if (((NetworkInfo) (obj)).getType() != 0) goto _L4; else goto _L3
_L3:
        s = ((NetworkInfo) (obj)).getSubtypeName();
        context = s;
        if (s == null)
        {
            context = "wwan";
        }
_L2:
        return context;
_L4:
        context = s;
        if (((NetworkInfo) (obj)).getType() != 1) goto _L2; else goto _L5
_L5:
        return "wifi";
        return "disconnected";
    }
}
