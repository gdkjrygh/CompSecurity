// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.y;

public final class gr
{

    private HandlerThread a;
    private int b;
    private final Object c = new Object();

    public gr()
    {
        a = null;
        b = 0;
    }

    public final Looper a()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        Looper looper;
        Exception exception;
        boolean flag;
        if (b == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.b(flag, "Invalid state: mHandlerThread should already been initialized.");
        com.google.android.gms.ads.internal.util.client.b.a(2);
        a = new HandlerThread("LooperProvider");
        a.start();
        b = b + 1;
        looper = a.getLooper();
        obj;
        JVM INSTR monitorexit ;
        return looper;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        int i;
        boolean flag;
        if (b > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.b(flag, "Invalid state: release() called more times than expected.");
        i = b - 1;
        b = i;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        com.google.android.gms.ads.internal.util.client.b.a(2);
        a.quit();
        a = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
