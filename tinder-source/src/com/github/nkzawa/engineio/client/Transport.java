// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;

import com.github.nkzawa.b.a;
import com.github.nkzawa.engineio.parser.b;
import com.github.nkzawa.engineio.parser.c;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;

// Referenced classes of package com.github.nkzawa.engineio.client:
//            EngineIOException, Socket

public abstract class Transport extends com.github.nkzawa.b.a
{
    protected static final class ReadyState extends Enum
    {

        public static final ReadyState a;
        public static final ReadyState b;
        public static final ReadyState c;
        public static final ReadyState d;
        private static final ReadyState e[];

        public static ReadyState valueOf(String s)
        {
            return (ReadyState)Enum.valueOf(com/github/nkzawa/engineio/client/Transport$ReadyState, s);
        }

        public static ReadyState[] values()
        {
            return (ReadyState[])e.clone();
        }

        public final String toString()
        {
            return super.toString().toLowerCase();
        }

        static 
        {
            a = new ReadyState("OPENING", 0);
            b = new ReadyState("OPEN", 1);
            c = new ReadyState("CLOSED", 2);
            d = new ReadyState("PAUSED", 3);
            e = (new ReadyState[] {
                a, b, c, d
            });
        }

        private ReadyState(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static class a
    {

        public String f;
        public String g;
        public String h;
        public boolean i;
        public boolean j;
        public int k;
        public int l;
        public Map m;
        public SSLContext n;
        public HostnameVerifier o;
        protected Socket p;

        public a()
        {
            k = -1;
            l = -1;
        }
    }


    public static int b = 0;
    public boolean c;
    public String d;
    public Map e;
    public boolean f;
    public boolean g;
    public int h;
    public String i;
    public String j;
    public String k;
    public SSLContext l;
    protected Socket m;
    public HostnameVerifier n;
    public ReadyState o;

    public Transport(a a1)
    {
        i = a1.g;
        j = a1.f;
        h = a1.k;
        f = a1.i;
        e = a1.m;
        k = a1.h;
        g = a1.j;
        l = a1.n;
        m = a1.p;
        n = a1.o;
    }

    public final Transport a(String s, Exception exception)
    {
        a("error", new Object[] {
            new EngineIOException(s, exception)
        });
        return this;
    }

    public final void a(b b1)
    {
        a("packet", new Object[] {
            b1
        });
    }

    public void a(String s)
    {
        a(com.github.nkzawa.engineio.parser.c.a(s));
    }

    public void a(byte abyte0[])
    {
        a(com.github.nkzawa.engineio.parser.c.a(abyte0));
    }

    public final void a(b ab[])
    {
        com.github.nkzawa.f.a.a(new Runnable(ab) {

            final b a[];
            final Transport b;

            public final void run()
            {
                if (b.o == com.github.nkzawa.engineio.client.ReadyState.b)
                {
                    b.b(a);
                    return;
                } else
                {
                    throw new RuntimeException("Transport not open");
                }
            }

            
            {
                b = Transport.this;
                a = ab;
                super();
            }
        });
    }

    public final Transport b()
    {
        com.github.nkzawa.f.a.a(new Runnable() {

            final Transport a;

            public final void run()
            {
                if (a.o == com.github.nkzawa.engineio.client.ReadyState.c || a.o == null)
                {
                    a.o = com.github.nkzawa.engineio.client.ReadyState.a;
                    a.f();
                }
            }

            
            {
                a = Transport.this;
                super();
            }
        });
        return this;
    }

    public abstract void b(b ab[]);

    public final Transport c()
    {
        com.github.nkzawa.f.a.a(new Runnable() {

            final Transport a;

            public final void run()
            {
                if (a.o == com.github.nkzawa.engineio.client.ReadyState.a || a.o == com.github.nkzawa.engineio.client.ReadyState.b)
                {
                    a.g();
                    a.e();
                }
            }

            
            {
                a = Transport.this;
                super();
            }
        });
        return this;
    }

    public final void d()
    {
        o = com.github.nkzawa.engineio.client.ReadyState.b;
        c = true;
        a("open", new Object[0]);
    }

    public void e()
    {
        o = com.github.nkzawa.engineio.client.ReadyState.c;
        a("close", new Object[0]);
    }

    public abstract void f();

    public abstract void g();

}
