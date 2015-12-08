// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

// Referenced classes of package com.cm.kinfoc:
//            ag

public final class y
{

    public static int a(Context context)
    {
        int i;
        if (context == null)
        {
            return 1;
        }
        NetworkInfo networkinfo;
        int j;
        boolean flag;
        try
        {
            networkinfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 32;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return 0;
        }
        if (networkinfo == null) goto _L2; else goto _L1
_L1:
        if (!networkinfo.isConnected()) goto _L2; else goto _L3
_L3:
        i = networkinfo.getType();
        j = networkinfo.getSubtype();
        if (i != 1) goto _L5; else goto _L4
_L4:
        flag = c(context);
        if (flag)
        {
            return 2;
        }
          goto _L2
_L5:
        if (i == 0)
        {
            switch (j)
            {
            default:
                return 1;

            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 7: // '\007'
            case 11: // '\013'
                return 4;

            case 3: // '\003'
            case 5: // '\005'
            case 6: // '\006'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 12: // '\f'
            case 14: // '\016'
            case 15: // '\017'
                return 8;

            case 13: // '\r'
                return 16;
            }
        }
        i = 1;
_L7:
        return i;
_L2:
        i = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String a(String s)
    {
        int j = 0;
        String s1 = ag.a(s);
        int i;
        if (s != null)
        {
            i = s1.length();
        } else
        {
            i = 0;
        }
        s = new StringBuilder();
        for (; j < 32 - i; j++)
        {
            s.append('0');
        }

        if (s1 != null)
        {
            s.append(s1);
        }
        return s.toString();
    }

    public static boolean b(Context context)
    {
        if (context == null)
        {
            return false;
        }
        context = (ConnectivityManager)context.getSystemService("connectivity");
        context = context.getActiveNetworkInfo();
        if (context == null) goto _L2; else goto _L1
_L1:
        boolean flag = context.isConnected();
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        return flag;
        context;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static boolean c(Context context)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        WifiManager wifimanager;
        wifimanager = (WifiManager)context.getSystemService("wifi");
        context = null;
        WifiInfo wifiinfo = wifimanager.getConnectionInfo();
        context = wifiinfo;
_L4:
        int i;
        if (context == null)
        {
            i = 0;
        } else
        {
            i = context.getIpAddress();
        }
        if (wifimanager.isWifiEnabled() && i != 0)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
          goto _L4
    }
}
