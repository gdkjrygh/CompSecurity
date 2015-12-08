// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

public final class hqn
{

    final AtomicInteger a = new AtomicInteger();
    private final SparseArray b = new SparseArray();

    hqn()
    {
    }

    public final hqo a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        hqo hqo1 = (hqo)b.get(i);
        this;
        JVM INSTR monitorexit ;
        return hqo1;
        Exception exception;
        exception;
        throw exception;
    }

    final hqo a(Context context, int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (b.get(i) != null)
        {
            throw new IllegalStateException((new StringBuilder(38)).append("Already created state for: ").append(i).toString());
        }
        break MISSING_BLOCK_LABEL_47;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        context = new hqo(context, i);
        b.put(i, context);
        this;
        JVM INSTR monitorexit ;
        return context;
    }
}
