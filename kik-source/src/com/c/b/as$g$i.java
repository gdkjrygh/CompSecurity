// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.lang.reflect.Method;

// Referenced classes of package com.c.b:
//            as, bd

private static final class  extends 
{

    private final Method m;
    private final Method n;

    public final  a()
    {
        return (t)as.a(m, null, new Object[0]);
    }

    public final void a(t t, Object obj)
    {
        if (!a.isInstance(obj))
        {
            obj = ((t)as.a(m, null, new Object[0])).t((bd)obj).t();
        }
        super.a(t, obj);
    }

    (g g1, String s, Class class1, Class class2, String s1)
    {
        super(g1, s, class1, class2, s1);
        m = as.a(a, "newBuilder", new Class[0]);
        n = as.a(class2, (new StringBuilder("get")).append(s).append("Builder").toString(), new Class[0]);
    }
}
