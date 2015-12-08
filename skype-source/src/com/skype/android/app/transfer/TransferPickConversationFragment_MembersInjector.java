// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.SkypeListFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.contacts.ConversationAdapter;
import com.skype.android.app.contacts.PickerFragment_MembersInjector;
import com.skype.android.app.media.MediaDocumentUploadUtil;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.transfer:
//            TransferPickConversationFragment, TransferUtil

public final class TransferPickConversationFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityAndAccessibilityUtilProvider;
    private final Provider adapterProvider;
    private final Provider analyticsProvider;
    private final Provider asyncProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider mediaDocumentUploadUtilProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider transferUtilProvider;
    private final Provider typeFaceFactoryProvider;
    private final Provider userPrefsProvider;

    public TransferPickConversationFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15)
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
        accessibilityAndAccessibilityUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        asyncProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        mediaDocumentUploadUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        typeFaceFactoryProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        transferUtilProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        adapterProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        } else
        {
            ecsConfigurationProvider = provider15;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15)
    {
        return new TransferPickConversationFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static void injectAdapter(TransferPickConversationFragment transferpickconversationfragment, Provider provider)
    {
        transferpickconversationfragment.adapter = (ConversationAdapter)provider.get();
    }

    public static void injectAnalytics(TransferPickConversationFragment transferpickconversationfragment, Provider provider)
    {
        transferpickconversationfragment.analytics = (Analytics)provider.get();
    }

    public static void injectAsync(TransferPickConversationFragment transferpickconversationfragment, Provider provider)
    {
        transferpickconversationfragment.async = (AsyncService)provider.get();
    }

    public static void injectConversationUtil(TransferPickConversationFragment transferpickconversationfragment, Provider provider)
    {
        transferpickconversationfragment.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectEcsConfiguration(TransferPickConversationFragment transferpickconversationfragment, Provider provider)
    {
        transferpickconversationfragment.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectLayoutExperience(TransferPickConversationFragment transferpickconversationfragment, Provider provider)
    {
        transferpickconversationfragment.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(TransferPickConversationFragment transferpickconversationfragment, Provider provider)
    {
        transferpickconversationfragment.lib = (SkyLib)provider.get();
    }

    public static void injectMap(TransferPickConversationFragment transferpickconversationfragment, Provider provider)
    {
        transferpickconversationfragment.map = (ObjectIdMap)provider.get();
    }

    public static void injectMediaDocumentUploadUtil(TransferPickConversationFragment transferpickconversationfragment, Provider provider)
    {
        transferpickconversationfragment.mediaDocumentUploadUtil = (MediaDocumentUploadUtil)provider.get();
    }

    public static void injectNavigation(TransferPickConversationFragment transferpickconversationfragment, Provider provider)
    {
        transferpickconversationfragment.navigation = (Navigation)provider.get();
    }

    public static void injectTransferUtil(TransferPickConversationFragment transferpickconversationfragment, Provider provider)
    {
        transferpickconversationfragment.transferUtil = (TransferUtil)provider.get();
    }

    public static void injectUserPrefs(TransferPickConversationFragment transferpickconversationfragment, Provider provider)
    {
        transferpickconversationfragment.userPrefs = (UserPreferences)provider.get();
    }

    public final void injectMembers(TransferPickConversationFragment transferpickconversationfragment)
    {
        if (transferpickconversationfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(transferpickconversationfragment, objectInterfaceFinderProvider);
            SkypeListFragment_MembersInjector.injectAccessibilityUtil(transferpickconversationfragment, accessibilityAndAccessibilityUtilProvider);
            PickerFragment_MembersInjector.injectAccessibility(transferpickconversationfragment, accessibilityAndAccessibilityUtilProvider);
            PickerFragment_MembersInjector.injectAsync(transferpickconversationfragment, asyncProvider);
            PickerFragment_MembersInjector.injectContactUtil(transferpickconversationfragment, contactUtilProvider);
            PickerFragment_MembersInjector.injectConversationUtil(transferpickconversationfragment, conversationUtilProvider);
            PickerFragment_MembersInjector.injectLayoutExperience(transferpickconversationfragment, layoutExperienceProvider);
            PickerFragment_MembersInjector.injectLib(transferpickconversationfragment, libProvider);
            PickerFragment_MembersInjector.injectUserPrefs(transferpickconversationfragment, userPrefsProvider);
            PickerFragment_MembersInjector.injectMap(transferpickconversationfragment, mapProvider);
            PickerFragment_MembersInjector.injectMediaDocumentUploadUtil(transferpickconversationfragment, mediaDocumentUploadUtilProvider);
            PickerFragment_MembersInjector.injectNavigation(transferpickconversationfragment, navigationProvider);
            PickerFragment_MembersInjector.injectTypeFaceFactory(transferpickconversationfragment, typeFaceFactoryProvider);
            PickerFragment_MembersInjector.injectTransferUtil(transferpickconversationfragment, transferUtilProvider);
            transferpickconversationfragment.navigation = (Navigation)navigationProvider.get();
            transferpickconversationfragment.transferUtil = (TransferUtil)transferUtilProvider.get();
            transferpickconversationfragment.lib = (SkyLib)libProvider.get();
            transferpickconversationfragment.mediaDocumentUploadUtil = (MediaDocumentUploadUtil)mediaDocumentUploadUtilProvider.get();
            transferpickconversationfragment.userPrefs = (UserPreferences)userPrefsProvider.get();
            transferpickconversationfragment.adapter = (ConversationAdapter)adapterProvider.get();
            transferpickconversationfragment.async = (AsyncService)asyncProvider.get();
            transferpickconversationfragment.map = (ObjectIdMap)mapProvider.get();
            transferpickconversationfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            transferpickconversationfragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            transferpickconversationfragment.analytics = (Analytics)analyticsProvider.get();
            transferpickconversationfragment.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((TransferPickConversationFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/transfer/TransferPickConversationFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
