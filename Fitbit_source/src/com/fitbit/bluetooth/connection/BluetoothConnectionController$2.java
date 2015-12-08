// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import com.fitbit.e.a;
import com.fitbit.galileo.bluetooth.GalileoTaskExecutor;
import com.fitbit.galileo.bluetooth.f;

// Referenced classes of package com.fitbit.bluetooth.connection:
//            BluetoothConnectionController

class a extends GalileoTaskExecutor
{

    final BluetoothConnectionController a;

    protected void a()
    {
        synchronized (com.fitbit.bluetooth.connection.BluetoothConnectionController.a(a))
        {
            if (BluetoothConnectionController.c(a) == this)
            {
                com.fitbit.e.a.a("BluetoothConnectionController", "Disconnection task completed", new Object[0]);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void b()
    {
        synchronized (com.fitbit.bluetooth.connection.BluetoothConnectionController.a(a))
        {
            if (BluetoothConnectionController.c(a) == this)
            {
                com.fitbit.e.a.a("BluetoothConnectionController", "Disconnection task cancelled", new Object[0]);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void c()
    {
        synchronized (com.fitbit.bluetooth.connection.BluetoothConnectionController.a(a))
        {
            if (BluetoothConnectionController.c(a) == this)
            {
                com.fitbit.e.a.a("BluetoothConnectionController", "Disconnection task failed", new Object[0]);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void d()
    {
        synchronized (com.fitbit.bluetooth.connection.BluetoothConnectionController.a(a))
        {
            if (BluetoothConnectionController.c(a) == this)
            {
                BluetoothConnectionController.d(a);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (BluetoothConnectionController bluetoothconnectioncontroller, f f, com.fitbit.galileo.bluetooth.a a1, com.fitbit.util.threading.ler ler)
    {
        a = bluetoothconnectioncontroller;
        super(f, a1, ler);
    }
}
