// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client.a;

import com.squareup.okhttp.ws.WebSocket;
import java.io.IOException;
import java.util.logging.Logger;
import okio.c;

// Referenced classes of package com.github.nkzawa.engineio.client.a:
//            c

final class a
    implements com.github.nkzawa.engineio.parser._cls2
{

    final com.github.nkzawa.engineio.client.a.c a;
    final com.github.nkzawa.engineio.client.a.c b;

    public final void a(Object obj)
    {
        if (obj instanceof String)
        {
            c.b(a).a(com.squareup.okhttp.ws.ocket.PayloadType.a, (new c()).a((String)obj));
            return;
        }
        try
        {
            if (obj instanceof byte[])
            {
                c.b(a).a(com.squareup.okhttp.ws.ocket.PayloadType.b, (new c()).b((byte[])(byte[])obj));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            c.h().fine("websocket closed before onclose event");
        }
        return;
    }

    Type(com.github.nkzawa.engineio.client.a.c c1, com.github.nkzawa.engineio.client.a.c c2)
    {
        b = c1;
        a = c2;
        super();
    }
}
