// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.b;


public final class a
{

    private long a;
    private int b;
    private final int c;

    private a(int i)
    {
        a = 0L;
        b = 0;
        c = i;
    }

    public static a a(double d)
    {
        return new a((int)Math.ceil(1000D / d));
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        long l = System.currentTimeMillis();
        if (l - a > (long)c)
        {
            b = 0;
            a = l;
        }
        i = b + 1;
        b = i;
        if (i <= 1)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        long l1;
        long l2;
        l1 = a;
        l2 = (long)c + l1;
        l1 = System.currentTimeMillis();
_L1:
        if (l1 >= l2)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        try
        {
            Thread.sleep(l2 - l1);
        }
        catch (InterruptedException interruptedexception) { }
        l1 = System.currentTimeMillis();
          goto _L1
        a = l2;
        b = 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
