// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.bl;

// Referenced classes of package com.google.android.gms.internal:
//            ra

public final class qz
{

    private HandlerThread a;
    private Handler b;
    private int c;
    private final Object d = new Object();

    public qz()
    {
        a = null;
        b = null;
        c = 0;
    }

    static Object a(qz qz1)
    {
        return qz1.d;
    }

    static int b(qz qz1)
    {
        return qz1.c;
    }

    public final Looper a()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (c != 0)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        if (a != null) goto _L2; else goto _L1
_L1:
        zzb.v("Starting the looper thread.");
        a = new HandlerThread("LooperProvider");
        a.start();
        b = new Handler(a.getLooper());
        zzb.v("Looper thread started.");
_L3:
        Looper looper;
        c = c + 1;
        looper = a.getLooper();
        return looper;
_L2:
        zzb.v("Resuming the looper thread");
        d.notifyAll();
          goto _L3
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        bl.a(a, "Invalid state: mHandlerThread should already been initialized.");
          goto _L3
    }

    public final void b()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        int i;
        boolean flag;
        if (c > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.b(flag, "Invalid state: release() called more times than expected.");
        i = c - 1;
        c = i;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        b.post(new ra(this));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
