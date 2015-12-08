// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            cf, bh

class cv
    implements cf
{

    private long ahG;
    private final long wB;
    private final int wC;
    private double wD;
    private final Object wF;

    public cv()
    {
        this(60, 2000L);
    }

    public cv(int i, long l)
    {
        wF = new Object();
        wC = i;
        wD = wC;
        wB = l;
    }

    public boolean dj()
    {
        Object obj = wF;
        obj;
        JVM INSTR monitorenter ;
        double d;
        long l;
        l = System.currentTimeMillis();
        if (wD >= (double)wC)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        d = (double)(l - ahG) / (double)wB;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        wD = Math.min(wC, d + wD);
        ahG = l;
        if (wD < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        wD = wD - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        bh.D("No more tokens available.");
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
