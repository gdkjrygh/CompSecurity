// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.preferences;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.preferences:
//            AppPreferences

public final class AppPreferences_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider preferencesProvider;

    public AppPreferences_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            preferencesProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new AppPreferences_Factory(provider);
    }

    public AppPreferences get()
    {
        return new AppPreferences((SharedPreferences)preferencesProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/preferences/AppPreferences_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
