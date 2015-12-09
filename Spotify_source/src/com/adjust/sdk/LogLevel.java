// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;


public final class LogLevel extends Enum
{

    public static final LogLevel a;
    public static final LogLevel b;
    private static LogLevel c;
    private static LogLevel d;
    private static LogLevel e;
    private static LogLevel f;
    private static final LogLevel g[];
    public final int androidLogLevel;

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
        return (LogLevel[])g.clone();
    }

    static 
    {
        c = new LogLevel("VERBOSE", 0, 2);
        d = new LogLevel("DEBUG", 1, 3);
        a = new LogLevel("INFO", 2, 4);
        e = new LogLevel("WARN", 3, 5);
        f = new LogLevel("ERROR", 4, 6);
        b = new LogLevel("ASSERT", 5, 7);
        g = (new LogLevel[] {
            c, d, a, e, f, b
        });
    }
}
