// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.worklight.common.WLUtils;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import org.apache.cordova.api.LegacyContext;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONObject;

public class NetworkDetector extends Plugin
{

    public NetworkDetector()
    {
    }

    private String getLocalIpAddress()
    {
        Object obj = "";
        String s = ((String) (obj));
        String s1;
        Enumeration enumeration;
        Enumeration enumeration1;
        int i;
        try
        {
            enumeration = NetworkInterface.getNetworkInterfaces();
        }
        catch (SocketException socketexception)
        {
            WLUtils.error(socketexception.toString());
            return s;
        }
        s = ((String) (obj));
        if (!enumeration.hasMoreElements())
        {
            return ((String) (obj));
        }
        s = ((String) (obj));
        enumeration1 = ((NetworkInterface)enumeration.nextElement()).getInetAddresses();
        s1 = ((String) (obj));
_L2:
        obj = s1;
        s = s1;
        if (!enumeration1.hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_10;
        }
        s = s1;
        obj = (InetAddress)enumeration1.nextElement();
        s = s1;
        if (((InetAddress) (obj)).isLoopbackAddress()) goto _L2; else goto _L1
_L1:
        s = s1;
        obj = ((InetAddress) (obj)).getHostAddress().toString();
        s = ((String) (obj));
        i = ((String) (obj)).indexOf("%");
        s1 = ((String) (obj));
        if (i == -1) goto _L2; else goto _L3
_L3:
        s = ((String) (obj));
        s1 = ((String) (obj)).substring(0, i);
          goto _L2
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        if (s.equals("getNetworkInfo"))
        {
            s = getNetworkData(ctx.getContext());
            return new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, s);
        } else
        {
            return new PluginResult(org.apache.cordova.api.PluginResult.Status.INVALID_ACTION);
        }
    }

    public JSONObject getNetworkData(Context context)
    {
        String s;
        Object obj;
        TelephonyManager telephonymanager;
        boolean flag;
        JSONObject jsonobject = new JSONObject();
        String s1 = "false";
        String s2 = "false";
        String s4 = "";
        s = "";
        String s3;
        Exception exception;
        try
        {
            obj = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            WLUtils.error("Cannot retrive network diagnostic data: ", context);
            return jsonobject;
        }
        s3 = s;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        s1 = Boolean.valueOf(((NetworkInfo) (obj)).isConnected()).toString();
        s2 = Boolean.valueOf(((NetworkInfo) (obj)).isRoaming()).toString();
        s4 = ((NetworkInfo) (obj)).getTypeName();
        s3 = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo().getSSID();
_L15:
        telephonymanager = (TelephonyManager)context.getSystemService("phone");
        telephonymanager.getNetworkType();
        JVM INSTR tableswitch 0 10: default 388
    //                   0 437
    //                   1 425
    //                   2 407
    //                   3 431
    //                   4 401
    //                   5 413
    //                   6 419
    //                   7 346
    //                   8 443
    //                   9 455
    //                   10 449;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L16:
        if (telephonymanager.getNetworkOperator() != null && !telephonymanager.getNetworkOperator().equals("")) goto _L14; else goto _L13
_L17:
        obj = (new StringBuilder(String.valueOf(telephonymanager.getNetworkOperatorName()))).append(((String) (obj))).toString();
        if (android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = Boolean.toString(flag);
        jsonobject.put("isNetworkConnected", s1);
        jsonobject.put("isAirplaneMode", context);
        jsonobject.put("isRoaming", s2);
        jsonobject.put("networkConnectionType", s4);
        jsonobject.put("wifiName", s3);
        jsonobject.put("telephonyNetworkType", s);
        jsonobject.put("carrierName", obj);
        jsonobject.put("ipAddress", getLocalIpAddress());
        return jsonobject;
        exception;
        WLUtils.error("Cannot retrive WIFI info, check application permission ACCESS_WIFI_STATE in AndroidManifest.xml.", exception);
        exception = s;
          goto _L15
_L9:
        s = "1xRTT";
          goto _L16
_L14:
        obj = (new StringBuilder("(")).append(telephonymanager.getNetworkOperator()).append(")").toString();
          goto _L17
_L1:
        s = "UNDETECTABLE";
          goto _L16
_L13:
        obj = "";
          goto _L17
_L6:
        s = "CDMA";
          goto _L16
_L4:
        s = "EDGE";
          goto _L16
_L7:
        s = "EVDO_0";
          goto _L16
_L8:
        s = "EVDO_A";
          goto _L16
_L3:
        s = "GPRS";
          goto _L16
_L5:
        s = "UMTS";
          goto _L16
_L2:
        s = "";
          goto _L16
_L10:
        s = "HSDPA";
          goto _L16
_L12:
        s = "HSPA";
          goto _L16
_L11:
        s = "HSUPA";
          goto _L16
    }
}
