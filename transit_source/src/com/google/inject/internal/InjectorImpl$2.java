// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.spi.Dependency;

// Referenced classes of package com.google.inject.internal:
//            InternalFactory, InjectorImpl, ErrorsException, Errors, 
//            BindingImpl, InternalContext

class val.providerType
    implements InternalFactory
{

    final InjectorImpl this$0;
    final BindingImpl val$providerBinding;
    final Key val$providerKey;
    final Class val$providerType;
    final Class val$rawType;

    public Object get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
        throws ErrorsException
    {
        errors = errors.withSource(val$providerKey);
        internalcontext = (Provider)val$providerBinding.getInternalFactory().get(errors, internalcontext, dependency, true);
        try
        {
            internalcontext = ((InternalContext) (internalcontext.get()));
        }
        // Misplaced declaration of an exception variable
        catch (InternalContext internalcontext)
        {
            throw errors.errorInProvider(internalcontext).toException();
        }
        if (internalcontext == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        if (!val$rawType.isInstance(internalcontext))
        {
            throw errors.subtypeNotProvided(val$providerType, val$rawType).toException();
        }
        return internalcontext;
    }

    ()
    {
        this$0 = final_injectorimpl;
        val$providerKey = key;
        val$providerBinding = bindingimpl;
        val$rawType = class1;
        val$providerType = Class.this;
        super();
    }
}
