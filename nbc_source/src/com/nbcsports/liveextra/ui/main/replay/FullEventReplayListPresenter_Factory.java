// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.replay;

import com.nbcsports.liveextra.content.ContentService;
import com.nbcsports.liveextra.ui.main.core.AssetViewModelTransformer;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.main.replay:
//            FullEventReplayListPresenter

public final class FullEventReplayListPresenter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final MembersInjector membersInjector;
    private final Provider serviceProvider;
    private final Provider sportProvider;
    private final Provider transformerProvider;

    public FullEventReplayListPresenter_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
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
        return new FullEventReplayListPresenter_Factory(membersinjector, provider, provider1, provider2);
    }

    public FullEventReplayListPresenter get()
    {
        FullEventReplayListPresenter fulleventreplaylistpresenter = new FullEventReplayListPresenter((ContentService)serviceProvider.get(), (AssetViewModelTransformer)transformerProvider.get(), sportProvider);
        membersInjector.injectMembers(fulleventreplaylistpresenter);
        return fulleventreplaylistpresenter;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/main/replay/FullEventReplayListPresenter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
