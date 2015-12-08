// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.networkinformation;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkManager extends CordovaPlugin
{

    public static final String CDMA = "cdma";
    public static final String CELLULAR = "cellular";
    public static final String EDGE = "edge";
    public static final String EHRPD = "ehrpd";
    public static final String GPRS = "gprs";
    public static final String GSM = "gsm";
    public static final String HSDPA = "hsdpa";
    public static final String HSPA = "hspa";
    public static final String HSPA_PLUS = "hspa+";
    public static final String HSUPA = "hsupa";
    private static final String LOG_TAG = "NetworkManager";
    public static final String LTE = "lte";
    public static final String MOBILE = "mobile";
    public static int NOT_REACHABLE = 0;
    public static final String ONEXRTT = "1xrtt";
    public static int REACHABLE_VIA_CARRIER_DATA_NETWORK = 0;
    public static int REACHABLE_VIA_WIFI_NETWORK = 0;
    public static final String TYPE_2G = "2g";
    public static final String TYPE_3G = "3g";
    public static final String TYPE_4G = "4g";
    public static final String TYPE_ETHERNET = "ethernet";
    public static final String TYPE_NONE = "none";
    public static final String TYPE_UNKNOWN = "unknown";
    public static final String TYPE_WIFI = "wifi";
    public static final String UMB = "umb";
    public static final String UMTS = "umts";
    public static final String WIFI = "wifi";
    public static final String WIMAX = "wimax";
    private CallbackContext connectionCallbackContext;
    private JSONObject lastInfo;
    BroadcastReceiver receiver;
    ConnectivityManager sockMan;

    public NetworkManager()
    {
        lastInfo = null;
    }

    private JSONObject getConnectionInfo(NetworkInfo networkinfo)
    {
        Object obj1 = "none";
        Object obj = "";
        if (networkinfo != null)
        {
            if (!networkinfo.isConnected())
            {
                obj = "none";
            } else
            {
                obj = getType(networkinfo);
            }
            networkinfo = networkinfo.getExtraInfo();
            obj1 = obj;
            obj = networkinfo;
        }
        Log.d("CordovaNetworkManager", (new StringBuilder()).append("Connection Type: ").append(((String) (obj1))).toString());
        Log.d("CordovaNetworkManager", (new StringBuilder()).append("Connection Extra Info: ").append(((String) (obj))).toString());
        networkinfo = new JSONObject();
        try
        {
            networkinfo.put("type", obj1);
            networkinfo.put("extraInfo", obj);
        }
        catch (JSONException jsonexception)
        {
            return networkinfo;
        }
        return networkinfo;
    }

    private String getType(NetworkInfo networkinfo)
    {
        if (networkinfo != null)
        {
            String s = networkinfo.getTypeName();
            if (s.toLowerCase().equals("wifi"))
            {
                return "wifi";
            }
            if (s.toLowerCase().equals("mobile") || s.toLowerCase().equals("cellular"))
            {
                networkinfo = networkinfo.getSubtypeName();
                if (networkinfo.toLowerCase().equals("gsm") || networkinfo.toLowerCase().equals("gprs") || networkinfo.toLowerCase().equals("edge"))
                {
                    return "2g";
                }
                if (networkinfo.toLowerCase().startsWith("cdma") || networkinfo.toLowerCase().equals("umts") || networkinfo.toLowerCase().equals("1xrtt") || networkinfo.toLowerCase().equals("ehrpd") || networkinfo.toLowerCase().equals("hsupa") || networkinfo.toLowerCase().equals("hsdpa") || networkinfo.toLowerCase().equals("hspa"))
                {
                    return "3g";
                }
                if (networkinfo.toLowerCase().equals("lte") || networkinfo.toLowerCase().equals("umb") || networkinfo.toLowerCase().equals("hspa+"))
                {
                    return "4g";
                }
            }
        } else
        {
            return "none";
        }
        return "unknown";
    }

    private void sendUpdate(String s)
    {
        if (connectionCallbackContext != null)
        {
            PluginResult pluginresult = new PluginResult(org.apache.cordova.PluginResult.Status.OK, s);
            pluginresult.setKeepCallback(true);
            connectionCallbackContext.sendPluginResult(pluginresult);
        }
        webView.postMessage("networkconnection", s);
    }

    private void updateConnectionInfo(NetworkInfo networkinfo)
    {
        JSONObject jsonobject = getConnectionInfo(networkinfo);
        if (jsonobject.equals(lastInfo)) goto _L2; else goto _L1
_L1:
        networkinfo = "";
        String s = jsonobject.get("type").toString();
        networkinfo = s;
_L4:
        sendUpdate(networkinfo);
        lastInfo = jsonobject;
_L2:
        return;
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
    {
        if (!s.equals("getConnectionInfo")) goto _L2; else goto _L1
_L1:
        connectionCallbackContext = callbackcontext;
        jsonarray = sockMan.getActiveNetworkInfo();
        s = "";
        jsonarray = getConnectionInfo(jsonarray).get("type").toString();
        s = jsonarray;
_L4:
        s = new PluginResult(org.apache.cordova.PluginResult.Status.OK, s);
        s.setKeepCallback(true);
        callbackcontext.sendPluginResult(s);
        return true;
_L2:
        return false;
        jsonarray;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super.initialize(cordovainterface, cordovawebview);
        sockMan = (ConnectivityManager)cordovainterface.getActivity().getSystemService("connectivity");
        connectionCallbackContext = null;
        cordovainterface = new IntentFilter();
        cordovainterface.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (receiver == null)
        {
            receiver = new BroadcastReceiver() {

                final NetworkManager this$0;

                public void onReceive(Context context, Intent intent)
                {
                    if (webView != null)
                    {
                        updateConnectionInfo(sockMan.getActiveNetworkInfo());
                    }
                }

            
            {
                this$0 = NetworkManager.this;
                super();
            }
            };
            cordovawebview.getContext().registerReceiver(receiver, cordovainterface);
        }
    }

    public void onDestroy()
    {
        if (receiver == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        webView.getContext().unregisterReceiver(receiver);
        receiver = null;
        return;
        Object obj;
        obj;
        Log.e("NetworkManager", (new StringBuilder()).append("Error unregistering network receiver: ").append(((Exception) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        receiver = null;
        return;
        obj;
        receiver = null;
        throw obj;
    }

    static 
    {
        NOT_REACHABLE = 0;
        REACHABLE_VIA_CARRIER_DATA_NETWORK = 1;
        REACHABLE_VIA_WIFI_NETWORK = 2;
    }

}
