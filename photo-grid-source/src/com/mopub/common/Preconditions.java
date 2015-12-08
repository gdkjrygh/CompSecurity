// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.os.Looper;
import com.mopub.common.logging.MoPubLog;
import java.util.IllegalFormatException;

public final class Preconditions
{

    public static final String EMPTY_ARGUMENTS = "";

    private Preconditions()
    {
    }

    private static transient String a(String s, Object aobj[])
    {
        s = String.valueOf(s);
        try
        {
            aobj = String.format(s, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            MoPubLog.e((new StringBuilder("MoPub preconditions had a format exception: ")).append(((IllegalFormatException) (aobj)).getMessage()).toString());
            return s;
        }
        return ((String) (aobj));
    }

    static boolean a(Object obj, boolean flag, String s, Object aobj[])
    {
        return b(obj, flag, s, aobj);
    }

    static boolean a(boolean flag, String s, Object aobj[])
    {
        return b(flag, s, aobj);
    }

    static boolean a(boolean flag, boolean flag1, String s, Object aobj[])
    {
        return c(flag, flag1, s, aobj);
    }

    private static transient boolean b(Object obj, boolean flag, String s, Object aobj[])
    {
        if (obj != null)
        {
            return true;
        }
        obj = a(s, aobj);
        if (flag)
        {
            throw new NullPointerException(((String) (obj)));
        } else
        {
            MoPubLog.e(((String) (obj)));
            return false;
        }
    }

    private static transient boolean b(boolean flag, String s, Object aobj[])
    {
        if (Looper.getMainLooper().equals(Looper.myLooper()))
        {
            return true;
        }
        s = a(s, aobj);
        if (flag)
        {
            throw new IllegalStateException(s);
        } else
        {
            MoPubLog.e(s);
            return false;
        }
    }

    static boolean b(boolean flag, boolean flag1, String s, Object aobj[])
    {
        return d(flag, flag1, s, aobj);
    }

    private static transient boolean c(boolean flag, boolean flag1, String s, Object aobj[])
    {
        if (flag)
        {
            return true;
        }
        s = a(s, aobj);
        if (flag1)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            MoPubLog.e(s);
            return false;
        }
    }

    public static void checkArgument(boolean flag)
    {
        c(flag, true, "Illegal argument.", new Object[] {
            ""
        });
    }

    public static void checkArgument(boolean flag, String s)
    {
        c(flag, true, s, new Object[] {
            ""
        });
    }

    public static transient void checkArgument(boolean flag, String s, Object aobj[])
    {
        c(flag, true, s, aobj);
    }

    public static void checkNotNull(Object obj)
    {
        b(obj, true, "Object can not be null.", new Object[] {
            ""
        });
    }

    public static void checkNotNull(Object obj, String s)
    {
        b(obj, true, s, new Object[] {
            ""
        });
    }

    public static transient void checkNotNull(Object obj, String s, Object aobj[])
    {
        b(obj, true, s, aobj);
    }

    public static void checkState(boolean flag)
    {
        d(flag, true, "Illegal state.", new Object[] {
            ""
        });
    }

    public static void checkState(boolean flag, String s)
    {
        d(flag, true, s, new Object[] {
            ""
        });
    }

    public static transient void checkState(boolean flag, String s, Object aobj[])
    {
        d(flag, true, s, aobj);
    }

    public static void checkUiThread()
    {
        b(true, "This method must be called from the UI thread.", new Object[] {
            ""
        });
    }

    public static void checkUiThread(String s)
    {
        b(true, s, new Object[] {
            ""
        });
    }

    public static transient void checkUiThread(String s, Object aobj[])
    {
        b(true, s, aobj);
    }

    private static transient boolean d(boolean flag, boolean flag1, String s, Object aobj[])
    {
        if (flag)
        {
            return true;
        }
        s = a(s, aobj);
        if (flag1)
        {
            throw new IllegalStateException(s);
        } else
        {
            MoPubLog.e(s);
            return false;
        }
    }
}
