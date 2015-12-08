// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class abv
{

    private ConnectivityManager a;

    public abv(Context context)
    {
        while (context == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) 
        {
            return;
        }
        a = (ConnectivityManager)context.getSystemService("connectivity");
    }

    public final ZZ a()
    {
        if (a == null)
        {
            return ZZ.b;
        }
        NetworkInfo networkinfo = a.getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            return ZZ.c;
        } else
        {
            return ZZ.a(networkinfo.getType());
        }
    }

    public final String b()
    {
        NetworkInfo networkinfo;
        int i;
        if (a == null)
        {
            return "unknown";
        }
        networkinfo = a.getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            return "disconnected";
        }
        i = networkinfo.getType();
        if (i != 0) goto _L2; else goto _L1
_L1:
        networkinfo.getSubtype();
        JVM INSTR tableswitch 1 15: default 120
    //                   1 123
    //                   2 123
    //                   3 126
    //                   4 123
    //                   5 126
    //                   6 126
    //                   7 123
    //                   8 126
    //                   9 126
    //                   10 126
    //                   11 123
    //                   12 126
    //                   13 129
    //                   14 126
    //                   15 126;
           goto _L3 _L4 _L4 _L5 _L4 _L5 _L5 _L4 _L5 _L5 _L5 _L4 _L5 _L6 _L5 _L5
_L3:
        return "unknown";
_L4:
        return "2G";
_L5:
        return "3G";
_L6:
        return "LTE";
_L2:
        if (i == 1)
        {
            return "wifi";
        }
        if (true) goto _L3; else goto _L7
_L7:
    }
}
