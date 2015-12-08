// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.repository;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.netflix.mediaclient.Log;

public final class SecurityRepository
{

    private static final String BOOTLOADER_PARAMETER_CERTIFICATION_VERSION = "certification_version";
    private static final String BOOTLOADER_PARAMETER_DEVICE_CATEGORY = "device_cat";
    private static final String BOOTLOADER_PARAMETER_DEVICE_TYPE = "device_type";
    private static final String BOOTLOADER_PARAMETER_FULL_ESN = "e";
    private static final String BOOTLOADER_PARAMETER_OS = "os";
    private static final String BOOTLOADER_PARAMETER_SDK_VERSION = "sdk_version";
    private static final String BOOTLOADER_PARAMETER_SOFTWARE_VERSION = "sw_version";
    private static final String BOOTLOADER_PARAMETER_WEB_API_VERSION = "v";
    private static final String BOOTLOADER_URL = "https://www.netflix.com/applanding/android";
    private static final String BOOTLOADER_WEB_API_VERSION = "2.0";
    private static final int CONSTANT_CRITTERCISM_APP_ID = 2;
    private static final int CONSTANT_DEVICE_ID_TOKEN = 1;
    private static final int CONSTANT_FACEBOOK_ID = 0;
    private static final String ESN_DELIM = "-";
    private static final String MDXJS_VERSION_VALUE = "1.1.6-android";
    private static final String MDXLIB_VERSION_VALUE = "2013.3";
    private static final String MODEL_DELIM = "_";
    public static final String NCCP_VERSION = "NCCP/2.15";
    private static final String NRDAPP_VERSION_VALUE = "2013.2";
    private static final String NRDLIB_VERSION_VALUE = "2013.2";
    private static final String NRD_SDK_VERSION_VALUE = "4.1";
    public static final String SENDER_ID = "484286080282";
    private static final String TAG = "SEC";
    private static String crittercismAppId;
    private static String deviceIdToken;
    private static String esnPrefix;
    private static String facebookId;
    private static boolean sLoaded;

    private SecurityRepository()
    {
    }

    public static String getBootloaderParameterCertificationVersion()
    {
        return "certification_version";
    }

    public static String getBootloaderParameterDeviceCategory()
    {
        return "device_cat";
    }

    public static String getBootloaderParameterDeviceType()
    {
        return "device_type";
    }

    public static String getBootloaderParameterFullEsn()
    {
        return "e";
    }

    public static String getBootloaderParameterOs()
    {
        return "os";
    }

    public static String getBootloaderParameterSdkVersion()
    {
        return "sdk_version";
    }

    public static String getBootloaderParameterSoftwareVersion()
    {
        return "sw_version";
    }

    public static String getBootloaderParameterWebApiVersion()
    {
        return "v";
    }

    public static String getBootloaderUrl()
    {
        return "https://www.netflix.com/applanding/android";
    }

    public static String getBootloaderWebApiVersion()
    {
        return "2.0";
    }

    public static String getCrittercismAppId()
    {
        return crittercismAppId;
    }

    public static String getDeviceIdToken()
    {
        return deviceIdToken;
    }

    public static String getEsnDelim()
    {
        return "-";
    }

    public static String getEsnPrefix()
    {
        return esnPrefix;
    }

    public static String getFacebookId()
    {
        return facebookId;
    }

    public static final int getLibraryVersion()
    {
        return native_getLibraryVersion();
    }

    public static String getMdxJsVersion()
    {
        return "1.1.6-android";
    }

    public static String getMdxLibVersion()
    {
        return "2013.3";
    }

    public static String getModelDelim()
    {
        return "_";
    }

    private static String getNativeLibraryDirectory(Context context)
    {
        context = context.getApplicationInfo();
        if ((((ApplicationInfo) (context)).flags & 0x80) != 0 || (((ApplicationInfo) (context)).flags & 1) == 0)
        {
            return ((ApplicationInfo) (context)).nativeLibraryDir;
        } else
        {
            return null;
        }
    }

    public static String getNrdAppVersion()
    {
        return "2013.2";
    }

    public static String getNrdLibVersion()
    {
        return "2013.2";
    }

    public static String getNrdSdkVersion()
    {
        return "4.1";
    }

    public static boolean isLoaded()
    {
        return sLoaded;
    }

    public static boolean loadLibraries(Context context)
    {
        boolean flag = true;
        com/netflix/mediaclient/repository/SecurityRepository;
        JVM INSTR monitorenter ;
        if (!sLoaded) goto _L2; else goto _L1
_L1:
        Log.w("SEC", "We already loaded native libraries!");
_L8:
        com/netflix/mediaclient/repository/SecurityRepository;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        context = getNativeLibraryDirectory(context);
        if (context == null) goto _L4; else goto _L3
_L3:
        Log.d("SEC", "Loading library from app file system. Installed or updated app.");
        context = (new StringBuilder()).append(context).append("/libnetflixmp_jni.so").toString();
        if (Log.isLoggable("SEC", 3))
        {
            Log.d("SEC", (new StringBuilder()).append("Loading from ").append(context).toString());
        }
        System.load(context);
_L5:
        sLoaded = true;
_L6:
        if (sLoaded)
        {
            native_init(new byte[0]);
            deviceIdToken = native_getConstant(1);
            facebookId = native_getConstant(0);
            crittercismAppId = native_getConstant(2);
        }
        flag = sLoaded;
        continue; /* Loop/switch isn't completed */
_L4:
        Log.d("SEC", "Loading library leaving to android to find mapping. Preloaded app.");
        System.loadLibrary("netflixmp_jni");
          goto _L5
        context;
        Log.e("SEC", "Failed to load library from assumed location", context);
          goto _L6
        context;
        throw context;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static final native String native_getConstant(int i);

    private static final native int native_getLibraryVersion();

    private static final native void native_init(byte abyte0[]);
}
