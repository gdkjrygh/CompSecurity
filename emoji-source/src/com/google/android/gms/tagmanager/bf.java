// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.ij;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cf, bh

class bf
    implements cf
{

    private final ij aef;
    private final long agf;
    private final long wE;
    private final int wF;
    private double wG;
    private long wH;
    private final Object wI = new Object();
    private final String wJ;

    public bf(int i, long l, long l1, String s, ij ij1)
    {
        wF = i;
        wG = wF;
        wE = l;
        agf = l1;
        wJ = s;
        aef = ij1;
    }

    public boolean _mthdo()
    {
        long l;
label0:
        {
            synchronized (wI)
            {
                l = aef.currentTimeMillis();
                if (l - wH >= agf)
                {
                    break label0;
                }
                bh.D((new StringBuilder()).append("Excessive ").append(wJ).append(" detected; call ignored.").toString());
            }
            return false;
        }
        double d;
        if (wG >= (double)wF)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        d = (double)(l - wH) / (double)wE;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        wG = Math.min(wF, d + wG);
        wH = l;
        if (wG < 1.0D)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        wG = wG - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        bh.D((new StringBuilder()).append("Excessive ").append(wJ).append(" detected; call ignored.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
    }
}
