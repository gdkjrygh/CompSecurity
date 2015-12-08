// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.spi.Dependency;
import com.google.inject.spi.InjectionPoint;
import java.lang.reflect.Field;
import java.util.List;

// Referenced classes of package com.google.inject.internal:
//            SingleMemberInjector, ErrorsException, InjectorImpl, Errors, 
//            InternalContext, InternalFactory

final class SingleFieldInjector
    implements SingleMemberInjector
{

    final Dependency dependency;
    final InternalFactory factory;
    final Field field;
    final InjectionPoint injectionPoint;

    public SingleFieldInjector(InjectorImpl injectorimpl, InjectionPoint injectionpoint, Errors errors)
        throws ErrorsException
    {
        injectionPoint = injectionpoint;
        field = (Field)injectionpoint.getMember();
        dependency = (Dependency)injectionpoint.getDependencies().get(0);
        field.setAccessible(true);
        factory = injectorimpl.getInternalFactory(dependency.getKey(), errors, InjectorImpl.JitLimitation.NO_JIT);
    }

    public InjectionPoint getInjectionPoint()
    {
        return injectionPoint;
    }

    public void inject(Errors errors, InternalContext internalcontext, Object obj)
    {
        Errors errors1;
        errors1 = errors.withSource(dependency);
        errors = internalcontext.setDependency(dependency);
        Object obj1 = factory.get(errors1, internalcontext, dependency, false);
        field.set(obj, obj1);
        internalcontext.setDependency(errors);
        return;
        obj;
        errors1.withSource(injectionPoint).merge(((ErrorsException) (obj)).getErrors());
        internalcontext.setDependency(errors);
        return;
        obj;
        throw new AssertionError(obj);
        obj;
        internalcontext.setDependency(errors);
        throw obj;
    }
}
