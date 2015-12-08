// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            de

protected abstract class kQ
{

    final de kP;
    private boolean kQ;
    private Object mListener;

    protected abstract void a(Object obj);

    protected abstract void aF();

    public void be()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = mListener;
        if (kQ)
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
                a(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                aF();
                throw obj1;
            }
        } else
        {
            aF();
        }
        this;
        JVM INSTR monitorenter ;
        kQ = true;
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

    public void bf()
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
        bf();
        synchronized (de.c(kP))
        {
            de.c(kP).remove(this);
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (de de1, Object obj)
    {
        kP = de1;
        super();
        mListener = obj;
        kQ = false;
    }
}
