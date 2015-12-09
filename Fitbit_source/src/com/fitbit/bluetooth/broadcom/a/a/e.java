// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.a.a;

import com.fitbit.bluetooth.broadcom.a.a;
import com.fitbit.bluetooth.connection.a.d;
import com.fitbit.bluetooth.connection.g;

// Referenced classes of package com.fitbit.bluetooth.broadcom.a.a:
//            m, i

public class e extends d
{

    private static final String c = "ConnectionState.ConnectingServerProfile";

    public e(g g1)
    {
        super(g1);
    }

    private void h()
    {
        if (!a.k())
        {
            a.a(new m(a));
            a.i();
            return;
        } else
        {
            a.a(new i(a));
            a.j();
            return;
        }
    }

    protected void a()
    {
        h();
    }

    protected void b()
    {
    }

    public String c()
    {
        return "ConnectionState.ConnectingServerProfile";
    }

    protected com.fitbit.bluetooth.connection.f.a e()
    {
        return a.a;
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
