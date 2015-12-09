// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;


final class m extends Enum
{

    public static final m a;
    public static final m b;
    public static final m c;
    private static final m e[];
    private final String d;

    private m(String s, int i, String s1)
    {
        super(s, i);
        d = s1;
    }

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(com/facebook/login/m, s);
    }

    public static m[] values()
    {
        return (m[])e.clone();
    }

    String a()
    {
        return d;
    }

    static 
    {
        a = new m("SUCCESS", 0, "success");
        b = new m("CANCEL", 1, "cancel");
        c = new m("ERROR", 2, "error");
        e = (new m[] {
            a, b, c
        });
    }
}
