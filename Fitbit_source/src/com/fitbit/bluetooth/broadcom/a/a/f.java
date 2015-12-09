// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.a.a;

import android.content.Intent;
import com.fitbit.bluetooth.connection.a.a;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.bluetooth.broadcom.a.a:
//            e

public final class f extends a
{

    private static final String c = "ConnectionState.Disconnected";

    public f(g g1)
    {
        super(g1);
    }

    protected void a()
    {
        a.a(new e(a));
        a.i();
    }

    protected void b()
    {
        Intent intent = new Intent("com.fitbit.bluetooth.connection.ConnectionStateContext.ACTION_CONNECTION_CLOSED");
        intent.putExtra("android.bluetooth.device.extra.DEVICE", a.l());
        z.a(intent);
    }

    public String c()
    {
        return "ConnectionState.Disconnected";
    }

    protected void y_()
    {
    }
}
