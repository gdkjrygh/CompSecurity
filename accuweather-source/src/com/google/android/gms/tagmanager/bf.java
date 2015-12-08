// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.ik;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cf, bh

class bf
    implements cf
{

    private final ik aec;
    private final long agc;
    private final long wB;
    private final int wC;
    private double wD;
    private long wE;
    private final Object wF = new Object();
    private final String wG;

    public bf(int i, long l, long l1, String s, ik ik1)
    {
        wC = i;
        wD = wC;
        wB = l;
        agc = l1;
        wG = s;
        aec = ik1;
    }

    public boolean dj()
    {
        long l;
label0:
        {
            synchronized (wF)
            {
                l = aec.currentTimeMillis();
                if (l - wE >= agc)
                {
                    break label0;
                }
                bh.D((new StringBuilder()).append("Excessive ").append(wG).append(" detected; call ignored.").toString());
            }
            return false;
        }
        double d;
        if (wD >= (double)wC)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        d = (double)(l - wE) / (double)wB;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        wD = Math.min(wC, d + wD);
        wE = l;
        if (wD < 1.0D)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        wD = wD - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        bh.D((new StringBuilder()).append("Excessive ").append(wG).append(" detected; call ignored.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
    }
}
