// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.c;

import com.squareup.okhttp.internal.f;
import com.squareup.okhttp.ws.WebSocket;
import com.squareup.okhttp.ws.b;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Random;
import java.util.concurrent.Executor;
import okio.c;
import okio.d;
import okio.e;
import okio.l;

// Referenced classes of package com.squareup.okhttp.internal.c:
//            d, c

public abstract class a
    implements WebSocket
{

    final com.squareup.okhttp.internal.c.d a;
    final b b;
    volatile boolean c;
    volatile boolean d;
    final Object e = new Object();
    private final com.squareup.okhttp.internal.c.c f;

    public a(e e1, d d1, Random random, Executor executor, b b1, String s)
    {
        b = b1;
        a = new com.squareup.okhttp.internal.c.d(d1, random);
        f = new com.squareup.okhttp.internal.c.c(e1, new c.a(b1, executor, s) {

            final b a;
            final Executor b;
            final String c;
            final a d;

            public final void a(int i, String s1)
            {
                Object obj = d.e;
                obj;
                JVM INSTR monitorenter ;
                d.d = true;
                boolean flag;
                if (!d.c)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj;
                JVM INSTR monitorexit ;
                b.execute(new f(this, "OkHttp %s WebSocket Close Reply", new Object[] {
                    c
                }, i, s1, flag) {

                    final int a;
                    final String c;
                    final boolean d;
                    final _cls1 e;

                    protected final void b()
                    {
                        a a1 = e.d;
                        int i = a;
                        String s = c;
                        if (d)
                        {
                            try
                            {
                                a1.a.a(i, s);
                            }
                            catch (IOException ioexception1) { }
                        }
                        try
                        {
                            a1.b();
                        }
                        catch (IOException ioexception) { }
                        a1.b.a();
                    }

            transient 
            {
                e = _pcls1;
                a = i;
                c = s1;
                d = flag;
                super(s, aobj);
            }
                });
                return;
                s1;
                obj;
                JVM INSTR monitorexit ;
                throw s1;
            }

            public final void a(c c1)
            {
                b.execute(new f(this, "OkHttp %s WebSocket Pong Reply", new Object[] {
                    c
                }, c1) {

                    final c a;
                    final _cls1 c;

                    protected final void b()
                    {
                        com.squareup.okhttp.internal.c.d d2;
                        c c1;
                        d2 = c.d.a;
                        c1 = a;
                        synchronized (d2.b)
                        {
                            d2.a(10, c1);
                        }
                        return;
                        exception;
                        d1;
                        JVM INSTR monitorexit ;
                        try
                        {
                            throw exception;
                        }
                        catch (IOException ioexception)
                        {
                            return;
                        }
                    }

            transient 
            {
                c = _pcls1;
                a = c1;
                super(s, aobj);
            }
                });
            }

            public final void a(e e2, com.squareup.okhttp.ws.WebSocket.PayloadType payloadtype)
                throws IOException
            {
                a.a(e2, payloadtype);
            }

            
            {
                d = a.this;
                a = b1;
                b = executor;
                c = s;
                super();
            }
        });
    }

    public final void a(com.squareup.okhttp.ws.WebSocket.PayloadType payloadtype, c c1)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        com.squareup.okhttp.internal.c.d d1 = a;
        if (payloadtype == null)
        {
            throw new NullPointerException("type == null");
        }
        if (c1 == null)
        {
            throw new NullPointerException("payload == null");
        }
        if (d1.e)
        {
            throw new IllegalStateException("A message writer is active. Did you call close()?");
        } else
        {
            d1.a(payloadtype, c1, c1.b, true, true);
            return;
        }
    }

    public final void a(String s)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        boolean flag;
        synchronized (e)
        {
            c = true;
            flag = d;
        }
        a.a(1000, s);
        if (flag)
        {
            b();
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final boolean a()
    {
        boolean flag = true;
        Object obj1;
        obj1 = f;
        ((com.squareup.okhttp.internal.c.c) (obj1)).a();
        if (!((com.squareup.okhttp.internal.c.c) (obj1)).j) goto _L2; else goto _L1
_L1:
        ((com.squareup.okhttp.internal.c.c) (obj1)).b();
_L3:
        Object obj;
        return !d;
_L2:
        switch (((com.squareup.okhttp.internal.c.c) (obj1)).f)
        {
        default:
            throw new ProtocolException((new StringBuilder("Unknown opcode: ")).append(Integer.toHexString(((com.squareup.okhttp.internal.c.c) (obj1)).f)).toString());

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_189;

        case 1: // '\001'
            break;
        }
        break MISSING_BLOCK_LABEL_146;
        obj;
        obj1 = e;
        obj1;
        JVM INSTR monitorenter ;
        d = true;
        com.squareup.okhttp.ws.WebSocket.PayloadType payloadtype;
        if (c)
        {
            flag = false;
        }
        if (flag && (obj instanceof ProtocolException))
        {
            try
            {
                a.a(1002, null);
            }
            catch (IOException ioexception1) { }
        }
        try
        {
            b();
        }
        catch (IOException ioexception) { }
        b.a(((IOException) (obj)));
        return false;
        payloadtype = com.squareup.okhttp.ws.WebSocket.PayloadType.a;
_L4:
        obj1.e = false;
        ((com.squareup.okhttp.internal.c.c) (obj1)).b.a(l.a(((com.squareup.okhttp.internal.c.c) (obj1)).c), payloadtype);
        if (!((com.squareup.okhttp.internal.c.c) (obj1)).e)
        {
            throw new IllegalStateException("Listener failed to call close on message payload.");
        }
          goto _L3
        payloadtype = com.squareup.okhttp.ws.WebSocket.PayloadType.b;
          goto _L4
        payloadtype;
        obj1;
        JVM INSTR monitorexit ;
        throw payloadtype;
    }

    public abstract void b()
        throws IOException;
}
