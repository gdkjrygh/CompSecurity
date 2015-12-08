// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;


// Referenced classes of package com.squareup.okhttp:
//            v, o, t, Protocol, 
//            n, w

public static final class <init>
{

    public t a;
    public Protocol b;
    public int c;
    public String d;
    public n e;
    ocol f;
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

    public final toString a(o o1)
    {
        f = o1.a();
        return this;
    }

    public final f a(v v1)
    {
        if (v1 != null)
        {
            a("networkResponse", v1);
        }
        h = v1;
        return this;
    }

    public final h a(String s, String s1)
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

    public final nit> b(v v1)
    {
        if (v1 != null)
        {
            a("cacheResponse", v1);
        }
        i = v1;
        return this;
    }

    public final i b(String s, String s1)
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

    public ocol()
    {
        c = -1;
        f = new <init>();
    }

    private <init>(v v1)
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

    j(v v1, byte byte0)
    {
        this(v1);
    }
}
