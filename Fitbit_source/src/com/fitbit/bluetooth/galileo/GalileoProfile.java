// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.galileo;

import android.bluetooth.BluetoothDevice;
import com.fitbit.bluetooth.b;
import java.util.UUID;

public interface GalileoProfile
    extends b
{

    public static final String a = "com.fitbit.bluetooth.galileo.ACTION_PROFILE_CONNECTED";
    public static final String b = "com.fitbit.bluetooth.galileo.ACTION_PROFILE_DISCONNECTED";
    public static final String c = "com.fitbit.bluetooth.galileo.ACTION_APP_REGISTERED";
    public static final String d = "com.fitbit.bluetooth.galileo.ACTION_APP_UNREGISTERED";
    public static final String e = "com.fitbit.bluetooth.galileo.ACTION_DEVICE_CONNECTED";
    public static final String f = "com.fitbit.bluetooth.galileo.ACTION_DEVICE_DISCONNECTED";
    public static final String g = "com.fitbit.bluetooth.galileo.ACTION_SERVICES_DISCOVERED";
    public static final String h = "com.fitbit.bluetooth.galileo.ACTION_CHARACTERISTICS_DISCOVERED";
    public static final String i = "com.fitbit.bluetooth.galileo.ACTION_NOTIFICATIONS_ENABLED";
    public static final String j = "com.fitbit.bluetooth.galileo.ACTION_NOTIFICATIONS_DISABLED";
    public static final String k = "adab%s-6e7d-4601-bda2-bffaa68956ba";
    public static final UUID l = UUID.fromString(String.format("adab%s-6e7d-4601-bda2-bffaa68956ba", new Object[] {
        "fb00"
    }));
    public static final UUID m = UUID.fromString("FFFF0000-FFFF-FFFF-FFFF-FFFFFFFFFFFF");
    public static final UUID n = UUID.fromString("adabfb01-6e7d-4601-bda2-bffaa68956ba");
    public static final UUID o = UUID.fromString("adabfb02-6e7d-4601-bda2-bffaa68956ba");
    public static final UUID p = UUID.fromString("adabfb03-6e7d-4601-bda2-bffaa68956ba");
    public static final UUID q = UUID.fromString("adabfb04-6e7d-4601-bda2-bffaa68956ba");
    public static final UUID r = UUID.fromString("558dfa00-4fa8-4105-9f02-4eaa93e62980");
    public static final UUID s = UUID.fromString("558dfa01-4fa8-4105-9f02-4eaa93e62980");

    public abstract boolean discoverServices(BluetoothDevice bluetoothdevice);

    public abstract boolean hasLiveDataService(BluetoothDevice bluetoothdevice);

    public abstract boolean hasStatusCharacteristic(BluetoothDevice bluetoothdevice);

    public abstract boolean isDncsSupported(BluetoothDevice bluetoothdevice);

    public abstract void makeCleanupAfterUnconfirmedDisconnect();

    public abstract boolean readSecureCharacteristic(BluetoothDevice bluetoothdevice);

    public abstract boolean readStatusCharacteristic(BluetoothDevice bluetoothdevice);

    public abstract boolean setFitbitNotificationsEnabled(BluetoothDevice bluetoothdevice, boolean flag);

    public abstract void setListener(GalileoProfileListener galileoprofilelistener);

    public abstract boolean setLiveDataNotificationsEnabled(BluetoothDevice bluetoothdevice, boolean flag);

    public abstract boolean writeValue(BluetoothDevice bluetoothdevice, byte abyte0[]);


    // Unreferenced inner class com/fitbit/bluetooth/galileo/GalileoProfile$GalileoProfileListener
    /* block-local class not found */
    class GalileoProfileListener {}

}
