// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.preferences:
//            PreferencesModule

public final class PreferencesModule_PreferencesFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final PreferencesModule module;

    public PreferencesModule_PreferencesFactory(PreferencesModule preferencesmodule, Provider provider)
    {
        if (!$assertionsDisabled && preferencesmodule == null)
        {
            throw new AssertionError();
        }
        module = preferencesmodule;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            contextProvider = provider;
            return;
        }
    }

    public static Factory create(PreferencesModule preferencesmodule, Provider provider)
    {
        return new PreferencesModule_PreferencesFactory(preferencesmodule, provider);
    }

    public SharedPreferences get()
    {
        SharedPreferences sharedpreferences = module.preferences((Context)contextProvider.get());
        if (sharedpreferences == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return sharedpreferences;
        }
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/preferences/PreferencesModule_PreferencesFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
