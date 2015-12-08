// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.a.a;

import com.fitbit.bluetooth.b.b;
import com.fitbit.bluetooth.connection.a.c;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.dncs.DncsHelper;

// Referenced classes of package com.fitbit.bluetooth.broadcom.a.a:
//            f

public class i extends c
{

    private static final String c = "ConnectionState.DisconnectingServerProfile";

    public i(g g1)
    {
        super(g1);
    }

    private void f()
    {
        if (DncsHelper.a())
        {
            a.b().disconnectProfile();
        }
        g();
    }

    private void g()
    {
        a.a(new f(a));
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

    protected void a()
    {
        f();
    }

    protected void b()
    {
        f();
    }

    public String c()
    {
        return "ConnectionState.DisconnectingServerProfile";
    }

    protected void y_()
    {
    }

    protected void z_()
    {
    }
}
