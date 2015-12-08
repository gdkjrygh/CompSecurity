// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzh;

// Referenced classes of package com.google.android.gms.internal:
//            zzht

public class zzfq
{

    private long zzCE;
    private long zzCF;
    private Object zzoe;

    public zzfq(long l)
    {
        zzCF = 0x8000000000000000L;
        zzoe = new Object();
        zzCE = l;
    }

    public boolean tryAcquire()
    {
        long l;
label0:
        {
            synchronized (zzoe)
            {
                l = zzh.zzaU().elapsedRealtime();
                if (zzCF + zzCE <= l)
                {
                    break label0;
                }
            }
            return false;
        }
        zzCF = l;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
