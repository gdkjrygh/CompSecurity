// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.lang.reflect.Method;

// Referenced classes of package com.google.a.b:
//            ae

final class ah extends ae
{

    final Method a;
    final int b;

    ah(Method method, int i)
    {
        a = method;
        b = i;
        super();
    }

    public final Object a(Class class1)
    {
        return a.invoke(null, new Object[] {
            class1, Integer.valueOf(b)
        });
    }
}
