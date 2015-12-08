// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            bv

public final class bw
{

    private final Object a = new Object();
    private int b;
    private List c;

    public bw()
    {
        c = new LinkedList();
    }

    public final bv a()
    {
        bv bv1;
label0:
        {
            bv1 = null;
            synchronized (a)
            {
                if (c.size() != 0)
                {
                    break label0;
                }
                zzb.zzaF("Queue empty");
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
        bv bv2;
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        bv2 = (bv)iterator.next();
        j = bv2.g();
        if (j > i)
        {
            bv1 = bv2;
            i = j;
        }
          goto _L1
        c.remove(bv1);
        obj;
        JVM INSTR monitorexit ;
        return bv1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception = (bv)c.get(0);
        exception.c();
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }

    public final boolean a(bv bv1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (c.contains(bv1))
        {
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        bv1;
        obj;
        JVM INSTR monitorexit ;
        throw bv1;
    }

    public final boolean b(bv bv1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = c.iterator();
_L2:
        bv bv2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_68;
            }
            bv2 = (bv)iterator.next();
        } while (bv1 == bv2);
        if (!bv2.b().equals(bv1.b())) goto _L2; else goto _L1
_L1:
        iterator.remove();
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        bv1;
        obj;
        JVM INSTR monitorexit ;
        throw bv1;
    }

    public final void c(bv bv1)
    {
        synchronized (a)
        {
            if (c.size() >= 10)
            {
                zzb.zzaF((new StringBuilder("Queue is full, current size = ")).append(c.size()).toString());
                c.remove(0);
            }
            int i = b;
            b = i + 1;
            bv1.a(i);
            c.add(bv1);
        }
        return;
        bv1;
        obj;
        JVM INSTR monitorexit ;
        throw bv1;
    }
}
