// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

// Referenced classes of package com.fitbit.bluetooth:
//            u

class a
    implements a
{

    final a a;

    public boolean a()
        throws Throwable
    {
        Class.forName("com.samsung.bluetoothle.BluetoothLEClientProfile");
        android/bluetooth/BluetoothAdapter.getMethod("startLeDiscovery", new Class[0]);
        android/bluetooth/BluetoothDevice.getMethod("getDeviceType", new Class[0]);
        return true;
    }

    Device(Device device)
    {
        a = device;
        super();
    }
}
