// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.k;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.squareup.okhttp:
//            o, d, t, p, 
//            Protocol, n, w

public final class v
{
    public static final class a
    {

        public t a;
        public Protocol b;
        public int c;
        public String d;
        public n e;
        o.a f;
        public w g;
        v h;
        v i;
        v j;

        private static void a(String s, v v1)
        {
            if (v1.g != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(s).append(".body != null").toString());
            }
            if (v1.h != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(s).append(".networkResponse != null").toString());
            }
            if (v1.i != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(s).append(".cacheResponse != null").toString());
            }
            if (v1.j != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(s).append(".priorResponse != null").toString());
            } else
            {
                return;
            }
        }

        public final a a(o o1)
        {
            f = o1.a();
            return this;
        }

        public final a a(v v1)
        {
            if (v1 != null)
            {
                a("networkResponse", v1);
            }
            h = v1;
            return this;
        }

        public final a a(String s, String s1)
        {
            f.b(s, s1);
            return this;
        }

        public final v a()
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
                return new v(this, (byte)0);
            }
        }

        public final a b(v v1)
        {
            if (v1 != null)
            {
                a("cacheResponse", v1);
            }
            i = v1;
            return this;
        }

        public final a b(String s, String s1)
        {
            f.a(s, s1);
            return this;
        }

        public final a c(v v1)
        {
            if (v1 != null && v1.g != null)
            {
                throw new IllegalArgumentException("priorResponse.body != null");
            } else
            {
                j = v1;
                return this;
            }
        }

        public a()
        {
            c = -1;
            f = new o.a();
        }

        private a(v v1)
        {
            c = -1;
            a = v1.a;
            b = v1.b;
            c = v1.c;
            d = v1.d;
            e = v1.e;
            f = v1.f.a();
            g = v1.g;
            h = v1.h;
            i = v1.i;
            j = v1.j;
        }

        a(v v1, byte byte0)
        {
            this(v1);
        }
    }


    public final t a;
    public final Protocol b;
    public final int c;
    public final String d;
    public final n e;
    public final o f;
    public final w g;
    public v h;
    v i;
    final v j;
    private volatile d k;

    private v(a a1)
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

    v(a a1, byte byte0)
    {
        this(a1);
    }

    public final int a()
    {
        return c;
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

    public final String b()
    {
        return d;
    }

    public final o c()
    {
        return f;
    }

    public final w d()
    {
        return g;
    }

    public final a e()
    {
        return new a(this, (byte)0);
    }

    public final v f()
    {
        return i;
    }

    public final List g()
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
        return com.squareup.okhttp.internal.http.k.a(f, s);
    }

    public final d h()
    {
        d d1 = k;
        if (d1 != null)
        {
            return d1;
        } else
        {
            d d2 = com.squareup.okhttp.d.a(f);
            k = d2;
            return d2;
        }
    }

    public final String toString()
    {
        return (new StringBuilder("Response{protocol=")).append(b).append(", code=").append(c).append(", message=").append(d).append(", url=").append(a.a.toString()).append('}').toString();
    }
}
