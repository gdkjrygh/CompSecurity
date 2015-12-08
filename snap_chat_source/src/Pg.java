// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.snapchat.android.SnapchatApplication;

public final class Pg
{

    public static NetworkInfo a()
    {
        return ((ConnectivityManager)SnapchatApplication.get().getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static String b()
    {
        String s;
        NetworkInfo networkinfo;
        networkinfo = a();
        s = "unknown";
        if (networkinfo == null || !networkinfo.isConnectedOrConnecting())
        {
            break MISSING_BLOCK_LABEL_41;
        }
        if (networkinfo.getType() != 1) goto _L2; else goto _L1
_L1:
        s = "wifi";
_L4:
        return s;
_L2:
        if (networkinfo.getType() != 0) goto _L4; else goto _L3
_L3:
        return "wwan";
        return "not_reachable";
    }
}
