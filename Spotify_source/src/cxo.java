// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

final class cxo
    implements cxr, Runnable
{

    private final Set a;
    private final Executor b;

    private cxo()
    {
        a = new HashSet();
        b = Executors.newSingleThreadExecutor();
    }

    cxo(byte byte0)
    {
        this();
    }

    public final void a()
    {
        b.execute(this);
    }

    public final void run()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_36;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }
}
