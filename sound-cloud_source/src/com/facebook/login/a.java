// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;


public final class a extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    private static final a f[];
    public final String e;

    private a(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/facebook/login/a, s);
    }

    public static a[] values()
    {
        return (a[])f.clone();
    }

    static 
    {
        a = new a("NONE", 0, null);
        b = new a("ONLY_ME", 1, "only_me");
        c = new a("FRIENDS", 2, "friends");
        d = new a("EVERYONE", 3, "everyone");
        f = (new a[] {
            a, b, c, d
        });
    }
}
