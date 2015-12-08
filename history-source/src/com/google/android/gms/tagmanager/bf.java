// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.ld;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cg, bh

class bf
    implements cg
{

    private final long BF;
    private final int BG;
    private double BH;
    private long BI;
    private final Object BJ = new Object();
    private final String BK;
    private final long arU;
    private final ld wb;

    public bf(int i, long l, long l1, String s, ld ld1)
    {
        BG = i;
        BH = BG;
        BF = l;
        arU = l1;
        BK = s;
        wb = ld1;
    }

    public boolean fe()
    {
        long l;
label0:
        {
            synchronized (BJ)
            {
                l = wb.currentTimeMillis();
                if (l - BI >= arU)
                {
                    break label0;
                }
                bh.W((new StringBuilder()).append("Excessive ").append(BK).append(" detected; call ignored.").toString());
            }
            return false;
        }
        double d;
        if (BH >= (double)BG)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        d = (double)(l - BI) / (double)BF;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        BH = Math.min(BG, d + BH);
        BI = l;
        if (BH < 1.0D)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        BH = BH - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        bh.W((new StringBuilder()).append("Excessive ").append(BK).append(" detected; call ignored.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
    }
}
