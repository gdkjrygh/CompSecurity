// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.android;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SetWifiApsInfo extends BaseInvoke
{

    private static final String METHOD = "setWifiApsInfo";
    private static final String PROPERTY_connectedApProp = "connectedap";
    private static final String PROPERTY_deviceCategory = "deviceCategory";
    private static final String PROPERTY_frequency = "f";
    private static final String PROPERTY_listOfAps = "wifiprop";
    private static final String PROPERTY_numWifiAps = "numwifiaps";
    private static final String PROPERTY_signalStrength = "ss";
    private static final String PROPERTY_wifiApsInfo = "wifiapsinfo";
    private static final String TARGET = "android";
    WifiManager mainWifi;

    public SetWifiApsInfo(Context context, String s, boolean flag)
    {
        super("android", "setWifiApsInfo");
        mainWifi = (WifiManager)context.getSystemService("wifi");
        if (flag)
        {
            setArguments(context, s);
        } else
        {
            context = new JSONObject();
            try
            {
                context.put("wifiapsinfo", "");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
            arguments = context.toString();
            if (Log.isLoggable("nf_invoke", 3))
            {
                Log.d("nf_invoke", (new StringBuilder()).append("WiFi APs Info: ").append(context.toString()).toString());
                return;
            }
        }
    }

    private void setArguments(Context context, String s)
    {
        JSONArray jsonarray = new JSONArray();
        WifiInfo wifiinfo = mainWifi.getConnectionInfo();
        context = null;
        if (wifiinfo == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        Object obj = wifiinfo.getSSID();
        context = ((Context) (obj));
        if (!((String) (obj)).startsWith("\""))
        {
            break MISSING_BLOCK_LABEL_65;
        }
        context = ((Context) (obj));
        if (((String) (obj)).endsWith("\""))
        {
            context = ((String) (obj)).substring(1, ((String) (obj)).length() - 1);
        }
        JSONObject jsonobject1;
        List list;
        jsonobject1 = new JSONObject();
        list = mainWifi.getScanResults();
        int i;
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_540;
        }
        i = 0;
        obj = null;
        Object obj1 = null;
_L2:
        JSONObject jsonobject;
        try
        {
            if (i >= list.size())
            {
                break; /* Loop/switch isn't completed */
            }
            jsonobject = new JSONObject();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        jsonobject.put("f", ((ScanResult)list.get(i)).frequency);
        jsonobject.put("ss", ((ScanResult)list.get(i)).level);
        if (Log.isLoggable("nf_invoke", 3))
        {
            Log.d("nf_invoke", (new StringBuilder()).append("WiFi ssid: ").append(((ScanResult)list.get(i)).SSID).append(" Current Ap: ").append(wifiinfo.getSSID()).toString());
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        if (!context.equals(((ScanResult)list.get(i)).SSID))
        {
            break MISSING_BLOCK_LABEL_310;
        }
        obj = new JSONObject();
        Log.d("nf_invoke", "WiFi Ap match available");
        ((JSONObject) (obj)).put("f", ((ScanResult)list.get(i)).frequency);
        ((JSONObject) (obj)).put("ss", ((ScanResult)list.get(i)).level);
        if (Log.isLoggable("nf_invoke", 3))
        {
            Log.d("nf_invoke", (new StringBuilder()).append("WiFi prop ssid: ").append(((ScanResult)list.get(i)).SSID).append(" f: ").append(((ScanResult)list.get(i)).frequency).append(" ss: ").append(((ScanResult)list.get(i)).level).toString());
        }
        jsonarray.put(jsonobject);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        context = new JSONObject();
        context.put("numwifiaps", list.size());
        context.put("wifiprop", jsonarray);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_472;
        }
        Log.d("nf_invoke", "WiFi Ap connected available");
        context.put("connectedap", obj);
        context.put("deviceCategory", s);
        jsonobject1.put("wifiapsinfo", context.toString());
        if (Log.isLoggable("nf_invoke", 3))
        {
            Log.d("nf_invoke", (new StringBuilder()).append("WiFi APs Info: ").append(jsonobject1.toString()).toString());
        }
_L4:
        arguments = jsonobject1.toString();
        return;
        jsonobject1.put("wifiapsinfo", "");
        if (Log.isLoggable("nf_invoke", 3))
        {
            Log.d("nf_invoke", (new StringBuilder()).append("WiFiList unavailable, APs Info: ").append(jsonobject1.toString()).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
        context;
_L8:
        Log.e("nf_invoke", "Failed to create JSON object", context);
        return;
        context;
_L6:
        Log.e("nf_invoke", "Unable to Log WiFiApsInfo ", context);
        return;
        context;
        if (true) goto _L6; else goto _L5
        context;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
