// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.app.Application;
import com.skype.SkyLib;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.cache.ContactMoodCache;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.util:
//            ContactUtil, ImageCache

public final class ContactUtil_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider configurationProvider;
    private final Provider contextProvider;
    private final Provider defaultAvatarsProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider spannedTextProvider;

    public ContactUtil_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        spannedTextProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        } else
        {
            defaultAvatarsProvider = provider7;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7)
    {
        return new ContactUtil_Factory(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public final ContactUtil get()
    {
        return new ContactUtil((Application)contextProvider.get(), accountProvider, (SkyLib)libProvider.get(), (ObjectIdMap)mapProvider.get(), (ContactMoodCache)spannedTextProvider.get(), (EcsConfiguration)configurationProvider.get(), (ImageCache)imageCacheProvider.get(), (DefaultAvatars)defaultAvatarsProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/util/ContactUtil_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
