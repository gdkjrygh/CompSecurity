// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzl, zzo

public final class zzp
{

    private static final zzl zzNy = new zzl("RequestTracker");
    public static final Object zzOD = new Object();
    private long zzOA;
    private long zzOB;
    private zzo zzOC;
    private long zzOz;

    public zzp(long l)
    {
        zzOz = l;
        zzOA = -1L;
        zzOB = 0L;
    }

    private void zzks()
    {
        zzOA = -1L;
        zzOC = null;
        zzOB = 0L;
    }

    public void clear()
    {
        synchronized (zzOD)
        {
            if (zzOA != -1L)
            {
                zzks();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(long l, zzo zzo1)
    {
        zzo zzo2;
        long l1;
        synchronized (zzOD)
        {
            zzo2 = zzOC;
            l1 = zzOA;
            zzOA = l;
            zzOC = zzo1;
            zzOB = SystemClock.elapsedRealtime();
        }
        if (zzo2 != null)
        {
            zzo2.zzw(l1);
        }
        return;
        zzo1;
        obj;
        JVM INSTR monitorexit ;
        throw zzo1;
    }

    public boolean zzb(long l, int i, Object obj)
    {
        zzo zzo1;
        boolean flag;
        flag = true;
        zzo1 = null;
        Object obj1 = zzOD;
        obj1;
        JVM INSTR monitorenter ;
        if (zzOA == -1L || zzOA != l)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        zzNy.zzb("request %d completed", new Object[] {
            Long.valueOf(zzOA)
        });
        zzo1 = zzOC;
        zzks();
_L2:
        if (zzo1 != null)
        {
            zzo1.zza(l, i, obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean zzc(long l, int i)
    {
        return zzb(l, i, null);
    }

    public boolean zzd(long l, int i)
    {
        long l1;
        boolean flag;
        flag = true;
        l1 = 0L;
        Object obj1 = zzOD;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        if (zzOA == -1L || l - zzOB < zzOz)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        zzNy.zzb("request %d timed out", new Object[] {
            Long.valueOf(zzOA)
        });
        l = zzOA;
        obj = zzOC;
        zzks();
_L2:
        if (obj != null)
        {
            ((zzo) (obj)).zza(l, i, null);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        flag = false;
        obj = null;
        l = l1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean zzkt()
    {
        Object obj = zzOD;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzOA != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzz(long l)
    {
        Object obj = zzOD;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzOA != -1L && zzOA == l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
