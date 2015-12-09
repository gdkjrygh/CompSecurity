// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.android;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import org.json.JSONException;
import org.json.JSONObject;

public class SetWifiLinkSpeed extends BaseInvoke
{

    private static final String METHOD = "setWifiLinkSpeed";
    private static final String PROPERTY_WIFI_LINKSPEED = "wifi_linkspeed";
    private static final String TARGET = "android";
    WifiManager mainWifi;

    public SetWifiLinkSpeed(Context context)
    {
        super("android", "setWifiLinkSpeed");
        mainWifi = (WifiManager)context.getSystemService("wifi");
        setArguments();
    }

    private void setArguments()
    {
        Object obj = mainWifi.getConnectionInfo();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        int i;
        i = ((WifiInfo) (obj)).getLinkSpeed();
        obj = new JSONObject();
        ((JSONObject) (obj)).put("wifi_linkspeed", i);
        arguments = ((JSONObject) (obj)).toString();
        return;
        arguments = "";
        return;
        Object obj1;
        obj1;
_L4:
        Log.e("nf_invoke", "Failed to create JSON object", ((Throwable) (obj1)));
        return;
        obj1;
_L2:
        Log.e("nf_invoke", "Unable to Log WifiLinkSpeed ", ((Throwable) (obj1)));
        return;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
