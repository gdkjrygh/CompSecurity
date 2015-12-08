// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker;

import com.fsr.tracker.domain.MeasureConfiguration;

public class LogEvent
{

    public static final String INVITE_ACCEPTED = "101";
    public static final String INVITE_DECLINED = "102";
    public static final String INVITE_SHOWN = "100";
    private MeasureConfiguration measureConfiguration;
    private String name;
    private String respondentId;

    public LogEvent(String s)
    {
        name = s;
    }

    public LogEvent(String s, String s1, MeasureConfiguration measureconfiguration)
    {
        name = s;
        respondentId = s1;
        measureConfiguration = measureconfiguration;
    }

    public static LogEvent inviteAccepted(String s, MeasureConfiguration measureconfiguration)
    {
        return new LogEvent("101", s, measureconfiguration);
    }

    public static LogEvent inviteDeclined(String s, MeasureConfiguration measureconfiguration)
    {
        return new LogEvent("102", s, measureconfiguration);
    }

    public static LogEvent inviteShown(String s, MeasureConfiguration measureconfiguration)
    {
        return new LogEvent("100", s, measureconfiguration);
    }

    public MeasureConfiguration getMeasureConfiguration()
    {
        return measureConfiguration;
    }

    public String getName()
    {
        return name;
    }

    public String getRespondentId()
    {
        return respondentId;
    }

    public void setMeasureConfiguration(MeasureConfiguration measureconfiguration)
    {
        measureConfiguration = measureconfiguration;
    }

    public void setName(String s)
    {
        name = s;
    }
}
