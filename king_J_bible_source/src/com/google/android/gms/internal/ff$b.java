// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            ff

protected abstract class Di
{

    final ff Dh;
    private boolean Di;
    private Object mListener;

    protected abstract void a(Object obj);

    protected abstract void dx();

    public void eN()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = mListener;
        if (Di)
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
                dx();
                throw obj1;
            }
        } else
        {
            dx();
        }
        this;
        JVM INSTR monitorenter ;
        Di = true;
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

    public void eO()
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
        eO();
        synchronized (ff.b(Dh))
        {
            ff.b(Dh).remove(this);
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (ff ff1, Object obj)
    {
        Dh = ff1;
        super();
        mListener = obj;
        Di = false;
    }
}
