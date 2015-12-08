// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.utils;

import com.microsoft.dl.BuildInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public final class Log
{

    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static final StackTraceElement a = new StackTraceElement("<unknown>", "<unknown>", "<unknown>", 0);
    private static final StackTraceElement b = new StackTraceElement("", "", "", 0);
    private static final int c = getMinLoggingLevel();
    private static final boolean d;

    private Log()
    {
    }

    private static StackTraceElement a()
    {
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        if (astacktraceelement != null && astacktraceelement.length > 4)
        {
            return astacktraceelement[4];
        } else
        {
            return a;
        }
    }

    private static String a(Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        try
        {
            stringwriter.append(throwable.toString());
            stringwriter.append("\n");
        }
        catch (IOException ioexception) { }
        throwable.printStackTrace(new PrintWriter(stringwriter));
        return stringwriter.toString();
    }

    private static String b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        int j = 4;
        while (j < astacktraceelement.length) 
        {
            StackTraceElement stacktraceelement = astacktraceelement[j];
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append('\n');
            }
            stringbuilder.append("\t");
            stringbuilder.append(stacktraceelement.getClassName());
            stringbuilder.append('.');
            stringbuilder.append(stacktraceelement.getMethodName());
            stringbuilder.append('(');
            if (stacktraceelement.isNativeMethod())
            {
                stringbuilder.append("Native method");
            } else
            {
                stringbuilder.append(stacktraceelement.getFileName());
                stringbuilder.append(':');
                if (stacktraceelement.getLineNumber() > 0)
                {
                    stringbuilder.append(stacktraceelement.getLineNumber());
                } else
                {
                    stringbuilder.append("?");
                }
            }
            stringbuilder.append(')');
            j++;
        }
        return stringbuilder.toString();
    }

    public static int d(String s, String s1)
    {
        StackTraceElement stacktraceelement;
        if (d)
        {
            stacktraceelement = a();
        } else
        {
            stacktraceelement = b;
        }
        log(s, 3, stacktraceelement.getFileName(), stacktraceelement.getClassName(), stacktraceelement.getMethodName(), stacktraceelement.getLineNumber(), s1, null, null);
        return 0;
    }

    public static int d(String s, String s1, Throwable throwable)
    {
        StackTraceElement stacktraceelement;
        if (d)
        {
            stacktraceelement = a();
        } else
        {
            stacktraceelement = b;
        }
        log(s, 3, stacktraceelement.getFileName(), stacktraceelement.getClassName(), stacktraceelement.getMethodName(), stacktraceelement.getLineNumber(), s1, a(throwable), null);
        return 0;
    }

    public static int e(String s, String s1)
    {
        StackTraceElement stacktraceelement = a();
        log(s, 6, stacktraceelement.getFileName(), stacktraceelement.getClassName(), stacktraceelement.getMethodName(), stacktraceelement.getLineNumber(), s1, null, null);
        return 0;
    }

    public static int e(String s, String s1, Throwable throwable)
    {
        StackTraceElement stacktraceelement = a();
        log(s, 6, stacktraceelement.getFileName(), stacktraceelement.getClassName(), stacktraceelement.getMethodName(), stacktraceelement.getLineNumber(), s1, a(throwable), null);
        return 0;
    }

    private static native int getMinLoggingLevel();

    public static int i(String s, String s1)
    {
        StackTraceElement stacktraceelement;
        if (d)
        {
            stacktraceelement = a();
        } else
        {
            stacktraceelement = b;
        }
        log(s, 4, stacktraceelement.getFileName(), stacktraceelement.getClassName(), stacktraceelement.getMethodName(), stacktraceelement.getLineNumber(), s1, null, null);
        return 0;
    }

    public static int i(String s, String s1, Throwable throwable)
    {
        StackTraceElement stacktraceelement;
        if (d)
        {
            stacktraceelement = a();
        } else
        {
            stacktraceelement = b;
        }
        log(s, 4, stacktraceelement.getFileName(), stacktraceelement.getClassName(), stacktraceelement.getMethodName(), stacktraceelement.getLineNumber(), s1, a(throwable), null);
        return 0;
    }

    public static boolean isLoggable(String s, int j)
    {
        return c >= 0 && j >= c;
    }

    private static native void log(String s, int j, String s1, String s2, String s3, int k, String s4, String s5, 
            String s6);

    public static int println(int j, String s, String s1)
    {
        return android.util.Log.println(j, s, s1);
    }

    public static int v(String s, String s1)
    {
        StackTraceElement stacktraceelement;
        if (d)
        {
            stacktraceelement = a();
        } else
        {
            stacktraceelement = b;
        }
        log(s, 2, stacktraceelement.getFileName(), stacktraceelement.getClassName(), stacktraceelement.getMethodName(), stacktraceelement.getLineNumber(), s1, null, null);
        return 0;
    }

    public static int v(String s, String s1, Throwable throwable)
    {
        StackTraceElement stacktraceelement;
        if (d)
        {
            stacktraceelement = a();
        } else
        {
            stacktraceelement = b;
        }
        log(s, 2, stacktraceelement.getFileName(), stacktraceelement.getClassName(), stacktraceelement.getMethodName(), stacktraceelement.getLineNumber(), s1, a(throwable), null);
        return 0;
    }

    public static int w(String s, String s1)
    {
        StackTraceElement stacktraceelement = a();
        log(s, 5, stacktraceelement.getFileName(), stacktraceelement.getClassName(), stacktraceelement.getMethodName(), stacktraceelement.getLineNumber(), s1, null, null);
        return 0;
    }

    public static int w(String s, String s1, Throwable throwable)
    {
        StackTraceElement stacktraceelement = a();
        log(s, 5, stacktraceelement.getFileName(), stacktraceelement.getClassName(), stacktraceelement.getMethodName(), stacktraceelement.getLineNumber(), s1, a(throwable), null);
        return 0;
    }

    public static int w(String s, Throwable throwable)
    {
        StackTraceElement stacktraceelement = a();
        log(s, 5, stacktraceelement.getFileName(), stacktraceelement.getClassName(), stacktraceelement.getMethodName(), stacktraceelement.getLineNumber(), null, a(throwable), null);
        return 0;
    }

    public static int wtf(String s, String s1)
    {
        StackTraceElement stacktraceelement = a();
        log(s, 7, stacktraceelement.getFileName(), stacktraceelement.getClassName(), stacktraceelement.getMethodName(), stacktraceelement.getLineNumber(), s1, null, b());
        return 0;
    }

    public static int wtf(String s, String s1, Throwable throwable)
    {
        StackTraceElement stacktraceelement = a();
        log(s, 7, stacktraceelement.getFileName(), stacktraceelement.getClassName(), stacktraceelement.getMethodName(), stacktraceelement.getLineNumber(), s1, a(throwable), b());
        return 0;
    }

    public static int wtf(String s, Throwable throwable)
    {
        StackTraceElement stacktraceelement = a();
        log(s, 7, stacktraceelement.getFileName(), stacktraceelement.getClassName(), stacktraceelement.getMethodName(), stacktraceelement.getLineNumber(), null, a(throwable), b());
        return 0;
    }

    static 
    {
        boolean flag = false;
        if (BuildInfo.FLAVOUR == com.microsoft.dl.BuildInfo.Flavour.DEBUG)
        {
            flag = true;
        }
        d = flag;
    }
}
