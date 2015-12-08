// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import android.util.Log;

// Referenced classes of package de.greenrobot.event:
//            h, c

final class b
    implements Runnable
{

    final h a = new h();
    final c b;
    volatile boolean c;

    b(c c1)
    {
        b = c1;
    }

    public final void run()
    {
_L4:
        g g1 = a.b();
        g g = g1;
        if (g1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        g = a.a();
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        c = false;
        this;
        JVM INSTR monitorexit ;
        c = false;
        return;
        this;
        JVM INSTR monitorexit ;
_L2:
        b.a(g);
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        Log.w("Event", (new StringBuilder()).append(Thread.currentThread().getName()).append(" was interruppted").toString(), ((Throwable) (obj)));
        c = false;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        c = false;
        throw obj;
    }
}
