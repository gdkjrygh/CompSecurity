// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


public final class SessionAuthorizationType extends Enum
{

    private static final SessionAuthorizationType $VALUES[];
    public static final SessionAuthorizationType PUBLISH;
    public static final SessionAuthorizationType READ;

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
        return (SessionAuthorizationType[])$VALUES.clone();
    }

    static 
    {
        READ = new SessionAuthorizationType("READ", 0);
        PUBLISH = new SessionAuthorizationType("PUBLISH", 1);
        $VALUES = (new SessionAuthorizationType[] {
            READ, PUBLISH
        });
    }
}
