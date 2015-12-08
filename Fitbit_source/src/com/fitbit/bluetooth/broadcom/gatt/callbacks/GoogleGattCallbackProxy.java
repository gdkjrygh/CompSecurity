// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt.callbacks;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.fitbit.bluetooth.broadcom.gatt.e;
import com.fitbit.bluetooth.broadcom.gatt.g;
import com.fitbit.bluetooth.broadcom.gatt.j;
import com.fitbit.bluetooth.broadcom.gatt.l;

final class GoogleGattCallbackProxy extends BluetoothGattCallback
    implements android.bluetooth.BluetoothAdapter.LeScanCallback
{

    private e callbackTarget;

    public GoogleGattCallbackProxy(e e1)
    {
        callbackTarget = e1;
    }

    public void onCharacteristicChanged(BluetoothGatt bluetoothgatt, BluetoothGattCharacteristic bluetoothgattcharacteristic)
    {
        callbackTarget.a((g)l.a().a(com/fitbit/bluetooth/broadcom/gatt/g, bluetoothgattcharacteristic));
    }

    public void onCharacteristicRead(BluetoothGatt bluetoothgatt, BluetoothGattCharacteristic bluetoothgattcharacteristic, int i)
    {
        callbackTarget.a((g)l.a().a(com/fitbit/bluetooth/broadcom/gatt/g, bluetoothgattcharacteristic), i);
    }

    public void onCharacteristicWrite(BluetoothGatt bluetoothgatt, BluetoothGattCharacteristic bluetoothgattcharacteristic, int i)
    {
        callbackTarget.b((g)l.a().a(com/fitbit/bluetooth/broadcom/gatt/g, bluetoothgattcharacteristic), i);
    }

    public void onConnectionStateChange(BluetoothGatt bluetoothgatt, int i, int k)
    {
        callbackTarget.a(bluetoothgatt.getDevice(), i, k);
    }

    public void onDescriptorRead(BluetoothGatt bluetoothgatt, BluetoothGattDescriptor bluetoothgattdescriptor, int i)
    {
        callbackTarget.a((j)l.a().a(com/fitbit/bluetooth/broadcom/gatt/j, bluetoothgattdescriptor), i);
    }

    public void onDescriptorWrite(BluetoothGatt bluetoothgatt, BluetoothGattDescriptor bluetoothgattdescriptor, int i)
    {
        callbackTarget.b((j)l.a().a(com/fitbit/bluetooth/broadcom/gatt/j, bluetoothgattdescriptor), i);
    }

    public void onLeScan(BluetoothDevice bluetoothdevice, int i, byte abyte0[])
    {
        callbackTarget.a(bluetoothdevice, i, abyte0);
    }

    public void onReadRemoteRssi(BluetoothGatt bluetoothgatt, int i, int k)
    {
        callbackTarget.b(bluetoothgatt.getDevice(), i, k);
    }

    public void onReliableWriteCompleted(BluetoothGatt bluetoothgatt, int i)
    {
        callbackTarget.b(bluetoothgatt.getDevice(), i);
    }

    public void onServicesDiscovered(BluetoothGatt bluetoothgatt, int i)
    {
        callbackTarget.a(bluetoothgatt.getDevice(), i);
    }
}
