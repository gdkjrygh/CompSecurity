// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util.logging;


public final class LogLevel extends Enum
{

    public static final LogLevel a;
    public static final LogLevel b;
    public static final LogLevel c;
    public static final LogLevel d;
    public static final LogLevel e;
    public static final LogLevel f;
    private static final LogLevel g[];

    private LogLevel(String s, int i)
    {
        super(s, i);
    }

    public static LogLevel valueOf(String s)
    {
        return (LogLevel)Enum.valueOf(com/spotify/mobile/android/util/logging/LogLevel, s);
    }

    public static LogLevel[] values()
    {
        return (LogLevel[])g.clone();
    }

    static 
    {
        a = new LogLevel("VERBOSE", 0);
        b = new LogLevel("DEBUG", 1);
        c = new LogLevel("INFO", 2);
        d = new LogLevel("WARNING", 3);
        e = new LogLevel("ERROR", 4);
        f = new LogLevel("YELL", 5);
        g = (new LogLevel[] {
            a, b, c, d, e, f
        });
    }
}
