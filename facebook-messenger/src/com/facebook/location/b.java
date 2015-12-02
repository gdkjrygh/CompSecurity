// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;


// Referenced classes of package com.facebook.location:
//            Coordinates

public class b
{

    private Double a;
    private Double b;
    private Double c;
    private Float d;
    private Float e;
    private Float f;
    private Float g;

    public b()
    {
    }

    public b a(Double double1)
    {
        a = double1;
        return this;
    }

    public b a(Float float1)
    {
        d = float1;
        return this;
    }

    public Double a()
    {
        return a;
    }

    public b b(Double double1)
    {
        b = double1;
        return this;
    }

    public b b(Float float1)
    {
        e = float1;
        return this;
    }

    public Double b()
    {
        return b;
    }

    public b c(Double double1)
    {
        c = double1;
        return this;
    }

    public b c(Float float1)
    {
        f = float1;
        return this;
    }

    public Double c()
    {
        return c;
    }

    public b d(Float float1)
    {
        g = float1;
        return this;
    }

    public Float d()
    {
        return d;
    }

    public Float e()
    {
        return e;
    }

    public Float f()
    {
        return f;
    }

    public Float g()
    {
        return g;
    }

    public Coordinates h()
    {
        return new Coordinates(this);
    }
}
