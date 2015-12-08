// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            ah, ae

class ad
    implements ah
{

    private final long BF;
    private final int BG;
    private double BH;
    private long BI;
    private final Object BJ;
    private final String BK;

    public ad(int i, long l, String s)
    {
        BJ = new Object();
        BG = i;
        BH = BG;
        BF = l;
        BK = s;
    }

    public ad(String s)
    {
        this(60, 2000L, s);
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
        d = (double)(l - BI) / (double)BF;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        BH = Math.min(BG, d + BH);
        BI = l;
        if (BH < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        BH = BH - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        ae.W((new StringBuilder()).append("Excessive ").append(BK).append(" detected; call ignored.").toString());
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
