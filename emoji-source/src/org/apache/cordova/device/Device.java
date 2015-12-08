// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.device;

import android.app.Activity;
import android.os.Build;
import java.util.TimeZone;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Device extends CordovaPlugin
{

    private static final String AMAZON_DEVICE = "Amazon";
    private static final String AMAZON_PLATFORM = "amazon-fireos";
    private static final String ANDROID_PLATFORM = "Android";
    public static final String TAG = "Device";
    public static String platform;
    public static String uuid;

    public Device()
    {
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        if (s.equals("getDeviceInfo"))
        {
            s = new JSONObject();
            s.put("uuid", uuid);
            s.put("version", getOSVersion());
            s.put("platform", getPlatform());
            s.put("model", getModel());
            callbackcontext.success(s);
            return true;
        } else
        {
            return false;
        }
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
        if (isAmazonDevice())
        {
            return "amazon-fireos";
        } else
        {
            return "Android";
        }
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
    }

    public boolean isAmazonDevice()
    {
        return Build.MANUFACTURER.equals("Amazon");
    }
}
