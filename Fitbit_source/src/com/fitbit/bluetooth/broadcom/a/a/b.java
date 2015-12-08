// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.a.a;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.bluetooth.broadcom.a.a;
import com.fitbit.bluetooth.connection.f;
import com.fitbit.bluetooth.connection.g;

public abstract class b extends com.fitbit.bluetooth.connection.a.b
{

    public b(g g1)
    {
        super(g1);
    }

    protected void a(Intent intent)
    {
        BluetoothDevice bluetoothdevice = (BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (a.l().equals(bluetoothdevice) && "com.fitbit.bluetooth.galileo.ACTION_DEVICE_DISCONNECTED".equals(intent.getAction()))
        {
            d();
        }
    }

    protected abstract void d();

    protected com.fitbit.bluetooth.connection.f.a e()
    {
        return null;
    }

    protected void f()
    {
    }

    protected void g()
    {
    }

    protected boolean h()
    {
        f f1 = a.n();
        if (f1.c(a.h) || i())
        {
            f1.b(a.h);
            return false;
        } else
        {
            f1.a(a.h);
            return true;
        }
    }

    protected boolean i()
    {
        boolean flag;
        if (!com.fitbit.bluetooth.g.g())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.fitbit.e.a.a(c(), "Bluetooth is turned off.", new Object[0]);
        return flag;
    }

    protected IntentFilter j()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.bluetooth.galileo.ACTION_DEVICE_DISCONNECTED");
        return intentfilter;
    }
}
