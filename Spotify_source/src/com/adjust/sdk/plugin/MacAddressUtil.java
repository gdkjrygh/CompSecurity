// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk.plugin;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class MacAddressUtil
{

    public MacAddressUtil()
    {
    }

    public static String getMacAddress(Context context)
    {
        context = getRawMacAddress(context);
        if (context == null)
        {
            return null;
        } else
        {
            return removeSpaceString(context.toUpperCase(Locale.US));
        }
    }

    private static String getRawMacAddress(Context context)
    {
        Object obj = loadAddress("wlan0");
        if (obj == null) goto _L2; else goto _L1
_L1:
        return ((String) (obj));
_L2:
        String s;
        s = loadAddress("eth0");
        obj = s;
        if (s != null) goto _L1; else goto _L3
_L3:
        context = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        obj = context;
        if (context != null) goto _L1; else goto _L4
_L4:
        return null;
        context;
        if (true) goto _L4; else goto _L5
_L5:
    }

    private static String loadAddress(String s)
    {
        Object obj;
        char ac[];
        obj = (new StringBuilder("/sys/class/net/")).append(s).append("/address").toString();
        s = new StringBuilder(1000);
        obj = new BufferedReader(new FileReader(((String) (obj))), 1024);
        ac = new char[1024];
_L1:
        int i = ((BufferedReader) (obj)).read(ac);
label0:
        {
            if (i == -1)
            {
                break label0;
            }
            try
            {
                s.append(String.valueOf(ac, 0, i));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
        }
          goto _L1
        ((BufferedReader) (obj)).close();
        s = s.toString();
        return s;
    }

    private static String removeSpaceString(String s)
    {
        if (s != null)
        {
            if (!TextUtils.isEmpty(s = s.replaceAll("\\s", "")))
            {
                return s;
            }
        }
        return null;
    }
}
