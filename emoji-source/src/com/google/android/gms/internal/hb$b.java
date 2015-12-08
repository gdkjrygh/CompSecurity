// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            hb

protected abstract class Gj
{

    final hb Gi;
    private boolean Gj;
    private Object mListener;

    protected abstract void d(Object obj);

    protected abstract void fu();

    public void fv()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = mListener;
        if (Gj)
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
                d(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                fu();
                throw obj1;
            }
        } else
        {
            fu();
        }
        this;
        JVM INSTR monitorenter ;
        Gj = true;
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

    public void fw()
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

    public void unregister()
    {
        fw();
        synchronized (hb.b(Gi))
        {
            hb.b(Gi).remove(this);
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (hb hb1, Object obj)
    {
        Gi = hb1;
        super();
        mListener = obj;
        Gj = false;
    }
}
