// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.d.a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class l
{

    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public l(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        } else
        {
            c = i;
            a = new LinkedHashMap(0, 0.75F, true);
            return;
        }
    }

    private void a(int i)
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
        if (b > i)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        if (a.entrySet().size() <= 0)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        obj = (java.util.Map.Entry)a.entrySet().iterator().next();
_L2:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1 = ((java.util.Map.Entry) (obj)).getKey();
        obj = ((java.util.Map.Entry) (obj)).getValue();
        a.remove(obj1);
        b = b - c(obj1, obj);
        e = e + 1;
        this;
        JVM INSTR monitorexit ;
        a(true, obj1, obj, null);
          goto _L1
        obj = null;
          goto _L2
    }

    private int c(Object obj, Object obj1)
    {
        int i = a(obj, obj1);
        if (i < 0)
        {
            throw new IllegalStateException((new StringBuilder("Negative size: ")).append(obj).append("=").append(obj1).toString());
        } else
        {
            return i;
        }
    }

    protected int a(Object obj, Object obj1)
    {
        return 1;
    }

    public final Object a(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("key == null");
        }
        this;
        JVM INSTR monitorenter ;
        obj = a.get(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_43;
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
        throw obj;
    }

    public final void a()
    {
        a(-1);
    }

    protected void a(boolean flag, Object obj, Object obj1, Object obj2)
    {
    }

    public final Object b(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            throw new NullPointerException("key == null || value == null");
        }
        this;
        JVM INSTR monitorenter ;
        Object obj2;
        d = d + 1;
        b = b + c(obj, obj1);
        obj2 = a.put(obj, obj1);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        b = b - c(obj, obj2);
        this;
        JVM INSTR monitorexit ;
        if (obj2 != null)
        {
            a(false, obj, obj2, obj1);
        }
        a(c);
        return obj2;
        obj;
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
