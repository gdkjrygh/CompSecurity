// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Provider;
import com.google.inject.ProvisionException;
import com.google.inject.spi.Dependency;

// Referenced classes of package com.google.inject.internal:
//            InjectorImpl, ErrorsException, Errors, InternalFactory, 
//            ContextualCallable, InternalContext

class 
    implements Provider
{

    final InjectorImpl this$0;
    final Dependency val$dependency;
    final InternalFactory val$factory;

    public Object get()
    {
        final Errors errors = new Errors(val$dependency);
        Object obj;
        try
        {
            obj = callInContext(new ContextualCallable() {

                final InjectorImpl._cls4 this$1;
                final Errors val$errors;

                public Object call(InternalContext internalcontext)
                    throws ErrorsException
                {
                    Dependency dependency1 = internalcontext.setDependency(dependency);
                    Object obj1 = factory.get(errors, internalcontext, dependency, false);
                    internalcontext.setDependency(dependency1);
                    return obj1;
                    Exception exception;
                    exception;
                    internalcontext.setDependency(dependency1);
                    throw exception;
                }

            
            {
                this$1 = InjectorImpl._cls4.this;
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
        return val$factory.toString();
    }

    ()
    {
        this$0 = final_injectorimpl;
        val$dependency = dependency1;
        val$factory = InternalFactory.this;
        super();
    }
}
