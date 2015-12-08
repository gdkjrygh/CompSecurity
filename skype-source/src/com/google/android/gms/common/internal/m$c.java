// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.internal:
//            m

protected abstract class b
{

    private Object a;
    private boolean b;
    final m d;

    protected abstract void a(Object obj);

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = a;
        if (b)
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
                a(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
        }
        this;
        JVM INSTR monitorenter ;
        b = true;
        this;
        JVM INSTR monitorexit ;
        c();
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

    public final void c()
    {
        d();
        synchronized (m.c(d))
        {
            m.c(d).remove(this);
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        a = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (m m1, Object obj)
    {
        d = m1;
        super();
        a = obj;
        b = false;
    }
}
