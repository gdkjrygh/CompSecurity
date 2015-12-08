// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.Protocol;
import java.util.Collections;
import java.util.List;

public final class grt
{

    public final grq a;
    public final Protocol b;
    public final int c;
    public final String d;
    public final grg e;
    public final grh f;
    public final grv g;
    public grt h;
    public grt i;
    final grt j;
    private volatile gqq k;

    private grt(gru gru1)
    {
        a = gru1.a;
        b = gru1.b;
        c = gru1.c;
        d = gru1.d;
        e = gru1.e;
        f = gru1.f.a();
        g = gru1.g;
        h = gru1.h;
        i = gru1.i;
        j = gru1.j;
    }

    grt(gru gru1, byte byte0)
    {
        this(gru1);
    }

    public final int a()
    {
        return c;
    }

    public final String a(String s, String s1)
    {
        s = f.a(s);
        if (s != null)
        {
            s1 = s;
        }
        return s1;
    }

    public final List a(String s)
    {
        return f.c(s);
    }

    public final String b(String s)
    {
        return a(s, null);
    }

    public final boolean b()
    {
        return c >= 200 && c < 300;
    }

    public final String c()
    {
        return d;
    }

    public final grh d()
    {
        return f;
    }

    public final grv e()
    {
        return g;
    }

    public final gru f()
    {
        return new gru(this, (byte)0);
    }

    public final boolean g()
    {
        switch (c)
        {
        case 304: 
        case 305: 
        case 306: 
        default:
            return false;

        case 300: 
        case 301: 
        case 302: 
        case 303: 
        case 307: 
        case 308: 
            return true;
        }
    }

    public final grt h()
    {
        return i;
    }

    public final List i()
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
        return gum.b(f, s);
    }

    public final gqq j()
    {
        gqq gqq1 = k;
        if (gqq1 != null)
        {
            return gqq1;
        } else
        {
            gqq gqq2 = gqq.a(f);
            k = gqq2;
            return gqq2;
        }
    }

    public final String toString()
    {
        return (new StringBuilder("Response{protocol=")).append(b).append(", code=").append(c).append(", message=").append(d).append(", url=").append(a.a.toString()).append('}').toString();
    }
}
