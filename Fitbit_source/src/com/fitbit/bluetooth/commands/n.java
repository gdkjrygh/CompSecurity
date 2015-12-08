// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;

import android.os.Bundle;
import com.fitbit.bluetooth.AirlinkSession;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.e.a;
import com.fitbit.galileo.ota.b;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;

// Referenced classes of package com.fitbit.bluetooth.commands:
//            j, d

final class n extends j
{

    private static final String n = "OpenSessionCommand";
    private GalileoProfile o;
    private final int p = 3;
    private int q;
    private final com.fitbit.galileo.ota.GalileoOtaMessages.BootMode r;

    public n(g g1, Bundle bundle, d.a a1)
    {
        super(g1, bundle, a1);
        q = 0;
        int l = bundle.getInt(d.i, -1);
        if (l == -1)
        {
            r = null;
            return;
        } else
        {
            r = com.fitbit.galileo.ota.GalileoOtaMessages.BootMode.values()[l];
            return;
        }
    }

    private void v()
    {
        q = q + 1;
        w();
    }

    private void w()
    {
        if (q <= 3 && o.writeValue(k.l(), b.f()))
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

    public void a(com.fitbit.galileo.ota.GalileoOtaMessages.f f)
    {
        r();
        m.a(false, null);
    }

    public void a(com.fitbit.galileo.ota.GalileoOtaMessages.l l)
    {
        r();
        AirlinkSession airlinksession = new AirlinkSession(l.f, l.g, l.d, l.e);
        Bundle bundle = new Bundle();
        bundle.putParcelable(d.h, airlinksession);
        boolean flag;
        if (r == null || l.f == r)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.fitbit.e.a.a("OpenSessionCommand", String.format("Expected Bootmode %s and received BootMode %s", new Object[] {
            r, l.f
        }), new Object[0]);
        m.a(flag, bundle);
    }

    protected void g()
    {
        o = k.a();
        o.setListener(this);
        w();
    }

    protected void h()
    {
        t();
        k.a().setListener(null);
    }

    protected void i()
    {
        TrackerSyncPreferencesSavedState.n();
        v();
    }

    protected String k()
    {
        return "OpenSessionCommand";
    }
}
