// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j;


// Referenced classes of package org.apache.log4j:
//            Level

public class Priority
{

    public static final Priority DEBUG = new Level(10000, "DEBUG", 7);
    public static final Priority ERROR = new Level(40000, "ERROR", 3);
    public static final Priority FATAL = new Level(50000, "FATAL", 0);
    public static final Priority INFO = new Level(20000, "INFO", 6);
    public static final Priority WARN = new Level(30000, "WARN", 4);
    transient int level;
    transient String levelStr;
    transient int syslogEquivalent;

    protected Priority()
    {
        level = 10000;
        levelStr = "DEBUG";
        syslogEquivalent = 7;
    }

    protected Priority(int i, String s, int j)
    {
        level = i;
        levelStr = s;
        syslogEquivalent = j;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Priority)
        {
            obj = (Priority)obj;
            flag = flag1;
            if (level == ((Priority) (obj)).level)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final boolean isGreaterOrEqual(Priority priority)
    {
        return level >= priority.level;
    }

    public final String toString()
    {
        return levelStr;
    }

}
