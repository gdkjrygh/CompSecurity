// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzk

class zzcv
    implements zzk
{

    private final Map zzaAI = new HashMap();
    private final int zzaAJ;
    private final zzl.zza zzaAK;
    private int zzaAL;

    zzcv(int i, zzl.zza zza)
    {
        zzaAJ = i;
        zzaAK = zza;
    }

    public Object get(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = zzaAI.get(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }

    public void zze(Object obj, Object obj1)
    {
        this;
        JVM INSTR monitorenter ;
        if (obj != null && obj1 != null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        throw new NullPointerException("key == null || value == null");
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        zzaAL = zzaAL + zzaAK.sizeOf(obj, obj1);
        if (zzaAL > zzaAJ)
        {
            Iterator iterator = zzaAI.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                zzaAL = zzaAL - zzaAK.sizeOf(entry.getKey(), entry.getValue());
                iterator.remove();
            } while (zzaAL > zzaAJ);
        }
        zzaAI.put(obj, obj1);
        this;
        JVM INSTR monitorexit ;
    }
}
