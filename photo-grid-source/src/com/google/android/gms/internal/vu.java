// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class vu
{

    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    private int b(Object obj, Object obj1)
    {
        int i = a(obj1);
        if (i < 0)
        {
            throw new IllegalStateException((new StringBuilder("Negative size: ")).append(obj).append("=").append(obj1).toString());
        } else
        {
            return i;
        }
    }

    protected int a(Object obj)
    {
        return 1;
    }

    public final Object a(Object obj, Object obj1)
    {
        if (obj1 == null)
        {
            throw new NullPointerException("key == null || value == null");
        }
        this;
        JVM INSTR monitorenter ;
        d = d + 1;
        b = b + b(obj, obj1);
        obj1 = a.put(obj, obj1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        b = b - b(obj, obj1);
        this;
        JVM INSTR monitorexit ;
        a(c);
        return obj1;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void a(int i)
    {
_L1:
        this;
        JVM INSTR monitorenter ;
        if (b < 0 || a.isEmpty() && b != 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getName()).append(".sizeOf() is reporting inconsistent results!").toString());
        }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (b > i && !a.isEmpty())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj1 = (java.util.Map.Entry)a.entrySet().iterator().next();
        Object obj = ((java.util.Map.Entry) (obj1)).getKey();
        obj1 = ((java.util.Map.Entry) (obj1)).getValue();
        a.remove(obj);
        b = b - b(obj, obj1);
        e = e + 1;
        this;
        JVM INSTR monitorexit ;
          goto _L1
    }

    public final Object b(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = a.get(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        f = f + 1;
        this;
        JVM INSTR monitorexit ;
        return obj;
        g = g + 1;
        this;
        JVM INSTR monitorexit ;
        return null;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final String toString()
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        int j = f + g;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        i = (f * 100) / j;
        String s = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] {
            Integer.valueOf(c), Integer.valueOf(f), Integer.valueOf(g), Integer.valueOf(i)
        });
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
