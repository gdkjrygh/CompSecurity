// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView

public class NetworkManager extends CordovaPlugin
{

    public static final String CDMA = "cdma";
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
    private String lastStatus;
    BroadcastReceiver receiver;
    private boolean registered;
    ConnectivityManager sockMan;

    public NetworkManager()
    {
        registered = false;
        lastStatus = "";
        receiver = null;
    }

    private String getConnectionInfo(NetworkInfo networkinfo)
    {
        String s = "none";
        if (networkinfo != null)
        {
            if (!networkinfo.isConnected())
            {
                s = "none";
            } else
            {
                s = getType(networkinfo);
            }
        }
        Log.d("CordovaNetworkManager", (new StringBuilder()).append("Connection Type: ").append(s).toString());
        return s;
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
            if (s.toLowerCase().equals("mobile"))
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
            PluginResult pluginresult = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, s);
            pluginresult.setKeepCallback(true);
            connectionCallbackContext.sendPluginResult(pluginresult);
        }
        webView.postMessage("networkconnection", s);
    }

    private void updateConnectionInfo(NetworkInfo networkinfo)
    {
        networkinfo = getConnectionInfo(networkinfo);
        if (!networkinfo.equals(lastStatus))
        {
            sendUpdate(networkinfo);
            lastStatus = networkinfo;
        }
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
    {
        if (s.equals("getConnectionInfo"))
        {
            connectionCallbackContext = callbackcontext;
            s = sockMan.getActiveNetworkInfo();
            s = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, getConnectionInfo(s));
            s.setKeepCallback(true);
            callbackcontext.sendPluginResult(s);
            return true;
        } else
        {
            return false;
        }
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super.initialize(cordovainterface, cordovawebview);
        sockMan = (ConnectivityManager)cordovainterface.getActivity().getSystemService("connectivity");
        connectionCallbackContext = null;
        cordovawebview = new IntentFilter();
        cordovawebview.addAction("android.net.conn.CONNECTIVITY_CHANGE");
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
            cordovainterface.getActivity().registerReceiver(receiver, cordovawebview);
            registered = true;
        }
    }

    public void onDestroy()
    {
        if (receiver == null || !registered)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        cordova.getActivity().unregisterReceiver(receiver);
        registered = false;
        return;
        Exception exception;
        exception;
        Log.e("NetworkManager", (new StringBuilder()).append("Error unregistering network receiver: ").append(exception.getMessage()).toString(), exception);
        return;
    }

    static 
    {
        NOT_REACHABLE = 0;
        REACHABLE_VIA_CARRIER_DATA_NETWORK = 1;
        REACHABLE_VIA_WIFI_NETWORK = 2;
    }

}
