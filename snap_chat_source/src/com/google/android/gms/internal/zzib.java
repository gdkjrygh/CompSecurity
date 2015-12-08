// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            zzia

public class zzib
    implements zzia
{
    class zza
    {

        public final zzia.zzd zzzN;
        public final zzia.zza zzzO;
        final zzib zzzP;

        public zza(zzia.zzd zzd, zzia.zza zza1)
        {
            zzzP = zzib.this;
            super();
            zzzN = zzd;
            zzzO = zza1;
        }
    }


    private final Object zznh = new Object();
    protected int zzrX;
    protected final BlockingQueue zzzL = new LinkedBlockingQueue();
    protected Object zzzM;

    public zzib()
    {
        zzrX = 0;
    }

    public int getStatus()
    {
        return zzrX;
    }

    public void reject()
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (zzrX != 0)
        {
            throw new UnsupportedOperationException();
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzrX = -1;
        for (Iterator iterator = zzzL.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzzO.run()) { }
        obj;
        JVM INSTR monitorexit ;
    }

    public void zza(zzia.zzd zzd, zzia.zza zza1)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (zzrX != 1) goto _L2; else goto _L1
_L1:
        zzd.zza(zzzM);
_L5:
        return;
_L2:
        if (zzrX != -1) goto _L4; else goto _L3
_L3:
        zza1.run();
          goto _L5
        zzd;
        obj;
        JVM INSTR monitorexit ;
        throw zzd;
_L4:
        if (zzrX != 0) goto _L5; else goto _L6
_L6:
        zzzL.add(new zza(zzd, zza1));
          goto _L5
    }

    public void zzc(Object obj)
    {
        Object obj1 = zznh;
        obj1;
        JVM INSTR monitorenter ;
        if (zzrX != 0)
        {
            throw new UnsupportedOperationException();
        }
        break MISSING_BLOCK_LABEL_27;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        zzzM = obj;
        zzrX = 1;
        for (Iterator iterator = zzzL.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzzN.zza(obj)) { }
        obj1;
        JVM INSTR monitorexit ;
    }
}
