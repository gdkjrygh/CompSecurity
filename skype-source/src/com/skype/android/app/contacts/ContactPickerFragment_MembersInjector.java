// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.SkypeListFragment_MembersInjector;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.media.MediaDocumentUploadUtil;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.telemetry.TelemetryHelper;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactPickerFragment, ContactAdapter, ContactAdapterViewBuilder, PickerFragment

public final class ContactPickerFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityAndAccessibilityUtilProvider;
    private final Provider accountProvider;
    private final Provider adapterProvider;
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
    private final Provider telemetryHelperProvider;
    private final Provider transferUtilProvider;
    private final Provider typeFaceFactoryProvider;
    private final Provider userPrefsProvider;
    private final Provider viewBuilderProvider;

    public ContactPickerFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17)
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
        accountProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        adapterProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        viewBuilderProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        telemetryHelperProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        } else
        {
            ecsConfigurationProvider = provider17;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17)
    {
        return new ContactPickerFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    public static void injectAccessibility(ContactPickerFragment contactpickerfragment, Provider provider)
    {
        contactpickerfragment.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectAccount(ContactPickerFragment contactpickerfragment, Provider provider)
    {
        contactpickerfragment.account = (Account)provider.get();
    }

    public static void injectAdapter(ContactPickerFragment contactpickerfragment, Provider provider)
    {
        contactpickerfragment.adapter = (ContactAdapter)provider.get();
    }

    public static void injectAsync(ContactPickerFragment contactpickerfragment, Provider provider)
    {
        contactpickerfragment.async = (AsyncService)provider.get();
    }

    public static void injectContactUtil(ContactPickerFragment contactpickerfragment, Provider provider)
    {
        contactpickerfragment.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectEcsConfiguration(ContactPickerFragment contactpickerfragment, Provider provider)
    {
        contactpickerfragment.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectLayoutExperience(ContactPickerFragment contactpickerfragment, Provider provider)
    {
        contactpickerfragment.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(ContactPickerFragment contactpickerfragment, Provider provider)
    {
        contactpickerfragment.lib = (SkyLib)provider.get();
    }

    public static void injectMap(ContactPickerFragment contactpickerfragment, Provider provider)
    {
        contactpickerfragment.map = (ObjectIdMap)provider.get();
    }

    public static void injectNavigation(ContactPickerFragment contactpickerfragment, Provider provider)
    {
        contactpickerfragment.navigation = (Navigation)provider.get();
    }

    public static void injectTelemetryHelper(ContactPickerFragment contactpickerfragment, Provider provider)
    {
        contactpickerfragment.telemetryHelper = (TelemetryHelper)provider.get();
    }

    public static void injectViewBuilder(ContactPickerFragment contactpickerfragment, Provider provider)
    {
        contactpickerfragment.viewBuilder = (ContactAdapterViewBuilder)provider.get();
    }

    public final void injectMembers(ContactPickerFragment contactpickerfragment)
    {
        if (contactpickerfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(contactpickerfragment, objectInterfaceFinderProvider);
            SkypeListFragment_MembersInjector.injectAccessibilityUtil(contactpickerfragment, accessibilityAndAccessibilityUtilProvider);
            contactpickerfragment.accessibility = (AccessibilityUtil)accessibilityAndAccessibilityUtilProvider.get();
            contactpickerfragment.async = (AsyncService)asyncProvider.get();
            contactpickerfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactpickerfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            contactpickerfragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            contactpickerfragment.lib = (SkyLib)libProvider.get();
            contactpickerfragment.userPrefs = (UserPreferences)userPrefsProvider.get();
            contactpickerfragment.map = (ObjectIdMap)mapProvider.get();
            contactpickerfragment.mediaDocumentUploadUtil = (MediaDocumentUploadUtil)mediaDocumentUploadUtilProvider.get();
            contactpickerfragment.navigation = (Navigation)navigationProvider.get();
            contactpickerfragment.typeFaceFactory = (TypeFaceFactory)typeFaceFactoryProvider.get();
            contactpickerfragment.transferUtil = (TransferUtil)transferUtilProvider.get();
            contactpickerfragment.async = (AsyncService)asyncProvider.get();
            contactpickerfragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            contactpickerfragment.lib = (SkyLib)libProvider.get();
            contactpickerfragment.map = (ObjectIdMap)mapProvider.get();
            contactpickerfragment.account = (Account)accountProvider.get();
            contactpickerfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactpickerfragment.adapter = (ContactAdapter)adapterProvider.get();
            contactpickerfragment.accessibility = (AccessibilityUtil)accessibilityAndAccessibilityUtilProvider.get();
            contactpickerfragment.viewBuilder = (ContactAdapterViewBuilder)viewBuilderProvider.get();
            contactpickerfragment.navigation = (Navigation)navigationProvider.get();
            contactpickerfragment.telemetryHelper = (TelemetryHelper)telemetryHelperProvider.get();
            contactpickerfragment.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactPickerFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactPickerFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
