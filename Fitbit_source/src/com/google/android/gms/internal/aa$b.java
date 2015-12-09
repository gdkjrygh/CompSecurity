// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            aa

protected abstract class c
{

    final aa a;
    private Object b;
    private boolean c;

    protected abstract void a();

    protected abstract void a(Object obj);

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = b;
        if (c)
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
                a();
                throw obj1;
            }
        } else
        {
            a();
        }
        this;
        JVM INSTR monitorenter ;
        c = true;
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

    public void c()
    {
        d();
        synchronized (aa.b(a))
        {
            aa.b(a).remove(this);
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        b = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (aa aa1, Object obj)
    {
        a = aa1;
        super();
        b = obj;
        c = false;
    }
}
