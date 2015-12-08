// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.URL;

public final class grr
{

    grj a;
    String b;
    gri c;
    grs d;
    Object e;

    public grr()
    {
        b = "GET";
        c = new gri();
    }

    private grr(grq grq1)
    {
        a = grq1.a;
        b = grq1.b;
        d = grq1.d;
        e = grq1.e;
        c = grq1.c.b();
    }

    grr(grq grq1, byte byte0)
    {
        this(grq1);
    }

    public final grr a()
    {
        return a("GET", ((grs) (null)));
    }

    public final grr a(gqq gqq1)
    {
        gqq1 = gqq1.toString();
        if (gqq1.isEmpty())
        {
            return b("Cache-Control");
        } else
        {
            return a("Cache-Control", ((String) (gqq1)));
        }
    }

    public final grr a(grj grj1)
    {
        if (grj1 == null)
        {
            throw new IllegalArgumentException("url == null");
        } else
        {
            a = grj1;
            return this;
        }
    }

    public final grr a(grs grs)
    {
        return a("POST", grs);
    }

    public final grr a(String s)
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
        s = grj.d(s1);
        if (s == null)
        {
            throw new IllegalArgumentException((new StringBuilder("unexpected url: ")).append(s1).toString());
        } else
        {
            return a(((grj) (s)));
        }
    }

    public final grr a(String s, grs grs)
    {
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("method == null || method.length() == 0");
        }
        if (grs != null && !guk.c(s))
        {
            throw new IllegalArgumentException((new StringBuilder("method ")).append(s).append(" must not have a request body.").toString());
        }
        if (grs == null && guk.b(s))
        {
            throw new IllegalArgumentException((new StringBuilder("method ")).append(s).append(" must have a request body.").toString());
        } else
        {
            b = s;
            d = grs;
            return this;
        }
    }

    public final grr a(String s, String s1)
    {
        c.b(s, s1);
        return this;
    }

    public final grr a(URL url)
    {
        if (url == null)
        {
            throw new IllegalArgumentException("url == null");
        }
        grj grj1 = grj.a(url);
        if (grj1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("unexpected url: ")).append(url).toString());
        } else
        {
            return a(grj1);
        }
    }

    public final grq b()
    {
        if (a == null)
        {
            throw new IllegalStateException("url == null");
        } else
        {
            return new grq(this, (byte)0);
        }
    }

    public final grr b(String s)
    {
        c.b(s);
        return this;
    }

    public final grr b(String s, String s1)
    {
        c.a(s, s1);
        return this;
    }
}
