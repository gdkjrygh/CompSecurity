// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import android.util.Log;

// Referenced classes of package com.comscore.utils:
//            Constants

public class CSLog
{

    public CSLog()
    {
    }

    public static void d(Class class1, String s)
    {
        if (Constants.DEBUG)
        {
            Log.d(class1.getSimpleName(), s);
        }
    }

    public static void d(Object obj, String s)
    {
        if (Constants.DEBUG)
        {
            d(obj.getClass(), s);
        }
    }

    public static void e(Class class1, String s)
    {
        if (Constants.DEBUG)
        {
            Log.e(class1.getSimpleName(), s);
        }
    }

    public static void e(Object obj, String s)
    {
        if (Constants.DEBUG)
        {
            e(obj.getClass(), s);
        }
    }

    public static void printStackTrace(Exception exception)
    {
        if (Constants.DEBUG)
        {
            exception.printStackTrace();
        }
    }

    public static void v(Class class1, String s)
    {
        if (Constants.DEBUG)
        {
            Log.v(class1.getSimpleName(), s);
        }
    }

    public static void v(Object obj, String s)
    {
        if (Constants.DEBUG)
        {
            v(obj.getClass(), s);
        }
    }
}
