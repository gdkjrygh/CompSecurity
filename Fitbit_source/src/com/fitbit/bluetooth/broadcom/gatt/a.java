// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.fitbit.bluetooth.broadcom.gatt.a.f;
import com.fitbit.bluetooth.broadcom.gatt.a.g;
import java.lang.reflect.Method;

final class a extends com.fitbit.util.g.a
{

    static Method a;
    static Method b;
    static Method c;

    a()
    {
    }

    public void a(Class class1)
        throws Throwable
    {
        a = class1.getMethod("openGattServer", new Class[] {
            android/content/Context, g.a().k()
        });
        b = class1.getMethod("getConnectedDevices", new Class[] {
            Integer.TYPE
        });
        c = class1.getMethod("getConnectionState", new Class[] {
            android/bluetooth/BluetoothDevice, Integer.TYPE
        });
    }
}
