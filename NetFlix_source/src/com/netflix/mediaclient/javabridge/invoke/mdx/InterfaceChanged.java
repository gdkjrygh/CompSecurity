// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.mdx;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import com.netflix.mediaclient.util.ConnectivityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class InterfaceChanged extends BaseInvoke
{

    private static final String METHOD = "InterfaceChanged";
    private static final String PROPERTY_CONNECTED = "connected";
    private static final String PROPERTY_IPADDRESS = "ipaddress";
    private static final String PROPERTY_NEW_INTERFACE = "newInterface";
    private static final String PROPERTY_SSID = "ssid";
    private static final String TAG = "nf_invoke";
    private static final String TARGET = "mdx";

    public InterfaceChanged(Context context)
    {
        super("mdx", "InterfaceChanged");
        if (context == null)
        {
            throw new IllegalArgumentException("Context is null!");
        } else
        {
            setArguments(context);
            return;
        }
    }

    public InterfaceChanged(boolean flag, boolean flag1, String s, String s1)
    {
        super("mdx", "InterfaceChanged");
        setArguments(flag, flag1, s, s1);
    }

    private void setArguments(Context context)
    {
        JSONObject jsonobject = new JSONObject();
        Object obj;
        obj = ConnectivityUtils.getNetworkType(context);
        jsonobject.put("newInterface", obj);
        jsonobject.put("connected", String.valueOf(ConnectivityUtils.isConnected(context)));
        String s;
        String s1;
        s1 = null;
        s = s1;
        if (!"WIFI".equals(obj)) goto _L2; else goto _L1
_L1:
        obj = (WifiManager)context.getSystemService("wifi");
        s = s1;
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = ((WifiManager) (obj)).getConnectionInfo();
        s = s1;
        if (obj == null) goto _L2; else goto _L4
_L4:
        if (Log.isLoggable("nf_invoke", 3))
        {
            Log.d("nf_invoke", ((WifiInfo) (obj)).toString());
            Log.d("nf_invoke", (new StringBuilder()).append("").append(((WifiInfo) (obj)).getSSID()).toString());
        }
        s = ((WifiInfo) (obj)).getSSID();
          goto _L2
_L9:
        jsonobject.put("ssid", s1);
        context = ConnectivityUtils.getLocalIP4Address(context);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        if (Log.isLoggable("nf_invoke", 3))
        {
            Log.d("nf_invoke", (new StringBuilder()).append("LocalIPAddress:").append(context).toString());
        }
        jsonobject.put("ipaddress", context);
_L6:
        arguments = jsonobject.toString();
        return;
        jsonobject.put("ipaddress", "");
        if (true) goto _L6; else goto _L5
_L5:
        context;
_L7:
        Log.e("nf_invoke", "Failed to create JSON object", context);
        return;
        context;
        if (true) goto _L7; else goto _L2
_L2:
        s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void setArguments(boolean flag, boolean flag1, String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        if (!flag) goto _L2; else goto _L1
_L1:
        jsonobject.put("newInterface", "MOBILE");
_L8:
        if (!flag1) goto _L4; else goto _L3
_L3:
        String s2;
        try
        {
            jsonobject.put("connected", "true");
            break MISSING_BLOCK_LABEL_164;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
          goto _L5
_L10:
        jsonobject.put("ssid", s2);
        if (s1 == null) goto _L7; else goto _L6
_L6:
        if (Log.isLoggable("nf_invoke", 3))
        {
            Log.d("nf_invoke", (new StringBuilder()).append("LocalIPAddress:").append(s1).toString());
        }
        jsonobject.put("ipaddress", s1);
_L9:
        arguments = jsonobject.toString();
        return;
_L2:
        jsonobject.put("newInterface", "WIFI");
          goto _L8
_L5:
        Log.e("nf_invoke", "Failed to create JSON object", s);
        return;
_L4:
        jsonobject.put("connected", "false");
        break MISSING_BLOCK_LABEL_164;
_L7:
        jsonobject.put("ipaddress", "");
          goto _L9
        s;
          goto _L5
        s2 = s;
        if (s == null)
        {
            s2 = "";
        }
          goto _L10
    }
}
