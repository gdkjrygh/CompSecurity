// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Provider;
import com.google.inject.ProvisionException;
import com.google.inject.spi.Dependency;

// Referenced classes of package com.google.inject.internal:
//            ContextualCallable, ErrorsException, InternalContext, InternalFactory, 
//            Errors, InjectorImpl

class val.errors
    implements ContextualCallable
{

    final etDependency this$1;
    final Errors val$errors;

    public Object call(InternalContext internalcontext)
        throws ErrorsException
    {
        Dependency dependency = internalcontext.setDependency(this._cls1.this.dependency);
        Object obj = factory.get(val$errors, internalcontext, this._cls1.this.dependency, false);
        internalcontext.setDependency(dependency);
        return obj;
        Exception exception;
        exception;
        internalcontext.setDependency(dependency);
        throw exception;
    }

    l.factory()
    {
        this$1 = final_factory;
        val$errors = Errors.this;
        super();
    }

    // Unreferenced inner class com/google/inject/internal/InjectorImpl$4

/* anonymous class */
    class InjectorImpl._cls4
        implements Provider
    {

        final InjectorImpl this$0;
        final Dependency val$dependency;
        final InternalFactory val$factory;

        public Object get()
        {
            Errors errors1 = new Errors(dependency);
            Object obj;
            try
            {
                obj = callInContext(errors1. new InjectorImpl._cls4._cls1());
                errors1.throwIfNewErrors(0);
            }
            catch (ErrorsException errorsexception)
            {
                throw new ProvisionException(errors1.merge(errorsexception.getErrors()).getMessages());
            }
            return obj;
        }

        public String toString()
        {
            return factory.toString();
        }

            
            {
                this$0 = final_injectorimpl;
                dependency = dependency1;
                factory = InternalFactory.this;
                super();
            }
    }

}
