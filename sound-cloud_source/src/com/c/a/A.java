// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import com.c.a.a.a.m;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.a:
//            p, d, w, v, 
//            o, B

public final class A
{
    public static final class a
    {

        public w a;
        public v b;
        public int c;
        public String d;
        public o e;
        p.a f;
        public B g;
        A h;
        A i;
        A j;

        private static void a(String s, A a1)
        {
            if (a1.g != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(s).append(".body != null").toString());
            }
            if (a1.h != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(s).append(".networkResponse != null").toString());
            }
            if (a1.i != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(s).append(".cacheResponse != null").toString());
            }
            if (a1.j != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(s).append(".priorResponse != null").toString());
            } else
            {
                return;
            }
        }

        public final a a(A a1)
        {
            if (a1 != null)
            {
                a("networkResponse", a1);
            }
            h = a1;
            return this;
        }

        public final a a(p p1)
        {
            f = p1.a();
            return this;
        }

        public final a a(String s, String s1)
        {
            f.c(s, s1);
            return this;
        }

        public final A a()
        {
            if (a == null)
            {
                throw new IllegalStateException("request == null");
            }
            if (b == null)
            {
                throw new IllegalStateException("protocol == null");
            }
            if (c < 0)
            {
                throw new IllegalStateException((new StringBuilder("code < 0: ")).append(c).toString());
            } else
            {
                return new A(this, (byte)0);
            }
        }

        public final a b(A a1)
        {
            if (a1 != null)
            {
                a("cacheResponse", a1);
            }
            i = a1;
            return this;
        }

        public final a b(String s, String s1)
        {
            f.a(s, s1);
            return this;
        }

        public final a c(A a1)
        {
            if (a1 != null && a1.g != null)
            {
                throw new IllegalArgumentException("priorResponse.body != null");
            } else
            {
                j = a1;
                return this;
            }
        }

        public a()
        {
            c = -1;
            f = new p.a();
        }

        private a(A a1)
        {
            c = -1;
            a = a1.a;
            b = a1.b;
            c = a1.c;
            d = a1.d;
            e = a1.e;
            f = a1.f.a();
            g = a1.g;
            h = a1.h;
            i = a1.i;
            j = a1.j;
        }

        a(A a1, byte byte0)
        {
            this(a1);
        }
    }


    public final w a;
    public final v b;
    public final int c;
    final String d;
    public final o e;
    public final p f;
    public final B g;
    A h;
    A i;
    final A j;
    private volatile d k;

    private A(a a1)
    {
        a = a1.a;
        b = a1.b;
        c = a1.c;
        d = a1.d;
        e = a1.e;
        f = a1.f.a();
        g = a1.g;
        h = a1.h;
        i = a1.i;
        j = a1.j;
    }

    A(a a1, byte byte0)
    {
        this(a1);
    }

    public final String a(String s)
    {
        s = f.a(s);
        if (s != null)
        {
            return s;
        } else
        {
            return null;
        }
    }

    public final boolean a()
    {
        return c >= 200 && c < 300;
    }

    public final a b()
    {
        return new a(this, (byte)0);
    }

    public final List c()
    {
        String s;
        if (c == 401)
        {
            s = "WWW-Authenticate";
        } else
        if (c == 407)
        {
            s = "Proxy-Authenticate";
        } else
        {
            return Collections.emptyList();
        }
        return m.a(f, s);
    }

    public final d d()
    {
        d d1 = k;
        if (d1 != null)
        {
            return d1;
        } else
        {
            d d2 = com.c.a.d.a(f);
            k = d2;
            return d2;
        }
    }

    public final String toString()
    {
        return (new StringBuilder("Response{protocol=")).append(b).append(", code=").append(c).append(", message=").append(d).append(", url=").append(a.a).append('}').toString();
    }
}
