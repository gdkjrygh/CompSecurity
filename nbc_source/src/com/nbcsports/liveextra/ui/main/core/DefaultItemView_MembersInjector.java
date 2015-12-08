// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            DefaultItemView

public final class DefaultItemView_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider configurationProvider;
    private final Provider favoritesProvider;
    private final Provider picassoProvider;
    private final MembersInjector supertypeInjector;

    public DefaultItemView_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        picassoProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            favoritesProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        return new DefaultItemView_MembersInjector(membersinjector, provider, provider1, provider2);
    }

    public void injectMembers(DefaultItemView defaultitemview)
    {
        if (defaultitemview == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(defaultitemview);
            defaultitemview.picasso = (Picasso)picassoProvider.get();
            defaultitemview.configuration = (Configuration)configurationProvider.get();
            defaultitemview.favorites = (FavoriteService)favoritesProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DefaultItemView)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/main/core/DefaultItemView_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
