// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.client;

import com.github.nkzawa.socketio.a.b;
import java.util.logging.Logger;

// Referenced classes of package com.github.nkzawa.socketio.client:
//            d

public final class a
    implements Runnable
{

    final d a;

    public final void run()
    {
        if (com.github.nkzawa.socketio.client.d.b(a))
        {
            com.github.nkzawa.socketio.client.d.b().fine(String.format("performing disconnect (%s)", new Object[] {
                d.i(a)
            }));
            com.github.nkzawa.socketio.client.d.b(a, new b(1));
        }
        d.j(a);
        if (com.github.nkzawa.socketio.client.d.b(a))
        {
            d.a(a, "io client disconnect");
        }
    }

    public (d d1)
    {
        a = d1;
        super();
    }
}
