// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class d
{

    public static boolean a(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            return false;
        }
        Object obj = context.getNetworkInfo(0);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        android.net.NetworkInfo.State state;
        obj = ((NetworkInfo) (obj)).getState();
        if (obj == android.net.NetworkInfo.State.CONNECTED)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        state = android.net.NetworkInfo.State.CONNECTING;
        if (obj != state)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        return true;
        Exception exception;
        exception;
        context = context.getNetworkInfo(1);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        context = context.getState();
        if (context == android.net.NetworkInfo.State.CONNECTED)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        exception = android.net.NetworkInfo.State.CONNECTING;
        if (context != exception)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        return true;
        context;
        return false;
    }
}
