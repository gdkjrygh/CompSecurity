// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;

public final class Asserts
{

    public static void checkMainThread(String s)
    {
        if (Looper.getMainLooper().getThread() != Thread.currentThread())
        {
            Log.e("Asserts", (new StringBuilder("checkMainThread: current thread ")).append(Thread.currentThread()).append(" IS NOT the main thread ").append(Looper.getMainLooper().getThread()).append("!").toString());
            throw new IllegalStateException(s);
        } else
        {
            return;
        }
    }

    public static void checkNotMainThread(String s)
    {
        if (Looper.getMainLooper().getThread() == Thread.currentThread())
        {
            Log.e("Asserts", (new StringBuilder("checkNotMainThread: current thread ")).append(Thread.currentThread()).append(" IS the main thread ").append(Looper.getMainLooper().getThread()).append("!").toString());
            throw new IllegalStateException(s);
        } else
        {
            return;
        }
    }

    public static void checkNotNull(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("null reference");
        } else
        {
            return;
        }
    }

    public static void checkNotNull(Object obj, Object obj1)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException(String.valueOf(obj1));
        } else
        {
            return;
        }
    }

    public static void checkState(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalStateException();
        } else
        {
            return;
        }
    }

    public static void checkState(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalStateException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static transient void checkState(boolean flag, String s, Object aobj[])
    {
        if (!flag)
        {
            throw new IllegalStateException(String.valueOf(String.format(s, aobj)));
        } else
        {
            return;
        }
    }

    public static void fail(Object obj)
    {
        throw new IllegalStateException(String.valueOf(obj));
    }
}
