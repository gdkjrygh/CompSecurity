// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.spi.Dependency;

// Referenced classes of package com.google.inject.internal:
//            InternalFactory, ConstructorBindingImpl, ErrorsException, Errors, 
//            ConstructorInjector, InternalContext

private static class key
    implements InternalFactory
{

    private boolean allowCircularProxy;
    private ConstructorInjector constructorInjector;
    private final boolean failIfNotLinked;
    private final Key key;

    public Object get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
        throws ErrorsException
    {
        boolean flag1;
        if (constructorInjector != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        $Preconditions.checkState(flag1, "Constructor not ready");
        if (failIfNotLinked && !flag)
        {
            throw errors.jitDisabled(key).toException();
        } else
        {
            return constructorInjector.construct(errors, internalcontext, dependency.getKey().getTypeLiteral().getRawType(), allowCircularProxy);
        }
    }



/*
    static ConstructorInjector access$002( , ConstructorInjector constructorinjector)
    {
        .constructorInjector = constructorinjector;
        return constructorinjector;
    }

*/


/*
    static boolean access$102(constructorInjector constructorinjector, boolean flag)
    {
        constructorinjector.allowCircularProxy = flag;
        return flag;
    }

*/

    allowCircularProxy(boolean flag, Key key1)
    {
        failIfNotLinked = flag;
        key = key1;
    }
}
