// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.fitbit.bluetooth.commands.CommandName;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.bluetooth.connection.e;
import com.fitbit.util.threading.c;
import java.util.UUID;

// Referenced classes of package com.fitbit.galileo.tasks.subtasks:
//            GalileoSubTask

public abstract class n extends GalileoSubTask
{

    private final CommandName a;
    private c b;

    protected n(CommandName commandname)
    {
        b = new _cls1(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d);
        a = commandname;
    }

    static CommandName a(n n1)
    {
        return n1.a;
    }

    protected void a(com.fitbit.bluetooth.connection.BluetoothConnectionService.CommandCompletionReason commandcompletionreason, Bundle bundle, BluetoothDevice bluetoothdevice)
    {
    }

    protected void a(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        if (!e.f(bluetoothconnectionservicestatus))
        {
            a(new Intent("com.fitbit.galileo.LE_DEVICE_UNABLE_TO_CONNECT"));
            a(false);
        }
    }

    protected void b()
    {
        Object obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_COMMAND_FINISHED");
        ((IntentFilter) (obj)).addAction("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED");
        b.a(((IntentFilter) (obj)));
        obj = f();
        if (obj == null || !a(((UUID) (obj))))
        {
            a(false);
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

    protected abstract UUID f();

    /* member class not found */
    class _cls1 {}

}
