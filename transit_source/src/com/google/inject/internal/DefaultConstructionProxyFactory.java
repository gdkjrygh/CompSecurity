// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.spi.InjectionPoint;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

// Referenced classes of package com.google.inject.internal:
//            ConstructionProxyFactory, ConstructionProxy

final class DefaultConstructionProxyFactory
    implements ConstructionProxyFactory
{

    private final InjectionPoint injectionPoint;

    DefaultConstructionProxyFactory(InjectionPoint injectionpoint)
    {
        injectionPoint = injectionpoint;
    }

    public ConstructionProxy create()
    {
        final Constructor constructor = (Constructor)injectionPoint.getMember();
        if (Modifier.isPublic(constructor.getModifiers()))
        {
            if (!Modifier.isPublic(constructor.getDeclaringClass().getModifiers()))
            {
                constructor.setAccessible(true);
            }
        } else
        {
            constructor.setAccessible(true);
        }
        return new ConstructionProxy() {

            final DefaultConstructionProxyFactory this$0;
            final Constructor val$constructor;

            public Constructor getConstructor()
            {
                return constructor;
            }

            public InjectionPoint getInjectionPoint()
            {
                return injectionPoint;
            }

            public transient Object newInstance(Object aobj[])
                throws InvocationTargetException
            {
                try
                {
                    aobj = ((Object []) (constructor.newInstance(aobj)));
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[])
                {
                    throw new AssertionError(((Object) (aobj)));
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[])
                {
                    throw new AssertionError(((Object) (aobj)));
                }
                return ((Object) (aobj));
            }

            
            {
                this$0 = DefaultConstructionProxyFactory.this;
                constructor = constructor1;
                super();
            }
        };
    }

}
