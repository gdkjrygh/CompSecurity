// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class b
{

    public static int a(Context context)
    {
        context = (ConnectivityManager)a(context, "connectivity");
        if (context != null)
        {
            context = context.getActiveNetworkInfo();
            if (context != null)
            {
                if (context.getType() == 1)
                {
                    return 1;
                }
                if (context.getType() == 0)
                {
                    int i = context.getSubtype();
                    return i != 2 && i != 1 && i != 4 ? 3 : 2;
                }
            }
        }
        return 0;
    }

    public static Object a(Context context, String s)
    {
        return context.getApplicationContext().getSystemService(s);
    }

    public static boolean b(Context context)
    {
        context = (ConnectivityManager)a(context, "connectivity");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        context = context.getNetworkInfo(1);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        boolean flag = context.isConnected();
        if (flag)
        {
            return true;
        }
        return false;
        context;
        return false;
    }
}
