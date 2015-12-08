// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzht;

// Referenced classes of package com.google.android.gms.tagmanager:
//            az, zzbg

class ad
    implements az
{

    private final long a;
    private final long b;
    private final int c;
    private double d;
    private long e;
    private final Object f = new Object();
    private final String g;
    private final zzht h;

    public ad(int i, long l, long l1, String s, zzht zzht1)
    {
        c = i;
        d = c;
        a = l;
        b = l1;
        g = s;
        h = zzht1;
    }

    public boolean a()
    {
        long l;
label0:
        {
            synchronized (f)
            {
                l = h.currentTimeMillis();
                if (l - e >= b)
                {
                    break label0;
                }
                zzbg.zzan((new StringBuilder()).append("Excessive ").append(g).append(" detected; call ignored.").toString());
            }
            return false;
        }
        double d1;
        if (d >= (double)c)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        d1 = (double)(l - e) / (double)a;
        if (d1 <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        d = Math.min(c, d1 + d);
        e = l;
        if (d < 1.0D)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        d = d - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzbg.zzan((new StringBuilder()).append("Excessive ").append(g).append(" detected; call ignored.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
    }
}
