// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            ad, aa

class z
    implements ad
{

    private final long wE;
    private final int wF;
    private double wG;
    private long wH;
    private final Object wI;
    private final String wJ;

    public z(int i, long l, String s)
    {
        wI = new Object();
        wF = i;
        wG = wF;
        wE = l;
        wJ = s;
    }

    public z(String s)
    {
        this(60, 2000L, s);
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
        d = (double)(l - wH) / (double)wE;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        wG = Math.min(wF, d + wG);
        wH = l;
        if (wG < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        wG = wG - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        aa.D((new StringBuilder()).append("Excessive ").append(wJ).append(" detected; call ignored.").toString());
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
