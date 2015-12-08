// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tinder.managers.ManagerApp;

public final class k
{

    private static String a;

    public static int a()
    {
        int i;
        try
        {
            i = Integer.parseInt(android.os.Build.VERSION.SDK);
        }
        catch (Throwable throwable)
        {
            return 1;
        }
        return i;
    }

    public static String b()
    {
        if (!TextUtils.isEmpty(a))
        {
            return a;
        }
        String s1 = ((TelephonyManager)ManagerApp.c().getSystemService("phone")).getDeviceId();
        String s = s1;
        if (s1 == null)
        {
            s = "";
        }
        a = s;
        return s;
    }

    public static String c()
    {
        if (((ConnectivityManager)ManagerApp.c().getSystemService("connectivity")).getNetworkInfo(1).isConnected())
        {
            return "wifi";
        } else
        {
            return ((TelephonyManager)ManagerApp.c().getSystemService("phone")).getNetworkOperatorName();
        }
    }

    public static String d()
    {
        return (new StringBuilder("Android ")).append(android.os.Build.VERSION.RELEASE).toString();
    }
}
