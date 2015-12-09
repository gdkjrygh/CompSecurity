// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


public final class LoginAuthorizationType extends Enum
{

    private static final LoginAuthorizationType $VALUES[];
    public static final LoginAuthorizationType PUBLISH;
    public static final LoginAuthorizationType READ;

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
        return (LoginAuthorizationType[])$VALUES.clone();
    }

    static 
    {
        READ = new LoginAuthorizationType("READ", 0);
        PUBLISH = new LoginAuthorizationType("PUBLISH", 1);
        $VALUES = (new LoginAuthorizationType[] {
            READ, PUBLISH
        });
    }
}
