// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import com.nbcsports.liveextra.content.FavoriteService;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            ContentListView

public final class ContentListView_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider favoritesProvider;
    private final MembersInjector supertypeInjector;

    public ContentListView_MembersInjector(MembersInjector membersinjector, Provider provider)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            favoritesProvider = provider;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider)
    {
        return new ContentListView_MembersInjector(membersinjector, provider);
    }

    public void injectMembers(ContentListView contentlistview)
    {
        if (contentlistview == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(contentlistview);
            contentlistview.favorites = (FavoriteService)favoritesProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ContentListView)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/main/core/ContentListView_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
