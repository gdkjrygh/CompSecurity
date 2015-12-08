// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            cf, bh

class cv
    implements cf
{

    private long aab;
    private final long vm;
    private final int vn;
    private double vo;
    private final Object vq;

    public cv()
    {
        this(60, 2000L);
    }

    public cv(int i, long l)
    {
        vq = new Object();
        vn = i;
        vo = vn;
        vm = l;
    }

    public boolean cS()
    {
        Object obj = vq;
        obj;
        JVM INSTR monitorenter ;
        double d;
        long l;
        l = System.currentTimeMillis();
        if (vo >= (double)vn)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        d = (double)(l - aab) / (double)vm;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        vo = Math.min(vn, d + vo);
        aab = l;
        if (vo < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        vo = vo - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        bh.z("No more tokens available.");
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
