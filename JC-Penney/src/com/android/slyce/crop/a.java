// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import java.util.Iterator;
import java.util.WeakHashMap;

// Referenced classes of package com.android.slyce.crop:
//            e, d, c

public class a
{

    private static a b = null;
    private final WeakHashMap a = new WeakHashMap();

    private a()
    {
    }

    public static a a()
    {
        com/android/slyce/crop/a;
        JVM INSTR monitorenter ;
        a a1;
        if (b == null)
        {
            b = new a();
        }
        a1 = b;
        com/android/slyce/crop/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    private e b(Thread thread)
    {
        this;
        JVM INSTR monitorenter ;
        e e2 = (e)a.get(thread);
        e e1;
        e1 = e2;
        if (e2 != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        e1 = new e(null);
        a.put(thread, e1);
        this;
        JVM INSTR monitorexit ;
        return e1;
        thread;
        throw thread;
    }

    public void a(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        for (d1 = d1.iterator(); d1.hasNext(); a((Thread)d1.next())) { }
        break MISSING_BLOCK_LABEL_37;
        d1;
        throw d1;
        this;
        JVM INSTR monitorexit ;
    }

    public void a(Thread thread)
    {
        this;
        JVM INSTR monitorenter ;
        thread = b(thread);
        thread.a = c.a;
        if (((e) (thread)).b != null)
        {
            ((e) (thread)).b.requestCancelDecode();
        }
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        thread;
        throw thread;
    }

}
