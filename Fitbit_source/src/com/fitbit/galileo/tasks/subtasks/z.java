// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks;

import com.fitbit.bluetooth.connection.BluetoothConnectionController;

// Referenced classes of package com.fitbit.galileo.tasks.subtasks:
//            GalileoSubTask

public class z extends GalileoSubTask
{

    private static final String a = "UnregisterConnectionConsumerSubTask";
    private final com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer b;

    public z(com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer connectionconsumer)
    {
        b = connectionconsumer;
    }

    protected void b()
    {
        BluetoothConnectionController.a().b(b);
        a(true);
    }

    protected void c()
    {
    }

    protected void d()
    {
    }

    public String e()
    {
        return "UnregisterConnectionConsumerSubTask";
    }
}
