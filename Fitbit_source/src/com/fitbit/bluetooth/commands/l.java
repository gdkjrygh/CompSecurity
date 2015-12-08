// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;

import android.os.Bundle;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.galileo.ota.b;

// Referenced classes of package com.fitbit.bluetooth.commands:
//            r

final class l extends r
{

    private static final String n = "GetMegadumpCommand";

    public l(g g, Bundle bundle, d.a a1)
    {
        super(g, bundle, a1);
    }

    public void a(byte abyte0[])
    {
        r();
        Bundle bundle = new Bundle();
        bundle.putByteArray("com.fitbit.bluetooth.commands.Command.EXTRA_DATA", abyte0);
        m.a(true, bundle);
    }

    protected byte[] a()
    {
        return com.fitbit.galileo.ota.b.e();
    }

    public void b()
    {
        r();
        m.a(false, null);
    }

    public void d(byte abyte0[])
    {
        r();
        Bundle bundle = new Bundle();
        bundle.putByteArray("com.fitbit.bluetooth.commands.Command.EXTRA_DATA", abyte0);
        m.a(true, bundle);
    }

    protected String k()
    {
        return "GetMegadumpCommand";
    }
}
