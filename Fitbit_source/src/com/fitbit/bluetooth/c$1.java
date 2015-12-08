// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import com.fitbit.e.a;

// Referenced classes of package com.fitbit.bluetooth:
//            e, c, n, k

class nit> extends e
{

    final c a;

    protected void a()
    {
        com.fitbit.e.a.a("BluetoothRestarter", "Bluetooth is disabled. Trying to enable...", new Object[0]);
        if (!com.fitbit.bluetooth.n.a().e())
        {
            com.fitbit.e.a.a("BluetoothRestarter", "Unable to enable Bluetooth.", new Object[0]);
            d();
        }
    }

    protected void b()
    {
        com.fitbit.e.a.a("BluetoothRestarter", "Bluetooth is enabled.", new Object[0]);
        d();
        com.fitbit.bluetooth.c.a(a);
        if (c.b(a) != null)
        {
            c.b(a).a();
        }
    }

    (c c1, boolean flag)
    {
        a = c1;
        super(flag);
    }
}
