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

    private final Map ahX = new HashMap();
    private final int ahY;
    private final l.a ahZ;
    private int aia;

    cz(int i, l.a a)
    {
        ahY = i;
        ahZ = a;
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
        aia = aia + ahZ.sizeOf(obj, obj1);
        if (aia > ahY)
        {
            Iterator iterator = ahX.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                aia = aia - ahZ.sizeOf(entry.getKey(), entry.getValue());
                iterator.remove();
            } while (aia > ahY);
        }
        ahX.put(obj, obj1);
        this;
        JVM INSTR monitorexit ;
    }

    public Object get(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = ahX.get(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }
}
