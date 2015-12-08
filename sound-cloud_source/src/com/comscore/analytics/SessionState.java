// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;


public final class SessionState extends Enum
{

    public static final SessionState ACTIVE_USER;
    public static final SessionState APPLICATION;
    public static final SessionState INACTIVE;
    public static final SessionState USER;
    private static final SessionState a[];

    private SessionState(String s, int i)
    {
        super(s, i);
    }

    public static SessionState valueOf(String s)
    {
        return (SessionState)Enum.valueOf(com/comscore/analytics/SessionState, s);
    }

    public static SessionState[] values()
    {
        return (SessionState[])a.clone();
    }

    static 
    {
        INACTIVE = new SessionState("INACTIVE", 0);
        APPLICATION = new SessionState("APPLICATION", 1);
        USER = new SessionState("USER", 2);
        ACTIVE_USER = new SessionState("ACTIVE_USER", 3);
        a = (new SessionState[] {
            INACTIVE, APPLICATION, USER, ACTIVE_USER
        });
    }
}
