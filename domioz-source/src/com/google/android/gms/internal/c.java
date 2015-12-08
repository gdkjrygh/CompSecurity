// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            b, fj

public final class c
{

    private final Object a;
    private int b;
    private List c;

    public final boolean a(b b1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (c.contains(b1))
        {
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final boolean b(b b1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = c.iterator();
_L2:
        b b2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_68;
            }
            b2 = (b)iterator.next();
        } while (b1 == b2);
        if (!b2.b().equals(b1.b())) goto _L2; else goto _L1
_L1:
        iterator.remove();
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final void c(b b1)
    {
        synchronized (a)
        {
            if (c.size() >= 10)
            {
                fj.a((new StringBuilder("Queue is full, current size = ")).append(c.size()).toString());
                c.remove(0);
            }
            int i = b;
            b = i + 1;
            b1.a(i);
            c.add(b1);
        }
        return;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }
}
