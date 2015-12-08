// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import com.nbcsports.liveextra.library.tve.Anvato;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.core:
//            DataModule

public final class DataModule_AnvatoFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider anvatoProvider;
    private final DataModule module;

    public DataModule_AnvatoFactory(DataModule datamodule, Provider provider)
    {
        if (!$assertionsDisabled && datamodule == null)
        {
            throw new AssertionError();
        }
        module = datamodule;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            anvatoProvider = provider;
            return;
        }
    }

    public static Factory create(DataModule datamodule, Provider provider)
    {
        return new DataModule_AnvatoFactory(datamodule, provider);
    }

    public com.nbcsports.liveextra.library.tve.Anvato.API get()
    {
        com.nbcsports.liveextra.library.tve.Anvato.API api = module.anvato((Anvato)anvatoProvider.get());
        if (api == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return api;
        }
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/core/DataModule_AnvatoFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
