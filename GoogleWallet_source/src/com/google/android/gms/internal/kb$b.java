// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            kb

public abstract class VU
{

    final kb VT;
    private boolean VU;
    private Object mListener;

    protected abstract void i(Object obj);

    protected abstract void iQ();

    public final void iR()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = mListener;
        if (VU)
        {
            Log.w("GmsClient", (new StringBuilder("Callback proxy ")).append(this).append(" being reused. This is not safe.").toString());
        }
        this;
        JVM INSTR monitorexit ;
        Object obj1;
        if (obj != null)
        {
            try
            {
                i(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                iQ();
                throw obj1;
            }
        } else
        {
            iQ();
        }
        this;
        JVM INSTR monitorenter ;
        VU = true;
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

    public final void iS()
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

    public final void unregister()
    {
        iS();
        synchronized (kb.b(VT))
        {
            kb.b(VT).remove(this);
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (kb kb1, Object obj)
    {
        VT = kb1;
        super();
        mListener = obj;
        VU = false;
    }
}
