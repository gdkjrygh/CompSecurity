// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            gl

final class hb
{

    private final Object a = new Object();
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private boolean d;

    public hb()
    {
        d = false;
    }

    public final void a()
    {
label0:
        {
            synchronized (a)
            {
                if (!d)
                {
                    break label0;
                }
            }
            return;
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext(); com.google.android.gms.internal.gl.a((Runnable)iterator.next())) { }
        break MISSING_BLOCK_LABEL_57;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Runnable runnable;
        for (Iterator iterator1 = c.iterator(); iterator1.hasNext(); a.a.post(runnable))
        {
            runnable = (Runnable)iterator1.next();
        }

        b.clear();
        c.clear();
        d = true;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(Runnable runnable)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!d)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        com.google.android.gms.internal.gl.a(runnable);
_L2:
        return;
        b.add(runnable);
        if (true) goto _L2; else goto _L1
_L1:
        runnable;
        obj;
        JVM INSTR monitorexit ;
        throw runnable;
    }
}
