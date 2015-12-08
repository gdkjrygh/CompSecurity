// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.h;


public final class j
{

    private static volatile long a = 0L;
    private static volatile long b = -1L;

    public static long a()
    {
        kik/a/h/j;
        JVM INSTR monitorenter ;
        long l = a;
        kik/a/h/j;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(long l)
    {
        kik/a/h/j;
        JVM INSTR monitorenter ;
        d(l - System.currentTimeMillis());
        kik/a/h/j;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static long b()
    {
        kik/a/h/j;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        l = System.currentTimeMillis();
        l1 = a;
        kik/a/h/j;
        JVM INSTR monitorexit ;
        return l + l1;
        Exception exception;
        exception;
        throw exception;
    }

    public static long b(long l)
    {
        return l - a;
    }

    public static long c()
    {
        kik/a/h/j;
        JVM INSTR monitorenter ;
        long l = b;
        kik/a/h/j;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public static long c(long l)
    {
        kik/a/h/j;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        l2 = 30L & ((65280L & l) >> 8 ^ (0xff0000L & l) >> 16 ^ (0xffffffffff000000L & l) >> 24);
        l1 = (224L & l) >> 5;
        if (l2 % 4L != 0L) goto _L2; else goto _L1
_L1:
        l1 /= 3L;
        l1 *= 3L;
_L4:
        kik/a/h/j;
        JVM INSTR monitorexit ;
        return l1 << 5 | -255L & l | l2;
_L2:
        l1 /= 2L;
        l1 *= 2L;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private static void d(long l)
    {
        kik/a/h/j;
        JVM INSTR monitorenter ;
        a = l;
        b = System.currentTimeMillis();
        kik/a/h/j;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
