// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            cg, bh

class cw
    implements cg
{

    private final long AN;
    private final int AO;
    private double AP;
    private final Object AR;
    private long arp;

    public cw()
    {
        this(60, 2000L);
    }

    public cw(int i, long l)
    {
        AR = new Object();
        AO = i;
        AP = AO;
        AN = l;
    }

    public boolean eJ()
    {
        Object obj = AR;
        obj;
        JVM INSTR monitorenter ;
        double d;
        long l;
        l = System.currentTimeMillis();
        if (AP >= (double)AO)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        d = (double)(l - arp) / (double)AN;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        AP = Math.min(AO, d + AP);
        arp = l;
        if (AP < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        AP = AP - 1.0D;
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
