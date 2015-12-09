// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.e.a;

public class e
{

    private e()
    {
    }

    public static Object a(Throwable throwable)
    {
        if (throwable != null)
        {
            com.fitbit.e.a.c("assert", com.fitbit.e.a.a(throwable), new Object[0]);
            throw new AssertionError();
        } else
        {
            return null;
        }
    }

    public static void a(boolean flag)
    {
        if (flag)
        {
            return;
        } else
        {
            throw new AssertionError();
        }
    }
}
