// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.i;
import java.io.IOException;
import java.net.URI;

// Referenced classes of package com.squareup.okhttp:
//            o, p, d, u

public final class t
{
    public static final class a
    {

        p a;
        String b;
        o.a c;
        u d;
        Object e;

        public final a a(d d1)
        {
            d1 = d1.toString();
            if (d1.isEmpty())
            {
                return b("Cache-Control");
            } else
            {
                return a("Cache-Control", ((String) (d1)));
            }
        }

        public final a a(p p1)
        {
            if (p1 == null)
            {
                throw new IllegalArgumentException("url == null");
            } else
            {
                a = p1;
                return this;
            }
        }

        public final a a(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("url == null");
            }
            String s1;
            if (s.regionMatches(true, 0, "ws:", 0, 3))
            {
                s1 = (new StringBuilder("http:")).append(s.substring(3)).toString();
            } else
            {
                s1 = s;
                if (s.regionMatches(true, 0, "wss:", 0, 4))
                {
                    s1 = (new StringBuilder("https:")).append(s.substring(4)).toString();
                }
            }
            s = p.d(s1);
            if (s == null)
            {
                throw new IllegalArgumentException((new StringBuilder("unexpected url: ")).append(s1).toString());
            } else
            {
                return a(((p) (s)));
            }
        }

        public final a a(String s, u u)
        {
            if (s == null || s.length() == 0)
            {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            }
            if (u != null && !i.c(s))
            {
                throw new IllegalArgumentException((new StringBuilder("method ")).append(s).append(" must not have a request body.").toString());
            }
            if (u == null && i.b(s))
            {
                throw new IllegalArgumentException((new StringBuilder("method ")).append(s).append(" must have a request body.").toString());
            } else
            {
                b = s;
                d = u;
                return this;
            }
        }

        public final a a(String s, String s1)
        {
            c.b(s, s1);
            return this;
        }

        public final t a()
        {
            if (a == null)
            {
                throw new IllegalStateException("url == null");
            } else
            {
                return new t(this, (byte)0);
            }
        }

        public final a b(String s)
        {
            c.b(s);
            return this;
        }

        public final a b(String s, String s1)
        {
            c.a(s, s1);
            return this;
        }

        public a()
        {
            b = "GET";
            c = new o.a();
        }

        private a(t t1)
        {
            a = t1.a;
            b = t1.b;
            d = t1.d;
            e = t1.e;
            c = t1.c.a();
        }

        a(t t1, byte byte0)
        {
            this(t1);
        }
    }


    public final p a;
    public final String b;
    public final o c;
    public final u d;
    final Object e;
    private volatile URI f;
    private volatile d g;

    private t(a a1)
    {
        a = a1.a;
        b = a1.b;
        c = a1.c.a();
        d = a1.d;
        if (a1.e != null)
        {
            a1 = ((a) (a1.e));
        } else
        {
            a1 = this;
        }
        e = a1;
    }

    t(a a1, byte byte0)
    {
        this(a1);
    }

    public final String a(String s)
    {
        return c.a(s);
    }

    public final URI a()
        throws IOException
    {
        URI uri;
        try
        {
            uri = f;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw new IOException(illegalstateexception.getMessage());
        }
        if (uri != null)
        {
            return uri;
        }
        uri = a.b();
        f = uri;
        return uri;
    }

    public final a b()
    {
        return new a(this, (byte)0);
    }

    public final d c()
    {
        d d1 = g;
        if (d1 != null)
        {
            return d1;
        } else
        {
            d d2 = com.squareup.okhttp.d.a(c);
            g = d2;
            return d2;
        }
    }

    public final boolean d()
    {
        return a.a.equals("https");
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("Request{method=")).append(b).append(", url=").append(a).append(", tag=");
        Object obj;
        if (e != this)
        {
            obj = e;
        } else
        {
            obj = null;
        }
        return stringbuilder.append(obj).append('}').toString();
    }
}
