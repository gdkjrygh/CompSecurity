// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.fitbit.bluetooth.Manufacturer;
import com.fitbit.bluetooth.broadcom.gatt.a.f;
import com.fitbit.bluetooth.broadcom.gatt.a.g;
import com.fitbit.bluetooth.k;
import com.fitbit.util.g.a;
import com.fitbit.util.g.b;
import java.lang.reflect.Method;
import java.util.UUID;

final class n extends a
{

    static Method A;
    static int a = 0;
    static int b = 2;
    static int c = 3;
    static int d = 5;
    static int e = 6;
    static int f = 15;
    static int g = 7;
    static int h = 13;
    static int i = 257;
    static Method j;
    static Method k;
    static Method l;
    static Method m;
    static Method n;
    static Method o;
    static Method p;
    static Method q;
    static Method r;
    static Method s;
    static Method t;
    static Method u;
    static Method v;
    static Method w;
    static Method x;
    static Method y;
    static Method z;

    n()
    {
    }

    public void a(Class class1)
        throws Throwable
    {
        f f1 = com.fitbit.bluetooth.broadcom.gatt.a.g.a();
        a = ((Integer)com.fitbit.util.g.b.a(class1, "GATT_SUCCESS")).intValue();
        b = ((Integer)com.fitbit.util.g.b.a(class1, "GATT_READ_NOT_PERMITTED")).intValue();
        c = ((Integer)com.fitbit.util.g.b.a(class1, "GATT_WRITE_NOT_PERMITTED")).intValue();
        d = ((Integer)com.fitbit.util.g.b.a(class1, "GATT_INSUFFICIENT_AUTHENTICATION")).intValue();
        e = ((Integer)com.fitbit.util.g.b.a(class1, "GATT_REQUEST_NOT_SUPPORTED")).intValue();
        f = ((Integer)com.fitbit.util.g.b.a(class1, "GATT_INSUFFICIENT_ENCRYPTION")).intValue();
        g = ((Integer)com.fitbit.util.g.b.a(class1, "GATT_INVALID_OFFSET")).intValue();
        h = ((Integer)com.fitbit.util.g.b.a(class1, "GATT_INVALID_ATTRIBUTE_LENGTH")).intValue();
        i = ((Integer)com.fitbit.util.g.b.a(class1, "GATT_FAILURE", Integer.valueOf(257))).intValue();
        Manufacturer manufacturer = com.fitbit.bluetooth.n.a().a();
        if (Manufacturer.e.equals(manufacturer))
        {
            A = class1.getMethod("getDevice", new Class[0]);
            l = class1.getMethod("connect", new Class[0]);
            m = android/bluetooth/BluetoothDevice.getMethod("connectGatt", new Class[] {
                android/content/Context, Boolean.TYPE, f1.h()
            });
            n = class1.getMethod("disconnect", new Class[0]);
            p = class1.getMethod("discoverServices", new Class[0]);
            q = class1.getMethod("getService", new Class[] {
                java/util/UUID
            });
            r = class1.getMethod("getServices", new Class[0]);
            s = class1.getMethod("refresh", new Class[0]);
            t = class1.getMethod("setCharacteristicNotification", new Class[] {
                f1.c(), Boolean.TYPE
            });
            v = class1.getMethod("writeDescriptor", new Class[] {
                f1.a()
            });
            w = class1.getMethod("writeCharacteristic", new Class[] {
                f1.c()
            });
            u = class1.getMethod("readCharacteristic", new Class[] {
                f1.c()
            });
            x = android/bluetooth/BluetoothAdapter.getMethod("startLeScan", new Class[] {
                f1.o()
            });
            y = android/bluetooth/BluetoothAdapter.getMethod("stopLeScan", new Class[] {
                f1.o()
            });
            z = class1.getMethod("close", new Class[0]);
            return;
        } else
        {
            j = class1.getMethod("registerApp", new Class[] {
                f1.h()
            });
            k = class1.getMethod("unregisterApp", new Class[0]);
            l = class1.getMethod("connect", new Class[] {
                android/bluetooth/BluetoothDevice, Boolean.TYPE
            });
            n = class1.getMethod("cancelConnection", new Class[] {
                android/bluetooth/BluetoothDevice
            });
            o = class1.getMethod("getConnectionState", new Class[] {
                android/bluetooth/BluetoothDevice
            });
            p = class1.getMethod("discoverServices", new Class[] {
                android/bluetooth/BluetoothDevice
            });
            q = class1.getMethod("getService", new Class[] {
                android/bluetooth/BluetoothDevice, java/util/UUID
            });
            r = class1.getMethod("getServices", new Class[] {
                android/bluetooth/BluetoothDevice
            });
            t = class1.getMethod("setCharacteristicNotification", new Class[] {
                f1.c(), Boolean.TYPE
            });
            v = class1.getMethod("writeDescriptor", new Class[] {
                f1.a()
            });
            w = class1.getMethod("writeCharacteristic", new Class[] {
                f1.c()
            });
            u = class1.getMethod("readCharacteristic", new Class[] {
                f1.c()
            });
            x = class1.getMethod("startScan", new Class[0]);
            y = class1.getMethod("stopScan", new Class[0]);
            return;
        }
    }

}
