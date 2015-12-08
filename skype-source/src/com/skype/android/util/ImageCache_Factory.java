// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.app.Application;
import com.skype.android.analytics.Analytics;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.skylib.ObjectIdMap;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.util:
//            ImageCache, HttpUtil, ConversationParticipantsUtil

public final class ImageCache_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider asyncProvider;
    private final Provider contextProvider;
    private final Provider conversationParticipantsUtilProvider;
    private final Provider httpUtilProvider;
    private final Provider mapProvider;
    private final MembersInjector membersInjector;

    public ImageCache_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
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
        asyncProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        httpUtilProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        conversationParticipantsUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsProvider = provider5;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new ImageCache_Factory(membersinjector, provider, provider1, provider2, provider3, provider4, provider5);
    }

    public final ImageCache get()
    {
        ImageCache imagecache = new ImageCache((Application)contextProvider.get(), (AsyncService)asyncProvider.get(), (HttpUtil)httpUtilProvider.get(), (ConversationParticipantsUtil)conversationParticipantsUtilProvider.get(), (ObjectIdMap)mapProvider.get(), (Analytics)analyticsProvider.get());
        membersInjector.injectMembers(imagecache);
        return imagecache;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/util/ImageCache_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
