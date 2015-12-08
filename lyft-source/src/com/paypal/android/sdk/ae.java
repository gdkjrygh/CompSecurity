// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.UUID;

public final class ae
{

    private static String a = null;
    private static long b = 0L;
    private static long c = 0L;

    public static void a()
    {
        com/paypal/android/sdk/ae;
        JVM INSTR monitorenter ;
        a = UUID.randomUUID().toString();
        b = System.currentTimeMillis();
        com/paypal/android/sdk/ae;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(long l)
    {
        com/paypal/android/sdk/ae;
        JVM INSTR monitorenter ;
        c = l;
        com/paypal/android/sdk/ae;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static String b()
    {
        com/paypal/android/sdk/ae;
        JVM INSTR monitorenter ;
        String s;
        if (a == null)
        {
            a();
        }
        s = a;
        com/paypal/android/sdk/ae;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean c()
    {
        com/paypal/android/sdk/ae;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        long l2;
        l = System.currentTimeMillis();
        l1 = d();
        l2 = c;
        boolean flag;
        if (l - l1 <= l2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com/paypal/android/sdk/ae;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private static long d()
    {
        com/paypal/android/sdk/ae;
        JVM INSTR monitorenter ;
        long l;
        if (b == 0L)
        {
            a();
        }
        l = b;
        com/paypal/android/sdk/ae;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

}
