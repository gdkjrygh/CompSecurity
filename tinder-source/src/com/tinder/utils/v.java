// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.crashlytics.android.Crashlytics;
import com.tinder.managers.ManagerApp;

public final class v
{

    public static String a()
    {
        return (new StringBuilder("[TID:")).append(Thread.currentThread().getId()).append('-').append(c()).append('.').append(Thread.currentThread().getStackTrace()[5].getMethodName()).append("()-").append(Thread.currentThread().getStackTrace()[5].getLineNumber()).append("]: ").toString();
    }

    public static String a(VolleyError volleyerror)
    {
        if (volleyerror != null)
        {
            try
            {
                volleyerror = new String(volleyerror.a.b, "utf-8");
            }
            // Misplaced declaration of an exception variable
            catch (VolleyError volleyerror)
            {
                return "";
            }
            return volleyerror;
        } else
        {
            return "";
        }
    }

    public static String a(String s, String s1)
    {
        if (!s1.contains("\n"))
        {
            return (new StringBuilder()).append(s).append(s1).toString();
        }
        String as[] = s1.split("\n");
        s1 = new StringBuilder(s1.length() + s.length() * as.length);
        for (int i = 0; i < as.length - 1; i++)
        {
            s1.append(s);
            s1.append(as[i]);
            if (i != as.length - 1)
            {
                s1.append('\n');
            }
        }

        return s1.toString();
    }

    public static void a(String s)
    {
        Crashlytics.a(s);
        if (ManagerApp.a)
        {
            Log.w("Tinder", a(a(), s));
        }
    }

    public static void a(String s, Throwable throwable)
    {
        Crashlytics.a(s);
        if (throwable != null)
        {
            Crashlytics.a(throwable);
        }
        if (ManagerApp.a)
        {
            Log.e("Tinder", (new StringBuilder()).append(a()).append(s).toString(), throwable);
        }
    }

    public static void b()
    {
        if (ManagerApp.a)
        {
            try
            {
                throw new ArithmeticException();
            }
            catch (ArithmeticException arithmeticexception)
            {
                arithmeticexception.printStackTrace();
            }
        }
    }

    public static void b(String s)
    {
        Crashlytics.a(s);
        if (ManagerApp.a)
        {
            Log.e("Tinder", a(a(), s));
        }
    }

    public static void b(String s, String s1)
    {
        Crashlytics.a((new StringBuilder()).append(s).append(": ").append(s1).toString());
        if (ManagerApp.a)
        {
            Log.e(s, a(a(), s1));
        }
    }

    private static String c()
    {
        String s;
        try
        {
            s = Thread.currentThread().getStackTrace()[5].getFileName();
            s = s.substring(0, s.length() - 5);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            b(outofmemoryerror.getMessage());
            return "";
        }
        return s;
    }
}
