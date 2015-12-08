// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class b
{

    public b()
    {
    }

    public static boolean a(Context context)
    {
        context = b(context);
        if (context == null) goto _L2; else goto _L1
_L1:
        context.getType();
        JVM INSTR lookupswitch 2: default 40
    //                   1: 42
    //                   6: 42;
           goto _L2 _L3 _L3
_L2:
        return false;
_L3:
        return true;
    }

    public static NetworkInfo b(Context context)
    {
        try
        {
            context = (ConnectivityManager)context.getSystemService("connectivity");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        context = context.getActiveNetworkInfo();
        return context;
        return null;
    }
}
