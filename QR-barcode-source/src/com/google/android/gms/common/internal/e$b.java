// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.internal:
//            e

protected abstract class LG
{

    final e LF;
    private boolean LG;
    private Object mListener;

    protected abstract void g(Object obj);

    protected abstract void gT();

    public void gU()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = mListener;
        if (LG)
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
                gT();
                throw obj1;
            }
        } else
        {
            gT();
        }
        this;
        JVM INSTR monitorenter ;
        LG = true;
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

    public void gV()
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
        gV();
        synchronized (e.b(LF))
        {
            e.b(LF).remove(this);
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (e e1, Object obj)
    {
        LF = e1;
        super();
        mListener = obj;
        LG = false;
    }
}
