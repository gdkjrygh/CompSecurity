// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.internal;


// Referenced classes of package com.millennialmedia.internal:
//            MMActivity

public static class c
{

    private boolean a;
    private boolean b;
    private int c;
    private int d;
    private Integer e;
    private Integer f;

    static int a(c c1, int i)
    {
        c1.c = i;
        return i;
    }

    static Integer a(c c1)
    {
        return c1.e;
    }

    static Integer b(e e1)
    {
        return e1.f;
    }

    static int c(f f1)
    {
        return f1.c;
    }

    static int d(c c1)
    {
        return c1.d;
    }

    static boolean e(d d1)
    {
        return d1.a;
    }

    static boolean f(a a1)
    {
        return a1.b;
    }

    public b a(int i)
    {
        c = i;
        return this;
    }

    public c a(Integer integer, Integer integer1)
    {
        e = integer;
        f = integer1;
        return this;
    }

    public f a(boolean flag)
    {
        a = flag;
        return this;
    }

    public a b(boolean flag)
    {
        b = flag;
        return this;
    }

    public ()
    {
        d = -1;
        c = -1;
    }
}
