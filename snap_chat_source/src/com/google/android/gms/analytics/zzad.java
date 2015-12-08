// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            zzah, zzae

class zzad
    implements zzah
{

    private final long zzEI;
    private final int zzEJ;
    private double zzEK;
    private long zzEL;
    private final Object zzEM;
    private final String zzrc;

    public zzad(int i, long l, String s)
    {
        zzEM = new Object();
        zzEJ = i;
        zzEK = zzEJ;
        zzEI = l;
        zzrc = s;
    }

    public zzad(String s)
    {
        this(60, 2000L, s);
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
        d = (double)(l - zzEL) / (double)zzEI;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        zzEK = Math.min(zzEJ, d + zzEK);
        zzEL = l;
        if (zzEK < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        zzEK = zzEK - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        zzae.zzac((new StringBuilder("Excessive ")).append(zzrc).append(" detected; call ignored.").toString());
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
