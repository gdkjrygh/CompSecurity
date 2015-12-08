// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzlv;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcc, zzbf

class zzbd
    implements zzcc
{

    private final long zzEI;
    private final int zzEJ;
    private double zzEK;
    private long zzEL;
    private final Object zzEM = new Object();
    private final long zzazf;
    private final zzlv zzmW;
    private final String zzrc;

    public zzbd(int i, long l, long l1, String s, zzlv zzlv1)
    {
        zzEJ = i;
        zzEK = zzEJ;
        zzEI = l;
        zzazf = l1;
        zzrc = s;
        zzmW = zzlv1;
    }

    public boolean zzgv()
    {
        long l;
label0:
        {
            synchronized (zzEM)
            {
                l = zzmW.currentTimeMillis();
                if (l - zzEL >= zzazf)
                {
                    break label0;
                }
                zzbf.zzac((new StringBuilder("Excessive ")).append(zzrc).append(" detected; call ignored.").toString());
            }
            return false;
        }
        double d;
        if (zzEK >= (double)zzEJ)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        d = (double)(l - zzEL) / (double)zzEI;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        zzEK = Math.min(zzEJ, d + zzEK);
        zzEL = l;
        if (zzEK < 1.0D)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        zzEK = zzEK - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzbf.zzac((new StringBuilder("Excessive ")).append(zzrc).append(" detected; call ignored.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
    }
}
