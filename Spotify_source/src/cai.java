// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class cai
{

    final Object a = new Object();
    int b;
    List c;

    public cai()
    {
        c = new LinkedList();
    }

    public final cah a()
    {
        cah cah1;
label0:
        {
            cah1 = null;
            synchronized (a)
            {
                if (c.size() != 0)
                {
                    break label0;
                }
                bka.a("Queue empty");
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
        cah cah2;
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        cah2 = (cah)iterator.next();
        j = cah2.e;
        if (j > i)
        {
            cah1 = cah2;
            i = j;
        }
          goto _L1
        c.remove(cah1);
        obj1;
        JVM INSTR monitorexit ;
        return cah1;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        cah2 = (cah)c.get(0);
        synchronized (cah2.a)
        {
            cah2.e = cah2.e - 100;
        }
        obj1;
        JVM INSTR monitorexit ;
        return cah2;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public final boolean a(cah cah1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (c.contains(cah1))
        {
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        cah1;
        obj;
        JVM INSTR monitorexit ;
        throw cah1;
    }

    public final boolean b(cah cah1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = c.iterator();
_L2:
        cah cah2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_68;
            }
            cah2 = (cah)iterator.next();
        } while (cah1 == cah2);
        if (!cah2.f.equals(cah1.f)) goto _L2; else goto _L1
_L1:
        iterator.remove();
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        cah1;
        obj;
        JVM INSTR monitorexit ;
        throw cah1;
    }
}
