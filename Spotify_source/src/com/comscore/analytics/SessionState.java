// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;


public final class SessionState extends Enum
{

    public static final SessionState a;
    public static final SessionState b;
    public static final SessionState c;
    public static final SessionState d;
    private static final SessionState e[];

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
        return (SessionState[])e.clone();
    }

    static 
    {
        a = new SessionState("INACTIVE", 0);
        b = new SessionState("APPLICATION", 1);
        c = new SessionState("USER", 2);
        d = new SessionState("ACTIVE_USER", 3);
        e = (new SessionState[] {
            a, b, c, d
        });
    }
}
