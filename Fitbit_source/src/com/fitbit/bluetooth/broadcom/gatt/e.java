// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothDevice;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            f, g, j

public abstract class e
{

    protected final Object a = f.a(this);

    e()
    {
    }

    public abstract void a(int i);

    public abstract void a(BluetoothDevice bluetoothdevice, int i);

    public abstract void a(BluetoothDevice bluetoothdevice, int i, int j);

    public abstract void a(BluetoothDevice bluetoothdevice, int i, byte abyte0[]);

    public abstract void a(g g);

    public abstract void a(g g, int i);

    public abstract void a(j j, int i);

    public abstract void b(BluetoothDevice bluetoothdevice, int i);

    public abstract void b(BluetoothDevice bluetoothdevice, int i, int j);

    public abstract void b(g g, int i);

    public abstract void b(j j, int i);
}
