// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ah

public final class ai
{

    private final Object a = new Object();
    private int b;
    private List c;

    public ai()
    {
        c = new LinkedList();
    }

    public final ah a()
    {
        ah ah1;
label0:
        {
            ah1 = null;
            synchronized (a)
            {
                if (c.size() != 0)
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.b.a(3);
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
        ah ah2;
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        ah2 = (ah)iterator.next();
        j = ah2.g();
        if (j > i)
        {
            ah1 = ah2;
            i = j;
        }
          goto _L1
        c.remove(ah1);
        obj;
        JVM INSTR monitorexit ;
        return ah1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception = (ah)c.get(0);
        exception.c();
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }

    public final boolean a(ah ah1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (c.contains(ah1))
        {
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        ah1;
        obj;
        JVM INSTR monitorexit ;
        throw ah1;
    }

    public final boolean b(ah ah1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = c.iterator();
_L2:
        ah ah2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_68;
            }
            ah2 = (ah)iterator.next();
        } while (ah1 == ah2);
        if (!ah2.b().equals(ah1.b())) goto _L2; else goto _L1
_L1:
        iterator.remove();
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        ah1;
        obj;
        JVM INSTR monitorexit ;
        throw ah1;
    }

    public final void c(ah ah1)
    {
        synchronized (a)
        {
            if (c.size() >= 10)
            {
                (new StringBuilder("Queue is full, current size = ")).append(c.size());
                com.google.android.gms.ads.internal.util.client.b.a(3);
                c.remove(0);
            }
            int i = b;
            b = i + 1;
            ah1.a(i);
            c.add(ah1);
        }
        return;
        ah1;
        obj;
        JVM INSTR monitorexit ;
        throw ah1;
    }
}
