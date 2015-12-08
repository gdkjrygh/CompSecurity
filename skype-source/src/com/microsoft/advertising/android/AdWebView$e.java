// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            AdWebView, Dimensions

private static final class <init>
{

    public int a;
    private int b;
    private int c;
    private int d;

    static int a(<init> <init>1)
    {
        return <init>1.b;
    }

    static void a(b b1, int i)
    {
        b1.c = i;
    }

    static int b(c c1)
    {
        return c1.c;
    }

    static void b(c c1, int i)
    {
        c1.d = i;
    }

    static int c(d d1)
    {
        return d1.d;
    }

    static void c(d d1, int i)
    {
        d1.b = i;
    }

    public final void a()
    {
        int i = c;
        c = d;
        d = i;
    }

    public final boolean a(Dimensions dimensions)
    {
        return Math.abs(c - dimensions.c) + Math.abs(d - dimensions.d) < 3;
    }

    private ()
    {
        a = -1;
        c = -1;
        d = -1;
    }

    d(byte byte0)
    {
        this();
    }
}
