// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.e;


// Referenced classes of package com.facebook.common.e:
//            m

public class n
{

    private String a;
    private String b;
    private Throwable c;
    private boolean d;
    private int e;
    private boolean f;

    n()
    {
        e = 1000;
    }

    public n a(int i)
    {
        e = i;
        return this;
    }

    public n a(String s)
    {
        a = s;
        return this;
    }

    public n a(Throwable throwable)
    {
        c = throwable;
        return this;
    }

    public n a(boolean flag)
    {
        d = flag;
        return this;
    }

    public String a()
    {
        return a;
    }

    public n b(String s)
    {
        b = s;
        return this;
    }

    public n b(boolean flag)
    {
        f = flag;
        return this;
    }

    public String b()
    {
        return b;
    }

    public Throwable c()
    {
        return c;
    }

    public boolean d()
    {
        return d;
    }

    public int e()
    {
        return e;
    }

    public boolean f()
    {
        return f;
    }

    public m g()
    {
        return new m(this);
    }
}
