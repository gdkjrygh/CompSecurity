// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks;

import android.bluetooth.BluetoothDevice;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.a.f;
import java.util.List;

// Referenced classes of package com.fitbit.galileo.tasks:
//            GalileoCompoundTask

public abstract class n extends GalileoCompoundTask
{

    private final boolean a;
    private final BluetoothDevice b;
    private final GalileoTrackerType c;
    private final com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer d;

    public n(BluetoothDevice bluetoothdevice, com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer connectionconsumer, GalileoTrackerType galileotrackertype, boolean flag)
    {
        b = bluetoothdevice;
        d = connectionconsumer;
        c = galileotrackertype;
        a = flag;
    }

    protected final com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer A()
    {
        return d;
    }

    public final boolean B()
    {
        return a;
    }

    protected List g()
    {
        if (B())
        {
            return t();
        } else
        {
            return null;
        }
    }

    protected abstract List t();

    public final GalileoTrackerType x()
    {
        return c;
    }

    public final BluetoothDevice y()
    {
        return b;
    }

    public final String z()
    {
        if (b != null)
        {
            return f.a(b);
        } else
        {
            return null;
        }
    }
}
