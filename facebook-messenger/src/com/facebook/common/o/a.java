// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.o;

import java.lang.reflect.Array;

// Referenced classes of package com.facebook.common.o:
//            b

public class a
{

    private static final Class a = com/facebook/common/o/a;
    private final Class b;
    private final int c;
    private final int d;
    private final int e;
    private final b f;
    private final com.facebook.common.time.a g;
    private final long h;
    private long i;
    private Object j[];
    private int k;

    public a(Class class1, int l, int i1, int j1, long l1, b b1, 
            com.facebook.common.time.a a1)
    {
        b = class1;
        c = Math.max(l, 0);
        d = Math.max(c, i1);
        e = Math.max(j1, 1);
        h = l1;
        f = b1;
        f.a(this);
        g = a1;
        j = (Object[])(Object[])Array.newInstance(b, c);
    }

    private void a(int l)
    {
        for (int i1 = l; i1 < k; i1++)
        {
            f.c(j[i1]);
        }

        Object aobj[] = (Object[])(Object[])Array.newInstance(b, l);
        System.arraycopy(((Object) (j)), 0, ((Object) (aobj)), 0, Math.min(j.length, l));
        j = aobj;
        k = Math.min(k, l);
    }

    static Class d()
    {
        return a;
    }

    public Object a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        k = k - 1;
        obj = j[k];
        j[k] = null;
_L1:
        f.a(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj = f.a();
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        b();
        f.b(obj);
        if (k >= d) goto _L2; else goto _L1
_L1:
        Object aobj[];
        int l;
        if (k + 1 > j.length)
        {
            a(Math.min(d, j.length + e));
        }
        aobj = j;
        l = k;
        k = l + 1;
        aobj[l] = obj;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f.c(obj);
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (k < e * 2)
        {
            i = g.a();
        }
        if (g.a() - i > h)
        {
            c();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        int l = Math.max(j.length - e, c);
        if (l != j.length)
        {
            a(l);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
