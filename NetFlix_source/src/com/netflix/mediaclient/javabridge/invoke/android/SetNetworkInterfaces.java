// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.android;

import android.content.Context;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import com.netflix.mediaclient.net.LogMobileType;
import com.netflix.mediaclient.util.ConnectivityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SetNetworkInterfaces extends BaseInvoke
{

    private static final String METHOD = "setNetworkInterfaces";
    private static final String PROPERTY_interfaceName = "interfaceName";
    private static final String PROPERTY_internetConnected = "internetConnected";
    private static final String PROPERTY_ipv4Address = "ipv4Address";
    private static final String PROPERTY_isDefault = "isDefault";
    private static final String PROPERTY_linkConnected = "linkConnected";
    private static final String PROPERTY_macAddress = "macAddress";
    private static final String PROPERTY_mobileCarrier = "mobileCarrier";
    private static final String PROPERTY_mobileCountryCode = "mobileCountryCode";
    private static final String PROPERTY_mobileNetworkCode = "mobileNetworkCode";
    private static final String PROPERTY_networkInterfaces = "networkInterfaces";
    private static final String PROPERTY_physicalLayerSubType = "physicalLayerSubType";
    private static final String PROPERTY_physicalLayerType = "physicalLayerType";
    private static final String PROPERTY_ssid = "ssid";
    private static final String PROPERTY_wirelessChannel = "wirelessChannel";
    private static final String TARGET = "android";

    public SetNetworkInterfaces(Context context)
    {
        super("android", "setNetworkInterfaces");
        setArguments(context);
    }

    private void setArguments(Context context)
    {
        JSONArray jsonarray;
        NetworkInfo anetworkinfo[];
        NetworkInfo networkinfo;
        jsonarray = new JSONArray();
        anetworkinfo = ConnectivityUtils.getNetworkInterfaces(context);
        networkinfo = ConnectivityUtils.getActiveNetworkInfo(context);
        int j = anetworkinfo.length;
        int i;
        i = 0;
        Object obj = null;
_L17:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Object obj1 = anetworkinfo[i];
        JSONObject jsonobject = new JSONObject();
        int k;
        jsonobject.put("interfaceName", ((NetworkInfo) (obj1)).getTypeName());
        k = ConnectivityUtils.getNetworkTypePerLoggingSpecifcation(context, ((NetworkInfo) (obj1)).getType());
        jsonobject.put("physicalLayerType", k);
        jsonobject.put("physicalLayerSubType", ConnectivityUtils.getNetworkSubTypePerLoggingSpecification(LogMobileType.toLogMobileType(((NetworkInfo) (obj1)))));
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3 = false;
        flag1 = false;
        flag = flag1;
        flag2 = flag3;
        if (networkinfo == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        flag = flag1;
        flag2 = flag3;
        if (networkinfo.getType() != ((NetworkInfo) (obj1)).getType())
        {
            break MISSING_BLOCK_LABEL_164;
        }
        boolean flag4;
        flag4 = true;
        flag = flag1;
        flag2 = flag4;
        if (((NetworkInfo) (obj1)).isConnectedOrConnecting())
        {
            flag = true;
            flag2 = flag4;
        }
        if (!flag2) goto _L4; else goto _L3
_L3:
        jsonobject.put("isDefault", flag2);
        if (!flag) goto _L6; else goto _L5
_L5:
        jsonobject.put("linkConnected", 1);
_L18:
        jsonobject.put("internetConnected", 0);
        String s = null;
        if (4 != k) goto _L8; else goto _L7
_L7:
        Object obj2 = (WifiManager)context.getSystemService("wifi");
        obj1 = s;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        obj2 = ((WifiManager) (obj2)).getConnectionInfo();
        obj1 = s;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        if (Log.isLoggable("nf_invoke", 3))
        {
            Log.d("nf_invoke", ((WifiInfo) (obj2)).toString());
            Log.d("nf_invoke", (new StringBuilder()).append("").append(((WifiInfo) (obj2)).getSSID()).toString());
        }
        s = ((WifiInfo) (obj2)).getSSID();
        obj1 = ConnectivityUtils.getLocalWifiIP4Address(context);
        obj2 = ((WifiInfo) (obj2)).getMacAddress();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        jsonobject.put("ssid", s);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        jsonobject.put("macAddress", obj2);
        jsonobject.put("wirelessChannel", 0);
_L19:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        jsonobject.put("ipv4Address", obj1);
        if (!ConnectivityUtils.carrierInfoNeeded(k)) goto _L10; else goto _L9
_L9:
        String s2;
        String s3;
        obj1 = "";
        s2 = "";
        s3 = "";
        TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
        s = s2;
        obj2 = s3;
        if (telephonymanager == null) goto _L12; else goto _L11
_L11:
        String s1;
        s1 = telephonymanager.getNetworkOperatorName();
        obj1 = telephonymanager.getNetworkOperator();
        if (Log.isLoggable("nf_invoke", 3))
        {
            Log.d("nf_invoke", (new StringBuilder()).append("networkOperator: ").append(((String) (obj1))).toString());
        }
        if (obj1 == null) goto _L14; else goto _L13
_L13:
        if (((String) (obj1)).length() <= 4) goto _L14; else goto _L15
_L15:
        s2 = ((String) (obj1)).substring(0, 3);
        s3 = ((String) (obj1)).substring(3);
        obj1 = s1;
        s = s2;
        obj2 = s3;
        if (!Log.isLoggable("nf_invoke", 3)) goto _L12; else goto _L16
_L16:
        Log.d("nf_invoke", (new StringBuilder()).append("mcc: ").append(s2).toString());
        Log.d("nf_invoke", (new StringBuilder()).append("mnc: ").append(s3).toString());
        obj2 = s3;
        s = s2;
        obj1 = s1;
_L12:
        jsonobject.put("mobileCarrier", obj1);
        jsonobject.put("mobileCountryCode", s);
        jsonobject.put("mobileNetworkCode", obj2);
_L10:
        jsonarray.put(jsonobject);
        i++;
        obj1 = jsonobject;
          goto _L17
_L6:
        jsonobject.put("linkConnected", 2);
          goto _L18
        context;
_L20:
        Log.e("nf_invoke", "Failed to create JSON object", context);
        return;
_L4:
        jsonobject.put("isDefault", false);
        jsonobject.put("linkConnected", 2);
          goto _L18
_L8:
        obj1 = ConnectivityUtils.getLocalMobileIP4Address(context);
          goto _L19
_L14:
        Log.w("nf_invoke", "Network operator less than 4 characters!");
        obj1 = s1;
        s = s2;
        obj2 = s3;
          goto _L12
_L2:
        context = new JSONObject();
        try
        {
            context.put("networkInterfaces", jsonarray);
            arguments = context.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
          goto _L20
        context;
          goto _L20
    }
}
