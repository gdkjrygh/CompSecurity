// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.apptentive.android.sdk.GlobalInfo;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.CustomData;
import com.apptentive.android.sdk.model.Device;
import com.apptentive.android.sdk.util.Constants;
import com.apptentive.android.sdk.util.JsonDiffer;
import com.apptentive.android.sdk.util.Reflection;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;

public class DeviceManager
{

    public DeviceManager()
    {
    }

    private static Device generateNewDevice(Context context)
    {
        Device device = new Device();
        device.setOsName("Android");
        device.setOsVersion(android.os.Build.VERSION.RELEASE);
        device.setOsBuild(android.os.Build.VERSION.INCREMENTAL);
        device.setOsApiLevel(String.valueOf(android.os.Build.VERSION.SDK_INT));
        device.setManufacturer(Build.MANUFACTURER);
        device.setModel(Build.MODEL);
        device.setBoard(Build.BOARD);
        device.setProduct(Build.PRODUCT);
        device.setBrand(Build.BRAND);
        device.setCpu(Build.CPU_ABI);
        device.setDevice(Build.DEVICE);
        device.setUuid(GlobalInfo.androidId);
        device.setBuildType(Build.TYPE);
        device.setBuildId(Build.ID);
        context = (TelephonyManager)(TelephonyManager)context.getSystemService("phone");
        device.setCarrier(context.getSimOperatorName());
        device.setCurrentCarrier(context.getNetworkOperatorName());
        device.setNetworkType(Constants.networkTypeAsString(context.getNetworkType()));
        device.setBootloaderVersion(Reflection.getBootloaderVersion());
        device.setRadioVersion(Reflection.getRadioVersion());
        device.setLocaleCountryCode(Locale.getDefault().getCountry());
        device.setLocaleLanguageCode(Locale.getDefault().getLanguage());
        device.setLocaleRaw(Locale.getDefault().toString());
        device.setUtcOffset(String.valueOf(TimeZone.getDefault().getRawOffset() / 1000));
        return device;
    }

    public static Device getStoredDevice(Context context)
    {
        context = context.getSharedPreferences("APPTENTIVE", 0).getString("device", null);
        try
        {
            context = new Device(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static CustomData loadCustomDeviceData(Context context)
    {
        context = context.getSharedPreferences("APPTENTIVE", 0).getString("deviceData", null);
        try
        {
            context = new CustomData(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                context = new CustomData();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return null;
            }
            return context;
        }
        return context;
    }

    public static CustomData loadIntegrationConfig(Context context)
    {
        context = context.getSharedPreferences("APPTENTIVE", 0).getString("integrationConfig", null);
        try
        {
            context = new CustomData(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                context = new CustomData();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return null;
            }
            return context;
        }
        return context;
    }

    public static void onSentDeviceInfo(Context context)
    {
    }

    public static void storeCustomDeviceData(Context context, CustomData customdata)
    {
        context = context.getSharedPreferences("APPTENTIVE", 0);
        customdata = customdata.toString();
        context.edit().putString("deviceData", customdata).commit();
    }

    private static void storeDevice(Context context, Device device)
    {
        context.getSharedPreferences("APPTENTIVE", 0).edit().putString("device", device.toString()).commit();
    }

    public static Device storeDeviceAndReturnDiff(Context context)
    {
        Device device;
        Object obj;
        obj = getStoredDevice(context);
        device = generateNewDevice(context);
        device.setCustomData(loadCustomDeviceData(context));
        device.setIntegrationConfig(loadIntegrationConfig(context));
        obj = JsonDiffer.getDiff(((org.json.JSONObject) (obj)), device);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        storeDevice(context, device);
        context = new Device(obj.toString());
        return context;
        context;
        Log.e("Error casting to Device.", context, new Object[0]);
        return null;
    }

    public static Device storeDeviceAndReturnIt(Context context)
    {
        Device device = generateNewDevice(context);
        device.setCustomData(loadCustomDeviceData(context));
        device.setIntegrationConfig(loadIntegrationConfig(context));
        storeDevice(context, device);
        return device;
    }

    public static void storeIntegrationConfig(Context context, CustomData customdata)
    {
        context = context.getSharedPreferences("APPTENTIVE", 0);
        customdata = customdata.toString();
        context.edit().putString("integrationConfig", customdata).commit();
    }
}
