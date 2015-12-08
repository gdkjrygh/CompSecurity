// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.SharedPreferences;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.preferences.AppPreferences;
import com.nbcsports.liveextra.library.tve.AuthService;
import dagger.MembersInjector;
import dagger.internal.DoubleCheckLazy;
import javax.inject.Provider;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            SochiApplicationSettingsFragment

public final class SochiApplicationSettingsFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider appPreferencesProvider;
    private final Provider clientLazyProvider;
    private final Provider configProvider;
    private final Provider passProvider;
    private final Provider preferencesProvider;
    private final MembersInjector supertypeInjector;

    public SochiApplicationSettingsFragment_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        passProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        configProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        preferencesProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        appPreferencesProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        } else
        {
            clientLazyProvider = provider4;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new SochiApplicationSettingsFragment_MembersInjector(membersinjector, provider, provider1, provider2, provider3, provider4);
    }

    public void injectMembers(SochiApplicationSettingsFragment sochiapplicationsettingsfragment)
    {
        if (sochiapplicationsettingsfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(sochiapplicationsettingsfragment);
            sochiapplicationsettingsfragment.pass = (AuthService)passProvider.get();
            sochiapplicationsettingsfragment.config = (Configuration)configProvider.get();
            sochiapplicationsettingsfragment.preferences = (SharedPreferences)preferencesProvider.get();
            sochiapplicationsettingsfragment.appPreferences = (AppPreferences)appPreferencesProvider.get();
            sochiapplicationsettingsfragment.clientLazy = DoubleCheckLazy.create(clientLazyProvider);
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((SochiApplicationSettingsFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/fragments/SochiApplicationSettingsFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
