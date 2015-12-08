// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import com.pandora.radio.data.s;
import com.pandora.radio.provider.b;
import com.pandora.radio.provider.d;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import p.cw.c;
import p.cx.n;
import p.cx.q;
import p.cx.t;
import p.dd.y;
import p.df.a;

// Referenced classes of package com.pandora.radio.util:
//            q, r

public class h
    implements com.pandora.radio.provider.b.c
{
    private class a
        implements Runnable
    {

        final h a;
        private s b;
        private int c;

        public void run()
        {
            Object obj2;
            obj2 = null;
            if (c <= 0)
            {
                break MISSING_BLOCK_LABEL_22;
            }
            p.df.a.c("PingDBQueue", "PingRunnable retry sleep");
            Thread.sleep(5000L);
            Object obj = com.pandora.radio.util.h.a(a);
            obj;
            JVM INSTR monitorenter ;
_L1:
            boolean flag = com.pandora.radio.util.h.b(a);
            if (flag)
            {
                break MISSING_BLOCK_LABEL_70;
            }
            p.df.a.c("PingDBQueue", "PingRunnable wait for network");
            com.pandora.radio.util.h.a(a).wait();
              goto _L1
            Object obj1;
            obj1;
            obj;
            JVM INSTR monitorexit ;
            return;
            obj;
            JVM INSTR monitorexit ;
            if (b.b())
            {
                com.pandora.radio.util.h.c(a).b(b);
                return;
            }
            break MISSING_BLOCK_LABEL_103;
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
            obj = com.pandora.radio.util.h.a(a, b);
            com.pandora.radio.util.h.c(a).b(b);
            com.pandora.radio.data.s.a a1 = b.d();
            if (a1 != null)
            {
                a1.a(((String) (obj)), null);
                return;
            }
            break MISSING_BLOCK_LABEL_339;
            a1;
            obj = null;
_L10:
            obj2 = a1.a();
            if (!(obj2 instanceof IOException)) goto _L3; else goto _L2
_L2:
            c = c + 1;
            if (c >= 5) goto _L5; else goto _L4
_L4:
            com.pandora.radio.util.h.d(a).a(this);
            p.df.a.c("PingDBQueue", "Retrying ping because of an IO exception", ((Throwable) (obj2)));
_L6:
            obj2 = b.d();
            if (obj2 != null)
            {
                ((com.pandora.radio.data.s.a) (obj2)).a(((String) (obj)), a1);
                return;
            }
            break MISSING_BLOCK_LABEL_339;
_L5:
            p.df.a.c("PingDBQueue", "Skip retry ping because we're out of retries", ((Throwable) (obj2)));
              goto _L6
            Exception exception;
            exception;
            obj2 = a1;
            a1 = exception;
_L7:
            com.pandora.radio.data.s.a a2 = b.d();
            if (a2 != null)
            {
                a2.a(((String) (obj)), ((Exception) (obj2)));
            }
            throw a1;
_L3:
            p.df.a.c("PingDBQueue", "Skipping ping because of an exception", ((Throwable) (obj2)));
              goto _L6
            a1;
            obj = null;
_L8:
            p.df.a.c("PingDBQueue", "Skipping ping because of an exception", a1);
            obj2 = b.d();
            if (obj2 != null)
            {
                ((com.pandora.radio.data.s.a) (obj2)).a(((String) (obj)), a1);
                return;
            }
            break MISSING_BLOCK_LABEL_339;
            a1;
            obj = null;
              goto _L7
            a1;
              goto _L7
            a2;
            obj2 = a1;
            a1 = a2;
              goto _L7
            a1;
              goto _L8
            a1;
            if (true) goto _L10; else goto _L9
_L9:
            InterruptedException interruptedexception;
            interruptedexception;
        }

        public a(s s1)
        {
            a = h.this;
            super();
            c = 0;
            b = s1;
        }
    }

    public static interface b
    {

        public abstract String e();

        public abstract p.cx.t.a f();
    }


    private com.pandora.radio.util.q a;
    private r b;
    private com.pandora.radio.provider.b c;
    private boolean d;
    private final Object e = new Object();
    private c f;

    public h(c c1)
    {
        d = false;
        f = c1;
        c1.b(this);
        c = c1.w().b();
        c1 = c.b();
        if (c1 != null && c1.size() > 0)
        {
            b();
            s s1;
            for (c1 = c1.iterator(); c1.hasNext(); a.a(new a(s1)))
            {
                s1 = (s)c1.next();
            }

        }
        c.a(this, "ping_urls");
    }

    static Object a(h h1)
    {
        return h1.e;
    }

    private String a(b b1)
        throws q, n
    {
        p.df.a.a("PingDBQueue", "ping: Pinging %s", new Object[] {
            b1.e()
        });
        return f.p().a(b1.e(), b1.f());
    }

    static String a(h h1, b b1)
        throws q, n
    {
        return h1.a(b1);
    }

    private void a(boolean flag)
    {
        synchronized (e)
        {
            if (d != flag)
            {
                d = flag;
                if (d)
                {
                    e.notify();
                }
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            a = new com.pandora.radio.util.q();
            b = new r(a, 2000L);
            b.start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static boolean b(h h1)
    {
        return h1.d;
    }

    static com.pandora.radio.provider.b c(h h1)
    {
        return h1.c;
    }

    static com.pandora.radio.util.q d(h h1)
    {
        return h1.a;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            b.a();
            b = null;
        }
        f.c(this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(long l, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (obj instanceof s)
        {
            b();
            a.a(new a((s)obj));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public void a(s s1)
    {
        long l = c.a(s1);
        p.df.a.c("PingDBQueue", "Ping: added row = %s, ping url= %s", new Object[] {
            String.valueOf(l), s1.e()
        });
        s1.a(l);
    }

    public void onNetworkConnectedEvent(y y1)
    {
        a(y1.a);
    }
}
