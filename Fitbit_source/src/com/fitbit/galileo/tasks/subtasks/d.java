// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks;

import android.bluetooth.BluetoothDevice;
import android.content.IntentFilter;
import com.fitbit.bluetooth.connection.BluetoothConnectionController;
import com.fitbit.bluetooth.connection.e;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.galileo.tasks.subtasks:
//            GalileoSubTask

public class d extends GalileoSubTask
{

    private static final String a = "ConnectTrackerSubTask";
    private final BluetoothDevice b;
    private final com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer c;
    private boolean d;
    private c e;

    public d(BluetoothDevice bluetoothdevice, com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer connectionconsumer)
    {
        d = false;
        e = new _cls1(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d);
        b = bluetoothdevice;
        c = connectionconsumer;
    }

    static boolean a(d d1)
    {
        return d1.d;
    }

    protected void b()
    {
        if (b == null)
        {
            a(false);
        } else
        {
            if (com.fitbit.bluetooth.connection.e.b())
            {
                a(true);
                return;
            }
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED");
            intentfilter.addAction("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_DISCONNECTED");
            e.a(intentfilter);
            if (!a(com.fitbit.bluetooth.connection.c.a(b)))
            {
                a(false);
                return;
            }
        }
    }

    protected void c()
    {
        e.d();
        if (j())
        {
            BluetoothConnectionController.a().a(c);
        }
    }

    protected void d()
    {
        d = true;
        com.fitbit.bluetooth.connection.c.a();
    }

    public String e()
    {
        return "ConnectTrackerSubTask";
    }

    protected boolean x_()
    {
        com.fitbit.e.a.a("ConnectTrackerSubTask", "Retrying ...", new Object[0]);
        return a(com.fitbit.bluetooth.connection.c.a(b));
    }

    /* member class not found */
    class _cls1 {}

}
