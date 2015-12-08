// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.e;

import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.fitbit.e:
//            a

public class b
{

    private static final String a = "LogUtils";
    private static final int b = 7;
    private static final int c = 1024;

    public b()
    {
    }

    public static transient void a(int i, String s, String s1, Object aobj[])
    {
        Thread thread = Thread.currentThread();
        StackTraceElement astacktraceelement[] = thread.getStackTrace();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[");
        stringbuilder.append(thread.getId());
        stringbuilder.append("] ");
        stringbuilder.append(String.format(s1, aobj));
        stringbuilder.append(" <- ");
        int j;
        if (astacktraceelement.length <= i)
        {
            i = astacktraceelement.length;
        }
        for (j = 3; j < i; j++)
        {
            stringbuilder.append(astacktraceelement[j].getMethodName());
            stringbuilder.append("[");
            stringbuilder.append(astacktraceelement[j].getLineNumber());
            stringbuilder.append("]");
            if (j + 1 != i)
            {
                stringbuilder.append(" <- ");
            }
        }

        com.fitbit.e.a.a(s, stringbuilder.toString(), new Object[0]);
    }

    public static transient void a(int i, String s, Object aobj[])
    {
        a(i, "LogUtils", s, aobj);
    }

    public static void a(String s, Level level, String s1)
    {
        if (s1.length() > 2048)
        {
            s = s1.substring(0, 1024);
            level = s1.substring(s1.length() - 1024);
            com.fitbit.e.a.a("LogUtils", s, new Object[0]);
            com.fitbit.e.a.a("LogUtils", level, new Object[0]);
            return;
        } else
        {
            com.fitbit.e.a.a("LogUtils", s1, new Object[0]);
            return;
        }
    }

    public static transient void a(String s, Object aobj[])
    {
        a(7, "LogUtils", s, aobj);
    }

    public static void a(Logger logger, String s)
    {
        a(logger, Level.FINE, s);
    }

    public static void a(Logger logger, Level level, String s)
    {
        int i;
        for (i = 0; i + 1024 < s.length(); i += 1024)
        {
            logger.log(level, s.substring(i, i + 1024));
        }

        if (i < s.length())
        {
            logger.log(level, s.substring(i));
        }
    }
}
