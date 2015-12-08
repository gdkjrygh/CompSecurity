// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Key;
import com.google.inject.spi.Dependency;
import javax.inject.Provider;

// Referenced classes of package com.google.inject.internal:
//            InternalFactory, CreationListener, ErrorsException, Errors, 
//            InjectorImpl, InternalContext

final class BoundProviderFactory
    implements InternalFactory, CreationListener
{

    private final InjectorImpl injector;
    private InternalFactory providerFactory;
    final Key providerKey;
    final Object source;

    BoundProviderFactory(InjectorImpl injectorimpl, Key key, Object obj)
    {
        injector = injectorimpl;
        providerKey = key;
        source = obj;
    }

    public Object get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
        throws ErrorsException
    {
        errors = errors.withSource(providerKey);
        internalcontext = (Provider)providerFactory.get(errors, internalcontext, dependency, true);
        try
        {
            internalcontext = ((InternalContext) (errors.checkForNull(internalcontext.get(), source, dependency)));
        }
        // Misplaced declaration of an exception variable
        catch (InternalContext internalcontext)
        {
            throw errors.errorInProvider(internalcontext).toException();
        }
        return internalcontext;
    }

    public void notify(Errors errors)
    {
        try
        {
            providerFactory = injector.getInternalFactory(providerKey, errors.withSource(source), InjectorImpl.JitLimitation.NEW_OR_EXISTING_JIT);
            return;
        }
        catch (ErrorsException errorsexception)
        {
            errors.merge(errorsexception.getErrors());
        }
    }

    public String toString()
    {
        return providerKey.toString();
    }
}
