// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.h;


public final class l
{

    private String a;
    private String b;

    private l()
    {
    }

    public static l a(String s, String s1)
    {
        l l1 = new l();
        l1.a(s1);
        l1.b(s);
        return l1;
    }

    public String a()
    {
        return a;
    }

    public void a(String s)
    {
        a = s;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        b = s;
    }
}
