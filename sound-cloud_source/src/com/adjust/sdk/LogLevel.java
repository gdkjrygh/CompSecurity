// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;


public final class LogLevel extends Enum
{

    private static final LogLevel $VALUES[];
    public static final LogLevel ASSERT;
    public static final LogLevel DEBUG;
    public static final LogLevel ERROR;
    public static final LogLevel INFO;
    public static final LogLevel VERBOSE;
    public static final LogLevel WARN;
    final int androidLogLevel;

    private LogLevel(String s, int i, int j)
    {
        super(s, i);
        androidLogLevel = j;
    }

    public static LogLevel valueOf(String s)
    {
        return (LogLevel)Enum.valueOf(com/adjust/sdk/LogLevel, s);
    }

    public static LogLevel[] values()
    {
        return (LogLevel[])$VALUES.clone();
    }

    public final int getAndroidLogLevel()
    {
        return androidLogLevel;
    }

    static 
    {
        VERBOSE = new LogLevel("VERBOSE", 0, 2);
        DEBUG = new LogLevel("DEBUG", 1, 3);
        INFO = new LogLevel("INFO", 2, 4);
        WARN = new LogLevel("WARN", 3, 5);
        ERROR = new LogLevel("ERROR", 4, 6);
        ASSERT = new LogLevel("ASSERT", 5, 7);
        $VALUES = (new LogLevel[] {
            VERBOSE, DEBUG, INFO, WARN, ERROR, ASSERT
        });
    }
}
