// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.f;

import android.util.Log;

public final class a
{

    public static int a = 2;

    public static int a(String s, String s1)
    {
        if (a <= 3)
        {
            return Log.d(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int a(String s, String s1, Throwable throwable)
    {
        if (a <= 4)
        {
            return Log.i(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int b(String s, String s1)
    {
        if (a <= 4)
        {
            return Log.i(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int b(String s, String s1, Throwable throwable)
    {
        if (a <= 5)
        {
            return Log.w(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int c(String s, String s1)
    {
        if (a <= 5)
        {
            return Log.w(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int c(String s, String s1, Throwable throwable)
    {
        if (a <= 6)
        {
            return Log.e(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int d(String s, String s1)
    {
        if (a <= 6)
        {
            return Log.e(s, s1);
        } else
        {
            return 0;
        }
    }

}
