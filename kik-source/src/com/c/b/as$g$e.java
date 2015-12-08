// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.c.b:
//            as

private static class 
    implements t
{

    protected final Class a;
    protected final Method b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;
    protected final Method h;
    protected final Method i;
    protected final Method j;

    public t a()
    {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    public Object a(g g1)
    {
        return as.a(c, g1, new Object[0]);
    }

    public Object a(t t, int k)
    {
        return as.a(e, t, new Object[] {
            Integer.valueOf(k)
        });
    }

    public Object a(as as1)
    {
        return as.a(b, as1, new Object[0]);
    }

    public Object a(as as1, int k)
    {
        return as.a(d, as1, new Object[] {
            Integer.valueOf(k)
        });
    }

    public final void a(t t, Object obj)
    {
        as.a(j, t, new Object[0]);
        for (obj = ((List)obj).iterator(); ((Iterator) (obj)).hasNext(); b(t, ((Iterator) (obj)).next())) { }
    }

    public final Object b(as as1)
    {
        return a(as1);
    }

    public void b(t t, Object obj)
    {
        as.a(g, t, new Object[] {
            obj
        });
    }

    public final boolean b(t t)
    {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    public final int c(g g1)
    {
        return ((Integer)as.a(i, g1, new Object[0])).intValue();
    }

    public final boolean c(as as1)
    {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    public final int d(as as1)
    {
        return ((Integer)as.a(h, as1, new Object[0])).intValue();
    }

    (String s, Class class1, Class class2)
    {
        b = as.a(class1, (new StringBuilder("get")).append(s).append("List").toString(), new Class[0]);
        c = as.a(class2, (new StringBuilder("get")).append(s).append("List").toString(), new Class[0]);
        d = as.a(class1, (new StringBuilder("get")).append(s).toString(), new Class[] {
            Integer.TYPE
        });
        e = as.a(class2, (new StringBuilder("get")).append(s).toString(), new Class[] {
            Integer.TYPE
        });
        a = d.getReturnType();
        f = as.a(class2, (new StringBuilder("set")).append(s).toString(), new Class[] {
            Integer.TYPE, a
        });
        g = as.a(class2, (new StringBuilder("add")).append(s).toString(), new Class[] {
            a
        });
        h = as.a(class1, (new StringBuilder("get")).append(s).append("Count").toString(), new Class[0]);
        i = as.a(class2, (new StringBuilder("get")).append(s).append("Count").toString(), new Class[0]);
        j = as.a(class2, (new StringBuilder("clear")).append(s).toString(), new Class[0]);
    }
}
