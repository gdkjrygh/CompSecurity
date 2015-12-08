// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;

import android.os.Bundle;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.galileo.ota.b;

// Referenced classes of package com.fitbit.bluetooth.commands:
//            j

final class c extends j
{

    private static final String n = "CloseSessionCommand";

    public c(g g1, Bundle bundle, d.a a1)
    {
        super(g1, bundle, a1);
    }

    public void a()
    {
        r();
        m.a(true, null);
    }

    public void a(com.fitbit.galileo.ota.GalileoOtaMessages.f f)
    {
        r();
        m.a(false, null);
    }

    protected void g()
    {
        GalileoProfile galileoprofile = k.a();
        galileoprofile.setListener(this);
        if (galileoprofile.writeValue(k.l(), b.g()))
        {
            s();
            return;
        } else
        {
            r();
            m.a(false, null);
            return;
        }
    }

    protected void h()
    {
        t();
        k.a().setListener(null);
    }

    protected void i()
    {
        r();
        m.a(false, null);
    }

    protected String k()
    {
        return "CloseSessionCommand";
    }
}
