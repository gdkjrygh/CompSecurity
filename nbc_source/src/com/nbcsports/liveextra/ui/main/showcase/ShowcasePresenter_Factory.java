// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.showcase;

import com.nbcsports.liveextra.content.ContentService;
import com.nbcsports.liveextra.ui.main.core.AssetViewModelTransformer;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.main.showcase:
//            ShowcasePresenter

public final class ShowcasePresenter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider serviceProvider;
    private final Provider sportProvider;
    private final Provider transformerProvider;

    public ShowcasePresenter_Factory(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        serviceProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        transformerProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            sportProvider = provider2;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2)
    {
        return new ShowcasePresenter_Factory(provider, provider1, provider2);
    }

    public ShowcasePresenter get()
    {
        return new ShowcasePresenter((ContentService)serviceProvider.get(), (AssetViewModelTransformer)transformerProvider.get(), sportProvider);
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/main/showcase/ShowcasePresenter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
