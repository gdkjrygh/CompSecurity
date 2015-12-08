// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.Protocol;

public final class gru
{

    public grq a;
    public Protocol b;
    public int c;
    public String d;
    public grg e;
    gri f;
    public grv g;
    grt h;
    grt i;
    grt j;

    public gru()
    {
        c = -1;
        f = new gri();
    }

    private gru(grt grt1)
    {
        c = -1;
        a = grt1.a;
        b = grt1.b;
        c = grt1.c;
        d = grt1.d;
        e = grt1.e;
        f = grt1.f.b();
        g = grt1.g;
        h = grt1.h;
        i = grt1.i;
        j = grt1.j;
    }

    gru(grt grt1, byte byte0)
    {
        this(grt1);
    }

    private static void a(String s, grt grt1)
    {
        if (grt1.g != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(".body != null").toString());
        }
        if (grt1.h != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(".networkResponse != null").toString());
        }
        if (grt1.i != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(".cacheResponse != null").toString());
        }
        if (grt1.j != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(".priorResponse != null").toString());
        } else
        {
            return;
        }
    }

    public final grt a()
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
            return new grt(this, (byte)0);
        }
    }

    public final gru a(int k)
    {
        c = k;
        return this;
    }

    public final gru a(Protocol protocol)
    {
        b = protocol;
        return this;
    }

    public final gru a(grh grh1)
    {
        f = grh1.b();
        return this;
    }

    public final gru a(grq grq)
    {
        a = grq;
        return this;
    }

    public final gru a(grt grt1)
    {
        if (grt1 != null)
        {
            a("networkResponse", grt1);
        }
        h = grt1;
        return this;
    }

    public final gru a(grv grv)
    {
        g = grv;
        return this;
    }

    public final gru a(String s, String s1)
    {
        f.b(s, s1);
        return this;
    }

    public final gru b(grt grt1)
    {
        if (grt1 != null)
        {
            a("cacheResponse", grt1);
        }
        i = grt1;
        return this;
    }

    public final gru b(String s, String s1)
    {
        f.a(s, s1);
        return this;
    }

    public final gru c(grt grt1)
    {
        if (grt1 != null && grt1.g != null)
        {
            throw new IllegalArgumentException("priorResponse.body != null");
        } else
        {
            j = grt1;
            return this;
        }
    }
}
