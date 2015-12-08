// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class Logger
{

    public Logger()
    {
    }

    public static void d(Object obj)
    {
        d(obj.getClass().getSimpleName(), getMethodName(4));
    }

    public static void d(Object obj, String s)
    {
        d(obj.getClass().getSimpleName(), s);
    }

    public static transient void d(Object obj, String s, Object aobj[])
    {
        d(obj.getClass().getSimpleName(), String.format(s, aobj));
    }

    public static void d(String s, String s1)
    {
        if (isDebugEnabled())
        {
            Log.d(s, s1);
        }
    }

    public static transient void d(String s, String s1, Object aobj[])
    {
        d(s, String.format(s1, aobj));
    }

    public static void e(Object obj)
    {
        e(obj.getClass().getSimpleName(), getMethodName(4));
    }

    public static void e(Object obj, String s)
    {
        e(obj.getClass().getSimpleName(), s);
    }

    public static transient void e(Object obj, String s, Object aobj[])
    {
        e(obj.getClass().getSimpleName(), String.format(s, aobj));
    }

    public static void e(String s, String s1)
    {
        if (isDebugEnabled())
        {
            Log.e(s, s1);
        }
    }

    public static void e(String s, String s1, Throwable throwable)
    {
        if (isDebugEnabled())
        {
            Log.e(s, s1, throwable);
        }
    }

    public static transient void e(String s, String s1, Object aobj[])
    {
        e(s, String.format(s1, aobj));
    }

    public static String getMethodName(int j)
    {
        return Thread.currentThread().getStackTrace()[j].getMethodName();
    }

    public static void i(Object obj)
    {
        i(obj.getClass().getSimpleName(), getMethodName(4));
    }

    public static void i(Object obj, String s)
    {
        i(obj.getClass().getSimpleName(), s);
    }

    public static transient void i(Object obj, String s, Object aobj[])
    {
        i(obj.getClass().getSimpleName(), String.format(s, aobj));
    }

    public static void i(String s, String s1)
    {
    }

    public static transient void i(String s, String s1, Object aobj[])
    {
        i(s, String.format(s1, aobj));
    }

    public static boolean isDebugEnabled()
    {
        return false;
    }

    public static void printMethodTrace(Object obj)
    {
        if (isDebugEnabled())
        {
            String s = getMethodName(4);
            StringBuilder stringbuilder = new StringBuilder();
            int k = Thread.currentThread().getStackTrace().length;
            for (int j = 5; j < k - 4; j++)
            {
                stringbuilder.append(s).append(" - ").append(getMethodName(j)).append("\n");
            }

            d(obj.getClass().getSimpleName(), stringbuilder.toString());
        }
    }

    public static void writeToFile(String s, String s1, boolean flag)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        PrintStream printstream = new PrintStream(new FileOutputStream(new File(Environment.getExternalStorageDirectory(), "acculog.txt"), true));
        if (flag)
        {
            obj = "Error!!!!! ";
        } else
        {
            obj = "";
        }
        printstream.println((new StringBuilder()).append(new Date()).append(" - ").append(s).append(": ").append(((String) (obj))).append(s1).toString());
        printstream.flush();
        if (printstream == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        printstream.close();
_L2:
        return;
        s1;
        s = obj1;
_L5:
        obj = s;
        s1.printStackTrace();
        if (s == null) goto _L2; else goto _L1
_L1:
        s.close();
        return;
        s;
_L4:
        if (obj != null)
        {
            ((PrintStream) (obj)).close();
        }
        throw s;
        s;
        obj = printstream;
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        s = printstream;
          goto _L5
    }
}
