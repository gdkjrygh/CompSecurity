// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ai

public class aj
{

    private final Object a = new Object();
    private int b;
    private List c;

    public aj()
    {
        c = new LinkedList();
    }

    public ai a()
    {
        ai ai1;
label0:
        {
            ai1 = null;
            synchronized (a)
            {
                if (c.size() != 0)
                {
                    break label0;
                }
                zzb.zzaC("Queue empty");
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
        ai ai2;
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        ai2 = (ai)iterator.next();
        j = ai2.g();
        if (j > i)
        {
            ai1 = ai2;
            i = j;
        }
          goto _L1
        c.remove(ai1);
        obj;
        JVM INSTR monitorexit ;
        return ai1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception = (ai)c.get(0);
        exception.c();
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }

    public boolean a(ai ai1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (c.contains(ai1))
        {
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        ai1;
        obj;
        JVM INSTR monitorexit ;
        throw ai1;
    }

    public boolean b(ai ai1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = c.iterator();
_L2:
        ai ai2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_68;
            }
            ai2 = (ai)iterator.next();
        } while (ai1 == ai2);
        if (!ai2.b().equals(ai1.b())) goto _L2; else goto _L1
_L1:
        iterator.remove();
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        ai1;
        obj;
        JVM INSTR monitorexit ;
        throw ai1;
    }

    public void c(ai ai1)
    {
        synchronized (a)
        {
            if (c.size() >= 10)
            {
                zzb.zzaC((new StringBuilder()).append("Queue is full, current size = ").append(c.size()).toString());
                c.remove(0);
            }
            int i = b;
            b = i + 1;
            ai1.a(i);
            c.add(ai1);
        }
        return;
        ai1;
        obj;
        JVM INSTR monitorexit ;
        throw ai1;
    }
}
