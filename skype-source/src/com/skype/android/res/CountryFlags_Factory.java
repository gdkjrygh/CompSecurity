// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.app.Application;
import com.skype.SkyLib;
import com.skype.android.util.ImageCache;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.res:
//            CountryFlags

public final class CountryFlags_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;

    public CountryFlags_Factory(Provider provider, Provider provider1, Provider provider2)
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
        imageCacheProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            libProvider = provider2;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2)
    {
        return new CountryFlags_Factory(provider, provider1, provider2);
    }

    public final CountryFlags get()
    {
        return new CountryFlags((Application)contextProvider.get(), (ImageCache)imageCacheProvider.get(), (SkyLib)libProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/res/CountryFlags_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
