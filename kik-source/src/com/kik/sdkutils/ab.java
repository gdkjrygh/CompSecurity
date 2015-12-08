// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;

import android.os.SystemClock;

public final class ab
{

    private static volatile Long a;

    public static long a()
    {
        com/kik/sdkutils/ab;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        l = SystemClock.elapsedRealtime();
        if (a == null)
        {
            a = Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        }
        l1 = a.longValue();
        com/kik/sdkutils/ab;
        JVM INSTR monitorexit ;
        return l + l1;
        Exception exception;
        exception;
        throw exception;
    }
}
