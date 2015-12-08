// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzk

public abstract class zzPU
{

    private Object mListener;
    final zzk zzPT;
    private boolean zzPU;

    public void unregister()
    {
        zzjh();
        synchronized (zzk.zzb(zzPT))
        {
            zzk.zzb(zzPT).remove(this);
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract void zzi(Object obj);

    protected abstract void zzjf();

    public void zzjg()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = mListener;
        if (zzPU)
        {
            (new StringBuilder("Callback proxy ")).append(this).append(" being reused. This is not safe.");
        }
        this;
        JVM INSTR monitorexit ;
        Object obj1;
        if (obj != null)
        {
            try
            {
                zzi(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                zzjf();
                throw obj1;
            }
        } else
        {
            zzjf();
        }
        this;
        JVM INSTR monitorenter ;
        zzPU = true;
        this;
        JVM INSTR monitorexit ;
        unregister();
        return;
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public void zzjh()
    {
        this;
        JVM INSTR monitorenter ;
        mListener = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (zzk zzk1, Object obj)
    {
        zzPT = zzk1;
        super();
        mListener = obj;
        zzPU = false;
    }
}
