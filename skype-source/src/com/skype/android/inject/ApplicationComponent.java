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

public interface ApplicationComponent
{

    public abstract AccessibilityManager accessibilityManager();

    public abstract AccountManager accountManager();

    public abstract ActivityManager activityManager();

    public abstract AlarmManager alarmManager();

    public abstract Application application();

    public abstract AssetManager assetManager();

    public abstract AudioManager audioManager();

    public abstract BluetoothManager bluetoothManager();

    public abstract ConnectivityManager connectivityManager();

    public abstract ContentResolver contentResolver();

    public abstract Context context();

    public abstract DevicePolicyManager devicePolicyManager();

    public abstract DisplayManager displayManager();

    public abstract DownloadManager downloadManager();

    public abstract InputManager inputManager();

    public abstract InputMethodManager inputMethodManager();

    public abstract LocationManager locationManager();

    public abstract NfcManager nfcManager();

    public abstract NotificationManager notificationManager();

    public abstract PackageManager packageManager();

    public abstract PowerManager powerManager();

    public abstract Resources resources();

    public abstract SensorManager sensorManager();

    public abstract StorageManager storageManager();

    public abstract TelephonyManager telephonyManager();

    public abstract UiModeManager uiModeManager();

    public abstract UsbManager usbManager();

    public abstract Vibrator vibrator();

    public abstract WifiManager wifiManager();

    public abstract WindowManager windowManager();
}
