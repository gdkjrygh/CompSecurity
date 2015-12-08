// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.a.a;

import com.fitbit.bluetooth.b.b;
import com.fitbit.bluetooth.broadcom.a.a;
import com.fitbit.bluetooth.connection.a.d;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.dncs.DncsHelper;

// Referenced classes of package com.fitbit.bluetooth.broadcom.a.a:
//            c, o

final class m extends d
{

    private static final String c = "ConnectionState.RegisteringServerApplication";

    public m(g g1)
    {
        super(g1);
    }

    private void h()
    {
        if (!a.k())
        {
            a.a(new c(a));
            a.i();
            return;
        } else
        {
            a.a(new o(a));
            a.j();
            return;
        }
    }

    protected void a()
    {
        if (DncsHelper.a() && !a.b().registerApplication())
        {
            a.a(new o(a));
            a.j();
            return;
        } else
        {
            h();
            return;
        }
    }

    protected void b()
    {
    }

    protected String c()
    {
        return "ConnectionState.RegisteringServerApplication";
    }

    protected com.fitbit.bluetooth.connection.f.a e()
    {
        return a.b;
    }

    protected void f()
    {
    }

    protected void g()
    {
    }

    protected void y_()
    {
    }
}
