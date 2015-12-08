// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import com.c.a.a.a.k;
import com.c.a.a.i;
import java.net.URL;

// Referenced classes of package com.c.a:
//            w, p, x

public static final class <init>
{

    String a;
    URL b;
    String c;
    ring d;
    x e;
    Object f;

    public final ring a(String s)
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

    public final ring a(String s, x x1)
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

    public final ring a(String s, String s1)
    {
        d.c(s, s1);
        return this;
    }

    public final  a(URL url)
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

    public final ring b(String s)
    {
        d.a(s);
        return this;
    }

    public final ring b(String s, String s1)
    {
        d.a(s, s1);
        return this;
    }

    public ring()
    {
        c = "GET";
        d = new <init>();
    }

    private <init>(w w1)
    {
        a = w1.a;
        b = w1.f;
        c = w1.b;
        e = w1.d;
        f = w1.e;
        d = w1.c.a();
    }

    d(w w1, byte byte0)
    {
        this(w1);
    }
}
