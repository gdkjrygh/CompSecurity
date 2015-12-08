// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class kxt
{

    private final Object a = new Object();
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private boolean d;

    public kxt()
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
        for (Iterator iterator = b.iterator(); iterator.hasNext(); kwv.a((Runnable)iterator.next())) { }
        break MISSING_BLOCK_LABEL_57;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Runnable runnable;
        for (Iterator iterator1 = c.iterator(); iterator1.hasNext(); jpx.a.post(runnable))
        {
            runnable = (Runnable)iterator1.next();
        }

        b.clear();
        c.clear();
        d = true;
        obj;
        JVM INSTR monitorexit ;
    }
}
