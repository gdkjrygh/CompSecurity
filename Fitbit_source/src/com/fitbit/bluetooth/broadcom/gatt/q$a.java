// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import bluetooth.le.a.c;
import com.fitbit.bluetooth.broadcom.a;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            q, g, j

private class <init> extends c
{

    final q b;

    public void a(int i, BluetoothGattService bluetoothgattservice)
    {
        com.fitbit.e.a.a("FitbitGattServerProfile", "onServiceAdded: status = %s, service = %s", new Object[] {
            com.fitbit.bluetooth.broadcom.a.a(i), bluetoothgattservice
        });
    }

    public void a(BluetoothDevice bluetoothdevice, int i, int k)
    {
        com.fitbit.e.a.a("FitbitGattServerProfile", "Connection state changed. Status: %s. New state: %s", new Object[] {
            com.fitbit.bluetooth.broadcom.a.a(i), com.fitbit.bluetooth.broadcom.a.b(k)
        });
        switch (k)
        {
        case 1: // '\001'
        default:
            return;

        case 2: // '\002'
            b.a(bluetoothdevice);
            return;

        case 0: // '\0'
            b.b(bluetoothdevice);
            return;
        }
    }

    public void a(BluetoothDevice bluetoothdevice, int i, BluetoothGattCharacteristic bluetoothgattcharacteristic, boolean flag, boolean flag1, int k, byte abyte0[])
    {
        com.fitbit.e.a.a("FitbitGattServerProfile", "onCharacteristicWriteRequest: requestId = %s, characteristic = %s, preparedWrite = %s, responseNeeded = %s, offset = %s, value = %s", new Object[] {
            Integer.valueOf(i), bluetoothgattcharacteristic, Boolean.valueOf(flag), Boolean.valueOf(flag1), Integer.valueOf(k), com.fitbit.galileo.a.c.a(abyte0)
        });
        b.a(bluetoothdevice, i, new g(bluetoothgattcharacteristic), flag, flag1, k, abyte0);
    }

    public void a(BluetoothDevice bluetoothdevice, int i, BluetoothGattDescriptor bluetoothgattdescriptor, boolean flag, boolean flag1, int k, byte abyte0[])
    {
        com.fitbit.e.a.a("FitbitGattServerProfile", "onDescriptorWriteRequest: requestId = %s, descriptor = %s, preparedWrite = %s, responseNeeded = %s, offset = %s, value = %s", new Object[] {
            Integer.valueOf(i), bluetoothgattdescriptor, Boolean.valueOf(flag), Boolean.valueOf(flag1), Integer.valueOf(k), com.fitbit.galileo.a.c.a(abyte0)
        });
        b.a(bluetoothdevice, i, new j(bluetoothgattdescriptor), flag, flag1, k, abyte0);
    }

    private or(q q1)
    {
        b = q1;
        super();
    }

    b(q q1, b b1)
    {
        this(q1);
    }
}
