// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.favorites;

import com.skype.SkyLib;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.favorites:
//            a

public final class FavoritesQuery_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider libProvider;

    public FavoritesQuery_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            libProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new FavoritesQuery_Factory(provider);
    }

    public final a get()
    {
        return new a((SkyLib)libProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/favorites/FavoritesQuery_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
