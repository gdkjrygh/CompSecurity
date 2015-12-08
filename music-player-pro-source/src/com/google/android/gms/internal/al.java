// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            gr, ak

public class al
{

    private final Object mH = new Object();
    private List nA;
    private int nz;

    public al()
    {
        nA = new LinkedList();
    }

    public boolean a(ak ak1)
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        if (nA.contains(ak1))
        {
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        ak1;
        obj;
        JVM INSTR monitorexit ;
        throw ak1;
    }

    public ak aZ()
    {
        ak ak1;
label0:
        {
            ak1 = null;
            synchronized (mH)
            {
                if (nA.size() != 0)
                {
                    break label0;
                }
                gr.S("Queue empty");
            }
            return null;
        }
        if (nA.size() < 2)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        int i = 0x80000000;
        Iterator iterator = nA.iterator();
_L1:
        ak ak2;
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        ak2 = (ak)iterator.next();
        j = ak2.getScore();
        if (j > i)
        {
            ak1 = ak2;
            i = j;
        }
          goto _L1
        nA.remove(ak1);
        obj;
        JVM INSTR monitorexit ;
        return ak1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception = (ak)nA.get(0);
        exception.aU();
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }

    public boolean b(ak ak1)
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = nA.iterator();
_L2:
        ak ak2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_73;
            }
            ak2 = (ak)iterator.next();
        } while (ak1 == ak2);
        if (!ak2.aT().equals(ak1.aT())) goto _L2; else goto _L1
_L1:
        nA.remove(ak1);
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        ak1;
        obj;
        JVM INSTR monitorexit ;
        throw ak1;
    }

    public void c(ak ak1)
    {
        synchronized (mH)
        {
            if (nA.size() >= 10)
            {
                gr.S((new StringBuilder()).append("Queue is full, current size = ").append(nA.size()).toString());
                nA.remove(0);
            }
            int i = nz;
            nz = i + 1;
            ak1.c(i);
            nA.add(ak1);
        }
        return;
        ak1;
        obj;
        JVM INSTR monitorexit ;
        throw ak1;
    }
}
