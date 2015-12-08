// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;


public final class g extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    private static final g f[];
    final boolean d;
    final boolean e;

    private g(String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        d = flag;
        e = flag1;
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/login/g, s);
    }

    public static g[] values()
    {
        return (g[])f.clone();
    }

    static 
    {
        a = new g("NATIVE_WITH_FALLBACK", 0, true, true);
        b = new g("NATIVE_ONLY", 1, true, false);
        c = new g("WEB_ONLY", 2, false, true);
        f = (new g[] {
            a, b, c
        });
    }
}
