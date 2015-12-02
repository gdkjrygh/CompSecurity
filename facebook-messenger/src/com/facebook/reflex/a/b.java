// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.a;

import java.util.Arrays;

public class b
{

    final double a[];
    final int b[];
    int c;

    public b(double d, double d1, double d2)
    {
        this(new double[] {
            d, d1, d2
        });
    }

    public b(double d, double d1, double d2, double d3)
    {
        this(new double[] {
            d, d1, d2, d3
        });
    }

    public b(double ad[])
    {
        c = 0;
        b = new int[ad.length + 1];
        a = new double[ad.length + 1];
        System.arraycopy(ad, 0, a, 0, ad.length);
        a[a.length - 1] = 1.7976931348623157E+308D;
    }

    public void a(double d)
    {
        this;
        JVM INSTR monitorenter ;
        int i = 0;
        while (i < a.length && a[i] < d) 
        {
            i++;
        }
        int ai[] = b;
        ai[i] = ai[i] + 1;
        c = c + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int[] a()
    {
        this;
        JVM INSTR monitorenter ;
        int ai[];
        ai = new int[b.length];
        System.arraycopy(b, 0, ai, 0, b.length);
        Arrays.fill(b, 0);
        c = 0;
        this;
        JVM INSTR monitorexit ;
        return ai;
        Exception exception;
        exception;
        throw exception;
    }

    public int b()
    {
        this;
        JVM INSTR monitorenter ;
        int i = c;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }
}
