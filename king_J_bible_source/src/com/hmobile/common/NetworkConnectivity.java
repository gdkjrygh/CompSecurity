// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.hmobile.biblekjv.HolyBibleApplication;

public class NetworkConnectivity
{

    public NetworkConnectivity()
    {
    }

    public static boolean isConnected()
    {
        boolean flag1 = false;
        NetworkInfo networkinfo;
        boolean flag;
        boolean flag2;
        try
        {
            networkinfo = ((ConnectivityManager)HolyBibleApplication.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        }
        catch (Exception exception)
        {
            return false;
        }
        flag = flag1;
        if (networkinfo == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        flag2 = networkinfo.isConnected();
        flag = flag1;
        if (flag2)
        {
            flag = true;
        }
        return flag;
    }
}
