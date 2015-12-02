// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.frontia.a.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;

public class a
{

    private static final String a = com/baidu/frontia/a/c/a.getSimpleName();
    private String b;
    private String c;
    private String d;
    private boolean e;
    private String f;

    public a(Context context)
    {
        b(context);
    }

    private void a(Context context, NetworkInfo networkinfo)
    {
        if (networkinfo.getExtraInfo() != null)
        {
            context = networkinfo.getExtraInfo().toLowerCase();
            if (context != null)
            {
                if (context.startsWith("cmwap") || context.startsWith("uniwap") || context.startsWith("3gwap"))
                {
                    e = true;
                    b = context;
                    c = "10.0.0.172";
                    d = "80";
                    return;
                }
                if (context.startsWith("ctwap"))
                {
                    e = true;
                    b = context;
                    c = "10.0.0.200";
                    d = "80";
                    return;
                }
                if (context.startsWith("cmnet") || context.startsWith("uninet") || context.startsWith("ctnet") || context.startsWith("3gnet"))
                {
                    e = false;
                    b = context;
                    return;
                }
            }
        }
        context = Proxy.getDefaultHost();
        int i = Proxy.getDefaultPort();
        if (context != null && context.length() > 0)
        {
            c = context;
            if ("10.0.0.172".equals(c.trim()))
            {
                e = true;
                d = "80";
                return;
            }
            if ("10.0.0.200".equals(c.trim()))
            {
                e = true;
                d = "80";
                return;
            } else
            {
                e = false;
                d = Integer.toString(i);
                return;
            }
        } else
        {
            e = false;
            return;
        }
    }

    public static boolean a(Context context)
    {
        context = ((ConnectivityManager)context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (context != null)
        {
            return context.isConnectedOrConnecting();
        } else
        {
            return false;
        }
    }

    private void b(Context context)
    {
        NetworkInfo networkinfo;
label0:
        {
            networkinfo = ((ConnectivityManager)context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (networkinfo != null)
            {
                if (!"wifi".equals(networkinfo.getTypeName().toLowerCase()))
                {
                    break label0;
                }
                f = "wifi";
                e = false;
            }
            return;
        }
        a(context, networkinfo);
        f = b;
    }

    public boolean a()
    {
        return e;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

}
