// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class j
{

    public static boolean a(Context context)
    {
        context = c(context);
        return context != null && context.isConnected();
    }

    public static String b(Context context)
    {
        context = c(context);
        if (context == null || !context.isConnected())
        {
            return "Not connected";
        }
        switch (context.getType())
        {
        case 8: // '\b'
        default:
            return "Unknown";

        case 7: // '\007'
            return "Bluetooth";

        case 9: // '\t'
            return "Ethernet";

        case 0: // '\0'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return "Mobile";

        case 1: // '\001'
            return "WiFi";

        case 6: // '\006'
            return "WiMAX";
        }
    }

    private static NetworkInfo c(Context context)
    {
        return ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
    }
}
