// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import android.app.Application;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import com.pinterest.kit.application.CommonApplication;
import com.pinterest.kit.application.Resources;
import com.pinterest.networking.MccMnc;
import com.pinterest.reporting.CrashReporting;
import java.net.URLDecoder;

public class NetworkUtils
{

    private static final String STR_UNKNOWN = "Unknown";
    private static NetworkUtils _instance;
    private static MccMnc _mccMnc = null;
    private boolean _hasInternet;

    public NetworkUtils()
    {
        _hasInternet = true;
    }

    public static String findParam(String s, String s1)
    {
        if (s == null)
        {
            return null;
        }
        int k = s.indexOf(s1) + s1.length() + 1;
        int j = s.indexOf("&", k);
        int i = j;
        if (j == -1)
        {
            i = s.length();
        }
        return s.substring(k, i);
    }

    public static Uri getDecodedUri(String s)
    {
        try
        {
            s = Uri.parse(URLDecoder.decode(s, "UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            CrashReporting.a(s);
            return null;
        }
        return s;
    }

    public static NetworkUtils getInstance()
    {
        if (_instance == null)
        {
            _instance = new NetworkUtils();
        }
        return _instance;
    }

    public static String replaceParam(String s, String s1, String s2)
    {
        if (s == null)
        {
            return null;
        }
        int k = s.indexOf(s1) + s1.length() + 1;
        int j = s.indexOf("&", k);
        int i = j;
        if (j == -1)
        {
            i = s.length();
        }
        return (new StringBuilder()).append(s.substring(0, k)).append(s2).append(s.substring(i)).toString();
    }

    public MccMnc getCarrierMccMnc()
    {
        if (_mccMnc == null)
        {
            Configuration configuration = Resources.configuration();
            _mccMnc = new MccMnc(configuration.mcc, configuration.mnc);
        }
        return _mccMnc;
    }

    public String getCarrierName()
    {
        if (isOnWifiNetwork())
        {
            return "wifi";
        }
        TelephonyManager telephonymanager = (TelephonyManager)CommonApplication.context().getSystemService("phone");
        if (telephonymanager != null)
        {
            return telephonymanager.getNetworkOperatorName();
        } else
        {
            return "Unknown";
        }
    }

    public boolean hasInternet()
    {
        return isConnectedAnyNetwork() && _hasInternet;
    }

    public boolean isConnectedAnyNetwork()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)CommonApplication.context().getSystemService("connectivity")).getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnectedOrConnecting();
    }

    public boolean isInAirplaneMode()
    {
        boolean flag = false;
        android.content.ContentResolver contentresolver = CommonApplication.context().getContentResolver();
        int i;
        try
        {
            i = android.provider.Settings.System.getInt(contentresolver, "airplane_mode_on", 0);
        }
        catch (NullPointerException nullpointerexception)
        {
            return false;
        }
        if (i != 0)
        {
            flag = true;
        }
        return flag;
    }

    public boolean isOnWifiNetwork()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)CommonApplication.context().getSystemService("connectivity")).getNetworkInfo(1);
        return networkinfo != null && networkinfo.isConnected();
    }

    public void setHasInternet(boolean flag)
    {
        _hasInternet = flag;
    }

}
