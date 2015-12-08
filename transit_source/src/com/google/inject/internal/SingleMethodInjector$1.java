// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.inject.internal:
//            SingleMethodInjector

class val.method
    implements ker
{

    final SingleMethodInjector this$0;
    final Method val$method;

    public transient Object invoke(Object obj, Object aobj[])
        throws IllegalAccessException, InvocationTargetException
    {
        return val$method.invoke(obj, aobj);
    }

    ker()
    {
        this$0 = final_singlemethodinjector;
        val$method = Method.this;
        super();
    }
}
