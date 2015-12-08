// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.lang.reflect.Method;

// Referenced classes of package com.c.b:
//            as, f

private static final class  extends 
{

    private final Method m;
    private final Method n;
    private final Method o;

    public final void a(t t, Object obj)
    {
        if (obj instanceof f)
        {
            as.a(o, t, new Object[] {
                obj
            });
            return;
        } else
        {
            super.a(t, obj);
            return;
        }
    }

    public final Object b(as as1)
    {
        return as.a(m, as1, new Object[0]);
    }

    (g g1, String s, Class class1, Class class2, String s1)
    {
        super(g1, s, class1, class2, s1);
        m = as.a(class1, (new StringBuilder("get")).append(s).append("Bytes").toString(), new Class[0]);
        n = as.a(class2, (new StringBuilder("get")).append(s).append("Bytes").toString(), new Class[0]);
        o = as.a(class2, (new StringBuilder("set")).append(s).append("Bytes").toString(), new Class[] {
            com/c/b/f
        });
    }
}
