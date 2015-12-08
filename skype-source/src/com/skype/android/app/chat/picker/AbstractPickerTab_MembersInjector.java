// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.analytics.Analytics;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.PackInfoUtils;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat.picker:
//            AbstractPickerTab

public final class AbstractPickerTab_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider configurationProvider;
    private final Provider mediaContentRosterProvider;
    private final Provider packInfoUtilsProvider;

    public AbstractPickerTab_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3)
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
        } else
        {
            packInfoUtilsProvider = provider3;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new AbstractPickerTab_MembersInjector(provider, provider1, provider2, provider3);
    }

    public static void injectAnalytics(AbstractPickerTab abstractpickertab, Provider provider)
    {
        abstractpickertab.analytics = (Analytics)provider.get();
    }

    public static void injectConfiguration(AbstractPickerTab abstractpickertab, Provider provider)
    {
        abstractpickertab.configuration = (EcsConfiguration)provider.get();
    }

    public static void injectMediaContentRoster(AbstractPickerTab abstractpickertab, Provider provider)
    {
        abstractpickertab.mediaContentRoster = (MediaContentRoster)provider.get();
    }

    public static void injectPackInfoUtils(AbstractPickerTab abstractpickertab, Provider provider)
    {
        abstractpickertab.packInfoUtils = (PackInfoUtils)provider.get();
    }

    public final void injectMembers(AbstractPickerTab abstractpickertab)
    {
        if (abstractpickertab == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            abstractpickertab.mediaContentRoster = (MediaContentRoster)mediaContentRosterProvider.get();
            abstractpickertab.configuration = (EcsConfiguration)configurationProvider.get();
            abstractpickertab.analytics = (Analytics)analyticsProvider.get();
            abstractpickertab.packInfoUtils = (PackInfoUtils)packInfoUtilsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AbstractPickerTab)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/picker/AbstractPickerTab_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
