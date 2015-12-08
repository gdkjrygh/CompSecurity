// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.favorites;

import android.app.Activity;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.widget.GridListAdapterViewBuilder;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.favorites:
//            FavoriteGridListAdapter

public final class FavoriteGridListAdapter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contactUtilProvider;
    private final Provider contextProvider;
    private final Provider conversationUtilProvider;
    private final Provider imageCacheProvider;
    private final MembersInjector membersInjector;
    private final Provider viewBuilderProvider;

    public FavoriteGridListAdapter_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
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
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        } else
        {
            viewBuilderProvider = provider4;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new FavoriteGridListAdapter_Factory(membersinjector, provider, provider1, provider2, provider3, provider4);
    }

    public final FavoriteGridListAdapter get()
    {
        FavoriteGridListAdapter favoritegridlistadapter = new FavoriteGridListAdapter((Activity)contextProvider.get(), (ContactUtil)contactUtilProvider.get(), (ImageCache)imageCacheProvider.get(), (ConversationUtil)conversationUtilProvider.get(), (GridListAdapterViewBuilder)viewBuilderProvider.get());
        membersInjector.injectMembers(favoritegridlistadapter);
        return favoritegridlistadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/favorites/FavoriteGridListAdapter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
