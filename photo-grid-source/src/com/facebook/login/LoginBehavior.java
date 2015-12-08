// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;


public final class LoginBehavior extends Enum
{

    private static final LoginBehavior $VALUES[];
    public static final LoginBehavior SSO_ONLY;
    public static final LoginBehavior SSO_WITH_FALLBACK;
    public static final LoginBehavior SUPPRESS_SSO;
    private final boolean allowsKatanaAuth;
    private final boolean allowsWebViewAuth;

    private LoginBehavior(String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        allowsKatanaAuth = flag;
        allowsWebViewAuth = flag1;
    }

    public static LoginBehavior valueOf(String s)
    {
        return (LoginBehavior)Enum.valueOf(com/facebook/login/LoginBehavior, s);
    }

    public static LoginBehavior[] values()
    {
        return (LoginBehavior[])$VALUES.clone();
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
        SSO_WITH_FALLBACK = new LoginBehavior("SSO_WITH_FALLBACK", 0, true, true);
        SSO_ONLY = new LoginBehavior("SSO_ONLY", 1, true, false);
        SUPPRESS_SSO = new LoginBehavior("SUPPRESS_SSO", 2, false, true);
        $VALUES = (new LoginBehavior[] {
            SSO_WITH_FALLBACK, SSO_ONLY, SUPPRESS_SSO
        });
    }
}
