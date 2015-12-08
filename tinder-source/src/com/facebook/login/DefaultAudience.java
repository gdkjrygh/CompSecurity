// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;


public final class DefaultAudience extends Enum
{

    public static final DefaultAudience a;
    public static final DefaultAudience b;
    public static final DefaultAudience c;
    public static final DefaultAudience d;
    private static final DefaultAudience f[];
    public final String e;

    private DefaultAudience(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }

    public static DefaultAudience valueOf(String s)
    {
        return (DefaultAudience)Enum.valueOf(com/facebook/login/DefaultAudience, s);
    }

    public static DefaultAudience[] values()
    {
        return (DefaultAudience[])f.clone();
    }

    static 
    {
        a = new DefaultAudience("NONE", 0, null);
        b = new DefaultAudience("ONLY_ME", 1, "only_me");
        c = new DefaultAudience("FRIENDS", 2, "friends");
        d = new DefaultAudience("EVERYONE", 3, "everyone");
        f = (new DefaultAudience[] {
            a, b, c, d
        });
    }
}
