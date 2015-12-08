// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.internal:
//            aa

public abstract class ad
{

    private Object a;
    private boolean b;
    final aa d;

    public ad(aa aa1, Object obj)
    {
        d = aa1;
        super();
        a = obj;
        b = false;
    }

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
        synchronized (aa.c(d))
        {
            aa.c(d).remove(this);
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
}
