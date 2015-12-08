// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.inject;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.admin.DevicePolicyManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.Vibrator;
import android.service.wallpaper.WallpaperService;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;

public class SystemServiceModule
{

    public SystemServiceModule()
    {
    }

    public static AccessibilityManager provideAccessibilityManager(Context context)
    {
        return (AccessibilityManager)context.getSystemService("accessibility");
    }

    public static AccountManager provideAccountManager(Context context)
    {
        return (AccountManager)context.getSystemService("account");
    }

    public static ActivityManager provideActivityManager(Context context)
    {
        return (ActivityManager)context.getSystemService("activity");
    }

    public static AlarmManager provideAlarmManager(Context context)
    {
        return (AlarmManager)context.getSystemService("alarm");
    }

    public static AudioManager provideAudioManager(Context context)
    {
        return (AudioManager)context.getSystemService("audio");
    }

    public static ClipboardManager provideClipboardManager(Context context)
    {
        return (ClipboardManager)context.getSystemService("clipboard");
    }

    public static ConnectivityManager provideConnectivityManager(Context context)
    {
        return (ConnectivityManager)context.getSystemService("connectivity");
    }

    public static DevicePolicyManager provideDevicePolicyManager(Context context)
    {
        return (DevicePolicyManager)context.getSystemService("device_policy");
    }

    public static DropBoxManager provideDropBoxManager(Context context)
    {
        return (DropBoxManager)context.getSystemService("dropbox");
    }

    public static InputMethodManager provideInputMethodManager(Context context)
    {
        return (InputMethodManager)context.getSystemService("input_method");
    }

    public static KeyguardManager provideKeyguardManager(Context context)
    {
        return (KeyguardManager)context.getSystemService("keyguard");
    }

    public static LocationManager provideLocationManager(Context context)
    {
        return (LocationManager)context.getSystemService("location");
    }

    public static NotificationManager provideNotificationManager(Context context)
    {
        return (NotificationManager)context.getSystemService("notification");
    }

    public static PackageManager providePackageManager(Context context)
    {
        return context.getPackageManager();
    }

    public static PowerManager providePowerManager(Context context)
    {
        return (PowerManager)context.getSystemService("power");
    }

    public static SearchManager provideSearchManager(Context context)
    {
        return (SearchManager)context.getSystemService("search");
    }

    public static SensorManager provideSensorManager(Context context)
    {
        return (SensorManager)context.getSystemService("sensor");
    }

    public static TelephonyManager provideTelephonyManager(Context context)
    {
        return (TelephonyManager)context.getSystemService("phone");
    }

    public static Vibrator provideVibrator(Context context)
    {
        return (Vibrator)context.getSystemService("vibrator");
    }

    public static WallpaperService provideWallpaperService(Context context)
    {
        return (WallpaperService)context.getSystemService("wallpaper");
    }

    public static WifiManager provideWifiManager(Context context)
    {
        return (WifiManager)context.getSystemService("wifi");
    }

    public static WindowManager provideWindowManager(Context context)
    {
        return (WindowManager)context.getSystemService("window");
    }
}
