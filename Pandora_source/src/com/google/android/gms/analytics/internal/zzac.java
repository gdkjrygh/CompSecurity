// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzad

public class zzac
{

    private final long zzIj;
    private final int zzIk;
    private double zzIl;
    private long zzIm;
    private final Object zzIn;
    private final String zzso;

    public zzac(int i, long l, String s)
    {
        zzIn = new Object();
        zzIk = i;
        zzIl = zzIk;
        zzIj = l;
        zzso = s;
    }

    public zzac(String s)
    {
        this(60, 2000L, s);
    }

    public boolean zziU()
    {
        Object obj = zzIn;
        obj;
        JVM INSTR monitorenter ;
        double d;
        long l;
        l = System.currentTimeMillis();
        if (zzIl >= (double)zzIk)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        d = (double)(l - zzIm) / (double)zzIj;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        zzIl = Math.min(zzIk, d + zzIl);
        zzIm = l;
        if (zzIl < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        zzIl = zzIl - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        zzad.zzan((new StringBuilder()).append("Excessive ").append(zzso).append(" detected; call ignored.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
