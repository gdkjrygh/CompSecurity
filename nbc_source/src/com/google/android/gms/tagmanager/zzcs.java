// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcd, zzbg

class zzcs
    implements zzcd
{

    private final long zzMf;
    private final int zzMg;
    private double zzMh;
    private final Object zzMj;
    private long zzaNC;

    public zzcs()
    {
        this(60, 2000L);
    }

    public zzcs(int i, long l)
    {
        zzMj = new Object();
        zzMg = i;
        zzMh = zzMg;
        zzMf = l;
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
        d = (double)(l - zzaNC) / (double)zzMf;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        zzMh = Math.min(zzMg, d + zzMh);
        zzaNC = l;
        if (zzMh < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        zzMh = zzMh - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        zzbg.zzaC("No more tokens available.");
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
