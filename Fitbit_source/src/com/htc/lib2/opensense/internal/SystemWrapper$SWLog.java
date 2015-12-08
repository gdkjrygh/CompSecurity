// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.opensense.internal;

import android.util.Log;

// Referenced classes of package com.htc.lib2.opensense.internal:
//            SystemWrapper

public static class ldFlag
{

    private static final boolean LOG_ENABLED;

    public static int d(String s, String s1)
    {
        if (LOG_ENABLED)
        {
            return Log.d(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int d(String s, String s1, Throwable throwable)
    {
        if (LOG_ENABLED)
        {
            return Log.d(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int e(String s, String s1)
    {
        if (LOG_ENABLED)
        {
            return Log.e(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int e(String s, String s1, Throwable throwable)
    {
        if (LOG_ENABLED)
        {
            return Log.e(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int i(String s, String s1)
    {
        if (LOG_ENABLED)
        {
            return Log.i(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int i(String s, String s1, Throwable throwable)
    {
        if (LOG_ENABLED)
        {
            return Log.i(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int v(String s, String s1)
    {
        if (LOG_ENABLED)
        {
            return Log.v(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int v(String s, String s1, Throwable throwable)
    {
        if (LOG_ENABLED)
        {
            return Log.v(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int w(String s, String s1)
    {
        if (LOG_ENABLED)
        {
            return Log.w(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int w(String s, String s1, Throwable throwable)
    {
        if (LOG_ENABLED)
        {
            return Log.w(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int w(String s, Throwable throwable)
    {
        if (LOG_ENABLED)
        {
            return Log.w(s, throwable);
        } else
        {
            return 0;
        }
    }

    static 
    {
        LOG_ENABLED = ldFlag.Htc_DEBUG_flag;
    }

    public ldFlag()
    {
    }
}
