// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzab

public class zzac
{

    private final Object zzoe = new Object();
    private int zzpd;
    private List zzpe;

    public zzac()
    {
        zzpe = new LinkedList();
    }

    public boolean zza(zzab zzab1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zzpe.contains(zzab1))
        {
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        zzab1;
        obj;
        JVM INSTR monitorexit ;
        throw zzab1;
    }

    public boolean zzb(zzab zzab1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = zzpe.iterator();
_L2:
        zzab zzab2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_68;
            }
            zzab2 = (zzab)iterator.next();
        } while (zzab1 == zzab2);
        if (!zzab2.zzbs().equals(zzab1.zzbs())) goto _L2; else goto _L1
_L1:
        iterator.remove();
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        zzab1;
        obj;
        JVM INSTR monitorexit ;
        throw zzab1;
    }

    public zzab zzby()
    {
        zzab zzab1;
label0:
        {
            zzab1 = null;
            synchronized (zzoe)
            {
                if (zzpe.size() != 0)
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.zzb.zzaj("Queue empty");
            }
            return null;
        }
        if (zzpe.size() < 2)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        int i = 0x80000000;
        Iterator iterator = zzpe.iterator();
_L1:
        zzab zzab2;
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        zzab2 = (zzab)iterator.next();
        j = zzab2.getScore();
        if (j > i)
        {
            zzab1 = zzab2;
            i = j;
        }
          goto _L1
        zzpe.remove(zzab1);
        obj;
        JVM INSTR monitorexit ;
        return zzab1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception = (zzab)zzpe.get(0);
        exception.zzbt();
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }

    public void zzc(zzab zzab1)
    {
        synchronized (zzoe)
        {
            if (zzpe.size() >= 10)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaj((new StringBuilder()).append("Queue is full, current size = ").append(zzpe.size()).toString());
                zzpe.remove(0);
            }
            int i = zzpd;
            zzpd = i + 1;
            zzab1.zzc(i);
            zzpe.add(zzab1);
        }
        return;
        zzab1;
        obj;
        JVM INSTR monitorexit ;
        throw zzab1;
    }
}
