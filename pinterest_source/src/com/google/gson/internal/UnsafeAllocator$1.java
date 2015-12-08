// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.lang.reflect.Method;

// Referenced classes of package com.google.gson.internal:
//            UnsafeAllocator

final class nit> extends UnsafeAllocator
{

    final Method val$allocateInstance;
    final Object val$unsafe;

    public final Object newInstance(Class class1)
    {
        return val$allocateInstance.invoke(val$unsafe, new Object[] {
            class1
        });
    }

    ()
    {
        val$allocateInstance = method;
        val$unsafe = obj;
        super();
    }
}
