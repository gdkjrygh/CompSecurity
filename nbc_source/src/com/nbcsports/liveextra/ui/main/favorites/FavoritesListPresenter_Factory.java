// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.favorites;

import com.nbcsports.liveextra.content.ContentService;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.ui.main.core.AssetViewModelTransformer;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.main.favorites:
//            FavoritesListPresenter

public final class FavoritesListPresenter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider favoritesProvider;
    private final MembersInjector membersInjector;
    private final Provider serviceProvider;
    private final Provider transformerProvider;

    public FavoritesListPresenter_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
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
            favoritesProvider = provider2;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        return new FavoritesListPresenter_Factory(membersinjector, provider, provider1, provider2);
    }

    public FavoritesListPresenter get()
    {
        FavoritesListPresenter favoriteslistpresenter = new FavoritesListPresenter((ContentService)serviceProvider.get(), (AssetViewModelTransformer)transformerProvider.get(), (FavoriteService)favoritesProvider.get());
        membersInjector.injectMembers(favoriteslistpresenter);
        return favoriteslistpresenter;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/main/favorites/FavoritesListPresenter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
