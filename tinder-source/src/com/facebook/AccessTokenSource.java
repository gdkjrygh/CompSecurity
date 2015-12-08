// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class AccessTokenSource extends Enum
{

    public static final AccessTokenSource a;
    public static final AccessTokenSource b;
    public static final AccessTokenSource c;
    public static final AccessTokenSource d;
    public static final AccessTokenSource e;
    public static final AccessTokenSource f;
    public static final AccessTokenSource g;
    private static final AccessTokenSource i[];
    final boolean h;

    private AccessTokenSource(String s, int j, boolean flag)
    {
        super(s, j);
        h = flag;
    }

    public static AccessTokenSource valueOf(String s)
    {
        return (AccessTokenSource)Enum.valueOf(com/facebook/AccessTokenSource, s);
    }

    public static AccessTokenSource[] values()
    {
        return (AccessTokenSource[])i.clone();
    }

    static 
    {
        a = new AccessTokenSource("NONE", 0, false);
        b = new AccessTokenSource("FACEBOOK_APPLICATION_WEB", 1, true);
        c = new AccessTokenSource("FACEBOOK_APPLICATION_NATIVE", 2, true);
        d = new AccessTokenSource("FACEBOOK_APPLICATION_SERVICE", 3, true);
        e = new AccessTokenSource("WEB_VIEW", 4, false);
        f = new AccessTokenSource("TEST_USER", 5, true);
        g = new AccessTokenSource("CLIENT_TOKEN", 6, true);
        i = (new AccessTokenSource[] {
            a, b, c, d, e, f, g
        });
    }
}
