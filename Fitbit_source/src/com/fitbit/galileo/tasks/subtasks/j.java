// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks;

import com.fitbit.bluetooth.commands.CommandName;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.bluetooth.connection.c;
import java.util.UUID;

// Referenced classes of package com.fitbit.galileo.tasks.subtasks:
//            k

public class j extends k
{

    private static final String a = "EnableFBActivityNotificationsSubTask";

    public j()
    {
    }

    protected boolean a(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        return bluetoothconnectionservicestatus.d();
    }

    public String e()
    {
        return "EnableFBActivityNotificationsSubTask";
    }

    protected CommandName f()
    {
        return CommandName.a;
    }

    protected UUID g()
    {
        return c.b();
    }
}
