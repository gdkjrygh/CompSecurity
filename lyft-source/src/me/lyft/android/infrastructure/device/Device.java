// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.device;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Locale;
import me.lyft.android.LyftApplication;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.logging.L;
import me.lyft.android.utils.DeviceNetworkUtils;

// Referenced classes of package me.lyft.android.infrastructure.device:
//            IDevice, BatteryStatus

public class Device
    implements IDevice
{

    private static final int MINIMAL_TABLET_DIMENSION = 480;
    private static final String platform = "android";
    final AccountManager accountManager;
    final ConnectivityManager connectivityManager;
    final LyftApplication context;
    final DisplayMetrics displayMetrics = new DisplayMetrics();
    private BatteryStatus lastKnownBatteryStatus;
    String mobileCountryCode;
    String mobileNetworkCode;
    final String networkCountryIso;
    final PackageManager packageManager;
    final TelephonyManager telephonyManager;
    final WindowManager windowManager;

    public Device(LyftApplication lyftapplication, WindowManager windowmanager, TelephonyManager telephonymanager, ConnectivityManager connectivitymanager, AccountManager accountmanager, PackageManager packagemanager)
    {
        context = lyftapplication;
        windowManager = windowmanager;
        telephonyManager = telephonymanager;
        connectivityManager = connectivitymanager;
        accountManager = accountmanager;
        packageManager = packagemanager;
        windowmanager.getDefaultDisplay().getMetrics(displayMetrics);
        networkCountryIso = telephonymanager.getNetworkCountryIso();
        lyftapplication = telephonymanager.getNetworkOperator();
        if (!Strings.isNullOrEmpty(lyftapplication))
        {
            mobileCountryCode = lyftapplication.substring(0, 3);
            mobileNetworkCode = lyftapplication.substring(3);
        }
    }

    private Account getGoogleAccount()
    {
        Account aaccount[] = accountManager.getAccountsByType("com.google");
        if (aaccount.length > 0)
        {
            return aaccount[0];
        } else
        {
            return null;
        }
    }

    private void refreshBatterStatus()
    {
        Object obj = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        obj = context.registerReceiver(null, ((IntentFilter) (obj)));
        int i = ((Intent) (obj)).getIntExtra("level", -1);
        int j = ((Intent) (obj)).getIntExtra("scale", -1);
        float f = (float)i / (float)j;
        i = ((Intent) (obj)).getIntExtra("status", -1);
        boolean flag;
        if (i == 2 || i == 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        lastKnownBatteryStatus = new BatteryStatus(f * 100F, flag, System.currentTimeMillis());
    }

    public String getAndroidId()
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public long getApplicationInstallTimestamp()
    {
        long l;
        try
        {
            l = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            L.e(namenotfoundexception, "getApplicationInstallTimestamp", new Object[0]);
            return 0L;
        }
        return l;
    }

    public String getApplicationVersion()
    {
        String s;
        try
        {
            s = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        catch (Exception exception)
        {
            L.e(exception, "getApplicationVersion", new Object[0]);
            return "";
        }
        return s;
    }

    public int getApplicationVersionCode()
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            L.e(namenotfoundexception, "getApplicationVersionCode", new Object[0]);
            return 0;
        }
        return i;
    }

    public BatteryStatus getBatteryStatus()
    {
        if (lastKnownBatteryStatus == null || lastKnownBatteryStatus.needsRefresh())
        {
            refreshBatterStatus();
        }
        return lastKnownBatteryStatus;
    }

    public Integer getDensity()
    {
        return Integer.valueOf((int)(displayMetrics.density * 160F));
    }

    public int getDensityDpi()
    {
        return displayMetrics.densityDpi;
    }

    public String getDeviceInfo()
    {
        return (new StringBuilder()).append(Build.MODEL).append(" ").append(Build.PRODUCT).append(" ").append(Build.MANUFACTURER).toString();
    }

    public String getDeviceLocale()
    {
        return context.getResources().getConfiguration().locale.toString();
    }

    public String getDeviceName()
    {
        String s = Build.MANUFACTURER;
        String s1 = Build.MODEL;
        if (s1.toUpperCase().startsWith(s.toUpperCase()))
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(s).append(" ").append(s1).toString();
        }
    }

    public int getDisplayRotation()
    {
        switch (windowManager.getDefaultDisplay().getRotation())
        {
        case 0: // '\0'
        default:
            return 0;

        case 1: // '\001'
            return 90;

        case 2: // '\002'
            return 180;

        case 3: // '\003'
            return 270;
        }
    }

    public long getElapsedRealtime()
    {
        return SystemClock.elapsedRealtime();
    }

    public String getGoogleAccountEmail()
    {
        Account account = getGoogleAccount();
        if (account == null)
        {
            return "";
        } else
        {
            return account.name;
        }
    }

    public String getLocaleCountryIso()
    {
        return Locale.getDefault().getCountry().toLowerCase();
    }

    public String getMobileCountryCode()
    {
        return mobileCountryCode;
    }

    public String getMobileNetworkCode()
    {
        return mobileNetworkCode;
    }

    public boolean getNetworkConnected()
    {
        NetworkInfo networkinfo = connectivityManager.getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnectedOrConnecting();
    }

    public String getNetworkIso()
    {
        return networkCountryIso;
    }

    public boolean getNetworkLocationEnabled()
    {
        return android.provider.Settings.Secure.isLocationProviderEnabled(context.getContentResolver(), "network");
    }

    public String getNetworkType()
    {
        return DeviceNetworkUtils.getNetworkType(connectivityManager.getActiveNetworkInfo());
    }

    public String getOSVersion()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public String getOperatorName()
    {
        return telephonyManager.getNetworkOperatorName();
    }

    public String getPhoneNumber()
    {
        return (String)Objects.firstNonNull(telephonyManager.getLine1Number(), "");
    }

    public String getPlatform()
    {
        return "android";
    }

    public String getRadioType()
    {
        return DeviceNetworkUtils.getRadioType(telephonyManager.getNetworkType());
    }

    public int getSDKVersion()
    {
        return android.os.Build.VERSION.SDK_INT;
    }

    public Integer getScreenHeight()
    {
        Display display = windowManager.getDefaultDisplay();
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            Point point = new Point();
            display.getSize(point);
            i = point.y;
        } else
        {
            i = display.getHeight();
        }
        return Integer.valueOf(i);
    }

    public Integer getScreenWidth()
    {
        Display display = windowManager.getDefaultDisplay();
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            Point point = new Point();
            display.getSize(point);
            i = point.x;
        } else
        {
            i = display.getWidth();
        }
        return Integer.valueOf(i);
    }

    public String getSimCountryIso()
    {
        return telephonyManager.getSimCountryIso();
    }

    public String getUserAgent()
    {
        return String.format(context.getString(0x7f070381), new Object[] {
            getOSVersion(), getApplicationVersion()
        });
    }

    public String getUuid()
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public float getXDensity()
    {
        return displayMetrics.xdpi;
    }

    public float getYDensity()
    {
        return displayMetrics.ydpi;
    }

    public boolean hasCamera()
    {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    public boolean hasCameraFlash()
    {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
    }

    public boolean isGPSEnabled()
    {
        return android.provider.Settings.Secure.isLocationProviderEnabled(context.getContentResolver(), "gps");
    }

    public boolean isModel(String s)
    {
        return Build.MODEL.equalsIgnoreCase(s);
    }

    public boolean isPackageInstalled(String s)
    {
        boolean flag = false;
        try
        {
            s = packageManager.getPackageInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        if (s != null)
        {
            flag = true;
        }
        return flag;
    }

    public boolean isTabletScreenSize()
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displaymetrics);
        Display display = windowManager.getDefaultDisplay();
        return (float)Math.min(display.getWidth(), display.getHeight()) / displaymetrics.density >= 480F;
    }
}
