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
import com.worklight.common.Logger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkDetector extends CordovaPlugin
{

    public static final String ACTION_GET_NETWORK_INFO = "getNetworkInfo";
    private static Logger logger = Logger.getInstance("NetworkDetector");

    public NetworkDetector()
    {
    }

    private JSONObject[] getAllIpAddresses()
        throws JSONException
    {
        JSONObject jsonobject;
        JSONObject jsonobject1;
        HashMap hashmap;
        jsonobject = new JSONObject();
        jsonobject1 = new JSONObject();
        hashmap = new HashMap();
        hashmap.put("en0", "wifiAddress");
        hashmap.put("en1", "wifiAddress");
        hashmap.put("eth0", "wifiAddress");
        hashmap.put("pdp_ip0", "3GAddress");
        hashmap.put("rmnet0", "3GAddress");
        Enumeration enumeration = NetworkInterface.getNetworkInterfaces();
_L8:
        if (!enumeration.hasMoreElements()) goto _L2; else goto _L1
_L1:
        NetworkInterface networkinterface;
        Enumeration enumeration1;
        networkinterface = (NetworkInterface)enumeration.nextElement();
        enumeration1 = networkinterface.getInetAddresses();
_L5:
        String s;
        String s1;
        InetAddress inetaddress;
        do
        {
            if (!enumeration1.hasMoreElements())
            {
                continue; /* Loop/switch isn't completed */
            }
            inetaddress = (InetAddress)enumeration1.nextElement();
        } while (inetaddress.isLoopbackAddress());
        s1 = inetaddress.getHostAddress().toString();
        s = (String)hashmap.get(networkinterface.getName());
        Object obj;
        obj = s;
        if (s == null)
        {
            obj = "3GAddress";
        }
        int i = s1.indexOf("%");
        s = s1;
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        s = s1.substring(0, i);
        if (!(inetaddress instanceof Inet4Address)) goto _L4; else goto _L3
_L3:
        jsonobject.put(((String) (obj)), s);
          goto _L5
        obj;
_L2:
        return (new JSONObject[] {
            jsonobject, jsonobject1
        });
_L4:
        if (!(inetaddress instanceof Inet6Address)) goto _L5; else goto _L6
_L6:
        jsonobject1.put(((String) (obj)), s);
          goto _L5
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static String getPrimaryAddress(JSONObject ajsonobject[])
        throws JSONException
    {
        String s;
label0:
        {
label1:
            {
                Object obj = null;
                s = null;
                Object obj1 = ajsonobject[0];
                JSONObject jsonobject = ajsonobject[1];
                ajsonobject = ((JSONObject []) (obj));
                if (((JSONObject) (obj1)).has("wifiAddress"))
                {
                    ajsonobject = ((JSONObject) (obj1)).getString("wifiAddress");
                }
                if (((JSONObject) (obj1)).has("3GAddress"))
                {
                    s = ((JSONObject) (obj1)).getString("3GAddress");
                }
                if (ajsonobject != null)
                {
                    obj = ajsonobject;
                } else
                {
                    obj = s;
                }
                if (obj != null)
                {
                    obj1 = obj;
                    if (obj != "")
                    {
                        break label1;
                    }
                }
                if (jsonobject.has("wifiAddress"))
                {
                    ajsonobject = jsonobject.getString("wifiAddress");
                }
                if (jsonobject.has("3GAddress"))
                {
                    s = jsonobject.getString("3GAddress");
                }
                if (ajsonobject == null)
                {
                    break label0;
                }
                obj1 = ajsonobject;
            }
            return ((String) (obj1));
        }
        return s;
    }

    public boolean execute(final String ctx, JSONArray jsonarray, final CallbackContext callbackContext)
        throws JSONException
    {
        if ("getNetworkInfo".equals(ctx))
        {
            ctx = cordova.getActivity();
            cordova.getThreadPool().execute(new Runnable() {

                final NetworkDetector this$0;
                final CallbackContext val$callbackContext;
                final Context val$ctx;

                public void run()
                {
                    JSONObject jsonobject = getNetworkData(ctx);
                    callbackContext.success(jsonobject);
                }

            
            {
                this$0 = NetworkDetector.this;
                ctx = context;
                callbackContext = callbackcontext;
                super();
            }
            });
            return true;
        } else
        {
            callbackContext.error((new StringBuilder()).append("Invalid action: ").append(ctx).toString());
            return true;
        }
    }

    public JSONObject getNetworkData(Context context)
    {
        String s;
        Object obj;
        JSONObject ajsonobject[];
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
            logger.error((new StringBuilder()).append("Diagnostics information is missing because of ").append(context.getMessage()).toString(), context);
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
        ajsonobject = (TelephonyManager)context.getSystemService("phone");
        ajsonobject.getNetworkType();
        JVM INSTR tableswitch 0 10: default 490
    //                   0 546
    //                   1 532
    //                   2 511
    //                   3 539
    //                   4 504
    //                   5 518
    //                   6 525
    //                   7 442
    //                   8 552
    //                   9 566
    //                   10 559;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L16:
        if (ajsonobject.getNetworkOperator() != null && !ajsonobject.getNetworkOperator().equals("")) goto _L14; else goto _L13
_L17:
        obj = (new StringBuilder()).append(ajsonobject.getNetworkOperatorName()).append(((String) (obj))).toString();
        if (android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = Boolean.toString(flag);
        ajsonobject = getAllIpAddresses();
        jsonobject.put("isNetworkConnected", s1);
        jsonobject.put("isAirplaneMode", context);
        jsonobject.put("isRoaming", s2);
        jsonobject.put("networkConnectionType", s4);
        jsonobject.put("wifiName", s3);
        jsonobject.put("telephonyNetworkType", s);
        jsonobject.put("carrierName", obj);
        jsonobject.put("ipv4Addresses", ajsonobject[0]);
        jsonobject.put("ipv6Addresses", ajsonobject[1]);
        jsonobject.put("ipAddress", getPrimaryAddress(ajsonobject));
        return jsonobject;
        exception;
        logger.warn((new StringBuilder()).append("Diagnostics information is missing Wi-Fi info with ").append(exception.getMessage()).append(".  Ensure application permission ACCESS_WIFI_STATE in AndroidManifest.xml.").toString(), exception);
        exception = s;
          goto _L15
_L9:
        s = "1xRTT";
          goto _L16
_L14:
        obj = (new StringBuilder()).append("(").append(ajsonobject.getNetworkOperator()).append(")").toString();
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
