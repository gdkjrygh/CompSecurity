// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks;

import android.bluetooth.BluetoothDevice;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.tasks.subtasks.b.b;
import com.fitbit.galileo.tasks.subtasks.c;
import com.fitbit.galileo.tasks.subtasks.d;
import com.fitbit.galileo.tasks.subtasks.e;
import com.fitbit.galileo.tasks.subtasks.j;
import com.fitbit.galileo.tasks.subtasks.r;
import com.fitbit.galileo.tasks.subtasks.z;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.galileo.tasks:
//            n

public abstract class p extends n
{

    private final com.fitbit.galileo.ota.GalileoOtaMessages.BootMode a;

    public p(BluetoothDevice bluetoothdevice, com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer connectionconsumer)
    {
        this(bluetoothdevice, connectionconsumer, GalileoTrackerType.a(bluetoothdevice), false);
    }

    public p(BluetoothDevice bluetoothdevice, com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer connectionconsumer, GalileoTrackerType galileotrackertype, boolean flag)
    {
        this(bluetoothdevice, connectionconsumer, galileotrackertype, flag, null);
    }

    public p(BluetoothDevice bluetoothdevice, com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer connectionconsumer, GalileoTrackerType galileotrackertype, boolean flag, com.fitbit.galileo.ota.GalileoOtaMessages.BootMode bootmode)
    {
        super(bluetoothdevice, connectionconsumer, galileotrackertype, flag);
        a = bootmode;
    }

    protected List f()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new d(y(), A()));
        arraylist.add(new b());
        arraylist.add(new j());
        arraylist.add(new r(a));
        return arraylist;
    }

    protected List t()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new c());
        arraylist.add(new e());
        arraylist.add(new z(A()));
        return arraylist;
    }
}
