// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks;

import android.content.IntentFilter;
import com.fitbit.bluetooth.commands.CommandName;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.bluetooth.connection.d;
import com.fitbit.bluetooth.connection.e;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;
import java.util.UUID;

// Referenced classes of package com.fitbit.galileo.tasks.subtasks:
//            GalileoSubTask

public abstract class k extends GalileoSubTask
{

    private c a;

    public k()
    {
        a = new _cls1(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d);
    }

    protected abstract boolean a(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus);

    protected void b()
    {
        BluetoothConnectionServiceStatus bluetoothconnectionservicestatus = com.fitbit.bluetooth.connection.d.a().b();
        if (!e.a(bluetoothconnectionservicestatus))
        {
            a(false);
        } else
        if (!a(bluetoothconnectionservicestatus))
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED");
            intentfilter.addAction("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_COMMAND_FINISHED");
            a.a(intentfilter);
            if (!a(g()))
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
        a.d();
    }

    protected void d()
    {
        com.fitbit.bluetooth.connection.c.p();
    }

    protected abstract CommandName f();

    protected abstract UUID g();

    protected boolean x_()
    {
        com.fitbit.e.a.a(e(), "Retrying ...", new Object[0]);
        return a(g());
    }

    /* member class not found */
    class _cls1 {}

}
