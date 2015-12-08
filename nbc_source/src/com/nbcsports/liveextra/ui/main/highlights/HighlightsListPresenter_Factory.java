// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.highlights;

import com.nbcsports.liveextra.content.ContentService;
import com.nbcsports.liveextra.ui.main.core.AssetViewModelTransformer;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.main.highlights:
//            HighlightsListPresenter

public final class HighlightsListPresenter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final MembersInjector membersInjector;
    private final Provider serviceProvider;
    private final Provider sportProvider;
    private final Provider transformerProvider;

    public HighlightsListPresenter_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
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

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        return new HighlightsListPresenter_Factory(membersinjector, provider, provider1, provider2);
    }

    public HighlightsListPresenter get()
    {
        HighlightsListPresenter highlightslistpresenter = new HighlightsListPresenter((ContentService)serviceProvider.get(), (AssetViewModelTransformer)transformerProvider.get(), sportProvider);
        membersInjector.injectMembers(highlightslistpresenter);
        return highlightslistpresenter;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/main/highlights/HighlightsListPresenter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
