// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.log;

import android.util.Log;
import com.facebook.base.b;

// Referenced classes of package com.facebook.debug.log:
//            g

public class f
{

    private static final int a = "com.facebook.".length();
    private static final String b = com/facebook/debug/log/f.getName();

    public f()
    {
    }

    private static String a()
    {
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        int i;
        for (i = 0; i < astacktraceelement.length && !b.equals(astacktraceelement[i].getClassName()); i++) { }
        for (i++; i < astacktraceelement.length && b.equals(astacktraceelement[i].getClassName()); i++) { }
        if (i >= astacktraceelement.length)
        {
            return "unknown";
        }
        StackTraceElement stacktraceelement = Thread.currentThread().getStackTrace()[i];
        String s1 = stacktraceelement.getClassName();
        i = s1.indexOf('.', a);
        String s = s1;
        if (i != -1)
        {
            s = s1.substring(i + 1);
        }
        return (new StringBuilder()).append(s).append(".").append(stacktraceelement.getMethodName()).append(":").append(stacktraceelement.getLineNumber()).toString();
    }

    public static void a(Class class1, String s)
    {
        if (com.facebook.base.b.a())
        {
            Log.e(g.a(class1), s);
        }
    }

    public static void a(Class class1, String s, Throwable throwable)
    {
        if (com.facebook.base.b.a())
        {
            Log.e(g.a(class1), s, throwable);
        }
    }

    public static void a(String s)
    {
        if (com.facebook.base.b.a())
        {
            a(a(), s);
        }
    }

    public static void a(String s, String s1)
    {
        if (com.facebook.base.b.a())
        {
            Log.e(s, s1);
        }
    }

    public static void b(Class class1, String s)
    {
        if (com.facebook.base.b.a())
        {
            Log.v(g.a(class1), s);
        }
    }

    public static void b(String s)
    {
        if (com.facebook.base.b.a())
        {
            b(a(), s);
        }
    }

    public static void b(String s, String s1)
    {
        if (com.facebook.base.b.a())
        {
            Log.w(s, s1);
        }
    }

    public static void c(String s)
    {
        if (com.facebook.base.b.a())
        {
            c(a(), s);
        }
    }

    public static void c(String s, String s1)
    {
        if (com.facebook.base.b.a())
        {
            Log.v(s, s1);
        }
    }

    public static void d(String s, String s1)
    {
        if (com.facebook.base.b.a())
        {
            Log.d(s, s1);
        }
    }

}
