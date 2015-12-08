// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.lang.reflect.Method;

// Referenced classes of package com.google.gson.internal:
//            h

static final class nit> extends h
{

    final Method a;
    final Object b;

    public final Object a(Class class1)
        throws Exception
    {
        return a.invoke(b, new Object[] {
            class1
        });
    }

    (Method method, Object obj)
    {
        a = method;
        b = obj;
        super();
    }
}
