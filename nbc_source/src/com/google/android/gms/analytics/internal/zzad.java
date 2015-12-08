// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzae

public class zzad
{

    private final long zzMf;
    private final int zzMg;
    private double zzMh;
    private long zzMi;
    private final Object zzMj;
    private final String zzuO;

    public zzad(int i, long l, String s)
    {
        zzMj = new Object();
        zzMg = i;
        zzMh = zzMg;
        zzMf = l;
        zzuO = s;
    }

    public zzad(String s)
    {
        this(60, 2000L, s);
    }

    public boolean zzkb()
    {
        Object obj = zzMj;
        obj;
        JVM INSTR monitorenter ;
        double d;
        long l;
        l = System.currentTimeMillis();
        if (zzMh >= (double)zzMg)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        d = (double)(l - zzMi) / (double)zzMf;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        zzMh = Math.min(zzMg, d + zzMh);
        zzMi = l;
        if (zzMh < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        zzMh = zzMh - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        zzae.zzaC((new StringBuilder()).append("Excessive ").append(zzuO).append(" detected; call ignored.").toString());
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
