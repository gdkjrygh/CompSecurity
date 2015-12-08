// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;


public final class LoginBehavior extends Enum
{

    public static final LoginBehavior a;
    public static final LoginBehavior b;
    public static final LoginBehavior c;
    private static final LoginBehavior f[];
    final boolean d;
    final boolean e;

    private LoginBehavior(String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        d = flag;
        e = flag1;
    }

    public static LoginBehavior valueOf(String s)
    {
        return (LoginBehavior)Enum.valueOf(com/facebook/login/LoginBehavior, s);
    }

    public static LoginBehavior[] values()
    {
        return (LoginBehavior[])f.clone();
    }

    static 
    {
        a = new LoginBehavior("NATIVE_WITH_FALLBACK", 0, true, true);
        b = new LoginBehavior("NATIVE_ONLY", 1, true, false);
        c = new LoginBehavior("WEB_ONLY", 2, false, true);
        f = (new LoginBehavior[] {
            a, b, c
        });
    }
}
