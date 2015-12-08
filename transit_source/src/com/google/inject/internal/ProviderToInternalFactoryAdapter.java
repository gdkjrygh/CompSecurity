// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Provider;
import com.google.inject.ProvisionException;

// Referenced classes of package com.google.inject.internal:
//            ErrorsException, Errors, InjectorImpl, InternalFactory, 
//            ContextualCallable, InternalContext

final class ProviderToInternalFactoryAdapter
    implements Provider
{

    private final InjectorImpl injector;
    private final InternalFactory internalFactory;

    public ProviderToInternalFactoryAdapter(InjectorImpl injectorimpl, InternalFactory internalfactory)
    {
        injector = injectorimpl;
        internalFactory = internalfactory;
    }

    public Object get()
    {
        final Errors errors = new Errors();
        Object obj;
        try
        {
            obj = injector.callInContext(new ContextualCallable() {

                final ProviderToInternalFactoryAdapter this$0;
                final Errors val$errors;

                public Object call(InternalContext internalcontext)
                    throws ErrorsException
                {
                    com.google.inject.spi.Dependency dependency = internalcontext.getDependency();
                    return internalFactory.get(errors, internalcontext, dependency, true);
                }

            
            {
                this$0 = ProviderToInternalFactoryAdapter.this;
                errors = errors1;
                super();
            }
            });
            errors.throwIfNewErrors(0);
        }
        catch (ErrorsException errorsexception)
        {
            throw new ProvisionException(errors.merge(errorsexception.getErrors()).getMessages());
        }
        return obj;
    }

    public String toString()
    {
        return internalFactory.toString();
    }

}
