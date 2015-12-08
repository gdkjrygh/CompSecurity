// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzi

protected abstract class zzaay
{

    private Object mListener;
    final zzi zzaax;
    private boolean zzaay;

    public void unregister()
    {
        zznR();
        synchronized (zzi.zzc(zzaax))
        {
            zzi.zzc(zzaax).remove(this);
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract void zznP();

    public void zznQ()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = mListener;
        if (zzaay)
        {
            Log.w("GmsClient", (new StringBuilder()).append("Callback proxy ").append(this).append(" being reused. This is not safe.").toString());
        }
        this;
        JVM INSTR monitorexit ;
        Object obj1;
        if (obj != null)
        {
            try
            {
                zzr(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                zznP();
                throw obj1;
            }
        } else
        {
            zznP();
        }
        this;
        JVM INSTR monitorenter ;
        zzaay = true;
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

    public void zznR()
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

    protected abstract void zzr(Object obj);

    public (zzi zzi1, Object obj)
    {
        zzaax = zzi1;
        super();
        mListener = obj;
        zzaay = false;
    }
}
