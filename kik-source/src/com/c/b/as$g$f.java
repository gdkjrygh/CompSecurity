// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.lang.reflect.Method;

// Referenced classes of package com.c.b:
//            as, bd

private static final class er.TYPE extends er.TYPE
{

    private final Method k;
    private final Method l;

    public final er.TYPE a()
    {
        return (t)as.a(k, null, new Object[0]);
    }

    public final void b(t t, Object obj)
    {
        if (!a.isInstance(obj))
        {
            obj = ((t)as.a(k, null, new Object[0])).t((bd)obj).t();
        }
        super.b(t, obj);
    }

    (String s, Class class1, Class class2)
    {
        super(s, class1, class2);
        k = as.a(a, "newBuilder", new Class[0]);
        l = as.a(class2, (new StringBuilder("get")).append(s).append("Builder").toString(), new Class[] {
            Integer.TYPE
        });
    }
}
