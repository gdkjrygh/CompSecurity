// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.i;

// Referenced classes of package com.squareup.okhttp:
//            t, o, d, p, 
//            u

public static final class <init>
{

    p a;
    String b;
    a c;
    u d;
    Object e;

    public final <init> a(d d1)
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

    public final d a(String s, String s1)
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

    public final nit> b(String s)
    {
        c.b(s);
        return this;
    }

    public final b b(String s, String s1)
    {
        c.a(s, s1);
        return this;
    }

    public ception()
    {
        b = "GET";
        c = new <init>();
    }

    private <init>(t t1)
    {
        a = t1.a;
        b = t1.b;
        d = t1.d;
        e = t1.e;
        c = t1.c.a();
    }

    c(t t1, byte byte0)
    {
        this(t1);
    }
}
