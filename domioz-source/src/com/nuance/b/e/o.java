// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import android.util.Log;
import com.nuance.b.b.a.b;
import com.nuance.b.b.a.c;
import com.nuance.b.b.a.d;
import com.nuance.b.b.a.e;
import com.nuance.b.b.a.f;
import com.nuance.b.b.a.h;
import com.nuance.b.b.a.i;

// Referenced classes of package com.nuance.b.e:
//            c, n, v, e

final class o
    implements e
{

    final com.nuance.b.e.c a;

    o(com.nuance.b.e.c c1)
    {
        a = c1;
        super();
    }

    public final void onConnect(b b1)
    {
        Log.d("Nina", String.format("NinaObserver.onConnect [%d]", new Object[] {
            Long.valueOf(b1.a)
        }));
        c.a(b1.b);
        if (c.z().d())
        {
            (new Thread(new v(a, (byte)0))).start();
        }
    }

    public final void onConnectError(c c1)
    {
        Log.d("Nina", String.format("NinaObserver.onConnectError [%d] -- %s", new Object[] {
            Long.valueOf(c1.a), c1.b
        }));
        switch (e.a[c1.b.ordinal()])
        {
        default:
            c.y();
            c.a(false, c.g(a));
            c.a(a, (new StringBuilder("Connect error! (")).append(c1.b).append(")").toString());
            // fall through

        case 1: // '\001'
        case 2: // '\002'
            return;
        }
    }

    public final void onConnectionLost(f f1)
    {
        Log.d("Nina", String.format("NinaObserver.onConnectionLost [%d] -- %s", new Object[] {
            Long.valueOf(f1.a), f1.b
        }));
        c.y();
        if (com.nuance.b.e.c.c(a) != null)
        {
            com.nuance.b.e.c.c(a).enable(false);
        }
    }

    public final void onDisconnect(h h1)
    {
        Log.d("Nina", String.format("NinaObserver.onDisconnect [%d]", new Object[] {
            Long.valueOf(h1.a)
        }));
        c.y();
        com.nuance.b.e.c.c(a).enable(false);
        c.a(true, com.nuance.b.e.c.h(a));
    }

    public final void onDisconnectError(i j)
    {
        Log.d("Nina", String.format("NinaObserver.onDisconnectError [%d] -- %s", new Object[] {
            Long.valueOf(j.a), j.b
        }));
        c.a(false, com.nuance.b.e.c.h(a));
    }
}
