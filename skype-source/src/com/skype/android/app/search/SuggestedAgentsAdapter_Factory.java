// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.app.Activity;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.ImageCache;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.search:
//            SuggestedAgentsAdapter

public final class SuggestedAgentsAdapter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider activityProvider;
    private final Provider contactUtilProvider;
    private final Provider defaultAvatarsProvider;
    private final Provider httpUtilProvider;
    private final Provider imageCacheProvider;
    private final MembersInjector membersInjector;
    private final Provider typeFaceFactoryProvider;

    public SuggestedAgentsAdapter_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
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
        activityProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        defaultAvatarsProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        typeFaceFactoryProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            httpUtilProvider = provider5;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new SuggestedAgentsAdapter_Factory(membersinjector, provider, provider1, provider2, provider3, provider4, provider5);
    }

    public final SuggestedAgentsAdapter get()
    {
        SuggestedAgentsAdapter suggestedagentsadapter = new SuggestedAgentsAdapter((Activity)activityProvider.get(), (ImageCache)imageCacheProvider.get(), (ContactUtil)contactUtilProvider.get(), (DefaultAvatars)defaultAvatarsProvider.get(), (TypeFaceFactory)typeFaceFactoryProvider.get(), (HttpUtil)httpUtilProvider.get());
        membersInjector.injectMembers(suggestedagentsadapter);
        return suggestedagentsadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/search/SuggestedAgentsAdapter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
