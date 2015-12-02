// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan.a;


// Referenced classes of package com.qihoo.security.engine.cloudscan.a:
//            a

public static class <init>
{

    private String a;
    private boolean b;
    private int c;
    private boolean d;

    static String a(<init> <init>1)
    {
        return <init>1.a;
    }

    static boolean b(a a1)
    {
        return a1.b;
    }

    static int c(b b1)
    {
        return b1.c;
    }

    static boolean d(c c1)
    {
        return c1.d;
    }

    public d a(int i)
    {
        c = i;
        d = true;
        return this;
    }

    public d a(String s)
    {
        a = s;
        b = true;
        return this;
    }

    public a a()
    {
        return new a(this, null);
    }

    private ()
    {
        b = false;
        d = false;
    }

    d(d d1)
    {
        this();
    }
}
