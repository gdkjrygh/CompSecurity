// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            as, au, af, ag

class ap
    implements as, Runnable
{

    final af a;
    private final Set b;
    private final Executor c;

    private ap(af af)
    {
        a = af;
        super();
        b = new HashSet();
        c = Executors.newSingleThreadExecutor();
    }

    ap(af af, ag ag)
    {
        this(af);
    }

    public void a()
    {
        c.execute(this);
    }

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((au)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_43;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }
}
