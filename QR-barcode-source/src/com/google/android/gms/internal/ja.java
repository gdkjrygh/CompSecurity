// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class ja
{

    private final LinkedHashMap Mj;
    private int Mk;
    private int Ml;
    private int Mm;
    private int Mn;
    private int Mo;
    private int Mp;
    private int size;

    public ja(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        } else
        {
            Mk = i;
            Mj = new LinkedHashMap(0, 0.75F, true);
            return;
        }
    }

    private int c(Object obj, Object obj1)
    {
        int i = sizeOf(obj, obj1);
        if (i < 0)
        {
            throw new IllegalStateException((new StringBuilder()).append("Negative size: ").append(obj).append("=").append(obj1).toString());
        } else
        {
            return i;
        }
    }

    protected Object create(Object obj)
    {
        return null;
    }

    protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
    }

    public final void evictAll()
    {
        trimToSize(-1);
    }

    public final Object get(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("key == null");
        }
        this;
        JVM INSTR monitorenter ;
        Object obj1 = Mj.get(obj);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        Mo = Mo + 1;
        this;
        JVM INSTR monitorexit ;
        return obj1;
        Mp = Mp + 1;
        this;
        JVM INSTR monitorexit ;
        obj1 = create(obj);
        if (obj1 == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_72;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        this;
        JVM INSTR monitorenter ;
        Object obj2;
        Mm = Mm + 1;
        obj2 = Mj.put(obj, obj1);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        Mj.put(obj, obj2);
_L1:
        this;
        JVM INSTR monitorexit ;
        if (obj2 != null)
        {
            entryRemoved(false, obj, obj1, obj2);
            return obj2;
        } else
        {
            trimToSize(Mk);
            return obj1;
        }
        size = size + c(obj, obj1);
          goto _L1
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final Object put(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            throw new NullPointerException("key == null || value == null");
        }
        this;
        JVM INSTR monitorenter ;
        Object obj2;
        Ml = Ml + 1;
        size = size + c(obj, obj1);
        obj2 = Mj.put(obj, obj1);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        size = size - c(obj, obj2);
        this;
        JVM INSTR monitorexit ;
        if (obj2 != null)
        {
            entryRemoved(false, obj, obj2, obj1);
        }
        trimToSize(Mk);
        return obj2;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final int size()
    {
        this;
        JVM INSTR monitorenter ;
        int i = size;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    protected int sizeOf(Object obj, Object obj1)
    {
        return 1;
    }

    public final String toString()
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        int j = Mo + Mp;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        i = (Mo * 100) / j;
        String s = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] {
            Integer.valueOf(Mk), Integer.valueOf(Mo), Integer.valueOf(Mp), Integer.valueOf(i)
        });
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void trimToSize(int i)
    {
_L2:
        this;
        JVM INSTR monitorenter ;
        if (size < 0 || Mj.isEmpty() && size != 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getName()).append(".sizeOf() is reporting inconsistent results!").toString());
        }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (size > i && !Mj.isEmpty())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        Object obj1;
        obj1 = (java.util.Map.Entry)Mj.entrySet().iterator().next();
        obj = ((java.util.Map.Entry) (obj1)).getKey();
        obj1 = ((java.util.Map.Entry) (obj1)).getValue();
        Mj.remove(obj);
        size = size - c(obj, obj1);
        Mn = Mn + 1;
        this;
        JVM INSTR monitorexit ;
        entryRemoved(true, obj, obj1, null);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
