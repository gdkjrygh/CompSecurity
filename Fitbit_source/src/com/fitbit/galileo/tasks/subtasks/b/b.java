// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks.b;

import com.fitbit.bluetooth.commands.CommandName;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.bluetooth.connection.c;
import com.fitbit.galileo.tasks.subtasks.f;
import java.util.UUID;

public class b extends f
{

    private static final String a = "DisableLiveDataNotificationsSubTask";

    public b()
    {
    }

    protected boolean a(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        return bluetoothconnectionservicestatus.e();
    }

    public String e()
    {
        return "DisableLiveDataNotificationsSubTask";
    }

    protected CommandName f()
    {
        return CommandName.b;
    }

    protected UUID g()
    {
        return c.j();
    }
}
