// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.SkypeListFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.media.MediaDocumentUploadUtil;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.shortcircuit.PromotedSCDContactsManager;
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
//            ContactSuggestedInvitesPickerFragment, PickerFragment, ContactPickerFragment, ContactAdapter, 
//            ContactAdapterViewBuilder

public final class ContactSuggestedInvitesPickerFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityAndAccessibilityUtilProvider;
    private final Provider accountProvider;
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
    private final Provider promotedSCDContactsManagerProvider;
    private final Provider telemetryHelperProvider;
    private final Provider transferUtilProvider;
    private final Provider typeFaceFactoryProvider;
    private final Provider userPrefsProvider;
    private final Provider viewBuilderProvider;

    public ContactSuggestedInvitesPickerFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19)
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
        }
        ecsConfigurationProvider = provider17;
        if (!$assertionsDisabled && provider18 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider18;
        if (!$assertionsDisabled && provider19 == null)
        {
            throw new AssertionError();
        } else
        {
            promotedSCDContactsManagerProvider = provider19;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19)
    {
        return new ContactSuggestedInvitesPickerFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19);
    }

    public static void injectAccessibility(ContactSuggestedInvitesPickerFragment contactsuggestedinvitespickerfragment, Provider provider)
    {
        contactsuggestedinvitespickerfragment.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectAnalytics(ContactSuggestedInvitesPickerFragment contactsuggestedinvitespickerfragment, Provider provider)
    {
        contactsuggestedinvitespickerfragment.analytics = (Analytics)provider.get();
    }

    public static void injectContactUtil(ContactSuggestedInvitesPickerFragment contactsuggestedinvitespickerfragment, Provider provider)
    {
        contactsuggestedinvitespickerfragment.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectPromotedSCDContactsManager(ContactSuggestedInvitesPickerFragment contactsuggestedinvitespickerfragment, Provider provider)
    {
        contactsuggestedinvitespickerfragment.promotedSCDContactsManager = (PromotedSCDContactsManager)provider.get();
    }

    public final void injectMembers(ContactSuggestedInvitesPickerFragment contactsuggestedinvitespickerfragment)
    {
        if (contactsuggestedinvitespickerfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(contactsuggestedinvitespickerfragment, objectInterfaceFinderProvider);
            SkypeListFragment_MembersInjector.injectAccessibilityUtil(contactsuggestedinvitespickerfragment, accessibilityAndAccessibilityUtilProvider);
            contactsuggestedinvitespickerfragment.accessibility = (AccessibilityUtil)accessibilityAndAccessibilityUtilProvider.get();
            contactsuggestedinvitespickerfragment.async = (AsyncService)asyncProvider.get();
            contactsuggestedinvitespickerfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactsuggestedinvitespickerfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            contactsuggestedinvitespickerfragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            contactsuggestedinvitespickerfragment.lib = (SkyLib)libProvider.get();
            contactsuggestedinvitespickerfragment.userPrefs = (UserPreferences)userPrefsProvider.get();
            contactsuggestedinvitespickerfragment.map = (ObjectIdMap)mapProvider.get();
            contactsuggestedinvitespickerfragment.mediaDocumentUploadUtil = (MediaDocumentUploadUtil)mediaDocumentUploadUtilProvider.get();
            contactsuggestedinvitespickerfragment.navigation = (Navigation)navigationProvider.get();
            contactsuggestedinvitespickerfragment.typeFaceFactory = (TypeFaceFactory)typeFaceFactoryProvider.get();
            contactsuggestedinvitespickerfragment.transferUtil = (TransferUtil)transferUtilProvider.get();
            contactsuggestedinvitespickerfragment.async = (AsyncService)asyncProvider.get();
            contactsuggestedinvitespickerfragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            contactsuggestedinvitespickerfragment.lib = (SkyLib)libProvider.get();
            contactsuggestedinvitespickerfragment.map = (ObjectIdMap)mapProvider.get();
            contactsuggestedinvitespickerfragment.account = (Account)accountProvider.get();
            contactsuggestedinvitespickerfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactsuggestedinvitespickerfragment.adapter = (ContactAdapter)adapterProvider.get();
            contactsuggestedinvitespickerfragment.accessibility = (AccessibilityUtil)accessibilityAndAccessibilityUtilProvider.get();
            contactsuggestedinvitespickerfragment.viewBuilder = (ContactAdapterViewBuilder)viewBuilderProvider.get();
            contactsuggestedinvitespickerfragment.navigation = (Navigation)navigationProvider.get();
            contactsuggestedinvitespickerfragment.telemetryHelper = (TelemetryHelper)telemetryHelperProvider.get();
            contactsuggestedinvitespickerfragment.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            contactsuggestedinvitespickerfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactsuggestedinvitespickerfragment.analytics = (Analytics)analyticsProvider.get();
            contactsuggestedinvitespickerfragment.promotedSCDContactsManager = (PromotedSCDContactsManager)promotedSCDContactsManagerProvider.get();
            contactsuggestedinvitespickerfragment.accessibility = (AccessibilityUtil)accessibilityAndAccessibilityUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactSuggestedInvitesPickerFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactSuggestedInvitesPickerFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
