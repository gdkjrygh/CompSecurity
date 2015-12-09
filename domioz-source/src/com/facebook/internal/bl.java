// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.q;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.internal:
//            bo, bm, bn

public class bl
{

    static final boolean a;
    private final Object b;
    private bo c;
    private final int d;
    private final Executor e;
    private bo f;
    private int g;

    public bl()
    {
        this(8);
    }

    public bl(int i)
    {
        this(i, q.d());
    }

    private bl(int i, Executor executor)
    {
        b = new Object();
        f = null;
        g = 0;
        d = i;
        e = executor;
    }

    static void a(bl bl1, bo bo1)
    {
        bl1.a(bo1);
    }

    private void a(bo bo1)
    {
        bo bo2 = null;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (bo1 == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        f = bo1.a(f);
        g = g - 1;
        bo1 = bo2;
        if (g >= d)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        bo2 = c;
        bo1 = bo2;
        if (bo2 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        c = bo2.a(c);
        f = bo2.a(f, false);
        g = g + 1;
        bo2.b();
        bo1 = bo2;
        obj;
        JVM INSTR monitorexit ;
        if (bo1 != null)
        {
            e.execute(new bm(this, bo1));
        }
        return;
        bo1;
        obj;
        JVM INSTR monitorexit ;
        throw bo1;
    }

    public final bn a(Runnable runnable)
    {
        bo bo1 = new bo(this, runnable);
        synchronized (b)
        {
            c = bo1.a(c, true);
        }
        a(((bo) (null)));
        return bo1;
        exception;
        runnable;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!com/facebook/internal/bl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
