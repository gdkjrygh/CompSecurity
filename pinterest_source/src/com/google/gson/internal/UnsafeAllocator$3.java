// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.lang.reflect.Method;

// Referenced classes of package com.google.gson.internal:
//            UnsafeAllocator

final class nit> extends UnsafeAllocator
{

    final Method val$newInstance;

    public final Object newInstance(Class class1)
    {
        return val$newInstance.invoke(null, new Object[] {
            class1, java/lang/Object
        });
    }

    ()
    {
        val$newInstance = method;
        super();
    }
}
