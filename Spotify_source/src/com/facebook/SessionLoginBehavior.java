// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class SessionLoginBehavior extends Enum
{

    public static final SessionLoginBehavior a;
    private static SessionLoginBehavior b;
    private static SessionLoginBehavior c;
    private static final SessionLoginBehavior d[];
    final boolean allowsKatanaAuth;
    final boolean allowsWebViewAuth;

    private SessionLoginBehavior(String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        allowsKatanaAuth = flag;
        allowsWebViewAuth = flag1;
    }

    public static SessionLoginBehavior valueOf(String s)
    {
        return (SessionLoginBehavior)Enum.valueOf(com/facebook/SessionLoginBehavior, s);
    }

    public static SessionLoginBehavior[] values()
    {
        return (SessionLoginBehavior[])d.clone();
    }

    static 
    {
        a = new SessionLoginBehavior("SSO_WITH_FALLBACK", 0, true, true);
        b = new SessionLoginBehavior("SSO_ONLY", 1, true, false);
        c = new SessionLoginBehavior("SUPPRESS_SSO", 2, false, true);
        d = (new SessionLoginBehavior[] {
            a, b, c
        });
    }
}
