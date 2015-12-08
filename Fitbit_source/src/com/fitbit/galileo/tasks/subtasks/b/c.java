// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks.b;

import com.fitbit.bluetooth.commands.CommandName;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.bluetooth.connection.e;
import com.fitbit.galileo.tasks.subtasks.n;
import java.util.UUID;

public class c extends n
{

    private static final String a = "EnableLiveDataListenerSubTask";

    public c()
    {
        super(CommandName.l);
    }

    protected void a(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        if (!com.fitbit.bluetooth.connection.e.e(bluetoothconnectionservicestatus))
        {
            a(false);
        }
    }

    public String e()
    {
        return "EnableLiveDataListenerSubTask";
    }

    protected UUID f()
    {
        if (!com.fitbit.bluetooth.connection.e.f())
        {
            return null;
        } else
        {
            return com.fitbit.bluetooth.connection.c.m();
        }
    }
}
