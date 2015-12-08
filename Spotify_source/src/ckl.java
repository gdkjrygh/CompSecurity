// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ckl
{

    final Object a = new Object();
    final List b = new ArrayList();
    boolean c;
    private final List d = new ArrayList();

    public ckl()
    {
        c = false;
    }

    static void b(Runnable runnable)
    {
        bjz.a.post(runnable);
    }

    public final void a()
    {
label0:
        {
            synchronized (a)
            {
                if (!c)
                {
                    break label0;
                }
            }
            return;
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext(); cji.a((Runnable)iterator.next())) { }
        break MISSING_BLOCK_LABEL_57;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        for (Iterator iterator1 = b.iterator(); iterator1.hasNext(); b((Runnable)iterator1.next())) { }
        d.clear();
        b.clear();
        c = true;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(Runnable runnable)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        cji.a(runnable);
_L2:
        return;
        d.add(runnable);
        if (true) goto _L2; else goto _L1
_L1:
        runnable;
        obj;
        JVM INSTR monitorexit ;
        throw runnable;
    }
}
