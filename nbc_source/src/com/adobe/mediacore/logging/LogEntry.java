// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.logging;


public class LogEntry
{

    private final String dateTime;
    private final String message;
    private final String tag;
    private final Logger.Verbosity verbosity;

    public LogEntry(String s, String s1, Logger.Verbosity verbosity1, String s2)
    {
        dateTime = s;
        message = s1;
        verbosity = verbosity1;
        tag = s2;
    }

    public String getDateTime()
    {
        return dateTime;
    }

    public String getMessage()
    {
        return message;
    }

    public String getTag()
    {
        return tag;
    }

    public Logger.Verbosity getVerbosity()
    {
        return verbosity;
    }
}
