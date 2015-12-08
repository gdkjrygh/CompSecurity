// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.spi.Dependency;

// Referenced classes of package com.google.inject.internal:
//            ContextualCallable, InternalInjectorCreator, BindingImpl, ErrorsException, 
//            InternalContext, Errors, InternalFactory

class val.binding
    implements ContextualCallable
{

    Dependency dependency;
    final InternalInjectorCreator this$0;
    final BindingImpl val$binding;
    final Errors val$errors;

    public volatile Object call(InternalContext internalcontext)
        throws ErrorsException
    {
        return call(internalcontext);
    }

    public Void call(InternalContext internalcontext)
    {
        Dependency dependency1;
        Errors errors1;
        dependency1 = internalcontext.setDependency(dependency);
        errors1 = val$errors.withSource(dependency);
        val$binding.getInternalFactory().get(errors1, internalcontext, dependency, false);
        internalcontext.setDependency(dependency1);
_L2:
        return null;
        ErrorsException errorsexception;
        errorsexception;
        errors1.merge(errorsexception.getErrors());
        internalcontext.setDependency(dependency1);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        internalcontext.setDependency(dependency1);
        throw exception;
    }

    ()
    {
        this$0 = final_internalinjectorcreator;
        val$binding = bindingimpl;
        val$errors = Errors.this;
        super();
        dependency = Dependency.get(val$binding.getKey());
    }
}
