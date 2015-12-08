// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client.a;

import com.github.nkzawa.engineio.client.Transport;
import com.github.nkzawa.engineio.parser.b;
import com.github.nkzawa.engineio.parser.c;
import java.util.logging.Logger;

public abstract class a extends Transport
{

    private static final Logger p = Logger.getLogger(com/github/nkzawa/engineio/client/a/a.getName());
    private boolean q;

    public a(com.github.nkzawa.engineio.client.Transport.a a1)
    {
        super(a1);
        d = "polling";
    }

    static com.github.nkzawa.engineio.client.Transport.ReadyState a(a a1, com.github.nkzawa.engineio.client.Transport.ReadyState readystate)
    {
        a1.o = readystate;
        return readystate;
    }

    static void a(a a1, b b1)
    {
        a1.a(b1);
    }

    private void a(Object obj)
    {
        com.github.nkzawa.engineio.parser.c.a a1;
        p.fine(String.format("polling got data %s", new Object[] {
            obj
        }));
        a1 = new com.github.nkzawa.engineio.parser.c.a(this) {

            final a a;
            final a b;

            public final boolean a(b b1)
            {
                if (com.github.nkzawa.engineio.client.a.a.b(a) == com.github.nkzawa.engineio.client.Transport.ReadyState.a)
                {
                    com.github.nkzawa.engineio.client.a.a.c(a);
                }
                if ("close".equals(b1.a))
                {
                    a.d(a);
                    return false;
                } else
                {
                    a.a(a, b1);
                    return true;
                }
            }

            
            {
                b = a.this;
                a = a2;
                super();
            }
        };
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        com.github.nkzawa.engineio.parser.c.a((String)obj, a1);
_L4:
        if (o != com.github.nkzawa.engineio.client.Transport.ReadyState.c)
        {
            q = false;
            a("pollComplete", new Object[0]);
            if (o != com.github.nkzawa.engineio.client.Transport.ReadyState.b)
            {
                break; /* Loop/switch isn't completed */
            }
            j();
        }
        return;
_L2:
        if (obj instanceof byte[])
        {
            com.github.nkzawa.engineio.parser.c.a((byte[])(byte[])obj, a1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        p.fine(String.format("ignoring poll - transport state '%s'", new Object[] {
            o
        }));
        return;
    }

    static boolean a(a a1)
    {
        return a1.q;
    }

    static com.github.nkzawa.engineio.client.Transport.ReadyState b(a a1)
    {
        return a1.o;
    }

    static com.github.nkzawa.engineio.client.Transport.ReadyState b(a a1, com.github.nkzawa.engineio.client.Transport.ReadyState readystate)
    {
        a1.o = readystate;
        return readystate;
    }

    static void c(a a1)
    {
        a1.d();
    }

    static void d(a a1)
    {
        a1.e();
    }

    static Logger i()
    {
        return p;
    }

    private void j()
    {
        p.fine("polling");
        q = true;
        h();
        a("poll", new Object[0]);
    }

    protected final void a(String s)
    {
        a(s);
    }

    protected final void a(byte abyte0[])
    {
        a(abyte0);
    }

    protected abstract void a(byte abyte0[], Runnable runnable);

    protected final void b(b ab[])
    {
        c = false;
        com.github.nkzawa.engineio.parser.c.a(ab, new com.github.nkzawa.engineio.parser.c.b(this, new Runnable(this) {

            final a a;
            final a b;

            public final void run()
            {
                a.c = true;
                a.a("drain", new Object[0]);
            }

            
            {
                b = a.this;
                a = a2;
                super();
            }
        }) {

            final a a;
            final Runnable b;
            final a c;

            public final volatile void a(Object obj)
            {
                obj = (byte[])obj;
                a.a(((byte []) (obj)), b);
            }

            
            {
                c = a.this;
                a = a2;
                b = runnable;
                super();
            }
        });
    }

    protected final void f()
    {
        j();
    }

    protected final void g()
    {
        com.github.nkzawa.b.a a1 = new com.github.nkzawa.b.a(this) {

            final a a;
            final a b;

            public final transient void a(Object aobj[])
            {
                a.i().fine("writing close packet");
                a.b(new b[] {
                    new b("close")
                });
            }

            
            {
                b = a.this;
                a = a2;
                super();
            }
        };
        if (o == com.github.nkzawa.engineio.client.Transport.ReadyState.b)
        {
            p.fine("transport open - closing");
            a1.a(new Object[0]);
            return;
        } else
        {
            p.fine("transport not open - deferring close");
            b("open", a1);
            return;
        }
    }

    protected abstract void h();


    // Unreferenced inner class com/github/nkzawa/engineio/client/a/a$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        final Runnable a;
        final a b;

        public final void run()
        {
            Object obj = b;
            a.a(b, com.github.nkzawa.engineio.client.Transport.ReadyState.d);
            obj = new Runnable(this, ((a) (obj))) {

                final a a;
                final _cls1 b;

                public final void run()
                {
                    a.i().fine("paused");
                    com.github.nkzawa.engineio.client.a.a.b(a, com.github.nkzawa.engineio.client.Transport.ReadyState.d);
    public final class _cls1
        implements Runnable
    {
                    b.a.run();
                }

            
            {
                b = _pcls1;
                a = a1;
                super();
            }
            };
            if (a.a(b) || !b.c)
            {
                int ai[] = new int[1];
                ai[0] = 0;
                if (a.a(b))
                {
                    a.i().fine("we are currently polling - waiting to pause");
                    ai[0] = ai[0] + 1;
                    b.b("pollComplete", new com.github.nkzawa.b.a(this, ai, ((Runnable) (obj))) {

                        final int a[];
                        final Runnable b;
                        final _cls1 c;

                        public final transient void a(Object aobj[])
                        {
                            a.i().fine("pre-pause polling complete");
                            aobj = a;
                            Object obj = aobj[0] - 1;
                            aobj[0] = obj;
                            if (obj == 0)
                            {
                                b.run();
                            }
                        }

            
            {
                c = _pcls1;
                a = ai;
                b = runnable;
                super();
            }
                    });
                }
                if (!b.c)
                {
                    a.i().fine("we are currently writing - waiting to pause");
                    ai[0] = ai[0] + 1;
                    b.b("drain", new com.github.nkzawa.b.a(this, ai, ((Runnable) (obj))) {

                        final int a[];
                        final Runnable b;
                        final _cls1 c;

                        public final transient void a(Object aobj[])
                        {
                            a.i().fine("pre-pause writing complete");
                            aobj = a;
                            Object obj = aobj[0] - 1;
                            aobj[0] = obj;
                            if (obj == 0)
                            {
                                b.run();
                            }
                        }

            
            {
                c = _pcls1;
                a = ai;
                b = runnable;
                super();
            }
                    });
                }
                return;
            } else
            {
                ((Runnable) (obj)).run();
                return;
            }
        }

            public 
            {
                b = a.this;
                a = runnable;
                super();
            }
    }

}
