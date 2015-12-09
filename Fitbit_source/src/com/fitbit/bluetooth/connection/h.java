// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import android.bluetooth.BluetoothDevice;
import com.fitbit.bluetooth.Manufacturer;
import com.fitbit.bluetooth.k;
import com.fitbit.bluetooth.n;
import com.fitbit.bluetooth.samsung.a.b;

// Referenced classes of package com.fitbit.bluetooth.connection:
//            g

public final class h
{

    public h()
    {
    }

    public static g a(BluetoothDevice bluetoothdevice)
    {
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1.a[n.a().a().ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return new b(bluetoothdevice);

        case 2: // '\002'
            return new com.fitbit.bluetooth.c.a.b(bluetoothdevice);

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return new com.fitbit.bluetooth.broadcom.a.b(bluetoothdevice);
        }
    }
}
