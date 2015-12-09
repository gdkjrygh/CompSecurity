// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            zzfx

public class zzfy
    implements zzfx
{
    class a
    {

        public final zzfx.zzd a;
        public final zzfx.zza b;
        final zzfy c;

        public a(zzfx.zzd zzd1, zzfx.zza zza1)
        {
            c = zzfy.this;
            super();
            a = zzd1;
            b = zza1;
        }
    }


    protected final BlockingQueue zzCW = new LinkedBlockingQueue();
    protected Object zzCX;
    private final Object zzoe = new Object();
    protected int zzue;

    public zzfy()
    {
        zzue = 0;
    }

    public int getStatus()
    {
        return zzue;
    }

    public void reject()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zzue != 0)
        {
            throw new UnsupportedOperationException();
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzue = -1;
        for (Iterator iterator = zzCW.iterator(); iterator.hasNext(); ((a)iterator.next()).b.run()) { }
        zzCW.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public void zza(zzfx.zzd zzd1, zzfx.zza zza1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zzue != 1) goto _L2; else goto _L1
_L1:
        zzd1.zza(zzCX);
_L5:
        return;
_L2:
        if (zzue != -1) goto _L4; else goto _L3
_L3:
        zza1.run();
          goto _L5
        zzd1;
        obj;
        JVM INSTR monitorexit ;
        throw zzd1;
_L4:
        if (zzue != 0) goto _L5; else goto _L6
_L6:
        zzCW.add(new a(zzd1, zza1));
          goto _L5
    }

    public void zzd(Object obj)
    {
        Object obj1 = zzoe;
        obj1;
        JVM INSTR monitorenter ;
        if (zzue != 0)
        {
            throw new UnsupportedOperationException();
        }
        break MISSING_BLOCK_LABEL_27;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        zzCX = obj;
        zzue = 1;
        for (Iterator iterator = zzCW.iterator(); iterator.hasNext(); ((a)iterator.next()).a.zza(obj)) { }
        zzCW.clear();
        obj1;
        JVM INSTR monitorexit ;
    }
}
