// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic;

import java.io.Serializable;

public final class Level
    implements Serializable
{

    public static final Level ALL = new Level(0x80000000, "ALL");
    public static final Integer ALL_INTEGER = Integer.valueOf(0x80000000);
    public static final Level DEBUG = new Level(10000, "DEBUG");
    public static final Integer DEBUG_INTEGER = Integer.valueOf(10000);
    public static final Level ERROR = new Level(40000, "ERROR");
    public static final Integer ERROR_INTEGER = Integer.valueOf(40000);
    public static final Level INFO = new Level(20000, "INFO");
    public static final Integer INFO_INTEGER = Integer.valueOf(20000);
    public static final Level OFF = new Level(0x7fffffff, "OFF");
    public static final Integer OFF_INTEGER = Integer.valueOf(0x7fffffff);
    public static final Level TRACE = new Level(5000, "TRACE");
    public static final Integer TRACE_INTEGER = Integer.valueOf(5000);
    public static final Level WARN = new Level(30000, "WARN");
    public static final Integer WARN_INTEGER = Integer.valueOf(30000);
    public final int levelInt;
    public final String levelStr;

    private Level(int i, String s)
    {
        levelInt = i;
        levelStr = s;
    }

    public static Level toLevel(String s)
    {
        return toLevel(s, DEBUG);
    }

    public static Level toLevel(String s, Level level)
    {
        if (s != null)
        {
            if (s.equalsIgnoreCase("ALL"))
            {
                return ALL;
            }
            if (s.equalsIgnoreCase("TRACE"))
            {
                return TRACE;
            }
            if (s.equalsIgnoreCase("DEBUG"))
            {
                return DEBUG;
            }
            if (s.equalsIgnoreCase("INFO"))
            {
                return INFO;
            }
            if (s.equalsIgnoreCase("WARN"))
            {
                return WARN;
            }
            if (s.equalsIgnoreCase("ERROR"))
            {
                return ERROR;
            }
            if (s.equalsIgnoreCase("OFF"))
            {
                return OFF;
            }
        }
        return level;
    }

    public boolean isGreaterOrEqual(Level level)
    {
        return levelInt >= level.levelInt;
    }

    public int toInt()
    {
        return levelInt;
    }

    public String toString()
    {
        return levelStr;
    }

}
