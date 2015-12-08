// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.IBluetoothGattProfile;
import android.os.ParcelUuid;

// Referenced classes of package com.fitbit.bluetooth:
//            r

class a
    implements a
{

    final tor a;

    public boolean a()
        throws Throwable
    {
        Class class1 = Class.forName("android.bluetooth.BluetoothGattService");
        class1.getConstructor(new Class[] {
            android/bluetooth/BluetoothDevice, android/os/ParcelUuid, java/lang/String, android/bluetooth/IBluetoothGattProfile
        });
        class1.getMethod("getCharacteristics", new Class[0]);
        class1.getMethod("getCharacteristicUuid", new Class[] {
            java/lang/String
        });
        class1.getMethod("registerWatcher", new Class[0]);
        class1.getMethod("deregisterWatcher", new Class[0]);
        class1.getMethod("setCharacteristicClientConf", new Class[] {
            java/lang/String, Integer.TYPE
        });
        class1.getMethod("close", new Class[0]);
        class1.getMethod("writeCharacteristicRaw", new Class[] {
            java/lang/String, [B, Boolean.TYPE
        });
        android/bluetooth/BluetoothDevice.getMethod("getGattServices", new Class[0]);
        return true;
    }

    hGattProfile(hGattProfile hgattprofile)
    {
        a = hgattprofile;
        super();
    }
}
