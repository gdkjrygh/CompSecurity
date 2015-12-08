// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.ju;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cg, bh

class bf
    implements cg
{

    private final long AN;
    private final int AO;
    private double AP;
    private long AQ;
    private final Object AR = new Object();
    private final String AS;
    private final long apL;
    private final ju yD;

    public bf(int i, long l, long l1, String s, ju ju1)
    {
        AO = i;
        AP = AO;
        AN = l;
        apL = l1;
        AS = s;
        yD = ju1;
    }

    public boolean eJ()
    {
        long l;
label0:
        {
            synchronized (AR)
            {
                l = yD.currentTimeMillis();
                if (l - AQ >= apL)
                {
                    break label0;
                }
                bh.W((new StringBuilder()).append("Excessive ").append(AS).append(" detected; call ignored.").toString());
            }
            return false;
        }
        double d;
        if (AP >= (double)AO)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        d = (double)(l - AQ) / (double)AN;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        AP = Math.min(AO, d + AP);
        AQ = l;
        if (AP < 1.0D)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        AP = AP - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        bh.W((new StringBuilder()).append("Excessive ").append(AS).append(" detected; call ignored.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
    }
}
