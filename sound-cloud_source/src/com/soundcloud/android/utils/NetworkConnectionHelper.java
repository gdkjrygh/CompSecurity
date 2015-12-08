// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.events.ConnectionType;

public class NetworkConnectionHelper
{

    public static final String TAG = "NetworkConnectionHelper";
    private final ConnectivityManager connectivityManager;
    private final TelephonyManager telephonyManager;

    public NetworkConnectionHelper()
    {
        this((ConnectivityManager)SoundCloudApplication.instance.getSystemService("connectivity"), (TelephonyManager)SoundCloudApplication.instance.getSystemService("phone"));
    }

    public NetworkConnectionHelper(ConnectivityManager connectivitymanager, TelephonyManager telephonymanager)
    {
        connectivityManager = connectivitymanager;
        telephonyManager = telephonymanager;
    }

    private ConnectionType fromNetworkType(int i)
    {
        switch (i)
        {
        default:
            return ConnectionType.UNKNOWN;

        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 7: // '\007'
        case 11: // '\013'
            return ConnectionType.TWO_G;

        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 12: // '\f'
        case 14: // '\016'
        case 15: // '\017'
            return ConnectionType.THREE_G;

        case 13: // '\r'
            return ConnectionType.FOUR_G;
        }
    }

    public ConnectionType getCurrentConnectionType()
    {
        NetworkInfo networkinfo = connectivityManager.getActiveNetworkInfo();
        if (networkinfo == null)
        {
            return ConnectionType.OFFLINE;
        }
        switch (networkinfo.getType())
        {
        default:
            return ConnectionType.UNKNOWN;

        case 1: // '\001'
        case 6: // '\006'
            return ConnectionType.WIFI;

        case 0: // '\0'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return fromNetworkType(telephonyManager.getNetworkType());
        }
    }

    public String getNetworkOperatorName()
    {
        return telephonyManager.getNetworkOperatorName();
    }

    public boolean isNetworkConnected()
    {
        NetworkInfo networkinfo = connectivityManager.getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnectedOrConnecting();
    }

    public boolean isWifiConnected()
    {
        NetworkInfo networkinfo = connectivityManager.getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnected() && (networkinfo.getType() == 1 || networkinfo.getType() == 6);
    }
}
