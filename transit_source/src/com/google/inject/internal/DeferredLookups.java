// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Key;
import com.google.inject.MembersInjector;
import com.google.inject.Provider;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$Lists;
import com.google.inject.spi.MembersInjectorLookup;
import com.google.inject.spi.ProviderLookup;
import java.util.List;

// Referenced classes of package com.google.inject.internal:
//            Lookups, InjectorImpl, LookupProcessor, Errors

final class DeferredLookups
    implements Lookups
{

    private final InjectorImpl injector;
    private final List lookups = $Lists.newArrayList();

    DeferredLookups(InjectorImpl injectorimpl)
    {
        injector = injectorimpl;
    }

    public MembersInjector getMembersInjector(TypeLiteral typeliteral)
    {
        typeliteral = new MembersInjectorLookup(typeliteral, typeliteral);
        lookups.add(typeliteral);
        return typeliteral.getMembersInjector();
    }

    public Provider getProvider(Key key)
    {
        key = new ProviderLookup(key, key);
        lookups.add(key);
        return key.getProvider();
    }

    void initialize(Errors errors)
    {
        injector.lookups = injector;
        (new LookupProcessor(errors)).process(injector, lookups);
    }
}
