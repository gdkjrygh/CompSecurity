// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks;

import android.bluetooth.BluetoothDevice;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.tasks.subtasks.b.d;
import com.fitbit.galileo.tasks.subtasks.c;
import com.fitbit.galileo.tasks.subtasks.e;
import com.fitbit.galileo.tasks.subtasks.j;
import com.fitbit.galileo.tasks.subtasks.r;
import com.fitbit.galileo.tasks.subtasks.y;
import com.fitbit.galileo.tasks.subtasks.z;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.galileo.tasks:
//            n

public class l extends n
{

    private static final String a = "EnableLiveDataTask";

    public l(BluetoothDevice bluetoothdevice, com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer connectionconsumer, GalileoTrackerType galileotrackertype, boolean flag)
    {
        super(bluetoothdevice, connectionconsumer, galileotrackertype, flag);
    }

    protected List a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new y(com.fitbit.livedata.auth.TrackerAuthCredentials.Cipher.a(x())));
        arraylist.add(new c());
        arraylist.add(new e());
        arraylist.add(new d());
        arraylist.add(new com.fitbit.galileo.tasks.subtasks.b.c());
        return arraylist;
    }

    protected void b()
    {
    }

    protected String c()
    {
        return "EnableLiveDataTask";
    }

    protected List f()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new com.fitbit.galileo.tasks.subtasks.d(y(), A()));
        arraylist.add(new j());
        arraylist.add(new r());
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
