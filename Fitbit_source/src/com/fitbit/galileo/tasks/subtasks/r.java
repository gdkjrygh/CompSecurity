// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks;

import android.content.IntentFilter;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.bluetooth.connection.d;
import com.fitbit.bluetooth.connection.e;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.galileo.tasks.subtasks:
//            GalileoSubTask

public class r extends GalileoSubTask
{

    private static final String a = "OpenSessionSubTask";
    private final com.fitbit.galileo.ota.GalileoOtaMessages.BootMode b;
    private c c;

    public r()
    {
        this(null);
    }

    public r(com.fitbit.galileo.ota.GalileoOtaMessages.BootMode bootmode)
    {
        c = new _cls1(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d);
        b = bootmode;
    }

    static com.fitbit.galileo.ota.GalileoOtaMessages.BootMode a(r r1)
    {
        return r1.b;
    }

    protected void b()
    {
        BluetoothConnectionServiceStatus bluetoothconnectionservicestatus = com.fitbit.bluetooth.connection.d.a().b();
        if (!com.fitbit.bluetooth.connection.e.d(bluetoothconnectionservicestatus))
        {
            a(false);
        } else
        if (!bluetoothconnectionservicestatus.f())
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED");
            intentfilter.addAction("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_COMMAND_FINISHED");
            c.a(intentfilter);
            if (!a(com.fitbit.bluetooth.connection.c.a(b)))
            {
                a(false);
                return;
            }
        } else
        {
            a(true);
            return;
        }
    }

    protected void c()
    {
        c.d();
    }

    protected void d()
    {
        com.fitbit.bluetooth.connection.c.p();
    }

    public String e()
    {
        return "OpenSessionSubTask";
    }

    /* member class not found */
    class _cls1 {}

}
