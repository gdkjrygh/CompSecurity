// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.session;


public class AnalyticsSessionInfo
{

    long lastActivity;
    String sessionId;

    public AnalyticsSessionInfo(String s, long l)
    {
        sessionId = s;
        lastActivity = l;
    }

    long getLastActivity()
    {
        return lastActivity;
    }

    String getSessionId()
    {
        return sessionId;
    }

    void setLastActivity(long l)
    {
        lastActivity = l;
    }

    void setSessionId(String s)
    {
        sessionId = s;
    }
}
