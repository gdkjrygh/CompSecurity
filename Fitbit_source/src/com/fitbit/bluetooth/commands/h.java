// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;

import android.os.Bundle;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.livedata.b;

// Referenced classes of package com.fitbit.bluetooth.commands:
//            d

public class h extends d
{

    private static final String n = "ConfigureLiveDataListenerCommand";
    private final boolean o;

    public h(g g1, Bundle bundle, d.a a)
    {
        super(g1, bundle, a);
        o = bundle.getBoolean("com.fitbit.bluetooth.commands.Command.EXTRA_ENABLE", true);
    }

    protected void g()
    {
        GalileoProfile galileoprofile = k.a();
        b b1;
        if (o)
        {
            b1 = b.a();
        } else
        {
            b1 = null;
        }
        galileoprofile.setListener(b1);
        r();
        m.a(true, null);
    }

    protected void h()
    {
    }

    protected String k()
    {
        return "ConfigureLiveDataListenerCommand";
    }
}
