// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;


// Referenced classes of package com.facebook.location:
//            Coordinates

public class g
{

    private final double a;
    private final double b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public g()
    {
        a = 0.0D;
        b = 0.0D;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
    }

    public g(Coordinates coordinates, String s, String s1, String s2, String s3, String s4)
    {
        a = coordinates.b();
        b = coordinates.c();
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = s4;
    }

    public double a()
    {
        return a;
    }

    public double b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public String e()
    {
        return e;
    }

    public String f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }
}
