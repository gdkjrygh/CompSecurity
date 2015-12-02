// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale.language;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import java.util.List;

public class b
{

    private static int a(int i)
    {
        switch (i)
        {
        default:
            return 5;

        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 7: // '\007'
        case 11: // '\013'
            return 2;

        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 12: // '\f'
        case 14: // '\016'
        case 15: // '\017'
            return 3;

        case 13: // '\r'
            return 4;
        }
    }

    public static Object a(Context context, String s)
    {
        return context.getApplicationContext().getSystemService(s);
    }

    public static boolean a(Context context)
    {
        context = (ConnectivityManager)a(context, "connectivity");
        if (context != null)
        {
            context = context.getAllNetworkInfo();
            if (context != null)
            {
                int j = context.length;
                for (int i = 0; i < j; i++)
                {
                    NetworkInfo networkinfo = context[i];
                    if (networkinfo != null && networkinfo.isConnected())
                    {
                        return true;
                    }
                }

            }
        }
        return false;
    }

    private static boolean a(Context context, Intent intent)
    {
        boolean flag1 = false;
        context = context.getPackageManager().queryIntentActivities(intent, 0x10000);
        boolean flag = flag1;
        if (context != null)
        {
            flag = flag1;
            if (context.size() > 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean b(Context context)
    {
        context = (WifiManager)a(context, "wifi");
        return context != null && context.isWifiEnabled();
    }

    public static void c(Context context)
    {
        Intent intent = new Intent();
        if (b(context))
        {
            intent.setAction("android.settings.DATA_ROAMING_SETTINGS");
        } else
        {
            intent.setAction("android.settings.WIFI_SETTINGS");
        }
        if (a(context, intent))
        {
            context.startActivity(intent);
        } else
        {
            intent.setAction("android.settings.SETTINGS");
            if (a(context, intent))
            {
                context.startActivity(intent);
                return;
            }
        }
    }

    public static int d(Context context)
    {
        Object obj;
        boolean flag1;
        boolean flag2;
label0:
        {
            flag2 = true;
            obj = (ConnectivityManager)a(context, "connectivity");
            if (obj != null)
            {
                NetworkInfo anetworkinfo[] = ((ConnectivityManager) (obj)).getAllNetworkInfo();
                if (anetworkinfo != null)
                {
                    int k = anetworkinfo.length;
                    int j = 0;
                    boolean flag = false;
                    do
                    {
                        flag1 = flag;
                        if (j >= k)
                        {
                            break;
                        }
                        NetworkInfo networkinfo = anetworkinfo[j];
                        flag1 = flag;
                        if (networkinfo != null)
                        {
                            flag1 = flag;
                            if (networkinfo.isConnected())
                            {
                                flag1 = true;
                            }
                        }
                        j++;
                        flag = flag1;
                    } while (true);
                    break label0;
                }
            }
            flag1 = false;
        }
        if (flag1) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        return i;
_L2:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((ConnectivityManager) (obj)).getNetworkInfo(1);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        i = ((flag2) ? 1 : 0);
        if (((NetworkInfo) (obj)).isConnected()) goto _L4; else goto _L3
_L3:
        return a(((TelephonyManager)context.getSystemService("phone")).getNetworkType());
    }
}
