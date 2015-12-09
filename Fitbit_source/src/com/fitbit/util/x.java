// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.e.a;

public class x
{

    private static final String a = "FBExceptionLogger";

    public x()
    {
    }

    public static void a()
    {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler()) {

            final Thread.UncaughtExceptionHandler a;

            public void uncaughtException(Thread thread, Throwable throwable)
            {
                com.fitbit.e.a.f("FBExceptionLogger", String.format("FATAL EXCEPTION: %s", new Object[] {
                    throwable
                }), throwable, new Object[0]);
                a.uncaughtException(thread, throwable);
            }

            
            {
                a = uncaughtexceptionhandler;
                super();
            }
        });
    }
}
