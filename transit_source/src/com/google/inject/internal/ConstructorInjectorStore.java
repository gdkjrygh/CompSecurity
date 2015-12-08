// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.spi.InjectionPoint;

// Referenced classes of package com.google.inject.internal:
//            ErrorsException, Errors, InjectorImpl, MembersInjectorStore, 
//            DefaultConstructionProxyFactory, ConstructorInjector, MembersInjectorImpl, ConstructionProxyFactory, 
//            FailableCache

final class ConstructorInjectorStore
{

    private final FailableCache cache = new FailableCache() {

        final ConstructorInjectorStore this$0;

        protected ConstructorInjector create(InjectionPoint injectionpoint, Errors errors)
            throws ErrorsException
        {
            return createConstructor(injectionpoint, errors);
        }

        protected volatile Object create(Object obj, Errors errors)
            throws ErrorsException
        {
            return create((InjectionPoint)obj, errors);
        }

            
            {
                this$0 = ConstructorInjectorStore.this;
                super();
            }
    };
    private final InjectorImpl injector;

    ConstructorInjectorStore(InjectorImpl injectorimpl)
    {
        injector = injectorimpl;
    }

    private ConstructorInjector createConstructor(InjectionPoint injectionpoint, Errors errors)
        throws ErrorsException
    {
        int i = errors.size();
        SingleParameterInjector asingleparameterinjector[] = injector.getParametersInjectors(injectionpoint.getDependencies(), errors);
        MembersInjectorImpl membersinjectorimpl = injector.membersInjectorStore.get(injectionpoint.getDeclaringType(), errors);
        injectionpoint = new DefaultConstructionProxyFactory(injectionpoint);
        errors.throwIfNewErrors(i);
        return new ConstructorInjector(membersinjectorimpl.getInjectionPoints(), injectionpoint.create(), asingleparameterinjector, membersinjectorimpl);
    }

    public ConstructorInjector get(InjectionPoint injectionpoint, Errors errors)
        throws ErrorsException
    {
        return (ConstructorInjector)cache.get(injectionpoint, errors);
    }

    boolean remove(InjectionPoint injectionpoint)
    {
        return cache.remove(injectionpoint);
    }

}
