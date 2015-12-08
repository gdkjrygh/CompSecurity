// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;


public final class LoginBehavior extends Enum
{

    private static final LoginBehavior $VALUES[];
    public static final LoginBehavior NATIVE_ONLY;
    public static final LoginBehavior NATIVE_WITH_FALLBACK;
    public static final LoginBehavior WEB_ONLY;
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

    boolean allowsKatanaAuth()
    {
        return allowsKatanaAuth;
    }

    boolean allowsWebViewAuth()
    {
        return allowsWebViewAuth;
    }

    static 
    {
        NATIVE_WITH_FALLBACK = new LoginBehavior("NATIVE_WITH_FALLBACK", 0, true, true);
        NATIVE_ONLY = new LoginBehavior("NATIVE_ONLY", 1, true, false);
        WEB_ONLY = new LoginBehavior("WEB_ONLY", 2, false, true);
        $VALUES = (new LoginBehavior[] {
            NATIVE_WITH_FALLBACK, NATIVE_ONLY, WEB_ONLY
        });
    }
}
