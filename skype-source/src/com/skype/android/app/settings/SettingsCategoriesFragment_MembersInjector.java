// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.config.ecs.EcsConfiguration;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.settings:
//            SettingsCategoriesFragment

public final class SettingsCategoriesFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider configurationProvider;
    private final Provider objectInterfaceFinderProvider;

    public SettingsCategoriesFragment_MembersInjector(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            configurationProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new SettingsCategoriesFragment_MembersInjector(provider, provider1);
    }

    public static void injectConfiguration(SettingsCategoriesFragment settingscategoriesfragment, Provider provider)
    {
        settingscategoriesfragment.configuration = (EcsConfiguration)provider.get();
    }

    public final void injectMembers(SettingsCategoriesFragment settingscategoriesfragment)
    {
        if (settingscategoriesfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(settingscategoriesfragment, objectInterfaceFinderProvider);
            settingscategoriesfragment.configuration = (EcsConfiguration)configurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SettingsCategoriesFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/settings/SettingsCategoriesFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
