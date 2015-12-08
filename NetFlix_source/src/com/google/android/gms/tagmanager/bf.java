// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gl;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cf, bh

class bf
    implements cf
{

    private final gl Wv;
    private final long Yx;
    private final long vm;
    private final int vn;
    private double vo;
    private long vp;
    private final Object vq = new Object();
    private final String vr;

    public bf(int i, long l, long l1, String s, gl gl1)
    {
        vn = i;
        vo = vn;
        vm = l;
        Yx = l1;
        vr = s;
        Wv = gl1;
    }

    public boolean cS()
    {
        long l;
label0:
        {
            synchronized (vq)
            {
                l = Wv.currentTimeMillis();
                if (l - vp >= Yx)
                {
                    break label0;
                }
                bh.z((new StringBuilder()).append("Excessive ").append(vr).append(" detected; call ignored.").toString());
            }
            return false;
        }
        double d;
        if (vo >= (double)vn)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        d = (double)(l - vp) / (double)vm;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        vo = Math.min(vn, d + vo);
        vp = l;
        if (vo < 1.0D)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        vo = vo - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        bh.z((new StringBuilder()).append("Excessive ").append(vr).append(" detected; call ignored.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
    }
}
