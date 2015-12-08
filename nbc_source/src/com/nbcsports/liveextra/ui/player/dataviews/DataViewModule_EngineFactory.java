// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.dataviews;

import android.content.Context;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player.dataviews:
//            DataViewModule, DataEngine

public final class DataViewModule_EngineFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final DataViewModule module;
    private final Provider viewModelProvider;

    public DataViewModule_EngineFactory(DataViewModule dataviewmodule, Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && dataviewmodule == null)
        {
            throw new AssertionError();
        }
        module = dataviewmodule;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            viewModelProvider = provider1;
            return;
        }
    }

    public static Factory create(DataViewModule dataviewmodule, Provider provider, Provider provider1)
    {
        return new DataViewModule_EngineFactory(dataviewmodule, provider, provider1);
    }

    public DataEngine get()
    {
        return module.engine((Context)contextProvider.get(), (AssetViewModel)viewModelProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/dataviews/DataViewModule_EngineFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
