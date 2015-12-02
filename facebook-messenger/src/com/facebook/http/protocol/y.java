// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;


// Referenced classes of package com.facebook.http.protocol:
//            z, f

public class y
{

    private final f a;
    private final Object b;
    private final String c;
    private final String d;

    y(z z1)
    {
        a = z.a(z1);
        b = z.b(z1);
        c = z.c(z1);
        d = z.d(z1);
    }

    public static z a(f f, Object obj)
    {
        return new z(f, obj);
    }

    public f a()
    {
        return a;
    }

    public Object b()
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
}
