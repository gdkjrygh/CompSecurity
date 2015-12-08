// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class n
{

    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public n(int i)
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
_L2:
        this;
        JVM INSTR monitorenter ;
        if (b >= 0 && (!a.isEmpty() || b == 0))
        {
            break MISSING_BLOCK_LABEL_29;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (b > i && !a.isEmpty())
        {
            break MISSING_BLOCK_LABEL_55;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj;
        Object obj1;
        obj1 = (java.util.Map.Entry)a.entrySet().iterator().next();
        obj = ((java.util.Map.Entry) (obj1)).getKey();
        obj1 = ((java.util.Map.Entry) (obj1)).getValue();
        a.remove(obj);
        b = b - c(obj, obj1);
        f = f + 1;
        this;
        JVM INSTR monitorexit ;
        a(true, obj, obj1, null);
        if (true) goto _L2; else goto _L1
_L1:
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
        Object obj1 = a.get(obj);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        g = g + 1;
        this;
        JVM INSTR monitorexit ;
        return obj1;
        h = h + 1;
        this;
        JVM INSTR monitorexit ;
        obj1 = b(obj);
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
        e = e + 1;
        obj2 = a.put(obj, obj1);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        a.put(obj, obj2);
_L1:
        this;
        JVM INSTR monitorexit ;
        if (obj2 != null)
        {
            a(false, obj, obj1, obj2);
            return obj2;
        } else
        {
            a(c);
            return obj1;
        }
        b = b + c(obj, obj1);
          goto _L1
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    protected void a(boolean flag, Object obj, Object obj1, Object obj2)
    {
    }

    protected Object b(Object obj)
    {
        return null;
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
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final String toString()
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        int j = g + h;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        i = (g * 100) / j;
        String s = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] {
            Integer.valueOf(c), Integer.valueOf(g), Integer.valueOf(h), Integer.valueOf(i)
        });
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
