// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.localytics.android:
//            ReflectionUtils, Constants

final class DatapointHelper
{

    private static final Object HARDWARE_TELEPHONY[] = {
        "android.hardware.telephony"
    };
    private static final Object HARDWARE_WIFI[] = {
        "android.hardware.wifi"
    };
    private static final String INVALID_ANDROID_ID = "9774d56d682e549c";
    private static final String LEGACY_DEVICE_ID_FILE = "/localytics/device_id";
    private static final Class STRING_CLASS_ARRAY[] = {
        java/lang/String
    };

    private DatapointHelper()
    {
        throw new UnsupportedOperationException("This class is non-instantiable");
    }

    public static String getAdvertisingIdOrNull(Context context)
    {
        Object obj = null;
        Object obj1 = ReflectionUtils.tryInvokeStatic("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] {
            android/content/Context
        }, new Object[] {
            context
        });
        context = obj;
        if (obj1 != null)
        {
            try
            {
                context = (String)ReflectionUtils.tryInvokeInstance(obj1, "getId", null, null);
            }
            catch (Exception exception)
            {
                context = obj;
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", "Localytics library can't get the advertising id", exception);
                    return null;
                }
            }
        }
        return context;
    }

    public static String getAndroidIdHashOrNull(Context context)
    {
        context = getAndroidIdOrNull(context);
        if (context == null)
        {
            return null;
        } else
        {
            return getSha256_buggy(context);
        }
    }

    public static String getAndroidIdOrNull(Context context)
    {
        File file = new File((new StringBuilder()).append(context.getFilesDir()).append("/localytics/device_id").toString());
        if (!file.exists() || file.length() <= 0L) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        obj = obj1;
        char ac[] = new char[100];
        obj = obj1;
        obj1 = new BufferedReader(new FileReader(file), 128);
        obj = String.copyValueOf(ac, 0, ((BufferedReader) (obj1)).read(ac));
        ((BufferedReader) (obj1)).close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        ((BufferedReader) (obj1)).close();
        return ((String) (obj));
        obj;
        obj1 = obj2;
        obj2 = obj;
_L7:
        obj = obj1;
        if (!Constants.IS_LOGGABLE)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        obj = obj1;
        Log.w("Localytics", "Caught exception", ((Throwable) (obj2)));
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        ((BufferedReader) (obj1)).close();
_L2:
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (context == null || context.toLowerCase().equals("9774d56d682e549c"))
        {
            return null;
        } else
        {
            return context;
        }
        obj1;
_L5:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        ((BufferedReader) (obj)).close();
        throw obj1;
        obj;
_L4:
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "Caught exception", ((Throwable) (obj)));
        }
          goto _L2
        obj;
          goto _L4
        obj2;
        obj = obj1;
        obj1 = obj2;
          goto _L5
        obj2;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static int getApiLevel()
    {
        int i;
        try
        {
            i = Integer.parseInt((String)android/os/Build$VERSION.getField("SDK").get(null));
        }
        catch (Exception exception)
        {
            Log.w("Localytics", "Caught exception", exception);
            int j;
            try
            {
                j = android/os/Build$VERSION.getField("SDK_INT").getInt(null);
            }
            catch (Exception exception1)
            {
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", "Caught exception", exception1);
                }
                return 3;
            }
            return j;
        }
        return i;
    }

    public static String getAppVersion(Context context)
    {
        Object obj = context.getPackageManager();
        try
        {
            obj = ((PackageManager) (obj)).getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException(context);
        }
        context = ((Context) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "versionName was null--is a versionName attribute set in the Android Manifest?");
        }
        context = "unknown";
        return context;
    }

    public static String getFBAttribution(Context context)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        obj3 = null;
        obj4 = null;
        obj1 = context.getContentResolver();
        obj2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
        obj = null;
        context = null;
        obj2 = ((ContentResolver) (obj1)).query(((Uri) (obj2)), new String[] {
            "aid"
        }, null, null, null);
        obj1 = obj4;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        obj1 = obj4;
        context = ((Context) (obj2));
        obj = obj2;
        if (!((Cursor) (obj2)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_81;
        }
        context = ((Context) (obj2));
        obj = obj2;
        obj1 = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("aid"));
        obj = obj1;
        if (obj2 != null)
        {
            ((Cursor) (obj2)).close();
            obj = obj1;
        }
_L2:
        return ((String) (obj));
        Exception exception;
        exception;
        obj = context;
        if (!Constants.IS_LOGGABLE)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj = context;
        Log.w("Localytics", "Error reading FB attribution", exception);
        obj = obj3;
        if (context == null) goto _L2; else goto _L1
_L1:
        context.close();
        return null;
        context;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw context;
    }

    public static String getLocalyticsAppKeyOrNull(Context context)
    {
        Object obj = null;
        Object obj1;
        try
        {
            obj1 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("LOCALYTICS_APP_KEY");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException(context);
        }
        context = obj;
        if (obj1 instanceof String)
        {
            context = (String)obj1;
        }
        return context;
    }

    public static int getLocalyticsNotificationIcon(Context context)
    {
        Object obj;
        obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        if (((ApplicationInfo) (obj)).metaData == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        obj = (String)((ApplicationInfo) (obj)).metaData.get("LOCALYTICS_NOTIFICATION_ICON");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        obj = ((String) (obj)).substring(((String) (obj)).lastIndexOf('/') + 1, ((String) (obj)).lastIndexOf('.'));
        return context.getResources().getIdentifier(((String) (obj)), "drawable", context.getPackageName());
        int i;
        context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        if (((ApplicationInfo) (context)).icon == 0)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        i = ((ApplicationInfo) (context)).icon;
        return i;
        context;
        return 0x1080093;
    }

    public static String getLocalyticsRollupKeyOrNull(Context context)
    {
        Object obj = null;
        Object obj1;
        try
        {
            obj1 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException(context);
        }
        context = obj;
        if (((ApplicationInfo) (obj1)).metaData == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj1 = (String)((ApplicationInfo) (obj1)).metaData.get("LOCALYTICS_ROLLUP_KEY");
        context = obj;
        if (obj1 instanceof String)
        {
            context = (String)obj1;
        }
        return context;
    }

    public static String getManufacturer()
    {
        String s1 = "unknown";
        String s = s1;
        if (Constants.CURRENT_API_LEVEL > 3)
        {
            try
            {
                s = (String)android/os/Build.getField("MANUFACTURER").get(null);
            }
            catch (Exception exception)
            {
                s = s1;
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", "Caught exception", exception);
                    return "unknown";
                }
            }
        }
        return s;
    }

    public static String getNetworkType(Context context, TelephonyManager telephonymanager)
    {
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", context.getPackageName()) != 0)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(1);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        if (context.isConnectedOrConnecting())
        {
            return "wifi";
        }
        break MISSING_BLOCK_LABEL_62;
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "Application does not have one more more of the following permissions: ACCESS_WIFI_STATE. Determining Wi-Fi connectivity is unavailable");
        }
_L2:
        return (new StringBuilder()).append("android_network_type_").append(telephonymanager.getNetworkType()).toString();
        context;
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "Application does not have the permission ACCESS_NETWORK_STATE. Determining Wi-Fi connectivity is unavailable", context);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String getSerialNumberHashOrNull()
    {
        Object obj = null;
        if (Constants.CURRENT_API_LEVEL >= 9)
        {
            try
            {
                obj = (String)android/os/Build.getField("SERIAL").get(null);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException(((Throwable) (obj)));
            }
        }
        if (obj == null)
        {
            return null;
        } else
        {
            return getSha256_buggy(((String) (obj)));
        }
    }

    static String getSha256_buggy(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("string cannot be null");
        }
        try
        {
            s = (new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(s.getBytes("UTF-8")))).toString(16);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static String getTelephonyDeviceIdOrNull(Context context)
    {
        if (Constants.CURRENT_API_LEVEL >= 7 && !((Boolean)ReflectionUtils.tryInvokeInstance(context.getPackageManager(), "hasSystemFeature", STRING_CLASS_ARRAY, HARDWARE_TELEPHONY)).booleanValue())
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.i("Localytics", "Device does not have telephony; cannot read telephony id");
            }
        } else
        {
            if (context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0)
            {
                return ((TelephonyManager)context.getSystemService("phone")).getDeviceId();
            }
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "Application does not have permission READ_PHONE_STATE; determining device id is not possible.  Please consider requesting READ_PHONE_STATE in the AndroidManifest");
                return null;
            }
        }
        return null;
    }

}
