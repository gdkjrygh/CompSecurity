// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.a.a;

import com.fitbit.bluetooth.connection.a.c;
import com.fitbit.bluetooth.connection.g;

// Referenced classes of package com.fitbit.bluetooth.broadcom.a.a:
//            i

public class o extends c
{

    private static final String c = "ConnectionState.UnregisteringServerApplication";

    public o(g g1)
    {
        super(g1);
    }

    private void f()
    {
        g();
    }

    private void g()
    {
        a.a(new i(a));
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
        return "ConnectionState.UnregisteringServerApplication";
    }

    protected void y_()
    {
    }

    protected void z_()
    {
    }
}
