// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.hardware;

import android.telephony.TelephonyManager;

public class z
{

    private z()
    {
    }

    public static int a(TelephonyManager telephonymanager)
    {
        int i;
        try
        {
            i = telephonymanager.getPhoneType();
        }
        // Misplaced declaration of an exception variable
        catch (TelephonyManager telephonymanager)
        {
            return -1;
        }
        return i;
    }

    public static String a(int i)
    {
        switch (i)
        {
        default:
            return "UNKNOWN";

        case 7: // '\007'
            return "1xRTT";

        case 4: // '\004'
            return "CDMA";

        case 2: // '\002'
            return "EDGE";

        case 14: // '\016'
            return "EHRPD";

        case 5: // '\005'
            return "EVDO_0";

        case 6: // '\006'
            return "EVDO_A";

        case 12: // '\f'
            return "EVDO_B";

        case 1: // '\001'
            return "GPRS";

        case 8: // '\b'
            return "HSDPA";

        case 10: // '\n'
            return "HSPA";

        case 15: // '\017'
            return "HSPAP";

        case 9: // '\t'
            return "HSUPA";

        case 11: // '\013'
            return "IDEN";

        case 13: // '\r'
            return "LTE";

        case 3: // '\003'
            return "UMTS";
        }
    }

    public static String b(int i)
    {
        switch (i)
        {
        default:
            return "UNKNOWN";

        case 2: // '\002'
            return "CDMA";

        case 1: // '\001'
            return "GSM";

        case 3: // '\003'
            return "SIP";

        case 0: // '\0'
            return "NONE";
        }
    }

    public static String b(TelephonyManager telephonymanager)
    {
        return b(a(telephonymanager));
    }
}
