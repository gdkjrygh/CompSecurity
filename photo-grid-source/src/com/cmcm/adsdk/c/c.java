// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.cmcm.adsdk.j;

public final class c
{

    private static Uri a = Uri.parse("content://telephony/carriers/preferapn");

    public static boolean a(Context context)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        context = context.getActiveNetworkInfo();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (!context.isAvailable() || !context.isConnected())
        {
            break MISSING_BLOCK_LABEL_50;
        }
        j.a("NetUtil", "isNetworkAvailable");
        return true;
        j.a("NetUtil", "isNetworkAvailable fail");
        return false;
        context;
        j.a("NetUtil", context);
        return false;
    }

}
