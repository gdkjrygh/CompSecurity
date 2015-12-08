// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Injector;
import com.google.inject.Provider;
import com.google.inject.spi.Dependency;

// Referenced classes of package com.google.inject.internal:
//            InternalFactory, InjectorShell, ErrorsException, Errors, 
//            InternalContext

private static class <init>
    implements InternalFactory, Provider
{

    private final Injector injector;

    public Injector get()
    {
        return injector;
    }

    public Injector get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
        throws ErrorsException
    {
        return injector;
    }

    public volatile Object get()
    {
        return get();
    }

    public volatile Object get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
        throws ErrorsException
    {
        return get(errors, internalcontext, dependency, flag);
    }

    public String toString()
    {
        return "Provider<Injector>";
    }

    private (Injector injector1)
    {
        injector = injector1;
    }

    injector(Injector injector1, injector injector2)
    {
        this(injector1);
    }
}
