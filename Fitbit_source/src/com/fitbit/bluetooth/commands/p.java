// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;

import android.os.Bundle;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.e.a;
import com.fitbit.galileo.ota.b;

// Referenced classes of package com.fitbit.bluetooth.commands:
//            j

final class p extends j
{

    private static final String n = "ReadBondInfoCommand";

    public p(g g1, Bundle bundle, d.a a1)
    {
        super(g1, bundle, a1);
    }

    public void a(com.fitbit.galileo.ota.GalileoOtaMessages.f f)
    {
        r();
        m.a(false, null);
    }

    public void a(com.fitbit.galileo.ota.GalileoOtaMessages.u u)
    {
        if (u != null && u.b == com.fitbit.galileo.ota.GalileoOtaMessages.TrackerBlock.c)
        {
            u = new com.fitbit.galileo.ota.GalileoOtaMessages.RFBondInfoPacket(u.d);
            com.fitbit.e.a.a("ReadBondInfoCommand", "BondInfo received: %s", new Object[] {
                u
            });
            Bundle bundle = new Bundle();
            bundle.putSerializable("com.fitbit.bluetooth.commands.Command.EXTRA_DATA", u);
            r();
            m.a(true, bundle);
        }
    }

    protected void g()
    {
        GalileoProfile galileoprofile = k.a();
        if (galileoprofile.isDncsSupported(k.l()))
        {
            galileoprofile.setListener(this);
            if (galileoprofile.writeValue(k.l(), b.i()))
            {
                s();
                return;
            } else
            {
                r();
                m.a(false, null);
                return;
            }
        } else
        {
            com.fitbit.e.a.a("ReadBondInfoCommand", "DNCS is not supported", new Object[0]);
            r();
            m.a(true, null);
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
        return "ReadBondInfoCommand";
    }
}
