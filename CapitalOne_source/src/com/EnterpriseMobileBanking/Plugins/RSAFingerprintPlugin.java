// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;
import com.EnterpriseMobileBanking.Utils.Log;
import com.rsa.mobilesdk.sdk.MobileAPI;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RSAFingerprintPlugin extends Plugin
{

    private static final String TAG = "RSAFingerprintPlugin";
    private static final Properties rsaSDKConfig;

    public RSAFingerprintPlugin()
    {
    }

    private String getDeviceInformation()
    {
        JSONObject jsonobject = new JSONObject();
        String s1;
        TelephonyManager telephonymanager;
        Display display;
        SimpleDateFormat simpledateformat;
        WifiManager wifimanager;
        telephonymanager = (TelephonyManager)cordova.getContext().getSystemService("phone");
        wifimanager = (WifiManager)cordova.getContext().getSystemService("wifi");
        display = ((WindowManager)cordova.getContext().getSystemService("window")).getDefaultDisplay();
        simpledateformat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        s1 = BluetoothAdapter.getDefaultAdapter().getName();
        Log.d("RSAFingerprintPlugin", (new StringBuilder()).append("BluetoothAdapter deviceName = ").append(s1).toString());
        Log.d("RSAFingerprintPlugin", (new StringBuilder()).append("android.os.Build.DEVICE = ").append(Build.DEVICE).toString());
        jsonobject.put("DeviceSystemVersion", Integer.toString(android.os.Build.VERSION.SDK_INT));
        jsonobject.put("SDK_VERSION", "1.00.00");
        String s;
        s = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        s = Build.DEVICE;
        jsonobject.put("DeviceName", s);
        if (wifimanager.getConnectionInfo() != null)
        {
            break MISSING_BLOCK_LABEL_496;
        }
        s = "";
_L1:
        try
        {
            jsonobject.put("WiFiMacAddress", s);
            jsonobject.put("PhoneNumber", telephonymanager.getLine1Number());
            jsonobject.put("OS_ID", android.provider.Settings.Secure.getString(cordova.getActivity().getContentResolver(), "android_id"));
            jsonobject.put("MultitaskingSupported", "true");
            jsonobject.put("Languages", cordova.getContext().getResources().getConfiguration().locale.getLanguage());
            jsonobject.put("DeviceModel", Build.MODEL);
            jsonobject.put("DeviceSystemName", "Android");
            jsonobject.put("ScreenSize", (new StringBuilder()).append("").append(display.getWidth()).append("x").append(display.getHeight()).toString());
            jsonobject.put("SIM_ID", telephonymanager.getSubscriberId());
            jsonobject.put("TIMESTAMP", simpledateformat.format(new Date()));
            jsonobject.put("HardwareID", telephonymanager.getDeviceId());
            jsonobject.put("OperatorName", telephonymanager.getNetworkOperatorName());
            jsonobject.put("OperatorCode", telephonymanager.getNetworkOperator());
            jsonobject.put("OperatorISO", telephonymanager.getNetworkCountryIso());
            jsonobject.put("SimCountryCode", telephonymanager.getSimCountryIso());
            jsonobject.put("SimOperator", telephonymanager.getSimOperatorName());
            jsonobject.put("SimSerialNum", telephonymanager.getSimSerialNumber());
            jsonobject.put("SubscriberId", telephonymanager.getSubscriberId());
            Log.d("RSAFingerprintPlugin", (new StringBuilder()).append("My Result:  ").append(jsonobject.toString(0)).toString());
        }
        catch (JSONException jsonexception)
        {
            Log.e("RSAFingerprintPlugin", "A JSONException occurred while building the device information mappings.");
        }
        return jsonobject.toString();
        s = wifimanager.getConnectionInfo().getMacAddress();
          goto _L1
    }

    private void testDeviceInfoAgainstRSA(String s, String s1)
    {
        try
        {
            s = new JSONObject(s);
            s1 = new JSONObject(s1);
            Iterator iterator = s.keys();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s2 = (String)iterator.next();
                if (!s.getString(s2).equals(s1.getString(s2)))
                {
                    Log.e("RSAFingerprintPlugin", (new StringBuilder()).append("Non-matching key-value pair for myObj vs deviceObj for key ").append(s2).append(":  ").append(s.getString(s2)).append(" vs ").append(s1.getString(s2)).toString());
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        Log.d("RSAFingerprintPlugin", "execute");
        jsonarray = MobileAPI.getInstance(cordova.getActivity());
        String s2;
        String s3;
        String s4;
        String s5;
        Object obj;
        JSONObject jsonobject;
        try
        {
            jsonarray.initSDK(rsaSDKConfig);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            StringWriter stringwriter = new StringWriter();
            s1.printStackTrace(new PrintWriter(stringwriter));
            Log.w("RSAFingerprintPlugin", "RuntimeException thrown from com.rsa.mobilesdk.sdk.MobileAPI method initSDK(java.util.Properties).");
            Log.w("RSAFingerprintPlugin", stringwriter.toString());
            if (s1.getMessage().contains("Looper.prepare()"))
            {
                jsonarray.destroy();
                boolean flag = false;
                if (Looper.myLooper() == null)
                {
                    Log.w("RSAFingerprintPlugin", "Looper is null.  Preparing.");
                    Looper.prepare();
                    flag = true;
                    Log.w("RSAFingerprintPlugin", "Looper prepared");
                }
                jsonarray.initSDK(rsaSDKConfig);
                if (flag)
                {
                    Log.w("RSAFingerprintPlugin", "initSDK called successfully.  Looper quitting.");
                    Looper.myLooper().quit();
                    Log.w("RSAFingerprintPlugin", "Looper quit.");
                }
            } else
            {
                jsonarray.destroy();
                throw s1;
            }
        }
        s1 = jsonarray.collectInfo();
        Log.d("RSAFingerprintPlugin", (new StringBuilder()).append("Collected result: ").append(s1).toString());
        jsonarray.destroy();
        jsonarray = s1;
        if (!s.equals("extras"))
        {
            break MISSING_BLOCK_LABEL_237;
        }
        obj = (TelephonyManager)cordova.getContext().getSystemService("phone");
        s = ((TelephonyManager) (obj)).getNetworkOperatorName();
        jsonarray = ((TelephonyManager) (obj)).getNetworkOperator();
        s2 = ((TelephonyManager) (obj)).getNetworkCountryIso();
        s3 = ((TelephonyManager) (obj)).getSimCountryIso();
        s4 = ((TelephonyManager) (obj)).getSimOperatorName();
        s5 = ((TelephonyManager) (obj)).getSimSerialNumber();
        obj = ((TelephonyManager) (obj)).getSubscriberId();
        jsonobject = new JSONObject(s1);
        jsonobject.put("OperatorName", s);
        jsonobject.put("OperatorCode", jsonarray);
        jsonobject.put("OperatorISO", s2);
        jsonobject.put("SimCountryCode", s3);
        jsonobject.put("SimOperator", s4);
        if (s5 == null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        jsonobject.put("SimSerialNum", s5);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        jsonobject.put("SubscriberId", obj);
        jsonarray = jsonobject.toString();
_L2:
        return new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, jsonarray);
        s;
        s.printStackTrace();
        jsonarray = s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        rsaSDKConfig = new Properties();
        rsaSDKConfig.setProperty("Configuration-key", "1");
        rsaSDKConfig.setProperty("Add-timestamp-key", "1");
    }
}
