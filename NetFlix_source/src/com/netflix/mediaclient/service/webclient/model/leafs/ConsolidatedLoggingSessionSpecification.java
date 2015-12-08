// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;


public class ConsolidatedLoggingSessionSpecification
{

    private int disableChancePercentagePerUserSession;
    private String session;
    private int suppressPercentagePerEvent;

    public ConsolidatedLoggingSessionSpecification()
    {
    }

    public int getDisableChancePercentagePerUserSession()
    {
        return disableChancePercentagePerUserSession;
    }

    public String getSession()
    {
        return session;
    }

    public int getSuppressPercentagePerEvent()
    {
        return suppressPercentagePerEvent;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ConsolidatedLoggingSpecification [session=").append(session).append(", disableChancePercentagePerUserSession=").append(disableChancePercentagePerUserSession).append(", suppressPercentagePerEvent=").append(suppressPercentagePerEvent).append("]").toString();
    }
}
