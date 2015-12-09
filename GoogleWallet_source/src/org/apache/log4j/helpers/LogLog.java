// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j.helpers;

import java.io.PrintStream;

// Referenced classes of package org.apache.log4j.helpers:
//            OptionConverter

public final class LogLog
{

    protected static boolean debugEnabled = false;
    private static boolean quietMode = false;

    public static void debug(String s)
    {
        if (debugEnabled && !quietMode)
        {
            System.out.println("log4j: " + s);
        }
    }

    public static void error(String s)
    {
        if (quietMode)
        {
            return;
        } else
        {
            System.err.println("log4j:ERROR " + s);
            return;
        }
    }

    public static void error(String s, Throwable throwable)
    {
        if (!quietMode)
        {
            System.err.println("log4j:ERROR " + s);
            if (throwable != null)
            {
                throwable.printStackTrace();
                return;
            }
        }
    }

    public static void setInternalDebugging(boolean flag)
    {
        debugEnabled = flag;
    }

    public static void warn(String s)
    {
        if (quietMode)
        {
            return;
        } else
        {
            System.err.println("log4j:WARN " + s);
            return;
        }
    }

    public static void warn(String s, Throwable throwable)
    {
        if (!quietMode)
        {
            System.err.println("log4j:WARN " + s);
            if (throwable != null)
            {
                throwable.printStackTrace();
                return;
            }
        }
    }

    static 
    {
        String s1 = OptionConverter.getSystemProperty("log4j.debug", null);
        String s = s1;
        if (s1 == null)
        {
            s = OptionConverter.getSystemProperty("log4j.configDebug", null);
        }
        if (s != null)
        {
            debugEnabled = OptionConverter.toBoolean(s, true);
        }
    }
}
