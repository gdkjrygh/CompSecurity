// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            cf, bh

class cv
    implements cf
{

    private long ahJ;
    private final long wE;
    private final int wF;
    private double wG;
    private final Object wI;

    public cv()
    {
        this(60, 2000L);
    }

    public cv(int i, long l)
    {
        wI = new Object();
        wF = i;
        wG = wF;
        wE = l;
    }

    public boolean _mthdo()
    {
        Object obj = wI;
        obj;
        JVM INSTR monitorenter ;
        double d;
        long l;
        l = System.currentTimeMillis();
        if (wG >= (double)wF)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        d = (double)(l - ahJ) / (double)wE;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        wG = Math.min(wF, d + wG);
        ahJ = l;
        if (wG < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        wG = wG - 1.0D;
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
