// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.bluetooth.BluetoothDevice;

public interface b
{

    public abstract boolean cancelConnection(BluetoothDevice bluetoothdevice);

    public abstract boolean connect(BluetoothDevice bluetoothdevice);

    public abstract boolean connectProfile();

    public abstract boolean disconnectProfile();

    public abstract boolean registerApplication();

    public abstract boolean unregisterApplication();
}
