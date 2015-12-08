// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;


// Referenced classes of package com.google.inject.internal:
//            ContextualCallable, ProviderToInternalFactoryAdapter, ErrorsException, InternalContext, 
//            InternalFactory, Errors

class val.errors
    implements ContextualCallable
{

    final ProviderToInternalFactoryAdapter this$0;
    final Errors val$errors;

    public Object call(InternalContext internalcontext)
        throws ErrorsException
    {
        com.google.inject.spi.Dependency dependency = internalcontext.getDependency();
        return ProviderToInternalFactoryAdapter.access$000(ProviderToInternalFactoryAdapter.this).get(val$errors, internalcontext, dependency, true);
    }

    ()
    {
        this$0 = final_providertointernalfactoryadapter;
        val$errors = Errors.this;
        super();
    }
}
