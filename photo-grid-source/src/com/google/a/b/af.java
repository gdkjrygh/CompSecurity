// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.lang.reflect.Method;

// Referenced classes of package com.google.a.b:
//            ae

final class af extends ae
{

    final Method a;
    final Object b;

    af(Method method, Object obj)
    {
        a = method;
        b = obj;
        super();
    }

    public final Object a(Class class1)
    {
        return a.invoke(b, new Object[] {
            class1
        });
    }
}
