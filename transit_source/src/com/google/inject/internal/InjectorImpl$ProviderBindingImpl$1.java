// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Provider;
import com.google.inject.spi.Dependency;

// Referenced classes of package com.google.inject.internal:
//            InternalFactory, InjectorImpl, ErrorsException, Errors, 
//            InternalContext

static final class val.provider
    implements InternalFactory
{

    final Provider val$provider;

    public Provider get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
    {
        return val$provider;
    }

    public volatile Object get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
        throws ErrorsException
    {
        return get(errors, internalcontext, dependency, flag);
    }

    (Provider provider1)
    {
        val$provider = provider1;
        super();
    }
}
