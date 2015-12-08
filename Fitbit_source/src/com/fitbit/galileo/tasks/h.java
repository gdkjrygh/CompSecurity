// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks;

import android.bluetooth.BluetoothDevice;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.tasks.subtasks.b.a;
import com.fitbit.galileo.tasks.subtasks.b.b;
import com.fitbit.galileo.tasks.subtasks.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.fitbit.galileo.tasks:
//            n

public class h extends n
{

    private static final String a = "DisableLiveDataTask";

    public h(BluetoothDevice bluetoothdevice, com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer connectionconsumer, GalileoTrackerType galileotrackertype, boolean flag)
    {
        super(bluetoothdevice, connectionconsumer, galileotrackertype, flag);
    }

    protected List a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new a());
        arraylist.add(new b());
        return arraylist;
    }

    protected void b()
    {
    }

    protected String c()
    {
        return "DisableLiveDataTask";
    }

    protected List f()
    {
        return Collections.emptyList();
    }

    protected List t()
    {
        return Collections.singletonList(new z(A()));
    }
}
