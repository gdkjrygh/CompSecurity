// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;

import com.facebook.common.executors.a;
import com.facebook.debug.log.b;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.ui.images.b:
//            d

public class c
    implements Executor
{

    private static final Class a = com/facebook/ui/images/b/c;
    private final a b;
    private final List c = hq.a();

    public c(a a1)
    {
        b = a1;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = hq.a(c);
        c.clear();
        this;
        JVM INSTR monitorexit ;
        com.facebook.debug.log.b.a(a, "Running %d runnables", new Object[] {
            Integer.valueOf(((List) (obj)).size())
        });
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Runnable)((Iterator) (obj)).next()).run()) { }
        break MISSING_BLOCK_LABEL_83;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(c c1)
    {
        c1.a();
    }

    public void execute(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        if (c.isEmpty())
        {
            b.a(new d(this), 50L);
        }
        c.add(runnable);
        this;
        JVM INSTR monitorexit ;
        return;
        runnable;
        throw runnable;
    }

}
