// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.c;

import com.squareup.okhttp.internal.f;
import com.squareup.okhttp.ws.b;
import java.io.IOException;
import java.util.concurrent.Executor;
import okio.c;
import okio.e;

// Referenced classes of package com.squareup.okhttp.internal.c:
//            a, d

final class c
    implements c
{

    final b a;
    final Executor b;
    final String c;
    final a d;

    public final void a(int i, String s)
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
        b.execute(new f("OkHttp %s WebSocket Close Reply", new Object[] {
            c
        }, i, s, flag) {

            final int a;
            final String c;
            final boolean d;
            final a._cls1 e;

            protected final void b()
            {
                a a1 = e.d;
                int j = a;
                String s1 = c;
                if (d)
                {
                    try
                    {
                        a1.a.a(j, s1);
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
                e = a._cls1.this;
                a = i;
                c = s1;
                d = flag;
                super(s, aobj);
            }
        });
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(c c1)
    {
        b.execute(new f("OkHttp %s WebSocket Pong Reply", new Object[] {
            c
        }, c1) {

            final c a;
            final a._cls1 c;

            protected final void b()
            {
                d d2;
                c c2;
                d2 = c.d.a;
                c2 = a;
                synchronized (d2.b)
                {
                    d2.a(10, c2);
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
                c = a._cls1.this;
                a = c1;
                super(s, aobj);
            }
        });
    }

    public final void a(e e, com.squareup.okhttp.ws.ocket.PayloadType payloadtype)
        throws IOException
    {
        a.a(e, payloadtype);
    }

    t>(a a1, b b1, Executor executor, String s)
    {
        d = a1;
        a = b1;
        b = executor;
        c = s;
        super();
    }
}
