// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import android.bluetooth.BluetoothDevice;
import com.fitbit.bluetooth.AirlinkSession;

// Referenced classes of package com.fitbit.bluetooth.connection:
//            BluetoothConnectionServiceStatus

public static class c
{

    private int a;
    private BluetoothDevice b;
    private AirlinkSession c;

    private c a(int i, boolean flag)
    {
        if (flag)
        {
            a = a | i;
            return this;
        } else
        {
            a = a & ~i;
            return this;
        }
    }

    public a a(BluetoothDevice bluetoothdevice)
    {
        b = bluetoothdevice;
        return this;
    }

    public b a(boolean flag)
    {
        return a(1, flag);
    }

    public a a(boolean flag, AirlinkSession airlinksession)
    {
        c = airlinksession;
        return a(8, flag);
    }

    public BluetoothConnectionServiceStatus a()
    {
        return new BluetoothConnectionServiceStatus(a, b, c);
    }

    public c b(boolean flag)
    {
        return a(2, flag);
    }

    public a c(boolean flag)
    {
        return a(4, flag);
    }

    public a d(boolean flag)
    {
        return a(16, flag);
    }

    public String toString()
    {
        return BluetoothConnectionServiceStatus.a(a, b, null);
    }

    public ()
    {
        a = 0;
        b = null;
        c = null;
    }

    public c(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        a = bluetoothconnectionservicestatus.a();
        b = bluetoothconnectionservicestatus.h();
        c = BluetoothConnectionServiceStatus.a(bluetoothconnectionservicestatus);
    }
}
