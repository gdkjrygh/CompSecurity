// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.content.Context;

// Referenced classes of package com.crashlytics.android.internal:
//            cq

public abstract class ci
{

    private Context a;
    private boolean b;

    public ci()
    {
    }

    protected final void b(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        throw new IllegalArgumentException("context cannot be null.");
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        a = new cq(context.getApplicationContext(), y());
        b = true;
        e();
          goto _L1
    }

    protected abstract void e();

    public final Context w()
    {
        return a;
    }

    public final boolean x()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final String y()
    {
        return getClass().getSimpleName().toLowerCase();
    }
}
