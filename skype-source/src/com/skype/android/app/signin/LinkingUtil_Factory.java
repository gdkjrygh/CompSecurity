// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.app.Activity;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ImageCache;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingUtil

public final class LinkingUtil_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider activityProvider;
    private final Provider defaultAvatarsProvider;
    private final Provider imageCacheProvider;

    public LinkingUtil_Factory(Provider provider, Provider provider1, Provider provider2)
    {
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
        } else
        {
            defaultAvatarsProvider = provider2;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2)
    {
        return new LinkingUtil_Factory(provider, provider1, provider2);
    }

    public final LinkingUtil get()
    {
        return new LinkingUtil((Activity)activityProvider.get(), (ImageCache)imageCacheProvider.get(), (DefaultAvatars)defaultAvatarsProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/LinkingUtil_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
