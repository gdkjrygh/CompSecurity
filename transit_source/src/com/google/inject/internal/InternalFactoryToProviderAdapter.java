// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Provider;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.spi.Dependency;

// Referenced classes of package com.google.inject.internal:
//            InternalFactory, Initializable, ErrorsException, Errors, 
//            InternalContext

final class InternalFactoryToProviderAdapter
    implements InternalFactory
{

    private final Initializable initializable;
    private final Object source;

    public InternalFactoryToProviderAdapter(Initializable initializable1, Object obj)
    {
        initializable = (Initializable)$Preconditions.checkNotNull(initializable1, "provider");
        source = $Preconditions.checkNotNull(obj, "source");
    }

    public Object get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
        throws ErrorsException
    {
        try
        {
            internalcontext = ((InternalContext) (errors.checkForNull(((Provider)initializable.get(errors)).get(), source, dependency)));
        }
        // Misplaced declaration of an exception variable
        catch (InternalContext internalcontext)
        {
            throw errors.withSource(source).errorInProvider(internalcontext).toException();
        }
        return internalcontext;
    }

    public String toString()
    {
        return initializable.toString();
    }
}
