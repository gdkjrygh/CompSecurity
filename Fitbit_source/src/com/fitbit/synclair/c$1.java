// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair;

import android.content.Intent;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.synclair:
//            c

class g.c extends c
{

    final com.fitbit.synclair.c a;

    protected void a(Intent intent)
    {
        if (c.a(a) != null && c.b(a) != null && "com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_DISCONNECTED".equals(intent.getAction()))
        {
            c.b(a).a();
        }
    }

    g.c(com.fitbit.synclair.c c1)
    {
        a = c1;
        super();
    }
}
