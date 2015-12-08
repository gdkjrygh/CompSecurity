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
import javax.inject.Provider;

// Referenced classes of package com.skype.android.inject:
//            ApplicationComponent, ApplicationModule_ContextFactory, ApplicationModule_ApplicationFactory, ApplicationModule_AlarmManagerFactory, 
//            ApplicationModule_AccessibilityManagerFactory, ApplicationModule_AccountManagerFactory, ApplicationModule_ActivityManagerFactory, ApplicationModule_AudioManagerFactory, 
//            ApplicationModule_AssetManagerFactory, ApplicationModule_BluetoothManagerFactory, ApplicationModule_ConnectivityManagerFactory, ApplicationModule_ContentResolverFactory, 
//            ApplicationModule_DevicePolicyManagerFactory, ApplicationModule_DisplayManagerFactory, ApplicationModule_DownloadManagerFactory, ApplicationModule_InputManagerFactory, 
//            ApplicationModule_InputMethodManagerFactory, ApplicationModule_LocationManagerFactory, ApplicationModule_NfcManagerFactory, ApplicationModule_NotificationManagerFactory, 
//            ApplicationModule_PackageManagerFactory, ApplicationModule_PowerManagerFactory, ApplicationModule_ResourcesFactory, ApplicationModule_SensorManagerFactory, 
//            ApplicationModule_StorageManagerFactory, ApplicationModule_TelephonyManagerFactory, ApplicationModule_UiModeManagerFactory, ApplicationModule_UsbManagerFactory, 
//            ApplicationModule_VibratorFactory, ApplicationModule_WindowManagerFactory, ApplicationModule_WifiManagerFactory, ApplicationModule

public final class DaggerApplicationComponent
    implements ApplicationComponent
{
    public static final class Builder
    {

        private ApplicationModule applicationModule;

        public final Builder applicationModule(ApplicationModule applicationmodule)
        {
            if (applicationmodule == null)
            {
                throw new NullPointerException("applicationModule");
            } else
            {
                applicationModule = applicationmodule;
                return this;
            }
        }

        public final ApplicationComponent build()
        {
            if (applicationModule == null)
            {
                throw new IllegalStateException("applicationModule must be set");
            } else
            {
                return new DaggerApplicationComponent(this);
            }
        }


        private Builder()
        {
        }

    }


    static final boolean $assertionsDisabled;
    private Provider accessibilityManagerProvider;
    private Provider accountManagerProvider;
    private Provider activityManagerProvider;
    private Provider alarmManagerProvider;
    private Provider applicationProvider;
    private Provider assetManagerProvider;
    private Provider audioManagerProvider;
    private Provider bluetoothManagerProvider;
    private Provider connectivityManagerProvider;
    private Provider contentResolverProvider;
    private Provider contextProvider;
    private Provider devicePolicyManagerProvider;
    private Provider displayManagerProvider;
    private Provider downloadManagerProvider;
    private Provider inputManagerProvider;
    private Provider inputMethodManagerProvider;
    private Provider locationManagerProvider;
    private Provider nfcManagerProvider;
    private Provider notificationManagerProvider;
    private Provider packageManagerProvider;
    private Provider powerManagerProvider;
    private Provider resourcesProvider;
    private Provider sensorManagerProvider;
    private Provider storageManagerProvider;
    private Provider telephonyManagerProvider;
    private Provider uiModeManagerProvider;
    private Provider usbManagerProvider;
    private Provider vibratorProvider;
    private Provider wifiManagerProvider;
    private Provider windowManagerProvider;

    private DaggerApplicationComponent(Builder builder1)
    {
        if (!$assertionsDisabled && builder1 == null)
        {
            throw new AssertionError();
        } else
        {
            initialize(builder1);
            return;
        }
    }


    public static Builder builder()
    {
        return new Builder();
    }

    private void initialize(Builder builder1)
    {
        contextProvider = ApplicationModule_ContextFactory.create(builder1.applicationModule);
        applicationProvider = ApplicationModule_ApplicationFactory.create(builder1.applicationModule);
        alarmManagerProvider = ApplicationModule_AlarmManagerFactory.create(builder1.applicationModule);
        accessibilityManagerProvider = ApplicationModule_AccessibilityManagerFactory.create(builder1.applicationModule);
        accountManagerProvider = ApplicationModule_AccountManagerFactory.create(builder1.applicationModule);
        activityManagerProvider = ApplicationModule_ActivityManagerFactory.create(builder1.applicationModule);
        audioManagerProvider = ApplicationModule_AudioManagerFactory.create(builder1.applicationModule);
        assetManagerProvider = ApplicationModule_AssetManagerFactory.create(builder1.applicationModule);
        bluetoothManagerProvider = ApplicationModule_BluetoothManagerFactory.create(builder1.applicationModule);
        connectivityManagerProvider = ApplicationModule_ConnectivityManagerFactory.create(builder1.applicationModule);
        contentResolverProvider = ApplicationModule_ContentResolverFactory.create(builder1.applicationModule);
        devicePolicyManagerProvider = ApplicationModule_DevicePolicyManagerFactory.create(builder1.applicationModule);
        displayManagerProvider = ApplicationModule_DisplayManagerFactory.create(builder1.applicationModule);
        downloadManagerProvider = ApplicationModule_DownloadManagerFactory.create(builder1.applicationModule);
        inputManagerProvider = ApplicationModule_InputManagerFactory.create(builder1.applicationModule);
        inputMethodManagerProvider = ApplicationModule_InputMethodManagerFactory.create(builder1.applicationModule);
        locationManagerProvider = ApplicationModule_LocationManagerFactory.create(builder1.applicationModule);
        nfcManagerProvider = ApplicationModule_NfcManagerFactory.create(builder1.applicationModule);
        notificationManagerProvider = ApplicationModule_NotificationManagerFactory.create(builder1.applicationModule);
        packageManagerProvider = ApplicationModule_PackageManagerFactory.create(builder1.applicationModule);
        powerManagerProvider = ApplicationModule_PowerManagerFactory.create(builder1.applicationModule);
        resourcesProvider = ApplicationModule_ResourcesFactory.create(builder1.applicationModule);
        sensorManagerProvider = ApplicationModule_SensorManagerFactory.create(builder1.applicationModule);
        storageManagerProvider = ApplicationModule_StorageManagerFactory.create(builder1.applicationModule);
        telephonyManagerProvider = ApplicationModule_TelephonyManagerFactory.create(builder1.applicationModule);
        uiModeManagerProvider = ApplicationModule_UiModeManagerFactory.create(builder1.applicationModule);
        usbManagerProvider = ApplicationModule_UsbManagerFactory.create(builder1.applicationModule);
        vibratorProvider = ApplicationModule_VibratorFactory.create(builder1.applicationModule);
        windowManagerProvider = ApplicationModule_WindowManagerFactory.create(builder1.applicationModule);
        wifiManagerProvider = ApplicationModule_WifiManagerFactory.create(builder1.applicationModule);
    }

    public final AccessibilityManager accessibilityManager()
    {
        return (AccessibilityManager)accessibilityManagerProvider.get();
    }

    public final AccountManager accountManager()
    {
        return (AccountManager)accountManagerProvider.get();
    }

    public final ActivityManager activityManager()
    {
        return (ActivityManager)activityManagerProvider.get();
    }

    public final AlarmManager alarmManager()
    {
        return (AlarmManager)alarmManagerProvider.get();
    }

    public final Application application()
    {
        return (Application)applicationProvider.get();
    }

    public final AssetManager assetManager()
    {
        return (AssetManager)assetManagerProvider.get();
    }

    public final AudioManager audioManager()
    {
        return (AudioManager)audioManagerProvider.get();
    }

    public final BluetoothManager bluetoothManager()
    {
        return (BluetoothManager)bluetoothManagerProvider.get();
    }

    public final ConnectivityManager connectivityManager()
    {
        return (ConnectivityManager)connectivityManagerProvider.get();
    }

    public final ContentResolver contentResolver()
    {
        return (ContentResolver)contentResolverProvider.get();
    }

    public final Context context()
    {
        return (Context)contextProvider.get();
    }

    public final DevicePolicyManager devicePolicyManager()
    {
        return (DevicePolicyManager)devicePolicyManagerProvider.get();
    }

    public final DisplayManager displayManager()
    {
        return (DisplayManager)displayManagerProvider.get();
    }

    public final DownloadManager downloadManager()
    {
        return (DownloadManager)downloadManagerProvider.get();
    }

    public final InputManager inputManager()
    {
        return (InputManager)inputManagerProvider.get();
    }

    public final InputMethodManager inputMethodManager()
    {
        return (InputMethodManager)inputMethodManagerProvider.get();
    }

    public final LocationManager locationManager()
    {
        return (LocationManager)locationManagerProvider.get();
    }

    public final NfcManager nfcManager()
    {
        return (NfcManager)nfcManagerProvider.get();
    }

    public final NotificationManager notificationManager()
    {
        return (NotificationManager)notificationManagerProvider.get();
    }

    public final PackageManager packageManager()
    {
        return (PackageManager)packageManagerProvider.get();
    }

    public final PowerManager powerManager()
    {
        return (PowerManager)powerManagerProvider.get();
    }

    public final Resources resources()
    {
        return (Resources)resourcesProvider.get();
    }

    public final SensorManager sensorManager()
    {
        return (SensorManager)sensorManagerProvider.get();
    }

    public final StorageManager storageManager()
    {
        return (StorageManager)storageManagerProvider.get();
    }

    public final TelephonyManager telephonyManager()
    {
        return (TelephonyManager)telephonyManagerProvider.get();
    }

    public final UiModeManager uiModeManager()
    {
        return (UiModeManager)uiModeManagerProvider.get();
    }

    public final UsbManager usbManager()
    {
        return (UsbManager)usbManagerProvider.get();
    }

    public final Vibrator vibrator()
    {
        return (Vibrator)vibratorProvider.get();
    }

    public final WifiManager wifiManager()
    {
        return (WifiManager)wifiManagerProvider.get();
    }

    public final WindowManager windowManager()
    {
        return (WindowManager)windowManagerProvider.get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/inject/DaggerApplicationComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
