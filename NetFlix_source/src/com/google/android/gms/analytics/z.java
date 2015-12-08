// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            ad, aa

class z
    implements ad
{

    private final long vm;
    private final int vn;
    private double vo;
    private long vp;
    private final Object vq;
    private final String vr;

    public z(int i, long l, String s)
    {
        vq = new Object();
        vn = i;
        vo = vn;
        vm = l;
        vr = s;
    }

    public z(String s)
    {
        this(60, 2000L, s);
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
        d = (double)(l - vp) / (double)vm;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        vo = Math.min(vn, d + vo);
        vp = l;
        if (vo < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        vo = vo - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        aa.z((new StringBuilder()).append("Excessive ").append(vr).append(" detected; call ignored.").toString());
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
