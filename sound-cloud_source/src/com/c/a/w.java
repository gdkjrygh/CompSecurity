// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import com.c.a.a.a.k;
import com.c.a.a.g;
import com.c.a.a.i;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

// Referenced classes of package com.c.a:
//            p, d, x

public final class w
{
    public static final class a
    {

        String a;
        URL b;
        String c;
        p.a d;
        x e;
        Object f;

        public final a a(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("url == null");
            } else
            {
                a = s;
                b = null;
                return this;
            }
        }

        public final a a(String s, x x1)
        {
            if (s.length() == 0)
            {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            }
            if (x1 != null && !k.a(s))
            {
                throw new IllegalArgumentException((new StringBuilder("method ")).append(s).append(" must not have a request body.").toString());
            }
            x x2 = x1;
            if (x1 == null)
            {
                x2 = x1;
                if (k.a(s))
                {
                    x2 = x.create(null, i.a);
                }
            }
            c = s;
            e = x2;
            return this;
        }

        public final a a(String s, String s1)
        {
            d.c(s, s1);
            return this;
        }

        public final a a(URL url)
        {
            b = url;
            a = url.toString();
            return this;
        }

        public final w a()
        {
            if (a == null)
            {
                throw new IllegalStateException("url == null");
            } else
            {
                return new w(this, (byte)0);
            }
        }

        public final a b(String s)
        {
            d.a(s);
            return this;
        }

        public final a b(String s, String s1)
        {
            d.a(s, s1);
            return this;
        }

        public a()
        {
            c = "GET";
            d = new p.a();
        }

        private a(w w1)
        {
            a = w1.a;
            b = w1.f;
            c = w1.b;
            e = w1.d;
            f = w1.e;
            d = w1.c.a();
        }

        a(w w1, byte byte0)
        {
            this(w1);
        }
    }


    public final String a;
    public final String b;
    public final p c;
    public final x d;
    final Object e;
    volatile URL f;
    private volatile URI g;
    private volatile d h;

    private w(a a1)
    {
        a = a1.a;
        b = a1.c;
        c = a1.d.a();
        d = a1.e;
        Object obj;
        if (a1.f != null)
        {
            obj = a1.f;
        } else
        {
            obj = this;
        }
        e = obj;
        f = a1.b;
    }

    w(a a1, byte byte0)
    {
        this(a1);
    }

    public final String a(String s)
    {
        return c.a(s);
    }

    public final URL a()
    {
        URL url;
        try
        {
            url = f;
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new RuntimeException((new StringBuilder("Malformed URL: ")).append(a).toString(), malformedurlexception);
        }
        if (url != null)
        {
            return url;
        }
        url = new URL(a);
        f = url;
        return url;
    }

    public final URI b()
        throws IOException
    {
        URI uri;
        try
        {
            uri = g;
        }
        catch (URISyntaxException urisyntaxexception)
        {
            throw new IOException(urisyntaxexception.getMessage());
        }
        if (uri != null)
        {
            return uri;
        }
        com.c.a.a.g.a();
        uri = com.c.a.a.g.a(a());
        g = uri;
        return uri;
    }

    public final a c()
    {
        return new a(this, (byte)0);
    }

    public final d d()
    {
        d d1 = h;
        if (d1 != null)
        {
            return d1;
        } else
        {
            d d2 = com.c.a.d.a(c);
            h = d2;
            return d2;
        }
    }

    public final boolean e()
    {
        return a().getProtocol().equals("https");
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
