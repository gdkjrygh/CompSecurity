// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcc, zzbf

class zzcr
    implements zzcc
{

    private final long zzEI;
    private final int zzEJ;
    private double zzEK;
    private final Object zzEM;
    private long zzaAu;

    public zzcr()
    {
        this(60, 2000L);
    }

    public zzcr(int i, long l)
    {
        zzEM = new Object();
        zzEJ = i;
        zzEK = zzEJ;
        zzEI = l;
    }

    public boolean zzgv()
    {
        Object obj = zzEM;
        obj;
        JVM INSTR monitorenter ;
        double d;
        long l;
        l = System.currentTimeMillis();
        if (zzEK >= (double)zzEJ)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        d = (double)(l - zzaAu) / (double)zzEI;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        zzEK = Math.min(zzEJ, d + zzEK);
        zzaAu = l;
        if (zzEK < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        zzEK = zzEK - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        zzbf.zzac("No more tokens available.");
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
