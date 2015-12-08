// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.lang.reflect.Method;

// Referenced classes of package com.c.b:
//            as

private static final class er.TYPE extends er.TYPE
{

    private t m;
    private Method n;
    private Method o;
    private boolean p;
    private Method q;
    private Method r;
    private Method s;

    public final Object a(er.TYPE type)
    {
        if (p)
        {
            int i = ((Integer)as.a(r, type, new Object[0])).intValue();
            return m.m(i);
        } else
        {
            return as.a(o, super.a(type), new Object[0]);
        }
    }

    public final Object a(as as1)
    {
        if (p)
        {
            int i = ((Integer)as.a(q, as1, new Object[0])).intValue();
            return m.m(i);
        } else
        {
            return as.a(o, super.a(as1), new Object[0]);
        }
    }

    public final void a(t t, Object obj)
    {
        if (p)
        {
            as.a(s, t, new Object[] {
                Integer.valueOf(((er.valueOf)obj).valueOf())
            });
            return;
        } else
        {
            super.a(t, as.a(n, null, new Object[] {
                obj
            }));
            return;
        }
    }

    (g g1, String s1, Class class1, Class class2, String s2)
    {
        super(g1, s1, class1, class2, s2);
        m = g1.m();
        n = as.a(a, "valueOf", new Class[] {
            com/c/b/ak$e
        });
        o = as.a(a, "getValueDescriptor", new Class[0]);
        p = g1.p().p();
        if (p)
        {
            q = as.a(class1, (new StringBuilder("get")).append(s1).append("Value").toString(), new Class[0]);
            r = as.a(class2, (new StringBuilder("get")).append(s1).append("Value").toString(), new Class[0]);
            s = as.a(class2, (new StringBuilder("set")).append(s1).append("Value").toString(), new Class[] {
                Integer.TYPE
            });
        }
    }
}
