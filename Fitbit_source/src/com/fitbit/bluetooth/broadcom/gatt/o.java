// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothDevice;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            p, s, g, j

public abstract class o
{

    protected final Object a = p.a(this);

    public o()
    {
    }

    public abstract void a(int i);

    public abstract void a(int i, s s);

    public abstract void a(BluetoothDevice bluetoothdevice, int i, int j);

    public abstract void a(BluetoothDevice bluetoothdevice, int i, int j, g g);

    public abstract void a(BluetoothDevice bluetoothdevice, int i, int j, j j1);

    public abstract void a(BluetoothDevice bluetoothdevice, int i, g g, boolean flag, boolean flag1, int j, byte abyte0[]);

    public abstract void a(BluetoothDevice bluetoothdevice, int i, j j, boolean flag, boolean flag1, int k, byte abyte0[]);

    public abstract void a(BluetoothDevice bluetoothdevice, int i, boolean flag);

    public abstract void a(BluetoothDevice bluetoothdevice, int i, byte abyte0[]);
}
