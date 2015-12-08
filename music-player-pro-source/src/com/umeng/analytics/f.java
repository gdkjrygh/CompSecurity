// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.analytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.umeng.common.Log;

class f
{

    f()
    {
    }

    public static String a(Context context)
    {
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0)
        {
            return null;
        }
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null)
        {
            return null;
        }
        if (context.getType() == 1)
        {
            return null;
        }
        context = context.getExtraInfo();
        Log.a("TAG", (new StringBuilder("net type:")).append(context).toString());
        if (context == null)
        {
            return null;
        }
        boolean flag;
        if (context.equals("cmwap") || context.equals("3gwap"))
        {
            break MISSING_BLOCK_LABEL_108;
        }
        flag = context.equals("uniwap");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        return "10.0.0.172";
        context;
        context.printStackTrace();
        return null;
    }
}
