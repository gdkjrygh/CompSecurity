// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.g.a;

import com.google.common.a.es;
import com.google.common.a.et;

// Referenced classes of package com.facebook.g.a:
//            c, a

public class b
{

    private String a;
    private String b;
    private String c;
    private et d;
    private et e;

    b()
    {
        e = es.e();
        d = es.e();
    }

    public b a(a a1)
    {
        e.b(a1);
        return this;
    }

    public b a(c c1)
    {
        d.b(c1);
        return this;
    }

    public b a(String s)
    {
        a = s;
        return this;
    }

    public transient b a(String s, Object aobj[])
    {
        return a(new c(s, aobj));
    }

    public String a()
    {
        return a;
    }

    public b b(String s)
    {
        b = s;
        return this;
    }

    public String b()
    {
        return b;
    }

    public b c(String s)
    {
        return a((new b()).a(s).f());
    }

    public es c()
    {
        return e.b();
    }

    public b d(String s)
    {
        c = s;
        return this;
    }

    public String d()
    {
        return c;
    }

    public es e()
    {
        return d.b();
    }

    public a f()
    {
        return new a(this);
    }
}
