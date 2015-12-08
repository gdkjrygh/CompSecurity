// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzak, zzhx

public class zzal
{

    private final Object zznh = new Object();
    private int zzog;
    private List zzoh;

    public zzal()
    {
        zzoh = new LinkedList();
    }

    public boolean zza(zzak zzak1)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (zzoh.contains(zzak1))
        {
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        zzak1;
        obj;
        JVM INSTR monitorexit ;
        throw zzak1;
    }

    public boolean zzb(zzak zzak1)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = zzoh.iterator();
_L2:
        zzak zzak2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_68;
            }
            zzak2 = (zzak)iterator.next();
        } while (zzak1 == zzak2);
        if (!zzak2.zzbm().equals(zzak1.zzbm())) goto _L2; else goto _L1
_L1:
        iterator.remove();
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        zzak1;
        obj;
        JVM INSTR monitorexit ;
        throw zzak1;
    }

    public zzak zzbs()
    {
        zzak zzak1;
label0:
        {
            zzak1 = null;
            synchronized (zznh)
            {
                if (zzoh.size() != 0)
                {
                    break label0;
                }
                zzhx.zzY("Queue empty");
            }
            return null;
        }
        if (zzoh.size() < 2)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        int i = 0x80000000;
        Iterator iterator = zzoh.iterator();
_L1:
        zzak zzak2;
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        zzak2 = (zzak)iterator.next();
        j = zzak2.getScore();
        if (j > i)
        {
            zzak1 = zzak2;
            i = j;
        }
          goto _L1
        zzoh.remove(zzak1);
        obj;
        JVM INSTR monitorexit ;
        return zzak1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception = (zzak)zzoh.get(0);
        exception.zzbn();
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }

    public void zzc(zzak zzak1)
    {
        synchronized (zznh)
        {
            if (zzoh.size() >= 10)
            {
                zzhx.zzY((new StringBuilder("Queue is full, current size = ")).append(zzoh.size()).toString());
                zzoh.remove(0);
            }
            int i = zzog;
            zzog = i + 1;
            zzak1.zzc(i);
            zzoh.add(zzak1);
        }
        return;
        zzak1;
        obj;
        JVM INSTR monitorexit ;
        throw zzak1;
    }
}
