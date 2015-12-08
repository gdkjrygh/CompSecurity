// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.lwperf.perfstats;

import android.os.Process;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ProcReader
{

    private static final String a = com/facebook/base/lwperf/perfstats/ProcReader.getSimpleName();
    private static final int b[] = {
        4096
    };
    private static volatile Method c = null;
    private static volatile boolean d = false;

    private ProcReader()
    {
    }

    public static String a(String s)
    {
        String as[] = new String[1];
        as[0] = null;
        a(s, b, as, null);
        return as[0];
    }

    private static Method a()
    {
        if (!d)
        {
            c = b();
            d = true;
        }
        return c;
    }

    public static boolean a(String s, int ai[], long al[])
    {
        return a(s, ai, null, al);
    }

    private static boolean a(String s, int ai[], String as[], long al[])
    {
        Method method;
        method = a();
        if (method == null)
        {
            return false;
        }
        ai = ((int []) (method.invoke(null, new Object[] {
            s, ai, as, al, null
        })));
        if (ai == null)
        {
            return false;
        }
        boolean flag = ((Boolean)ai).booleanValue();
        return flag;
        ai;
        if (Log.isLoggable(a, 6))
        {
            s = (new StringBuilder("Error (IllegalAccessException - ")).append(ai.getLocalizedMessage()).append(") while accessing proc file - ").append(s);
            Log.e(a, s.toString(), ai);
        }
_L2:
        return false;
        ai;
        if (Log.isLoggable(a, 6))
        {
            s = (new StringBuilder("Error (InvocationTargetException - ")).append(ai.getLocalizedMessage()).append(") while accessing proc file - ").append(s);
            Log.e(a, s.toString(), ai);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static Method b()
    {
        Method method;
        try
        {
            method = android/os/Process.getMethod("readProcFile", new Class[] {
                java/lang/String, [I, [Ljava/lang/String;, [J, [F
            });
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            Log.isLoggable(a, 5);
            return null;
        }
        return method;
    }

}
