// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.e;

import android.text.TextUtils;
import android.util.Log;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import java.util.Arrays;

public class a
{

    public static final int a = 2;
    public static final int b = 7;
    public static final int c = 3;
    public static final int d = 6;
    public static final int e = 4;
    public static final int f = 5;
    private static final String g = "%s(%d)";

    public a()
    {
    }

    private static String a(String s)
    {
        return String.format("%s(%d)", new Object[] {
            s, Long.valueOf(Thread.currentThread().getId() % 1000L)
        });
    }

    public static String a(Throwable throwable)
    {
        return Log.getStackTraceString(throwable);
    }

    public static String a(StackTraceElement astacktraceelement[])
    {
        return TextUtils.join("\n", astacktraceelement);
    }

    private static transient void a(String s, int i, String s1, Throwable throwable, Object aobj[])
    {
        if (!a(b(s, 23), i))
        {
            return;
        }
        String s2 = a(s);
        if (aobj != null && aobj.length > 0)
        {
            try
            {
                s = String.format(s1, aobj);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = (new StringBuilder()).append("errLog").append(s1).append(" params=").append(Arrays.toString(aobj)).toString();
            }
        } else
        {
            s = s1;
        }
        s1 = s;
        if (throwable != null)
        {
            s1 = (new StringBuilder()).append(s).append(" ").append(Log.getStackTraceString(throwable)).toString();
        }
        Log.println(i, s2, s1);
    }

    public static transient void a(String s, String s1, Throwable throwable, Object aobj[])
    {
        a(s, 3, s1, throwable, aobj);
    }

    public static transient void a(String s, String s1, Object aobj[])
    {
        a(s, 3, s1, null, aobj);
    }

    public static void a(String s, Throwable throwable)
    {
        a(s, 3, "", throwable, (Object[])null);
    }

    public static boolean a(String s, int i)
    {
        if (!b.a.a());
        return true;
    }

    private static String b(String s, int i)
    {
        int j;
        int k;
label0:
        {
            j = s.length();
            String s1 = s;
            if (j > i)
            {
                k = s.lastIndexOf(".");
                if (j - k - 1 > i)
                {
                    break label0;
                }
                s1 = s.substring(k + 1);
            }
            return s1;
        }
        if (k != -1)
        {
            return s.substring(k + 1, k + 1 + i);
        } else
        {
            return s.substring(j - i);
        }
    }

    public static transient void b(String s, String s1, Throwable throwable, Object aobj[])
    {
        a(s, 2, s1, throwable, aobj);
    }

    public static transient void b(String s, String s1, Object aobj[])
    {
        a(s, 2, s1, null, aobj);
    }

    public static void b(String s, Throwable throwable)
    {
        a(s, 2, "", throwable, (Object[])null);
    }

    public static transient void c(String s, String s1, Throwable throwable, Object aobj[])
    {
        a(s, 7, s1, throwable, aobj);
    }

    public static transient void c(String s, String s1, Object aobj[])
    {
        a(s, 7, s1, null, aobj);
    }

    public static void c(String s, Throwable throwable)
    {
        a(s, 7, "", throwable, (Object[])null);
    }

    public static transient void d(String s, String s1, Throwable throwable, Object aobj[])
    {
        a(s, 4, s1, throwable, aobj);
    }

    public static transient void d(String s, String s1, Object aobj[])
    {
        a(s, 4, s1, null, aobj);
    }

    public static void d(String s, Throwable throwable)
    {
        a(s, 4, "", throwable, (Object[])null);
    }

    public static transient void e(String s, String s1, Throwable throwable, Object aobj[])
    {
        a(s, 5, s1, throwable, aobj);
    }

    public static transient void e(String s, String s1, Object aobj[])
    {
        a(s, 5, s1, null, aobj);
    }

    public static void e(String s, Throwable throwable)
    {
        a(s, 5, "", throwable, (Object[])null);
    }

    public static transient void f(String s, String s1, Throwable throwable, Object aobj[])
    {
        a(s, 6, s1, throwable, aobj);
    }

    public static transient void f(String s, String s1, Object aobj[])
    {
        a(s, 6, s1, null, aobj);
    }

    public static void f(String s, Throwable throwable)
    {
        a(s, 6, "", throwable, (Object[])null);
    }
}
