// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.TypeLiteral;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// Referenced classes of package com.google.inject.spi:
//            InjectionPoint

static class method extends method
{

    final Method method;
    boolean overrodeGuiceInject;

    public boolean isFinal()
    {
        return Modifier.isFinal(method.getModifiers());
    }

    InjectionPoint toInjectionPoint()
    {
        return new InjectionPoint(declaringType, method, optional);
    }

    (TypeLiteral typeliteral, Method method1, Annotation annotation)
    {
        super(typeliteral, annotation);
        method = method1;
    }
}
