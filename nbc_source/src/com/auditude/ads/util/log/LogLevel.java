// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.log;


public final class LogLevel
{

    public static final LogLevel ALL = new LogLevel(0, "ALL");
    public static final LogLevel DEBUG = new LogLevel(2, "DEBUG");
    public static final LogLevel ERROR = new LogLevel(8, "ERROR");
    public static final LogLevel FATAL = new LogLevel(1000, "FATAL");
    public static final LogLevel INFO = new LogLevel(4, "INFO");
    public static final LogLevel WARN = new LogLevel(6, "WARN");
    private String name;
    private int verbosity;

    public LogLevel(int i, String s)
    {
        verbosity = i;
        name = s;
    }

    public String getName()
    {
        return name;
    }

    public int getVerbosity()
    {
        return verbosity;
    }

    public Boolean isAtLeast(LogLevel loglevel)
    {
        if (verbosity >= loglevel.verbosity)
        {
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

}
