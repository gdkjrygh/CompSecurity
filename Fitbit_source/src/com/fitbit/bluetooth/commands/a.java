// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;

import android.content.Intent;
import android.os.Bundle;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.galileo.ota.b;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.bluetooth.commands:
//            j

final class a extends j
{

    private static final String n = "AlertUserCommand";
    private final boolean o;

    public a(g g1, Bundle bundle, d.a a1)
    {
        super(g1, bundle, a1);
        o = bundle.getBoolean("com.fitbit.bluetooth.commands.Command.EXTRA_WAIT_FOR_USER", false);
    }

    public void a(com.fitbit.galileo.ota.GalileoOtaMessages.f f)
    {
        r();
        m.a(false, null);
    }

    public void b()
    {
        if (!o)
        {
            r();
            m.a(true, null);
            return;
        } else
        {
            t();
            z.a(new Intent("com.fitbit.bluetooth.commands.Command.ACTION_CODE_DISPLAYED"));
            return;
        }
    }

    public void c()
    {
        r();
        m.a(true, null);
    }

    protected void g()
    {
        GalileoProfile galileoprofile = k.a();
        galileoprofile.setListener(this);
        if (galileoprofile.writeValue(k.l(), com.fitbit.galileo.ota.b.c()))
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
        k.a().setListener(null);
        t();
    }

    protected void i()
    {
        r();
        m.a(false, null);
    }

    protected boolean j()
    {
        return l != null && l.containsKey("com.fitbit.bluetooth.commands.Command.EXTRA_WAIT_FOR_USER");
    }

    protected String k()
    {
        return "AlertUserCommand";
    }
}
