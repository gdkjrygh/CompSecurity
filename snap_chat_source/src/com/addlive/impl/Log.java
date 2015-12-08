// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;


public class Log
{

    private static boolean enabled = true;

    public Log()
    {
    }

    public static int d(String s, String s1)
    {
        if (!enabled)
        {
            return 0;
        } else
        {
            return android.util.Log.d(s, s1);
        }
    }

    public static int d(String s, String s1, Throwable throwable)
    {
        if (!enabled)
        {
            return 0;
        } else
        {
            return android.util.Log.d(s, s1, throwable);
        }
    }

    public static int e(String s, String s1)
    {
        if (!enabled)
        {
            return 0;
        } else
        {
            return android.util.Log.e(s, s1);
        }
    }

    public static int e(String s, String s1, Throwable throwable)
    {
        if (!enabled)
        {
            return 0;
        } else
        {
            return android.util.Log.e(s, s1, throwable);
        }
    }

    public static int i(String s, String s1)
    {
        if (!enabled)
        {
            return 0;
        } else
        {
            return android.util.Log.i(s, s1);
        }
    }

    public static int i(String s, String s1, Throwable throwable)
    {
        if (!enabled)
        {
            return 0;
        } else
        {
            return android.util.Log.i(s, s1, throwable);
        }
    }

    public static int println(int j, String s, String s1)
    {
        if (!enabled)
        {
            return 0;
        } else
        {
            return android.util.Log.println(j, s, s1);
        }
    }

    public static void setEnabled(boolean flag)
    {
        enabled = flag;
    }

    public static int v(String s, String s1)
    {
        if (!enabled)
        {
            return 0;
        } else
        {
            return android.util.Log.v(s, s1);
        }
    }

    public static int v(String s, String s1, Throwable throwable)
    {
        if (!enabled)
        {
            return 0;
        } else
        {
            return android.util.Log.v(s, s1, throwable);
        }
    }

    public static int w(String s, String s1)
    {
        if (!enabled)
        {
            return 0;
        } else
        {
            return android.util.Log.w(s, s1);
        }
    }

    public static int w(String s, String s1, Throwable throwable)
    {
        if (!enabled)
        {
            return 0;
        } else
        {
            return android.util.Log.w(s, s1, throwable);
        }
    }

    public static int w(String s, Throwable throwable)
    {
        if (!enabled)
        {
            return 0;
        } else
        {
            return android.util.Log.w(s, throwable);
        }
    }

    public static int wtf(String s, String s1)
    {
        if (!enabled)
        {
            return 0;
        } else
        {
            return android.util.Log.wtf(s, s1);
        }
    }

    public static int wtf(String s, String s1, Throwable throwable)
    {
        if (!enabled)
        {
            return 0;
        } else
        {
            return android.util.Log.wtf(s, s1, throwable);
        }
    }

    public static int wtf(String s, Throwable throwable)
    {
        if (!enabled)
        {
            return 0;
        } else
        {
            return android.util.Log.wtf(s, throwable);
        }
    }

}
