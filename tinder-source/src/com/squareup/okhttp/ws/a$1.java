// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.ws;

import com.squareup.okhttp.f;
import com.squareup.okhttp.internal.c.a;
import com.squareup.okhttp.internal.d;
import com.squareup.okhttp.internal.k;
import com.squareup.okhttp.p;
import com.squareup.okhttp.t;
import com.squareup.okhttp.v;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp.ws:
//            a, b

final class a
    implements f
{

    final b a;
    final com.squareup.okhttp.ws.a b;

    public final void a(v v1)
        throws IOException
    {
        b b1;
        Object obj;
        try
        {
            obj = b;
            b1 = a;
            if (v1.c != 101)
            {
                d.b.a(((com.squareup.okhttp.ws.a) (obj)).a);
                throw new ProtocolException((new StringBuilder("Expected HTTP 101 response but was '")).append(v1.c).append(" ").append(v1.d).append("'").toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (v v1)
        {
            a.a(v1);
            return;
        }
        Object obj1 = v1.a("Connection");
        if (!"Upgrade".equalsIgnoreCase(((String) (obj1))))
        {
            throw new ProtocolException((new StringBuilder("Expected 'Connection' header value 'Upgrade' but was '")).append(((String) (obj1))).append("'").toString());
        }
        obj1 = v1.a("Upgrade");
        if (!"websocket".equalsIgnoreCase(((String) (obj1))))
        {
            throw new ProtocolException((new StringBuilder("Expected 'Upgrade' header value 'websocket' but was '")).append(((String) (obj1))).append("'").toString());
        }
        obj1 = v1.a("Sec-WebSocket-Accept");
        Object obj2 = k.b((new StringBuilder()).append(((com.squareup.okhttp.ws.a) (obj)).c).append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11").toString());
        if (!((String) (obj2)).equals(obj1))
        {
            throw new ProtocolException((new StringBuilder("Expected 'Sec-WebSocket-Accept' header value '")).append(((String) (obj2))).append("' but was '").append(((String) (obj1))).append("'").toString());
        }
        obj1 = d.b.b(((com.squareup.okhttp.ws.a) (obj)).a);
        if (!d.b.a(((com.squareup.okhttp.i) (obj1))))
        {
            throw new IllegalStateException("Unable to take ownership of connection.");
        }
        obj2 = d.b.d(((com.squareup.okhttp.i) (obj1)));
        okio.d d1 = d.b.e(((com.squareup.okhttp.i) (obj1)));
        obj = ((com.squareup.okhttp.ws.a) (obj)).b;
        String s = v1.a.a.toString();
        ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque(), k.a(String.format("OkHttp %s WebSocket", new Object[] {
            s
        }), true));
        threadpoolexecutor.allowCoreThreadTimeOut(true);
        obj = new <init>(((com.squareup.okhttp.i) (obj1)), ((okio.e) (obj2)), d1, ((java.util.Random) (obj)), threadpoolexecutor, b1, s);
        d.b.b(((com.squareup.okhttp.i) (obj1)), obj);
        b1.a(((WebSocket) (obj)), v1);
        boolean flag;
        do
        {
            flag = ((a) (obj)).a();
        } while (flag);
        return;
    }

    public final void a(IOException ioexception)
    {
        a.a(ioexception);
    }

    l.c.a(com.squareup.okhttp.ws.a a1, b b1)
    {
        b = a1;
        a = b1;
        super();
    }
}
