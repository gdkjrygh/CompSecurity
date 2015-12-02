// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class c
{

    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final int i;
    private final int j;

    public c(int k)
    {
        this(0x7fffffff, k);
    }

    public c(int k, int l)
    {
        this(k, l, 0);
    }

    public c(int k, int l, int i1)
    {
        if (k <= 0)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (l <= 0)
        {
            throw new IllegalArgumentException("maxEntries <= 0");
        } else
        {
            i = i1;
            c = k;
            j = l;
            a = new LinkedHashMap(0, 0.75F, true);
            return;
        }
    }

    private int c(Object obj, Object obj1)
    {
        int k = b(obj, obj1);
        if (k < 0)
        {
            throw new IllegalStateException((new StringBuilder()).append("Negative size: ").append(obj).append("=").append(obj1).toString());
        } else
        {
            return k;
        }
    }

    private void e(int k)
    {
        this;
        JVM INSTR monitorenter ;
        if (b > k)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        int l = 0;
_L2:
        this;
        JVM INSTR monitorenter ;
        if (b < 0 || a.isEmpty() && b != 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getName()).append(".sizeOf() is reporting inconsistent results!").toString());
        }
        break MISSING_BLOCK_LABEL_87;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if ((l < i || b > k) && !a.isEmpty())
        {
            break MISSING_BLOCK_LABEL_123;
        }
        this;
        JVM INSTR monitorexit ;
        c(l);
        return;
        Object obj;
        Object obj1;
        obj1 = (java.util.Map.Entry)a.entrySet().iterator().next();
        obj = ((java.util.Map.Entry) (obj1)).getKey();
        obj1 = ((java.util.Map.Entry) (obj1)).getValue();
        a.remove(obj);
        b = b - c(obj, obj1);
        d(b);
        f = f + 1;
        this;
        JVM INSTR monitorexit ;
        a(true, obj, obj1, null);
        l++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void f(int k)
    {
        this;
        JVM INSTR monitorenter ;
        if (a.size() > k)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        int l = 0;
_L2:
        this;
        JVM INSTR monitorenter ;
        if ((l < i || a.size() > k) && !a.isEmpty())
        {
            break MISSING_BLOCK_LABEL_67;
        }
        this;
        JVM INSTR monitorexit ;
        c(l);
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
        d(b);
        f = f + 1;
        this;
        JVM INSTR monitorexit ;
        a(true, obj, obj1, null);
        l++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
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
            break MISSING_BLOCK_LABEL_48;
        }
        g = g + 1;
        a(1);
        this;
        JVM INSTR monitorexit ;
        return obj1;
        h = h + 1;
        b(1);
        this;
        JVM INSTR monitorexit ;
        obj1 = b(obj);
        if (obj1 == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_82;
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
            break MISSING_BLOCK_LABEL_134;
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
            e(c);
            return obj1;
        }
        b = b + c(obj, obj1);
        d(b);
          goto _L1
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Object a(Object obj, Object obj1)
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
        d(b);
        this;
        JVM INSTR monitorexit ;
        if (obj2 != null)
        {
            a(false, obj, obj2, obj1);
        }
        e(c);
        f(j);
        return obj2;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void a()
    {
        e(-1);
    }

    protected void a(int k)
    {
    }

    protected void a(boolean flag, Object obj, Object obj1, Object obj2)
    {
    }

    public final int b()
    {
        this;
        JVM INSTR monitorenter ;
        int k = a.size();
        this;
        JVM INSTR monitorexit ;
        return k;
        Exception exception;
        exception;
        throw exception;
    }

    protected int b(Object obj, Object obj1)
    {
        return 1;
    }

    protected Object b(Object obj)
    {
        return null;
    }

    protected void b(int k)
    {
    }

    protected void c(int k)
    {
    }

    protected void d(int k)
    {
    }

    public final String toString()
    {
        int k = 0;
        this;
        JVM INSTR monitorenter ;
        int l = g + h;
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        k = (g * 100) / l;
        String s = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] {
            Integer.valueOf(c), Integer.valueOf(g), Integer.valueOf(h), Integer.valueOf(k)
        });
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
