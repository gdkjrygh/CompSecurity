// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Looper;
import android.text.TextUtils;

public final class bl
{

    public static Object a(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("null reference");
        } else
        {
            return obj;
        }
    }

    public static Object a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            throw new NullPointerException(String.valueOf(obj1));
        } else
        {
            return obj;
        }
    }

    public static String a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Given String is empty or null");
        } else
        {
            return s;
        }
    }

    public static String a(String s, Object obj)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException(String.valueOf(obj));
        } else
        {
            return s;
        }
    }

    public static void a(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalStateException();
        } else
        {
            return;
        }
    }

    public static void a(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalStateException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static transient void a(boolean flag, String s, Object aobj[])
    {
        if (!flag)
        {
            throw new IllegalStateException(String.format(s, aobj));
        } else
        {
            return;
        }
    }

    public static void b(String s)
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException(s);
        } else
        {
            return;
        }
    }

    public static void b(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalArgumentException();
        } else
        {
            return;
        }
    }

    public static void b(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalArgumentException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static transient void b(boolean flag, String s, Object aobj[])
    {
        if (!flag)
        {
            throw new IllegalArgumentException(String.format(s, aobj));
        } else
        {
            return;
        }
    }

    public static void c(String s)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException(s);
        } else
        {
            return;
        }
    }
}
