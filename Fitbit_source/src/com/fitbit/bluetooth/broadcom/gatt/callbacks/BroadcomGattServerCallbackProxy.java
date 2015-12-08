// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt.callbacks;

import android.bluetooth.BluetoothDevice;
import com.broadcom.bt.gatt.BluetoothGattCharacteristic;
import com.broadcom.bt.gatt.BluetoothGattDescriptor;
import com.broadcom.bt.gatt.BluetoothGattServerCallback;
import com.fitbit.bluetooth.broadcom.gatt.g;
import com.fitbit.bluetooth.broadcom.gatt.j;
import com.fitbit.bluetooth.broadcom.gatt.l;
import com.fitbit.bluetooth.broadcom.gatt.o;
import com.fitbit.bluetooth.broadcom.gatt.s;

final class BroadcomGattServerCallbackProxy extends BluetoothGattServerCallback
{

    private final o callbackTarget;

    public BroadcomGattServerCallbackProxy(o o1)
    {
        callbackTarget = o1;
    }

    public void onAppRegistered(int i)
    {
        callbackTarget.a(i);
    }

    public void onCharacteristicReadRequest(BluetoothDevice bluetoothdevice, int i, int k, BluetoothGattCharacteristic bluetoothgattcharacteristic)
    {
        callbackTarget.a(bluetoothdevice, i, k, (g)l.a().a(com/fitbit/bluetooth/broadcom/gatt/g, bluetoothgattcharacteristic));
    }

    public void onCharacteristicWriteRequest(BluetoothDevice bluetoothdevice, int i, BluetoothGattCharacteristic bluetoothgattcharacteristic, boolean flag, boolean flag1, int k, byte abyte0[])
    {
        callbackTarget.a(bluetoothdevice, i, (g)l.a().a(com/fitbit/bluetooth/broadcom/gatt/g, bluetoothgattcharacteristic), flag, flag1, k, abyte0);
    }

    public void onConnectionStateChange(BluetoothDevice bluetoothdevice, int i, int k)
    {
        callbackTarget.a(bluetoothdevice, i, k);
    }

    public void onDescriptorReadRequest(BluetoothDevice bluetoothdevice, int i, int k, BluetoothGattDescriptor bluetoothgattdescriptor)
    {
        callbackTarget.a(bluetoothdevice, i, k, (j)l.a().a(com/fitbit/bluetooth/broadcom/gatt/j, bluetoothgattdescriptor));
    }

    public void onDescriptorWriteRequest(BluetoothDevice bluetoothdevice, int i, BluetoothGattDescriptor bluetoothgattdescriptor, boolean flag, boolean flag1, int k, byte abyte0[])
    {
        callbackTarget.a(bluetoothdevice, i, (j)l.a().a(com/fitbit/bluetooth/broadcom/gatt/j, bluetoothgattdescriptor), flag, flag1, k, abyte0);
    }

    public void onExecuteWrite(BluetoothDevice bluetoothdevice, int i, boolean flag)
    {
        callbackTarget.a(bluetoothdevice, i, flag);
    }

    public void onScanResult(BluetoothDevice bluetoothdevice, int i, byte abyte0[])
    {
        callbackTarget.a(bluetoothdevice, i, abyte0);
    }

    public void onServiceAdded(int i, s s)
    {
        callbackTarget.a(i, s);
    }
}
