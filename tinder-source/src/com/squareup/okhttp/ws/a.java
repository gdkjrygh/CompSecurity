// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.ws;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.e;
import com.squareup.okhttp.f;
import com.squareup.okhttp.i;
import com.squareup.okhttp.internal.d;
import com.squareup.okhttp.internal.http.h;
import com.squareup.okhttp.internal.http.q;
import com.squareup.okhttp.internal.k;
import com.squareup.okhttp.p;
import com.squareup.okhttp.s;
import com.squareup.okhttp.t;
import com.squareup.okhttp.v;
import java.io.IOException;
import java.net.ProtocolException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okio.ByteString;
import okio.b;

// Referenced classes of package com.squareup.okhttp.ws:
//            b

public final class com.squareup.okhttp.ws.a
{
    private static final class a extends com.squareup.okhttp.internal.c.a
    {

        private final i f;

        protected final void b()
            throws IOException
        {
            d.b.a(f, this);
        }

        a(i i, okio.e e1, okio.d d1, Random random, Executor executor, com.squareup.okhttp.ws.b b1, String s1)
        {
            super(e1, d1, random, executor, b1, s1);
            f = i;
        }
    }


    final e a;
    final Random b;
    final String c;
    private final t d;

    private com.squareup.okhttp.ws.a(s s1, t t1)
    {
        this(s1, t1, ((Random) (new SecureRandom())));
    }

    private com.squareup.okhttp.ws.a(s s1, t t1, Random random)
    {
        if (!"GET".equals(t1.b))
        {
            throw new IllegalArgumentException((new StringBuilder("Request must be GET: ")).append(t1.b).toString());
        }
        b = random;
        byte abyte0[] = new byte[16];
        random.nextBytes(abyte0);
        c = okio.b.a(ByteString.a(abyte0).c);
        s1 = s1.c();
        random = k.a(Collections.singletonList(Protocol.b));
        if (!random.contains(Protocol.b))
        {
            throw new IllegalArgumentException((new StringBuilder("protocols doesn't contain http/1.1: ")).append(random).toString());
        }
        if (random.contains(Protocol.a))
        {
            throw new IllegalArgumentException((new StringBuilder("protocols must not contain http/1.0: ")).append(random).toString());
        }
        if (random.contains(null))
        {
            throw new IllegalArgumentException("protocols must not contain null");
        } else
        {
            s1.f = k.a(random);
            t1 = t1.b().a("Upgrade", "websocket").a("Connection", "Upgrade").a("Sec-WebSocket-Key", c).a("Sec-WebSocket-Version", "13").a();
            d = t1;
            a = s1.a(t1);
            return;
        }
    }

    public static com.squareup.okhttp.ws.a a(s s1, t t1)
    {
        return new com.squareup.okhttp.ws.a(s1, t1);
    }

    public final void a()
    {
        Object obj;
        obj = a;
        obj.c = true;
        if (((e) (obj)).e == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj = ((e) (obj)).e;
        if (((h) (obj)).h != null)
        {
            ((h) (obj)).h.a(((h) (obj)));
            return;
        }
        i i = ((h) (obj)).c;
        if (i != null)
        {
            try
            {
                d.b.a(i, obj);
                return;
            }
            catch (IOException ioexception) { }
        }
    }

    public final void a(com.squareup.okhttp.ws.b b1)
    {
        b1 = new f(b1) {

            final com.squareup.okhttp.ws.b a;
            final com.squareup.okhttp.ws.a b;

            public final void a(v v1)
                throws IOException
            {
                com.squareup.okhttp.ws.b b2;
                Object obj;
                try
                {
                    obj = b;
                    b2 = a;
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
                if (!d.b.a(((i) (obj1))))
                {
                    throw new IllegalStateException("Unable to take ownership of connection.");
                }
                obj2 = d.b.d(((i) (obj1)));
                okio.d d1 = d.b.e(((i) (obj1)));
                obj = ((com.squareup.okhttp.ws.a) (obj)).b;
                String s1 = v1.a.a.toString();
                ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque(), k.a(String.format("OkHttp %s WebSocket", new Object[] {
                    s1
                }), true));
                threadpoolexecutor.allowCoreThreadTimeOut(true);
                obj = new a(((i) (obj1)), ((okio.e) (obj2)), d1, ((Random) (obj)), threadpoolexecutor, b2, s1);
                d.b.b(((i) (obj1)), obj);
                b2.a(((WebSocket) (obj)), v1);
                boolean flag;
                do
                {
                    flag = ((com.squareup.okhttp.internal.c.a) (obj)).a();
                } while (flag);
                return;
            }

            public final void a(IOException ioexception)
            {
                a.a(ioexception);
            }

            
            {
                b = com.squareup.okhttp.ws.a.this;
                a = b1;
                super();
            }
        };
        d.b.a(a, b1);
    }
}
