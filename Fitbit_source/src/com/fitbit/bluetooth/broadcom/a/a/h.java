// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.a.a;

import com.fitbit.bluetooth.broadcom.a.a;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.bluetooth.galileo.GalileoProfile;

// Referenced classes of package com.fitbit.bluetooth.broadcom.a.a:
//            b, n

public class h extends b
{

    private static final String c = "ConnectionState.DisconnectingDevice";

    public h(g g1)
    {
        super(g1);
    }

    private void s()
    {
        if (a.a().cancelConnection(a.l()))
        {
            a(a.e.a());
            return;
        } else
        {
            com.fitbit.e.a.a("ConnectionState.DisconnectingDevice", "Unable to disconnect device.", new Object[0]);
            d();
            return;
        }
    }

    protected void a()
    {
        super.a();
        s();
    }

    protected void b()
    {
        super.b();
        s();
    }

    public String c()
    {
        return "ConnectionState.DisconnectingDevice";
    }

    protected void d()
    {
        a.a(new n(a));
        if (a.k())
        {
            a.j();
            return;
        } else
        {
            a.i();
            return;
        }
    }

    protected void y_()
    {
        super.y_();
        p();
    }

    protected void z_()
    {
        d();
    }
}
