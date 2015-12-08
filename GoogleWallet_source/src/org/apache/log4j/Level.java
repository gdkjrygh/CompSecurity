// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j;

import java.io.Serializable;

// Referenced classes of package org.apache.log4j:
//            Priority

public class Level extends Priority
    implements Serializable
{

    public static final Level ALL = new Level(0x80000000, "ALL", 7);
    public static final Level DEBUG = new Level(10000, "DEBUG", 7);
    public static final Level ERROR = new Level(40000, "ERROR", 3);
    public static final Level FATAL = new Level(50000, "FATAL", 0);
    public static final Level INFO = new Level(20000, "INFO", 6);
    public static final Level OFF = new Level(0x7fffffff, "OFF", 0);
    public static final Level TRACE = new Level(5000, "TRACE", 7);
    public static final Level WARN = new Level(30000, "WARN", 4);

    protected Level(int i, String s, int j)
    {
        super(i, s, j);
    }

    public static Level toLevel(String s, Level level)
    {
        if (s != null)
        {
            s = s.toUpperCase();
            if (s.equals("ALL"))
            {
                return ALL;
            }
            if (s.equals("DEBUG"))
            {
                return DEBUG;
            }
            if (s.equals("INFO"))
            {
                return INFO;
            }
            if (s.equals("WARN"))
            {
                return WARN;
            }
            if (s.equals("ERROR"))
            {
                return ERROR;
            }
            if (s.equals("FATAL"))
            {
                return FATAL;
            }
            if (s.equals("OFF"))
            {
                return OFF;
            }
            if (s.equals("TRACE"))
            {
                return TRACE;
            }
            if (s.equals("\u0130NFO"))
            {
                return INFO;
            }
        }
        return level;
    }

}
