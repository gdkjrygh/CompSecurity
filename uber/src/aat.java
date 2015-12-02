// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class aat
{

    private final Object a = new Object();
    private int b;
    private List c;

    public aat()
    {
        c = new LinkedList();
    }

    public final aas a()
    {
        aas aas1;
label0:
        {
            aas1 = null;
            synchronized (a)
            {
                if (c.size() != 0)
                {
                    break label0;
                }
                of.a("Queue empty");
            }
            return null;
        }
        if (c.size() < 2)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        int i = 0x80000000;
        Iterator iterator = c.iterator();
_L1:
        aas aas2;
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        aas2 = (aas)iterator.next();
        j = aas2.g();
        if (j > i)
        {
            aas1 = aas2;
            i = j;
        }
          goto _L1
        c.remove(aas1);
        obj;
        JVM INSTR monitorexit ;
        return aas1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception = (aas)c.get(0);
        exception.c();
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }

    public final boolean a(aas aas1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (c.contains(aas1))
        {
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        aas1;
        obj;
        JVM INSTR monitorexit ;
        throw aas1;
    }

    public final boolean b(aas aas1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = c.iterator();
_L2:
        aas aas2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_68;
            }
            aas2 = (aas)iterator.next();
        } while (aas1 == aas2);
        if (!aas2.b().equals(aas1.b())) goto _L2; else goto _L1
_L1:
        iterator.remove();
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        aas1;
        obj;
        JVM INSTR monitorexit ;
        throw aas1;
    }

    public final void c(aas aas1)
    {
        synchronized (a)
        {
            if (c.size() >= 10)
            {
                of.a((new StringBuilder("Queue is full, current size = ")).append(c.size()).toString());
                c.remove(0);
            }
            int i = b;
            b = i + 1;
            aas1.a(i);
            c.add(aas1);
        }
        return;
        aas1;
        obj;
        JVM INSTR monitorexit ;
        throw aas1;
    }
}
