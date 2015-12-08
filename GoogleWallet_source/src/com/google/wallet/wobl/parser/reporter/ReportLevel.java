// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser.reporter;

import java.util.logging.Level;

public final class ReportLevel extends Enum
{

    private static final ReportLevel $VALUES[];
    public static final ReportLevel ERROR;
    public static final ReportLevel INFO;
    public static final ReportLevel WARN;
    private Level level;

    private ReportLevel(String s, int i, Level level1)
    {
        super(s, i);
        level = level1;
    }

    public static ReportLevel valueOf(String s)
    {
        return (ReportLevel)Enum.valueOf(com/google/wallet/wobl/parser/reporter/ReportLevel, s);
    }

    public static ReportLevel[] values()
    {
        return (ReportLevel[])$VALUES.clone();
    }

    public final Level getLoggerLevel()
    {
        return level;
    }

    static 
    {
        INFO = new ReportLevel("INFO", 0, Level.INFO);
        WARN = new ReportLevel("WARN", 1, Level.WARNING);
        ERROR = new ReportLevel("ERROR", 2, Level.SEVERE);
        $VALUES = (new ReportLevel[] {
            INFO, WARN, ERROR
        });
    }
}
