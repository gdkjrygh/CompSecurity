// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            k

class da
    implements k
{

    private final Map atM = new HashMap();
    private final int atN;
    private final l.a atO;
    private int atP;

    da(int i, l.a a)
    {
        atN = i;
        atO = a;
    }

    public void e(Object obj, Object obj1)
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
        atP = atP + atO.sizeOf(obj, obj1);
        if (atP > atN)
        {
            Iterator iterator = atM.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                atP = atP - atO.sizeOf(entry.getKey(), entry.getValue());
                iterator.remove();
            } while (atP > atN);
        }
        atM.put(obj, obj1);
        this;
        JVM INSTR monitorexit ;
    }

    public Object get(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = atM.get(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }
}
