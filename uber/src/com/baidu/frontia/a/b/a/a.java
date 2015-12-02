// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.frontia.a.b.a;

import android.text.TextUtils;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class a
{

    private static boolean a = true;
    private static boolean b = false;
    private static Logger c;

    public static String a(Throwable throwable)
    {
        if (throwable == null)
        {
            return "";
        } else
        {
            StringWriter stringwriter = new StringWriter();
            throwable.printStackTrace(new PrintWriter(stringwriter));
            return stringwriter.toString();
        }
    }

    public static void a(String s, String s1)
    {
label0:
        {
            if (a)
            {
                if (!b || c == null)
                {
                    break label0;
                }
                c.log(Level.INFO, (new StringBuilder()).append(s).append(": ").append(s1).toString());
            }
            return;
        }
        Log.i(s, s1);
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        d(s, (new StringBuilder()).append(s1).append('\n').append(a(throwable)).toString());
    }

    public static void a(String s, Throwable throwable)
    {
        d(s, a(throwable));
    }

    public static void b(String s, String s1)
    {
label0:
        {
            if (a)
            {
                if (!b || c == null)
                {
                    break label0;
                }
                c.log(Level.INFO, (new StringBuilder()).append(s).append(": ").append(s1).toString());
            }
            return;
        }
        Log.d(s, s1);
    }

    public static void c(String s, String s1)
    {
label0:
        {
            if (a)
            {
                if (!b || c == null)
                {
                    break label0;
                }
                c.log(Level.WARNING, (new StringBuilder()).append(s).append(": ").append(s1).toString());
            }
            return;
        }
        Log.w(s, s1);
    }

    public static void d(String s, String s1)
    {
        if (a)
        {
            if (b && c != null)
            {
                c.log(Level.SEVERE, (new StringBuilder()).append(s).append(": ").append(s1).toString());
            } else
            if (!TextUtils.isEmpty(s1))
            {
                Log.e(s, s1);
                return;
            }
        }
    }

}
