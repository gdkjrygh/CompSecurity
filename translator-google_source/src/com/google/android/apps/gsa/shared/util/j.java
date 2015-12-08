// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.gsa.shared.util:
//            k

public final class j
    implements InvocationHandler
{

    final Executor a;
    final Object b;
    final Class c;

    public j(Executor executor, Object obj, Class class1)
    {
        a = executor;
        b = obj;
        c = class1;
        super();
    }

    public final Object invoke(Object obj, Method method, Object aobj[])
    {
        a.execute(new k(b, method, aobj, c));
        return null;
    }
}
