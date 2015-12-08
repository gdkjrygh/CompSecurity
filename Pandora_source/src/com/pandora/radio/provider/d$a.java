// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;


// Referenced classes of package com.pandora.radio.provider:
//            d

public static class c
{

    private final String a;
    private final int b;
    private final String c;

    public static c a(String s)
    {
        return new <init>(s, 1, null);
    }

    public static <init> a(String s, String s1)
    {
        return new <init>(s, 2, s1);
    }

    public static <init> b(String s)
    {
        return new <init>(s, 2, null);
    }

    public static <init> c(String s)
    {
        return new <init>(s, 3, null);
    }

    public String a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    private (String s, int i, String s1)
    {
        a = s;
        b = i;
        c = s1;
    }
}
