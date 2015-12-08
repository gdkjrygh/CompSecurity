// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.MediaContentRoster;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat.picker:
//            ExtensiblePickerDialogFragment, PickerDialogFragment

public final class ExtensiblePickerDialogFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider configurationProvider;
    private final Provider mediaContentRosterProvider;
    private final Provider objectInterfaceFinderProvider;

    public ExtensiblePickerDialogFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        mediaContentRosterProvider = provider1;
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
            configurationProvider = provider3;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new ExtensiblePickerDialogFragment_MembersInjector(provider, provider1, provider2, provider3);
    }

    public static void injectAnalytics(ExtensiblePickerDialogFragment extensiblepickerdialogfragment, Provider provider)
    {
        extensiblepickerdialogfragment.analytics = (Analytics)provider.get();
    }

    public static void injectConfiguration(ExtensiblePickerDialogFragment extensiblepickerdialogfragment, Provider provider)
    {
        extensiblepickerdialogfragment.configuration = (EcsConfiguration)provider.get();
    }

    public final void injectMembers(ExtensiblePickerDialogFragment extensiblepickerdialogfragment)
    {
        if (extensiblepickerdialogfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(extensiblepickerdialogfragment, objectInterfaceFinderProvider);
            extensiblepickerdialogfragment.mediaContentRoster = (MediaContentRoster)mediaContentRosterProvider.get();
            extensiblepickerdialogfragment.analytics = (Analytics)analyticsProvider.get();
            extensiblepickerdialogfragment.configuration = (EcsConfiguration)configurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ExtensiblePickerDialogFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/picker/ExtensiblePickerDialogFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
