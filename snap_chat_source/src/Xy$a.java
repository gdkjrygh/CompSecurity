// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.URL;

public static final class >
{

    Xs a;
    String b;
    public lang.String c;
    Xz d;
    public Object e;

    private Object a(Xs xs)
    {
        if (xs == null)
        {
            throw new IllegalArgumentException("url == null");
        } else
        {
            a = xs;
            return this;
        }
    }

    public final a a(Xg xg)
    {
        xg = xg.toString();
        if (xg.isEmpty())
        {
            return b("Cache-Control");
        } else
        {
            return a("Cache-Control", ((String) (xg)));
        }
    }

    public final String a(Xr xr)
    {
        c = xr.b();
        return this;
    }

    public final lang.String a(String s)
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
        s = Xs.c(s1);
        if (s == null)
        {
            throw new IllegalArgumentException((new StringBuilder("unexpected url: ")).append(s1).toString());
        } else
        {
            return a(((Xs) (s)));
        }
    }

    public final lang.String a(String s, Xz xz)
    {
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("method == null || method.length() == 0");
        }
        if (xz != null && !XW.c(s))
        {
            throw new IllegalArgumentException((new StringBuilder("method ")).append(s).append(" must not have a request body.").toString());
        }
        if (xz == null && XW.b(s))
        {
            throw new IllegalArgumentException((new StringBuilder("method ")).append(s).append(" must have a request body.").toString());
        } else
        {
            b = s;
            d = xz;
            return this;
        }
    }

    public final lang.String a(String s, String s1)
    {
        c.b(s, s1);
        return this;
    }

    public final net.URL a(URL url)
    {
        Xs xs = Xs.a(url);
        if (xs == null)
        {
            throw new IllegalArgumentException((new StringBuilder("unexpected url: ")).append(url).toString());
        } else
        {
            return a(xs);
        }
    }

    public final Xy a()
    {
        if (a == null)
        {
            throw new IllegalStateException("url == null");
        } else
        {
            return new Xy(this, (byte)0);
        }
    }

    public final lang.String b(String s)
    {
        c.b(s);
        return this;
    }

    public >()
    {
        b = "GET";
        c = new <init>();
    }

    private >(Xy xy)
    {
        a = xy.a;
        b = xy.b;
        d = xy.d;
        e = xy.e;
        c = xy.c.b();
    }

    >(Xy xy, byte byte0)
    {
        this(xy);
    }
}
