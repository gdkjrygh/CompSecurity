// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.worklight.common.Logger;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WifiPlugin extends CordovaPlugin
{
    static final class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action ACQUIRE_WIFI;

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/worklight/androidgap/plugin/WifiPlugin$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        static 
        {
            ACQUIRE_WIFI = new Action("ACQUIRE_WIFI", 0);
            $VALUES = (new Action[] {
                ACQUIRE_WIFI
            });
        }

        private Action(String s, int i)
        {
            super(s, i);
        }
    }

    private class WifiConnection
    {

        private String MAC;
        private String SSID;
        final WifiPlugin this$0;

        public String getMAC()
        {
            return MAC;
        }

        public String getSSID()
        {
            return SSID;
        }

        public WifiConnection(String s, String s1)
        {
            this$0 = WifiPlugin.this;
            super();
            SSID = null;
            MAC = null;
            SSID = s;
            MAC = s1;
        }
    }


    private static final String MACArray[] = {
        "egg", "bar", "least"
    };
    private static final String SSIDArray[] = {
        "foo", "spam", "last"
    };
    public static final String TAG = "Wifi";
    private static final Logger logger = Logger.getInstance(com/worklight/androidgap/plugin/WifiPlugin.getName());
    private static final Random randomGenerator = new Random();
    private Context ctx;
    WifiManager wifiManager;

    public WifiPlugin()
    {
    }

    private static ScanResult createScanResult(String s, String s1, int i)
    {
        Object obj;
        try
        {
            obj = android/net/wifi/ScanResult.getDeclaredConstructors()[0];
            ((Constructor) (obj)).setAccessible(true);
            obj = (ScanResult)((Constructor) (obj)).newInstance(new Object[] {
                "foo", "bar", "", Integer.valueOf(10), Integer.valueOf(-10)
            });
            obj.SSID = s;
            obj.BSSID = s1;
            obj.level = i;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return ((ScanResult) (obj));
    }

    private WifiConnection getCurrentSsid(Context context)
    {
        Object obj1 = null;
        Object obj2 = null;
        String s = obj2;
        Object obj = obj1;
        if (((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(1).isConnected())
        {
            WifiInfo wifiinfo = wifiManager.getConnectionInfo();
            s = obj2;
            obj = obj1;
            if (wifiinfo != null)
            {
                s = obj2;
                obj = obj1;
                if (!wifiinfo.getSSID().equals(""))
                {
                    obj = wifiinfo.getSSID();
                    context = ((Context) (obj));
                    if (((String) (obj)).indexOf("\"") == 0)
                    {
                        context = ((String) (obj)).substring(1, ((String) (obj)).length() - 1);
                    }
                    s = wifiinfo.getBSSID();
                    obj = context;
                }
            }
        }
        return new WifiConnection(((String) (obj)), s);
    }

    private static int getStrength(ScanResult scanresult)
    {
        int i = 100;
        if (isEmulator())
        {
            i = scanresult.level;
        } else
        {
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                return WifiManager.calculateSignalLevel(scanresult.level, 101);
            }
            if (scanresult.level <= -100)
            {
                return 0;
            }
            if (scanresult.level < -55)
            {
                float f = 45;
                float f1 = 100;
                return (int)(((float)(scanresult.level + 100) * f1) / f);
            }
        }
        return i;
    }

    private static boolean isEmulator()
    {
        return Build.PRODUCT.equals("sdk_x86") || Build.PRODUCT.equals("google_sdk") || Build.PRODUCT.equals("sdk");
    }

    private JSONArray resultToJSONArray(Iterable iterable)
    {
        Object obj = getCurrentSsid(ctx);
        String s = ((WifiConnection) (obj)).getSSID();
        obj = ((WifiConnection) (obj)).getMAC();
        JSONArray jsonarray = new JSONArray();
        try
        {
            JSONObject jsonobject;
            for (iterable = iterable.iterator(); iterable.hasNext(); jsonarray.put(jsonobject))
            {
                ScanResult scanresult = (ScanResult)iterable.next();
                jsonobject = new JSONObject();
                jsonobject.put("MAC", scanresult.BSSID);
                jsonobject.put("SSID", scanresult.SSID);
                jsonobject.put("strength", getStrength(scanresult));
                if (scanresult.SSID.equals(s) && scanresult.BSSID.equals(obj))
                {
                    jsonobject.put("connected", true);
                }
            }

        }
        // Misplaced declaration of an exception variable
        catch (Iterable iterable)
        {
            throw new AssertionError(iterable);
        }
        return jsonarray;
    }

    private void scanWifi(final CallbackContext callbackContext)
    {
        ctx.registerReceiver(new BroadcastReceiver() {

            final WifiPlugin this$0;
            final CallbackContext val$callbackContext;

            public void onReceive(Context context, Intent intent)
            {
                ctx.unregisterReceiver(this);
                if (!WifiPlugin.isEmulator()) goto _L2; else goto _L1
_L1:
                intent = new LinkedList();
                int i = 0;
_L4:
                context = intent;
                if (i >= 6)
                {
                    break; /* Loop/switch isn't completed */
                }
                String s;
                int j;
                try
                {
                    j = WifiPlugin.randomGenerator.nextInt(3);
                    context = WifiPlugin.SSIDArray[j];
                    j = WifiPlugin.randomGenerator.nextInt(3);
                    s = WifiPlugin.MACArray[j];
                    j = WifiPlugin.randomGenerator.nextInt(3);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    WifiPlugin.logger.error((new StringBuilder()).append("WifiPlugin : Error getting scan results : ").append(context.getMessage()).toString());
                    callbackContext.error(0);
                    return;
                }
                if (j != 0)
                {
                    j *= 10;
                } else
                {
                    j = 30;
                }
                intent.add(WifiPlugin.createScanResult(context, s, j));
                i++;
                if (true) goto _L4; else goto _L3
_L2:
                context = wifiManager.getScanResults();
_L3:
                context = resultToJSONArray(context);
                callbackContext.success(context);
                return;
            }

            
            {
                this$0 = WifiPlugin.this;
                callbackContext = callbackcontext;
                super();
            }
        }, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
        if (!isEmulator()) goto _L2; else goto _L1
_L1:
        callbackContext = new Intent("android.net.wifi.SCAN_RESULTS");
        ctx.sendBroadcast(callbackContext);
_L4:
        return;
_L2:
        if (!wifiManager.isWifiEnabled())
        {
            logger.error("failed to start wifi scan, wifi is disabled");
            callbackContext.error(1);
            return;
        }
        if (wifiManager.startScan()) goto _L4; else goto _L3
_L3:
        logger.error("failed to start wifi scan");
        callbackContext.error(2);
        return;
        Exception exception;
        exception;
        logger.error((new StringBuilder()).append("WifiPlugin : Error initiating scan, reason : ").append(exception.getMessage()).toString());
        callbackContext.error(0);
        return;
    }

    private static String toAllCaps(String s)
    {
        s = Pattern.compile("[A-Z]?[a-z]*").matcher(s);
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            if (!s.find())
            {
                break;
            }
            stringbuilder.append(s.group());
            if (!s.hitEnd())
            {
                stringbuilder.append("_");
            }
        } while (true);
        return stringbuilder.toString().toUpperCase();
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        ctx = cordova.getActivity();
        wifiManager = (WifiManager)ctx.getSystemService("wifi");
        s = Action.valueOf(toAllCaps(s));
        logger.debug((new StringBuilder()).append("WifiPlugin called with action: ").append(s).toString());
        static class _cls2
        {

            static final int $SwitchMap$com$worklight$androidgap$plugin$WifiPlugin$Action[];

            static 
            {
                $SwitchMap$com$worklight$androidgap$plugin$WifiPlugin$Action = new int[Action.values().length];
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WifiPlugin$Action[Action.ACQUIRE_WIFI.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls2..SwitchMap.com.worklight.androidgap.plugin.WifiPlugin.Action[s.ordinal()];
        JVM INSTR tableswitch 1 1: default 131
    //                   1 92;
           goto _L1 _L2
_L2:
        scanWifi(callbackcontext);
        return true;
        s;
        logger.error((new StringBuilder()).append("Error initializing WIFI scanning, reason: ").append(s.getMessage()).toString());
        return false;
_L1:
        return false;
    }









}
