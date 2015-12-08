// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.m4b.maps.j:
//            l

public abstract class b
{

    private Object a;
    private boolean b;
    private l c;

    protected abstract void a(Object obj);

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = a;
        if (b)
        {
            String s = String.valueOf(this);
            Log.w("GmsClient", (new StringBuilder(String.valueOf(s).length() + 47)).append("Callback proxy ").append(s).append(" being reused. This is not safe.").toString());
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
        synchronized (l.c(c))
        {
            l.c(c).remove(this);
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

    public (l l1, Object obj)
    {
        c = l1;
        super();
        a = obj;
        b = false;
    }
}
