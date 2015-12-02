// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;


// Referenced classes of package com.facebook.http.protocol:
//            y, f

public class z
{

    private final f a;
    private final Object b;
    private String c;
    private String d;

    public z(f f, Object obj)
    {
        a = f;
        b = obj;
    }

    static f a(z z1)
    {
        return z1.a;
    }

    static Object b(z z1)
    {
        return z1.b;
    }

    static String c(z z1)
    {
        return z1.c;
    }

    static String d(z z1)
    {
        return z1.d;
    }

    public y a()
    {
        return new y(this);
    }

    public z a(String s)
    {
        c = s;
        return this;
    }

    public z b(String s)
    {
        d = s;
        return this;
    }
}
