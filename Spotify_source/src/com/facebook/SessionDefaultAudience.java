// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class SessionDefaultAudience extends Enum
{

    public static final SessionDefaultAudience a;
    private static SessionDefaultAudience b;
    private static SessionDefaultAudience c;
    private static SessionDefaultAudience d;
    private static final SessionDefaultAudience e[];
    public final String nativeProtocolAudience;

    private SessionDefaultAudience(String s, int i, String s1)
    {
        super(s, i);
        nativeProtocolAudience = s1;
    }

    public static SessionDefaultAudience valueOf(String s)
    {
        return (SessionDefaultAudience)Enum.valueOf(com/facebook/SessionDefaultAudience, s);
    }

    public static SessionDefaultAudience[] values()
    {
        return (SessionDefaultAudience[])e.clone();
    }

    static 
    {
        b = new SessionDefaultAudience("NONE", 0, null);
        c = new SessionDefaultAudience("ONLY_ME", 1, "only_me");
        a = new SessionDefaultAudience("FRIENDS", 2, "friends");
        d = new SessionDefaultAudience("EVERYONE", 3, "everyone");
        e = (new SessionDefaultAudience[] {
            b, c, a, d
        });
    }
}
