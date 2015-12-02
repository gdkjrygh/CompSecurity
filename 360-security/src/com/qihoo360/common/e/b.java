// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.qihoo360.common.utils.ContextHelper;

public class b
{

    public static boolean a(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null) goto _L2; else goto _L1
_L1:
        context = context.getAllNetworkInfo();
        if (context == null) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        j = context.length;
        i = 0;
_L6:
        if (i < j) goto _L4; else goto _L2
_L2:
        return false;
_L4:
        if (context[i].isConnected())
        {
            return true;
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean b(Context context)
    {
        context = (ConnectivityManager)context.getApplicationContext().getSystemService("connectivity");
        try
        {
            context = context.getNetworkInfo(1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context != null)
        {
            return context.isConnected();
        } else
        {
            return false;
        }
    }

    public static byte c(Context context)
    {
        if (!a(context))
        {
            return 9;
        }
        if (b(context))
        {
            return 0;
        }
        context = (TelephonyManager)ContextHelper.getSystemService(context, "phone");
        if (context == null) goto _L2; else goto _L1
_L1:
        context.getNetworkType();
        JVM INSTR tableswitch 1 15: default 112
    //                   1 115
    //                   2 115
    //                   3 117
    //                   4 115
    //                   5 117
    //                   6 117
    //                   7 117
    //                   8 117
    //                   9 117
    //                   10 117
    //                   11 115
    //                   12 117
    //                   13 117
    //                   14 117
    //                   15 117;
           goto _L2 _L3 _L3 _L4 _L3 _L4 _L4 _L4 _L4 _L4 _L4 _L3 _L4 _L4 _L4 _L4
_L2:
        return 9;
_L3:
        return 1;
_L4:
        return 2;
    }
}
