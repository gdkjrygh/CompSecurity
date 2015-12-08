// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.SkypeListFragment_MembersInjector;
import com.skype.android.app.Navigation;
import com.skype.android.app.contacts.ContactPickerFragment_MembersInjector;
import com.skype.android.app.contacts.PickerFragment_MembersInjector;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ViewStateManager;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            AddParticipantsAccessibilityFragment

public final class AddParticipantsAccessibilityFragment_MembersInjector
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
    private final Provider viewStateProvider;

    public AddParticipantsAccessibilityFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18)
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
        } else
        {
            viewStateProvider = provider18;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18)
    {
        return new AddParticipantsAccessibilityFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    public static void injectAccount(AddParticipantsAccessibilityFragment addparticipantsaccessibilityfragment, Provider provider)
    {
        addparticipantsaccessibilityfragment.account = (Account)provider.get();
    }

    public static void injectConversationUtil(AddParticipantsAccessibilityFragment addparticipantsaccessibilityfragment, Provider provider)
    {
        addparticipantsaccessibilityfragment.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectLib(AddParticipantsAccessibilityFragment addparticipantsaccessibilityfragment, Provider provider)
    {
        addparticipantsaccessibilityfragment.lib = (SkyLib)provider.get();
    }

    public static void injectMap(AddParticipantsAccessibilityFragment addparticipantsaccessibilityfragment, Provider provider)
    {
        addparticipantsaccessibilityfragment.map = (ObjectIdMap)provider.get();
    }

    public static void injectNavigation(AddParticipantsAccessibilityFragment addparticipantsaccessibilityfragment, Provider provider)
    {
        addparticipantsaccessibilityfragment.navigation = (Navigation)provider.get();
    }

    public static void injectViewState(AddParticipantsAccessibilityFragment addparticipantsaccessibilityfragment, Provider provider)
    {
        addparticipantsaccessibilityfragment.viewState = (ViewStateManager)provider.get();
    }

    public final void injectMembers(AddParticipantsAccessibilityFragment addparticipantsaccessibilityfragment)
    {
        if (addparticipantsaccessibilityfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(addparticipantsaccessibilityfragment, objectInterfaceFinderProvider);
            SkypeListFragment_MembersInjector.injectAccessibilityUtil(addparticipantsaccessibilityfragment, accessibilityAndAccessibilityUtilProvider);
            PickerFragment_MembersInjector.injectAccessibility(addparticipantsaccessibilityfragment, accessibilityAndAccessibilityUtilProvider);
            PickerFragment_MembersInjector.injectAsync(addparticipantsaccessibilityfragment, asyncProvider);
            PickerFragment_MembersInjector.injectContactUtil(addparticipantsaccessibilityfragment, contactUtilProvider);
            PickerFragment_MembersInjector.injectConversationUtil(addparticipantsaccessibilityfragment, conversationUtilProvider);
            PickerFragment_MembersInjector.injectLayoutExperience(addparticipantsaccessibilityfragment, layoutExperienceProvider);
            PickerFragment_MembersInjector.injectLib(addparticipantsaccessibilityfragment, libProvider);
            PickerFragment_MembersInjector.injectUserPrefs(addparticipantsaccessibilityfragment, userPrefsProvider);
            PickerFragment_MembersInjector.injectMap(addparticipantsaccessibilityfragment, mapProvider);
            PickerFragment_MembersInjector.injectMediaDocumentUploadUtil(addparticipantsaccessibilityfragment, mediaDocumentUploadUtilProvider);
            PickerFragment_MembersInjector.injectNavigation(addparticipantsaccessibilityfragment, navigationProvider);
            PickerFragment_MembersInjector.injectTypeFaceFactory(addparticipantsaccessibilityfragment, typeFaceFactoryProvider);
            PickerFragment_MembersInjector.injectTransferUtil(addparticipantsaccessibilityfragment, transferUtilProvider);
            ContactPickerFragment_MembersInjector.injectAsync(addparticipantsaccessibilityfragment, asyncProvider);
            ContactPickerFragment_MembersInjector.injectLayoutExperience(addparticipantsaccessibilityfragment, layoutExperienceProvider);
            ContactPickerFragment_MembersInjector.injectLib(addparticipantsaccessibilityfragment, libProvider);
            ContactPickerFragment_MembersInjector.injectMap(addparticipantsaccessibilityfragment, mapProvider);
            ContactPickerFragment_MembersInjector.injectAccount(addparticipantsaccessibilityfragment, accountProvider);
            ContactPickerFragment_MembersInjector.injectContactUtil(addparticipantsaccessibilityfragment, contactUtilProvider);
            ContactPickerFragment_MembersInjector.injectAdapter(addparticipantsaccessibilityfragment, adapterProvider);
            ContactPickerFragment_MembersInjector.injectAccessibility(addparticipantsaccessibilityfragment, accessibilityAndAccessibilityUtilProvider);
            ContactPickerFragment_MembersInjector.injectViewBuilder(addparticipantsaccessibilityfragment, viewBuilderProvider);
            ContactPickerFragment_MembersInjector.injectNavigation(addparticipantsaccessibilityfragment, navigationProvider);
            ContactPickerFragment_MembersInjector.injectTelemetryHelper(addparticipantsaccessibilityfragment, telemetryHelperProvider);
            ContactPickerFragment_MembersInjector.injectEcsConfiguration(addparticipantsaccessibilityfragment, ecsConfigurationProvider);
            addparticipantsaccessibilityfragment.account = (Account)accountProvider.get();
            addparticipantsaccessibilityfragment.lib = (SkyLib)libProvider.get();
            addparticipantsaccessibilityfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            addparticipantsaccessibilityfragment.viewState = (ViewStateManager)viewStateProvider.get();
            addparticipantsaccessibilityfragment.navigation = (Navigation)navigationProvider.get();
            addparticipantsaccessibilityfragment.map = (ObjectIdMap)mapProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AddParticipantsAccessibilityFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/AddParticipantsAccessibilityFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
