// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks;

import android.content.IntentFilter;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.bluetooth.connection.d;

// Referenced classes of package com.fitbit.galileo.tasks.subtasks:
//            GalileoSubTask

public class c extends GalileoSubTask
{

    private static final String a = "CloseSessionSubTask";
    private com.fitbit.util.threading.c b;

    public c()
    {
        b = new _cls1(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d);
    }

    protected void b()
    {
        BluetoothConnectionServiceStatus bluetoothconnectionservicestatus = com.fitbit.bluetooth.connection.d.a().b();
        if (!bluetoothconnectionservicestatus.c() || !bluetoothconnectionservicestatus.f())
        {
            a(true);
        } else
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED");
            intentfilter.addAction("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_COMMAND_FINISHED");
            b.a(intentfilter);
            if (!a(com.fitbit.bluetooth.connection.c.d()))
            {
                a(false);
                return;
            }
        }
    }

    protected void c()
    {
        b.d();
    }

    protected void d()
    {
        com.fitbit.bluetooth.connection.c.p();
    }

    public String e()
    {
        return "CloseSessionSubTask";
    }

    /* member class not found */
    class _cls1 {}

}
