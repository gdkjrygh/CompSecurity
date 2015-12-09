// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.net.URI;
import java.net.URL;

public final class grq
{

    public final grj a;
    public final String b;
    public final grh c;
    public final grs d;
    final Object e;
    private volatile URL f;
    private volatile URI g;
    private volatile gqq h;

    private grq(grr grr1)
    {
        a = grr1.a;
        b = grr1.b;
        c = grr1.c.a();
        d = grr1.d;
        if (grr1.e != null)
        {
            grr1 = ((grr) (grr1.e));
        } else
        {
            grr1 = this;
        }
        e = grr1;
    }

    grq(grr grr1, byte byte0)
    {
        this(grr1);
    }

    public final String a(String s)
    {
        return c.a(s);
    }

    public final URL a()
    {
        URL url = f;
        if (url != null)
        {
            return url;
        } else
        {
            URL url1 = a.a();
            f = url1;
            return url1;
        }
    }

    public final URI b()
    {
        URI uri;
        try
        {
            uri = g;
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
        g = uri;
        return uri;
    }

    public final grr c()
    {
        return new grr(this, (byte)0);
    }

    public final gqq d()
    {
        gqq gqq1 = h;
        if (gqq1 != null)
        {
            return gqq1;
        } else
        {
            gqq gqq2 = gqq.a(c);
            h = gqq2;
            return gqq2;
        }
    }

    public final boolean e()
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
