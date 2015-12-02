// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import java.util.List;

// Referenced classes of package com.facebook.http.protocol:
//            o, n, t

public class p
{

    private String a;
    private String b;
    private String c;
    private List d;
    private t e;
    private List f;
    private Object g;
    private boolean h;
    private boolean i;
    private o j;

    public p()
    {
        j = o.MULTI_PART_ENTITY;
    }

    public p a(t t)
    {
        e = t;
        return this;
    }

    public p a(String s)
    {
        a = s;
        return this;
    }

    public p a(List list)
    {
        d = list;
        return this;
    }

    public String a()
    {
        return a;
    }

    public p b(String s)
    {
        b = s;
        return this;
    }

    public p b(List list)
    {
        f = list;
        return this;
    }

    public String b()
    {
        return b;
    }

    public p c(String s)
    {
        c = s;
        return this;
    }

    public String c()
    {
        return c;
    }

    public List d()
    {
        return d;
    }

    public t e()
    {
        return e;
    }

    public List f()
    {
        return f;
    }

    public Object g()
    {
        return g;
    }

    public boolean h()
    {
        return h;
    }

    public boolean i()
    {
        return i;
    }

    public o j()
    {
        return j;
    }

    public n k()
    {
        return new n(this);
    }
}
