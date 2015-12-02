// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.p;


public class a
{

    private final com.facebook.common.time.a a;
    private final int b;
    private final long c;
    private double d;
    private long e;

    public a(com.facebook.common.time.a a1, int i, long l)
    {
        a = a1;
        b = i;
        c = l;
        d = i;
    }

    public boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        double d1;
        long l = a.a();
        long l1 = e;
        e = l;
        d = d + (double)(l - l1) * ((double)b / (double)c);
        if (d > (double)b)
        {
            d = b;
        }
        d1 = d;
        if (d1 >= 1.0D) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        d = d - 1.0D;
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}
