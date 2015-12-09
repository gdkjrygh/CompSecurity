// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;

// Referenced classes of package com.fitbit.bluetooth:
//            k, Manufacturer

class j
    implements k
{

    protected final BluetoothAdapter a = BluetoothAdapter.getDefaultAdapter();

    j()
    {
    }

    public Manufacturer a()
    {
        return Manufacturer.a;
    }

    public boolean a(BluetoothDevice bluetoothdevice, Bundle bundle)
    {
        return false;
    }

    public boolean b()
    {
        return false;
    }

    public boolean c()
    {
        return false;
    }

    public boolean d()
    {
        return a.disable();
    }

    public boolean e()
    {
        return a.enable();
    }
}
