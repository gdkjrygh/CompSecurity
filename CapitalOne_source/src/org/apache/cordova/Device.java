// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.TimeZone;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.LOG;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView

public class Device extends CordovaPlugin
{

    public static final String TAG = "Device";
    public static String cordovaVersion = "2.3.0";
    public static String platform = "Android";
    public static String uuid;
    BroadcastReceiver telephonyReceiver;

    public Device()
    {
        telephonyReceiver = null;
    }

    private void initTelephonyReceiver()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.PHONE_STATE");
        telephonyReceiver = new BroadcastReceiver() {

            final Device this$0;

            public void onReceive(Context context, Intent intent)
            {
                if (intent != null && intent.getAction().equals("android.intent.action.PHONE_STATE") && intent.hasExtra("state"))
                {
                    context = intent.getStringExtra("state");
                    if (context.equals(TelephonyManager.EXTRA_STATE_RINGING))
                    {
                        LOG.i("Device", "Telephone RINGING");
                        webView.postMessage("telephone", "ringing");
                    } else
                    {
                        if (context.equals(TelephonyManager.EXTRA_STATE_OFFHOOK))
                        {
                            LOG.i("Device", "Telephone OFFHOOK");
                            webView.postMessage("telephone", "offhook");
                            return;
                        }
                        if (context.equals(TelephonyManager.EXTRA_STATE_IDLE))
                        {
                            LOG.i("Device", "Telephone IDLE");
                            webView.postMessage("telephone", "idle");
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = Device.this;
                super();
            }
        };
        cordova.getActivity().registerReceiver(telephonyReceiver, intentfilter);
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        if (s.equals("getDeviceInfo"))
        {
            s = new JSONObject();
            s.put("uuid", uuid);
            s.put("version", getOSVersion());
            s.put("platform", platform);
            s.put("name", getProductName());
            s.put("cordova", cordovaVersion);
            s.put("model", getModel());
            callbackcontext.success(s);
            return true;
        } else
        {
            return false;
        }
    }

    public String getCordovaVersion()
    {
        return cordovaVersion;
    }

    public String getModel()
    {
        return Build.MODEL;
    }

    public String getOSVersion()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public String getPlatform()
    {
        return platform;
    }

    public String getProductName()
    {
        return Build.PRODUCT;
    }

    public String getSDKVersion()
    {
        return android.os.Build.VERSION.SDK;
    }

    public String getTimeZoneID()
    {
        return TimeZone.getDefault().getID();
    }

    public String getUuid()
    {
        return android.provider.Settings.Secure.getString(cordova.getActivity().getContentResolver(), "android_id");
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super.initialize(cordovainterface, cordovawebview);
        uuid = getUuid();
        initTelephonyReceiver();
    }

    public void onDestroy()
    {
        cordova.getActivity().unregisterReceiver(telephonyReceiver);
    }

}
