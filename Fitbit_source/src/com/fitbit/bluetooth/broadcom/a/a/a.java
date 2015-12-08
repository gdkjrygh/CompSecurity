// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.a.a;

import android.content.Intent;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.bluetooth.broadcom.a.a:
//            b, h

public class a extends b
{

    private static final String c = "ConnectionState.Connected";

    public a(g g1)
    {
        super(g1);
    }

    protected void a()
    {
        super.a();
        if (((com.fitbit.bluetooth.broadcom.c.a)a.a()).d(a.l()))
        {
            Intent intent = new Intent("com.fitbit.bluetooth.connection.ConnectionStateContext.ACTION_CONNECTION_OPENED");
            intent.putExtra("android.bluetooth.device.extra.DEVICE", a.l());
            z.a(intent);
            return;
        } else
        {
            com.fitbit.e.a.a("ConnectionState.Connected", "Device is not connected. Closing coneection...", new Object[0]);
            d();
            return;
        }
    }

    protected void b()
    {
        super.b();
        a.a(new h(a));
        a.j();
    }

    protected String c()
    {
        return "ConnectionState.Connected";
    }

    protected void d()
    {
        a.h();
    }
}
