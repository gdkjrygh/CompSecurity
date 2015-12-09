// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


public final class SessionAuthorizationType extends Enum
{

    public static final SessionAuthorizationType a;
    public static final SessionAuthorizationType b;
    private static final SessionAuthorizationType c[];

    private SessionAuthorizationType(String s, int i)
    {
        super(s, i);
    }

    public static SessionAuthorizationType valueOf(String s)
    {
        return (SessionAuthorizationType)Enum.valueOf(com/facebook/internal/SessionAuthorizationType, s);
    }

    public static SessionAuthorizationType[] values()
    {
        return (SessionAuthorizationType[])c.clone();
    }

    static 
    {
        a = new SessionAuthorizationType("READ", 0);
        b = new SessionAuthorizationType("PUBLISH", 1);
        c = (new SessionAuthorizationType[] {
            a, b
        });
    }
}
