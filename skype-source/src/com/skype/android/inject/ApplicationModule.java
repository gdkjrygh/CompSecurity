// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
import android.app.DownloadManager;
import android.app.NotificationManager;
import android.app.UiModeManager;
import android.app.admin.DevicePolicyManager;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.nfc.NfcManager;
import android.os.PowerManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;

public class ApplicationModule
{

    private final Application application;

    public ApplicationModule(Application application1)
    {
        application = application1;
    }

    private Object systemService(String s)
    {
        return application.getSystemService(s);
    }

    AccessibilityManager accessibilityManager()
    {
        return (AccessibilityManager)systemService("accessibility");
    }

    AccountManager accountManager()
    {
        return (AccountManager)systemService("account");
    }

    ActivityManager activityManager()
    {
        return (ActivityManager)systemService("activity");
    }

    AlarmManager alarmManager()
    {
        return (AlarmManager)systemService("alarm");
    }

    Application application()
    {
        return application;
    }

    AssetManager assetManager()
    {
        return application.getAssets();
    }

    AudioManager audioManager()
    {
        return (AudioManager)systemService("audio");
    }

    BluetoothManager bluetoothManager()
    {
        return (BluetoothManager)systemService("bluetooth");
    }

    ConnectivityManager connectivityManager()
    {
        return (ConnectivityManager)systemService("connectivity");
    }

    ContentResolver contentResolver()
    {
        return application.getContentResolver();
    }

    Context context()
    {
        return application;
    }

    DevicePolicyManager devicePolicyManager()
    {
        return (DevicePolicyManager)systemService("device_policy");
    }

    DisplayManager displayManager()
    {
        return (DisplayManager)systemService("display");
    }

    DownloadManager downloadManager()
    {
        return (DownloadManager)systemService("download");
    }

    InputManager inputManager()
    {
        return (InputManager)systemService("input");
    }

    InputMethodManager inputMethodManager()
    {
        return (InputMethodManager)systemService("input_method");
    }

    LocationManager locationManager()
    {
        return (LocationManager)systemService("location");
    }

    NfcManager nfcManager()
    {
        return (NfcManager)systemService("nfc");
    }

    NotificationManager notificationManager()
    {
        return (NotificationManager)systemService("notification");
    }

    PackageManager packageManager()
    {
        return application.getPackageManager();
    }

    PowerManager powerManager()
    {
        return (PowerManager)systemService("power");
    }

    Resources resources()
    {
        return application.getResources();
    }

    SensorManager sensorManager()
    {
        return (SensorManager)systemService("sensor");
    }

    StorageManager storageManager()
    {
        return (StorageManager)systemService("storage");
    }

    TelephonyManager telephonyManager()
    {
        return (TelephonyManager)systemService("phone");
    }

    UiModeManager uiModeManager()
    {
        return (UiModeManager)systemService("uimode");
    }

    UsbManager usbManager()
    {
        return (UsbManager)systemService("usb");
    }

    Vibrator vibrator()
    {
        return (Vibrator)systemService("vibrator");
    }

    WifiManager wifiManager()
    {
        return (WifiManager)systemService("wifi");
    }

    WindowManager windowManager()
    {
        return (WindowManager)systemService("window");
    }
}
