// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt.callbacks;

import android.bluetooth.BluetoothDevice;
import com.broadcom.bt.gatt.BluetoothGattCallback;
import com.broadcom.bt.gatt.BluetoothGattCharacteristic;
import com.broadcom.bt.gatt.BluetoothGattDescriptor;
import com.fitbit.bluetooth.broadcom.gatt.e;
import com.fitbit.bluetooth.broadcom.gatt.g;
import com.fitbit.bluetooth.broadcom.gatt.j;
import com.fitbit.bluetooth.broadcom.gatt.l;

final class BroadcomGattCallbackProxy extends BluetoothGattCallback
{

    private final e callbackTarget;

    public BroadcomGattCallbackProxy(e e1)
    {
        callbackTarget = e1;
    }

    public void onAppRegistered(int i)
    {
        callbackTarget.a(i);
    }

    public void onCharacteristicChanged(BluetoothGattCharacteristic bluetoothgattcharacteristic)
    {
        callbackTarget.a((g)l.a().a(com/fitbit/bluetooth/broadcom/gatt/g, bluetoothgattcharacteristic));
    }

    public void onCharacteristicRead(BluetoothGattCharacteristic bluetoothgattcharacteristic, int i)
    {
        callbackTarget.a((g)l.a().a(com/fitbit/bluetooth/broadcom/gatt/g, bluetoothgattcharacteristic), i);
    }

    public void onCharacteristicWrite(BluetoothGattCharacteristic bluetoothgattcharacteristic, int i)
    {
        callbackTarget.b((g)l.a().a(com/fitbit/bluetooth/broadcom/gatt/g, bluetoothgattcharacteristic), i);
    }

    public void onConnectionStateChange(BluetoothDevice bluetoothdevice, int i, int k)
    {
        callbackTarget.a(bluetoothdevice, i, k);
    }

    public void onDescriptorRead(BluetoothGattDescriptor bluetoothgattdescriptor, int i)
    {
        callbackTarget.a((j)l.a().a(com/fitbit/bluetooth/broadcom/gatt/j, bluetoothgattdescriptor), i);
    }

    public void onDescriptorWrite(BluetoothGattDescriptor bluetoothgattdescriptor, int i)
    {
        callbackTarget.b((j)l.a().a(com/fitbit/bluetooth/broadcom/gatt/j, bluetoothgattdescriptor), i);
    }

    public void onReadRemoteRssi(BluetoothDevice bluetoothdevice, int i, int k)
    {
        callbackTarget.b(bluetoothdevice, i, k);
    }

    public void onReliableWriteCompleted(BluetoothDevice bluetoothdevice, int i)
    {
        callbackTarget.b(bluetoothdevice, i);
    }

    public void onScanResult(BluetoothDevice bluetoothdevice, int i, byte abyte0[])
    {
        callbackTarget.a(bluetoothdevice, i, abyte0);
    }

    public void onServicesDiscovered(BluetoothDevice bluetoothdevice, int i)
    {
        callbackTarget.a(bluetoothdevice, i);
    }
}
