// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            jl

protected abstract class MR
{

    final jl MQ;
    private boolean MR;
    private Object mListener;

    protected abstract void g(Object obj);

    protected abstract void hx();

    public void hy()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = mListener;
        if (MR)
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
                g(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                hx();
                throw obj1;
            }
        } else
        {
            hx();
        }
        this;
        JVM INSTR monitorenter ;
        MR = true;
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

    public void hz()
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
        hz();
        synchronized (jl.b(MQ))
        {
            jl.b(MQ).remove(this);
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (jl jl1, Object obj)
    {
        MQ = jl1;
        super();
        mListener = obj;
        MR = false;
    }
}
