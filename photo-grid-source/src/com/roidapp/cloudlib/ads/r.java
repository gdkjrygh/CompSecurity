// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;


// Referenced classes of package com.roidapp.cloudlib.ads:
//            q

public final class r
{

    final q a;
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;

    public r(q q)
    {
        a = q;
        super();
    }

    static int a(r r1)
    {
        return r1.b;
    }

    static int a(r r1, int i)
    {
        r1.b = i;
        return i;
    }

    static String a(r r1, String s)
    {
        r1.d = s;
        return s;
    }

    static String b(r r1)
    {
        return r1.d;
    }

    static String b(r r1, String s)
    {
        r1.c = s;
        return s;
    }

    static String c(r r1)
    {
        return r1.c;
    }

    static String c(r r1, String s)
    {
        r1.f = s;
        return s;
    }

    static String d(r r1)
    {
        return r1.f;
    }

    static String d(r r1, String s)
    {
        r1.e = s;
        return s;
    }

    static String e(r r1)
    {
        return r1.e;
    }

    public final int a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }
}
