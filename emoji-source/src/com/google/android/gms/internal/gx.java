// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Looper;
import android.util.Log;

public final class gx
{

    public static void A(boolean flag)
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

    public static void ay(String s)
    {
        if (Looper.getMainLooper().getThread() != Thread.currentThread())
        {
            Log.e("Asserts", (new StringBuilder()).append("checkMainThread: current thread ").append(Thread.currentThread()).append(" IS NOT the main thread ").append(Looper.getMainLooper().getThread()).append("!").toString());
            throw new IllegalStateException(s);
        } else
        {
            return;
        }
    }

    public static void az(String s)
    {
        if (Looper.getMainLooper().getThread() == Thread.currentThread())
        {
            Log.e("Asserts", (new StringBuilder()).append("checkNotMainThread: current thread ").append(Thread.currentThread()).append(" IS the main thread ").append(Looper.getMainLooper().getThread()).append("!").toString());
            throw new IllegalStateException(s);
        } else
        {
            return;
        }
    }

    public static void c(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("null reference");
        } else
        {
            return;
        }
    }
}
