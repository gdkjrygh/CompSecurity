// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothDevice;
import com.fitbit.bluetooth.Manufacturer;
import com.fitbit.bluetooth.broadcom.gatt.a.f;
import com.fitbit.bluetooth.broadcom.gatt.a.g;
import com.fitbit.bluetooth.k;
import com.fitbit.bluetooth.n;
import com.fitbit.util.g.a;
import java.lang.reflect.Method;
import java.util.UUID;

final class r extends a
{

    static Method a;
    static Method b;
    static Method c;
    static Method d;
    static Method e;
    static Method f;
    static Method g;
    static Method h;
    static Method i;
    static Method j;
    static Method k;
    static Method l;
    static Method m;
    static Method n;

    r()
    {
    }

    public void a(Class class1)
        throws Throwable
    {
        f f1 = com.fitbit.bluetooth.broadcom.gatt.a.g.a();
        d = class1.getMethod("connect", new Class[] {
            android/bluetooth/BluetoothDevice, Boolean.TYPE
        });
        e = class1.getMethod("cancelConnection", new Class[] {
            android/bluetooth/BluetoothDevice
        });
        f = class1.getMethod("addService", new Class[] {
            f1.e()
        });
        g = class1.getMethod("removeService", new Class[] {
            f1.e()
        });
        h = class1.getMethod("clearServices", new Class[0]);
        i = class1.getMethod("getServices", new Class[0]);
        j = class1.getMethod("getService", new Class[] {
            java/util/UUID
        });
        k = class1.getMethod("getConnectionState", new Class[] {
            android/bluetooth/BluetoothDevice
        });
        l = class1.getMethod("getConnectedDevices", new Class[0]);
        m = class1.getMethod("sendResponse", new Class[] {
            android/bluetooth/BluetoothDevice, Integer.TYPE, Integer.TYPE, Integer.TYPE, [B
        });
        n = class1.getMethod("notifyCharacteristicChanged", new Class[] {
            android/bluetooth/BluetoothDevice, f1.c(), Boolean.TYPE
        });
        Manufacturer manufacturer = com.fitbit.bluetooth.n.a().a();
        if (Manufacturer.f.equals(manufacturer) || Manufacturer.d.equals(manufacturer))
        {
            a = class1.getMethod("registerApp", new Class[] {
                f1.k()
            });
            b = class1.getMethod("unregisterApp", new Class[0]);
        }
        if (Manufacturer.f.equals(manufacturer))
        {
            c = class1.getMethod("clearServices", new Class[0]);
            return;
        } else
        {
            c = class1.getMethod("close", new Class[0]);
            return;
        }
    }
}
