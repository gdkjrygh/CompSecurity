// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.applink;


public final class SessionState extends Enum
{

    public static final SessionState a;
    public static final SessionState b;
    public static final SessionState c;
    private static final SessionState d[];

    private SessionState(String s, int i)
    {
        super(s, i);
    }

    public static SessionState valueOf(String s)
    {
        return (SessionState)Enum.valueOf(com/spotify/mobile/android/spotlets/applink/SessionState, s);
    }

    public static SessionState[] values()
    {
        return (SessionState[])d.clone();
    }

    static 
    {
        a = new SessionState("NotInit", 0);
        b = new SessionState("Started", 1);
        c = new SessionState("Stopped", 2);
        d = (new SessionState[] {
            a, b, c
        });
    }
}
