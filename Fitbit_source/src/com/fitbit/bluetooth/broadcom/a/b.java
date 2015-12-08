// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.a;

import android.bluetooth.BluetoothDevice;
import com.fitbit.bluetooth.broadcom.a.a.f;
import com.fitbit.bluetooth.connection.a;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.dncs.DncsHelper;

// Referenced classes of package com.fitbit.bluetooth.broadcom.a:
//            a

public class b extends a
{

    private final GalileoProfile c = new com.fitbit.bluetooth.broadcom.c.a();
    private final com.fitbit.bluetooth.b.b d;

    public b(BluetoothDevice bluetoothdevice)
    {
        super(bluetoothdevice);
        if (DncsHelper.a())
        {
            d = new com.fitbit.bluetooth.broadcom.b.a();
            return;
        } else
        {
            d = null;
            return;
        }
    }

    public GalileoProfile a()
    {
        return c;
    }

    public com.fitbit.bluetooth.b.b b()
    {
        return d;
    }

    protected Class c()
    {
        return com/fitbit/bluetooth/broadcom/a/a/f;
    }

    protected Class d()
    {
        return com/fitbit/bluetooth/broadcom/a/a/a;
    }

    protected com.fitbit.bluetooth.connection.a.a e()
    {
        return new f(this);
    }

    protected com.fitbit.bluetooth.connection.f f()
    {
        return new com.fitbit.bluetooth.broadcom.a.a();
    }
}
