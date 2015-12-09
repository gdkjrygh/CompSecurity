// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.service;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import com.ibm.eo.EOCore;
import com.ibm.eo.EOLifecycleObject;
import com.ibm.eo.model.AndroidArray;
import com.ibm.eo.model.ClientEnvironment;
import com.ibm.eo.model.KeyboardStateType;
import com.ibm.eo.model.KeyboardType;
import com.ibm.eo.model.MobileEnvironment;
import com.ibm.eo.model.OrientationType;
import com.ibm.eo.model.StorageType;
import com.ibm.eo.util.BatteryReceiver;
import com.ibm.eo.util.ConnectionReceiver;
import com.ibm.eo.util.LogInternal;
import com.ibm.eo.util.ScreenReceiver;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;

public class EnvironmentalDataService
    implements EOLifecycleObject
{

    private static final int IP_BIT_16 = 16;
    private static final int IP_BIT_24 = 24;
    private static final int IP_BIT_8 = 8;
    private static final int SET_BITS_TO_CHAR = 255;
    private static final String TEALEAF_DEVICE_ID = "TEALEAF_DEVICE_ID";
    private Boolean _isEnabled;
    private String applicationName;
    private String applicationPackageName;
    private String applicationVersion;
    private BatteryReceiver batteryReceiver;
    private ConnectionReceiver connectionReceiver;
    private int lastHeight;
    private int lastWidth;
    private ScreenReceiver screenReceiver;

    public EnvironmentalDataService()
    {
        lastWidth = 0;
        lastHeight = 0;
        _isEnabled = Boolean.valueOf(false);
    }

    private Application getApplication()
    {
        return EOCore.getApplication();
    }

    private Boolean isNotApplicationContextNull()
    {
        if (getApplication() != null && getApplication().getApplicationContext() != null)
        {
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    private Boolean isNotApplicationResourcesNull()
    {
        if (getApplication() != null && getApplication().getResources() != null)
        {
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public final ClientEnvironment createClientEnvironment()
    {
        ClientEnvironment clientenvironment = new ClientEnvironment();
        clientenvironment.setOsVersion(android.os.Build.VERSION.RELEASE);
        if (screenReceiver == null)
        {
            hasClientStateChanged();
        }
        clientenvironment.setHeight(getScreenReceiver().getHeight());
        lastHeight = getScreenReceiver().getHeight();
        clientenvironment.setWidth(getScreenReceiver().getWidth());
        lastWidth = getScreenReceiver().getWidth();
        clientenvironment.setDeviceHeight(getScreenReceiver().getDeviceHeight());
        clientenvironment.setDeviceWidth(getScreenReceiver().getDeviceWidth());
        clientenvironment.setPixelDensity(getScreenReceiver().getPixelDensity());
        MobileEnvironment mobileenvironment = new MobileEnvironment();
        mobileenvironment.setTotalStorage(getStorage(StorageType.PHONE_TOTAL));
        mobileenvironment.setTotalMemory(getAvailableMemory());
        mobileenvironment.setLocale(Locale.getDefault().getDisplayName());
        mobileenvironment.setLanguage(Locale.getDefault().getDisplayLanguage());
        mobileenvironment.setManufacturer(getManufacturer());
        mobileenvironment.setDeviceModel(getModel());
        mobileenvironment.setAppName(getApplicationName());
        mobileenvironment.setAppVersion(getApplicationVersion());
        mobileenvironment.setDeviceId(getDeviceId());
        mobileenvironment.setOrientationType(getOrientationType());
        AndroidArray androidarray = new AndroidArray();
        androidarray.setBrand(Build.BRAND);
        androidarray.setFingerPrint(Build.FINGERPRINT);
        androidarray.setKeyboardType(getKeyboardType());
        mobileenvironment.setAndroidArray(androidarray);
        clientenvironment.setMobileEnvironment(mobileenvironment);
        return clientenvironment;
    }

    public final boolean disable()
    {
        disableBatteryManager();
        disableConnectionListener();
        disableScreenReceiver();
        applicationName = null;
        applicationVersion = null;
        applicationPackageName = null;
        _isEnabled = Boolean.valueOf(false);
        return true;
    }

    public final void disableBatteryManager()
    {
        if (batteryReceiver != null && isNotApplicationContextNull().booleanValue())
        {
            getApplication().getApplicationContext().unregisterReceiver(batteryReceiver);
            batteryReceiver = null;
        }
    }

    public final void disableConnectionListener()
    {
        if (connectionReceiver != null && isNotApplicationContextNull().booleanValue())
        {
            getApplication().getApplicationContext().unregisterReceiver(connectionReceiver);
            connectionReceiver = null;
        }
    }

    public final void disableScreenReceiver()
    {
        if (screenReceiver != null && isNotApplicationContextNull().booleanValue())
        {
            getApplication().getApplicationContext().unregisterReceiver(screenReceiver);
            screenReceiver = null;
        }
    }

    public final boolean enable()
    {
        getApplicationData();
        enableBatteryManager();
        enableConnectionListener();
        enableScreenReceiver();
        _isEnabled = Boolean.valueOf(true);
        return _isEnabled.booleanValue();
    }

    public final void enableBatteryManager()
    {
        if (batteryReceiver == null && isNotApplicationContextNull().booleanValue())
        {
            batteryReceiver = new BatteryReceiver();
            IntentFilter intentfilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            getApplication().getApplicationContext().registerReceiver(batteryReceiver, intentfilter);
        }
    }

    public final void enableConnectionListener()
    {
        if (connectionReceiver == null && isNotApplicationContextNull().booleanValue())
        {
            connectionReceiver = new ConnectionReceiver();
            IntentFilter intentfilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            getApplication().getApplicationContext().registerReceiver(connectionReceiver, intentfilter);
        }
    }

    public final void enableScreenReceiver()
    {
        if (screenReceiver == null && isNotApplicationContextNull().booleanValue())
        {
            screenReceiver = new ScreenReceiver();
            IntentFilter intentfilter = new IntentFilter("android.intent.action.CONFIGURATION_CHANGED");
            getApplication().getApplicationContext().registerReceiver(screenReceiver, intentfilter);
        }
    }

    public final void getApplicationData()
    {
        PackageInfo packageinfo;
        PackageManager packagemanager = getApplication().getPackageManager();
        packageinfo = packagemanager.getPackageInfo(getApplication().getPackageName(), 0);
        applicationVersion = packageinfo.versionName;
        applicationPackageName = packageinfo.packageName;
        if (packageinfo.applicationInfo.name == null)
        {
            applicationName = (String)packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(getApplication().getPackageName(), 0));
            return;
        }
        try
        {
            applicationName = packageinfo.applicationInfo.name;
            return;
        }
        catch (Exception exception)
        {
            LogInternal.logException(exception);
        }
        return;
    }

    public final String getApplicationName()
    {
        if (applicationName == null)
        {
            return "";
        } else
        {
            return applicationName;
        }
    }

    public final String getApplicationPackageName()
    {
        return applicationPackageName;
    }

    public final String getApplicationVersion()
    {
        return applicationVersion;
    }

    public final long getAvailableMemory()
    {
        android.app.ActivityManager.MemoryInfo memoryinfo;
        ActivityManager activitymanager;
        long l;
        try
        {
            memoryinfo = new android.app.ActivityManager.MemoryInfo();
            activitymanager = (ActivityManager)getApplication().getApplicationContext().getSystemService("activity");
        }
        catch (Exception exception)
        {
            LogInternal.logException(exception);
            return 0L;
        }
        if (activitymanager == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        activitymanager.getMemoryInfo(memoryinfo);
        l = memoryinfo.availMem;
        return l;
    }

    public final BatteryReceiver getBatteryReceiver()
    {
        return batteryReceiver;
    }

    public final String getCarrier()
    {
        String s;
        try
        {
            s = ((TelephonyManager)getApplication().getApplicationContext().getSystemService("phone")).getNetworkOperatorName();
        }
        catch (Exception exception)
        {
            LogInternal.logException(exception);
            return null;
        }
        return s;
    }

    public final ConnectionReceiver getConnectionReceiver()
    {
        return connectionReceiver;
    }

    public final String getDeviceId()
    {
        String s1 = null;
        String s = null;
        if (false)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s = s1;
        Object obj;
        try
        {
            obj = EOCore.getApplication().getSharedPreferences("TEALEAF_DEVICE_ID", 0);
        }
        catch (Exception exception)
        {
            LogInternal.logException(exception);
            return s;
        }
        s = s1;
        s1 = ((SharedPreferences) (obj)).getString("TEALEAF_DEVICE_ID", null);
        s = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s = s1;
        s1 = UUID.randomUUID().toString();
        s = s1;
        obj = ((SharedPreferences) (obj)).edit();
        s = s1;
        ((android.content.SharedPreferences.Editor) (obj)).putString("TEALEAF_DEVICE_ID", s1);
        s = s1;
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        s = s1;
        return s;
    }

    public final String getHttpXTealeafProperty()
    {
        Object obj;
        String s;
        StringBuilder stringbuilder;
        if (applicationVersion == null)
        {
            obj = null;
        } else
        {
            obj = applicationVersion.split("\\.");
        }
        stringbuilder = new StringBuilder();
        if (obj == null)
        {
            s = "";
        } else
        {
            s = obj[0];
        }
        stringbuilder.append(s);
        if (obj == null || obj.length < 2)
        {
            obj = "";
        } else
        {
            obj = (new StringBuilder()).append(".").append(obj[1]).toString();
        }
        stringbuilder.append(((String) (obj)));
        obj = new StringBuilder(99);
        ((StringBuilder) (obj)).append("TLT_BROWSER=");
        ((StringBuilder) (obj)).append(getApplicationName());
        ((StringBuilder) (obj)).append("Native;TLT_BROWSER_VERSION=");
        ((StringBuilder) (obj)).append(stringbuilder.toString());
        ((StringBuilder) (obj)).append(";TLT_BRAND=");
        ((StringBuilder) (obj)).append(Build.BRAND);
        ((StringBuilder) (obj)).append(";TLT_MODEL=");
        ((StringBuilder) (obj)).append(getModel());
        if (screenReceiver == null) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj)).append(";TLT_SCREEN_HEIGHT=");
        ((StringBuilder) (obj)).append(getScreenReceiver().getHeight());
        ((StringBuilder) (obj)).append(";TLT_SCREEN_WIDTH=");
        ((StringBuilder) (obj)).append(getScreenReceiver().getWidth());
_L4:
        return ((StringBuilder) (obj)).toString();
_L2:
        if (lastHeight > 0)
        {
            ((StringBuilder) (obj)).append(";TLT_SCREEN_HEIGHT=");
            ((StringBuilder) (obj)).append(lastHeight);
        }
        if (lastWidth > 0)
        {
            ((StringBuilder) (obj)).append(";TLT_SCREEN_WIDTH=");
            ((StringBuilder) (obj)).append(lastWidth);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String getIpAddress()
    {
        String s;
        try
        {
            int i = ((WifiManager)getApplication().getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
            s = String.format(Locale.US, "%d.%d.%d.%d", new Object[] {
                Integer.valueOf(i & 0xff), Integer.valueOf(i >> 8 & 0xff), Integer.valueOf(i >> 16 & 0xff), Integer.valueOf(i >> 24 & 0xff)
            });
        }
        catch (Exception exception)
        {
            LogInternal.logException(exception);
            return "";
        }
        return s;
    }

    public final KeyboardStateType getKeyboardStateType()
    {
        KeyboardStateType keyboardstatetype = KeyboardStateType.UNDEFINED;
        if (!isNotApplicationResourcesNull().booleanValue()) goto _L2; else goto _L1
_L1:
        getApplication().getResources().getConfiguration().keyboardHidden;
        JVM INSTR tableswitch 1 2: default 65
    //                   1 48
    //                   2 52;
           goto _L2 _L3 _L4
_L3:
        return KeyboardStateType.HIDDEN_FALSE;
_L4:
        KeyboardStateType keyboardstatetype1 = KeyboardStateType.HIDDEN_TRUE;
        return keyboardstatetype1;
        Exception exception;
        exception;
        LogInternal.logException(exception);
        return keyboardstatetype;
_L2:
        return keyboardstatetype;
    }

    public final KeyboardType getKeyboardType()
    {
        KeyboardType keyboardtype = KeyboardType.UNDEFINED;
        if (!isNotApplicationResourcesNull().booleanValue()) goto _L2; else goto _L1
_L1:
        getApplication().getResources().getConfiguration().keyboard;
        JVM INSTR tableswitch 1 3: default 73
    //                   1 52
    //                   2 56
    //                   3 60;
           goto _L2 _L3 _L4 _L5
_L3:
        return KeyboardType.NO_KEYS;
_L4:
        return KeyboardType.QWERTY;
_L5:
        KeyboardType keyboardtype1 = KeyboardType.TWELVE_KEYS;
        return keyboardtype1;
        Exception exception;
        exception;
        LogInternal.logException(exception);
        return keyboardtype;
_L2:
        return keyboardtype;
    }

    public final String getManufacturer()
    {
        Object obj;
        try
        {
            obj = android/os/Build.getDeclaredField("MANUFACTURER");
            ((Field) (obj)).setAccessible(true);
            obj = (String)((Field) (obj)).get(android/os/Build);
        }
        catch (Exception exception)
        {
            LogInternal.logException(exception);
            return "";
        }
        return ((String) (obj));
    }

    public final String getModel()
    {
        String s = Build.MODEL;
        if ("sdk".equals(s) || "Full Android on x86 Emulator".equals(s))
        {
            break MISSING_BLOCK_LABEL_36;
        }
        String s1 = s;
        if (!"Android SDK build for x86".equals(s))
        {
            break MISSING_BLOCK_LABEL_40;
        }
        s1 = "Android Simulator";
        return s1;
        Exception exception;
        exception;
        s = "";
_L2:
        LogInternal.logException(exception);
        return s;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final OrientationType getOrientationType()
    {
        OrientationType orientationtype = OrientationType.UNDEFINED;
        if (!isNotApplicationResourcesNull().booleanValue()) goto _L2; else goto _L1
_L1:
        Object obj = getApplication().getResources().getConfiguration();
        ((Configuration) (obj)).orientation;
        JVM INSTR tableswitch 1 2: default 89
    //                   1 76
    //                   2 72;
           goto _L3 _L4 _L5
_L3:
        if (android.os.Build.VERSION.SDK_INT < 15 && ((Configuration) (obj)).orientation == 3)
        {
            return OrientationType.SQUARE;
        }
        break; /* Loop/switch isn't completed */
_L5:
        return OrientationType.LANDSCAPE;
_L4:
        obj = OrientationType.PORTRAIT;
        return ((OrientationType) (obj));
        Exception exception;
        exception;
        LogInternal.logException(exception);
        return orientationtype;
_L2:
        return orientationtype;
    }

    public final ScreenReceiver getScreenReceiver()
    {
        if (screenReceiver == null)
        {
            enableScreenReceiver();
        }
        return screenReceiver;
    }

    public final long getStorage(StorageType storagetype)
    {
        Object obj;
        int i;
        long l4;
        try
        {
            if (storagetype == StorageType.PHONE_FREE || storagetype == StorageType.PHONE_USED || storagetype == StorageType.PHONE_TOTAL)
            {
                obj = Environment.getDataDirectory();
            } else
            {
                obj = Environment.getExternalStorageDirectory();
            }
            obj = new StatFs(((File) (obj)).getPath());
        }
        // Misplaced declaration of an exception variable
        catch (StorageType storagetype)
        {
            LogInternal.logException(storagetype);
            return 0L;
        }
        _cls1..SwitchMap.com.ibm.eo.model.StorageType[storagetype.ordinal()];
        JVM INSTR tableswitch 1 6: default 210
    //                   1 91
    //                   2 91
    //                   3 129
    //                   4 129
    //                   5 167
    //                   6 167;
           goto _L1 _L2 _L2 _L3 _L3 _L4 _L4
_L2:
        if (android.os.Build.VERSION.SDK_INT > 17)
        {
            long l = ((StatFs) (obj)).getAvailableBlocksLong();
            return ((StatFs) (obj)).getBlockSizeLong() * l;
        } else
        {
            long l1 = ((StatFs) (obj)).getAvailableBlocks();
            return (long)((StatFs) (obj)).getBlockSize() * l1;
        }
_L3:
        if (android.os.Build.VERSION.SDK_INT > 17)
        {
            long l2 = ((StatFs) (obj)).getAvailableBlocksLong();
            return ((StatFs) (obj)).getBlockSizeLong() * l2;
        } else
        {
            long l3 = ((StatFs) (obj)).getAvailableBlocks();
            return (long)((StatFs) (obj)).getBlockSize() * l3;
        }
_L4:
        if (android.os.Build.VERSION.SDK_INT > 17)
        {
            return ((StatFs) (obj)).getBlockCountLong() - ((StatFs) (obj)).getBlockSizeLong();
        }
        l4 = ((StatFs) (obj)).getBlockCount();
        i = ((StatFs) (obj)).getBlockSize();
        return l4 - (long)i;
_L1:
        return 0L;
    }

    public final Boolean hasClientStateChanged()
    {
        if (batteryReceiver == null || connectionReceiver == null || screenReceiver == null)
        {
            onResumeEO();
        }
        return Boolean.valueOf(false);
    }

    public final HashMap httpHeaders()
    {
        return null;
    }

    public final boolean isEnabled()
    {
        return _isEnabled.booleanValue();
    }

    public final String name()
    {
        return "Environmental Service";
    }

    public final boolean onDestroyEO()
    {
        return true;
    }

    public final boolean onLowMemoryEO()
    {
        return true;
    }

    public final boolean onPauseEO()
    {
        if (EOCore.hasBeenPostedInBackground().booleanValue())
        {
            disableBatteryManager();
            disableConnectionListener();
            disableScreenReceiver();
        }
        return true;
    }

    public final boolean onResumeEO()
    {
        enableBatteryManager();
        enableConnectionListener();
        enableScreenReceiver();
        return true;
    }

    public final boolean onTerminateEO()
    {
        return true;
    }

    public final Boolean setDeviceId(String s)
    {
        try
        {
            android.content.SharedPreferences.Editor editor = EOCore.getApplication().getSharedPreferences("TEALEAF_DEVICE_ID", 0).edit();
            editor.putString("TEALEAF_DEVICE_ID", s);
            editor.commit();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogInternal.logException(s);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(true);
    }

    private class _cls1
    {

        static final int $SwitchMap$com$ibm$eo$model$StorageType[];

        static 
        {
            $SwitchMap$com$ibm$eo$model$StorageType = new int[StorageType.values().length];
            try
            {
                $SwitchMap$com$ibm$eo$model$StorageType[StorageType.PHONE_FREE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$ibm$eo$model$StorageType[StorageType.SD_CARD_FREE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$ibm$eo$model$StorageType[StorageType.PHONE_USED.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$ibm$eo$model$StorageType[StorageType.SD_CARD_USED.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$ibm$eo$model$StorageType[StorageType.PHONE_TOTAL.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$ibm$eo$model$StorageType[StorageType.SD_CARD_TOTAL.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
