// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            cg, bh

class cw
    implements cg
{

    private final long BF;
    private final int BG;
    private double BH;
    private final Object BJ;
    private long aty;

    public cw()
    {
        this(60, 2000L);
    }

    public cw(int i, long l)
    {
        BJ = new Object();
        BG = i;
        BH = BG;
        BF = l;
    }

    public boolean fe()
    {
        Object obj = BJ;
        obj;
        JVM INSTR monitorenter ;
        double d;
        long l;
        l = System.currentTimeMillis();
        if (BH >= (double)BG)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        d = (double)(l - aty) / (double)BF;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        BH = Math.min(BG, d + BH);
        aty = l;
        if (BH < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        BH = BH - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        bh.W("No more tokens available.");
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
