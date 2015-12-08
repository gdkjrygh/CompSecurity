// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class SessionLoginBehavior extends Enum
{

    private static final SessionLoginBehavior $VALUES[];
    public static final SessionLoginBehavior SSO_ONLY;
    public static final SessionLoginBehavior SSO_WITH_FALLBACK;
    public static final SessionLoginBehavior SUPPRESS_SSO;
    private final boolean allowsKatanaAuth;
    private final boolean allowsWebViewAuth;

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
        return (SessionLoginBehavior[])$VALUES.clone();
    }

    final boolean allowsKatanaAuth()
    {
        return allowsKatanaAuth;
    }

    final boolean allowsWebViewAuth()
    {
        return allowsWebViewAuth;
    }

    static 
    {
        SSO_WITH_FALLBACK = new SessionLoginBehavior("SSO_WITH_FALLBACK", 0, true, true);
        SSO_ONLY = new SessionLoginBehavior("SSO_ONLY", 1, true, false);
        SUPPRESS_SSO = new SessionLoginBehavior("SUPPRESS_SSO", 2, false, true);
        $VALUES = (new SessionLoginBehavior[] {
            SSO_WITH_FALLBACK, SSO_ONLY, SUPPRESS_SSO
        });
    }
}
