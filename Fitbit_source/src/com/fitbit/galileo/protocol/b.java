// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.protocol;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.device.Device;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.a.f;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.protocol.commands.c;
import com.fitbit.util.threading.FitbitHandlerThread;

public abstract class b
{

    protected final BluetoothWorker a;
    private a b;
    private c c;
    private final GalileoTrackerType d;
    private final String e;

    protected b(BluetoothWorker bluetoothworker, GalileoTrackerType galileotrackertype, String s, a a1)
    {
        d = galileotrackertype;
        e = s;
        a = bluetoothworker;
        b = a1;
    }

    protected static BluetoothDevice a(Device device)
    {
        String s = com.fitbit.galileo.a.f.b(device.d());
        BluetoothDevice bluetoothdevice = a(s);
        device = bluetoothdevice;
        if (bluetoothdevice == null)
        {
            device = a(com.fitbit.galileo.a.f.a(s));
        }
        return device;
    }

    static BluetoothDevice a(String s)
    {
        BluetoothAdapter bluetoothadapter = BluetoothAdapter.getDefaultAdapter();
        try
        {
            s = bluetoothadapter.getRemoteDevice(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    static c a(b b1)
    {
        return b1.c;
    }

    public static void a(Runnable runnable)
    {
        FitbitHandlerThread.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.b, runnable);
    }

    protected void a()
    {
        if (b != null)
        {
            a a1 = b;
            b = null;
    /* block-local class not found */
    class a {}

            a1.a(this);
        }
    }

    protected abstract void a(BluetoothDevice bluetoothdevice);

    protected void a(com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType failuretype)
    {
        if (b != null)
        {
            a a1 = b;
            b = null;
            a1.a(this, failuretype);
        }
    }

    protected void b()
    {
        if (b != null)
        {
            a a1 = b;
            b = null;
            a1.b(this);
        }
    }

    public BluetoothWorker c()
    {
        return a;
    }

    protected final boolean d()
    {
        boolean flag = true;
        if (a == null || !a.d())
        {
            flag = false;
        } else
        if (c == null || !c.isStarted())
        {
            c = new c(FitBitApplication.a(), a, d, e);
            c.registerListener(0, new _cls1());
            c.startLoading();
            return true;
        }
        return flag;
    }

    protected abstract boolean e();

    public final void f()
    {
        a(new _cls2());
    }

    protected GalileoTrackerType g()
    {
        return d;
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
