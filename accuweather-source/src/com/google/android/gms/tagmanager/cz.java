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

class cz
    implements k
{

    private final Map ahU = new HashMap();
    private final int ahV;
    private final l.a ahW;
    private int ahX;

    cz(int i, l.a a)
    {
        ahV = i;
        ahW = a;
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
        ahX = ahX + ahW.sizeOf(obj, obj1);
        if (ahX > ahV)
        {
            Iterator iterator = ahU.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                ahX = ahX - ahW.sizeOf(entry.getKey(), entry.getValue());
                iterator.remove();
            } while (ahX > ahV);
        }
        ahU.put(obj, obj1);
        this;
        JVM INSTR monitorexit ;
    }

    public Object get(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = ahU.get(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }
}
