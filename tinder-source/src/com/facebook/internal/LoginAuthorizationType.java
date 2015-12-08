// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


public final class LoginAuthorizationType extends Enum
{

    public static final LoginAuthorizationType a;
    public static final LoginAuthorizationType b;
    private static final LoginAuthorizationType c[];

    private LoginAuthorizationType(String s, int i)
    {
        super(s, i);
    }

    public static LoginAuthorizationType valueOf(String s)
    {
        return (LoginAuthorizationType)Enum.valueOf(com/facebook/internal/LoginAuthorizationType, s);
    }

    public static LoginAuthorizationType[] values()
    {
        return (LoginAuthorizationType[])c.clone();
    }

    static 
    {
        a = new LoginAuthorizationType("READ", 0);
        b = new LoginAuthorizationType("PUBLISH", 1);
        c = (new LoginAuthorizationType[] {
            a, b
        });
    }
}
