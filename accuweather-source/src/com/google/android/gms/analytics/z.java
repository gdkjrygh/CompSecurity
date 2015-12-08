// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            ad, aa

class z
    implements ad
{

    private final long wB;
    private final int wC;
    private double wD;
    private long wE;
    private final Object wF;
    private final String wG;

    public z(int i, long l, String s)
    {
        wF = new Object();
        wC = i;
        wD = wC;
        wB = l;
        wG = s;
    }

    public z(String s)
    {
        this(60, 2000L, s);
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
        d = (double)(l - wE) / (double)wB;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        wD = Math.min(wC, d + wD);
        wE = l;
        if (wD < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        wD = wD - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        aa.D((new StringBuilder()).append("Excessive ").append(wG).append(" detected; call ignored.").toString());
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
