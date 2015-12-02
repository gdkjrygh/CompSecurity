// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;


public class f
{

    private static long a;

    public static boolean a()
    {
        com/qihoo360/mobilesafe/b/f;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        l = System.currentTimeMillis();
        l1 = a;
        l1 = l - l1;
        if (l1 <= 0L || l1 >= 800L) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        com/qihoo360/mobilesafe/b/f;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        a = l;
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean b()
    {
        com/qihoo360/mobilesafe/b/f;
        JVM INSTR monitorenter ;
        long l = System.currentTimeMillis();
        if (l - a <= 800L) goto _L2; else goto _L1
_L1:
        a = l;
        boolean flag = true;
_L4:
        com/qihoo360/mobilesafe/b/f;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}
