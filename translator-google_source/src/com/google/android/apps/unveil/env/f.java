// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.unveil.env:
//            g

public abstract class f
{

    boolean a;

    public f()
    {
    }

    public abstract Object a();

    public abstract void a(Object obj);

    public final void a(Executor executor, Handler handler)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        executor.execute(new g(this, handler));
        if (true) goto _L1; else goto _L3
_L3:
        executor;
        throw executor;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        a = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        a = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
