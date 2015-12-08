// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.analytics.Analytics;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.PackInfoUtils;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat.picker:
//            MRUTab, MRUManager, AbstractPickerTab

public final class MRUTab_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider configurationProvider;
    private final Provider mediaContentRosterProvider;
    private final Provider mruManagerProvider;
    private final Provider packInfoUtilsProvider;
    private final Provider userPrefsProvider;

    public MRUTab_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        mediaContentRosterProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        packInfoUtilsProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        mruManagerProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            userPrefsProvider = provider5;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new MRUTab_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5);
    }

    public static void injectConfiguration(MRUTab mrutab, Provider provider)
    {
        mrutab.configuration = (EcsConfiguration)provider.get();
    }

    public static void injectMruManager(MRUTab mrutab, Provider provider)
    {
        mrutab.mruManager = (MRUManager)provider.get();
    }

    public static void injectUserPrefs(MRUTab mrutab, Provider provider)
    {
        mrutab.userPrefs = (UserPreferences)provider.get();
    }

    public final void injectMembers(MRUTab mrutab)
    {
        if (mrutab == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            mrutab.mediaContentRoster = (MediaContentRoster)mediaContentRosterProvider.get();
            mrutab.configuration = (EcsConfiguration)configurationProvider.get();
            mrutab.analytics = (Analytics)analyticsProvider.get();
            mrutab.packInfoUtils = (PackInfoUtils)packInfoUtilsProvider.get();
            mrutab.mruManager = (MRUManager)mruManagerProvider.get();
            mrutab.configuration = (EcsConfiguration)configurationProvider.get();
            mrutab.userPrefs = (UserPreferences)userPrefsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MRUTab)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/picker/MRUTab_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
