// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.SkypeListFragment_MembersInjector;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.media.MediaDocumentUploadUtil;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            PickerFragment

public final class PickerFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityAndAccessibilityUtilProvider;
    private final Provider asyncProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider mediaDocumentUploadUtilProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider transferUtilProvider;
    private final Provider typeFaceFactoryProvider;
    private final Provider userPrefsProvider;

    public PickerFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
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
        } else
        {
            transferUtilProvider = provider12;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        return new PickerFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectAccessibility(PickerFragment pickerfragment, Provider provider)
    {
        pickerfragment.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectAsync(PickerFragment pickerfragment, Provider provider)
    {
        pickerfragment.async = (AsyncService)provider.get();
    }

    public static void injectContactUtil(PickerFragment pickerfragment, Provider provider)
    {
        pickerfragment.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(PickerFragment pickerfragment, Provider provider)
    {
        pickerfragment.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectLayoutExperience(PickerFragment pickerfragment, Provider provider)
    {
        pickerfragment.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(PickerFragment pickerfragment, Provider provider)
    {
        pickerfragment.lib = (SkyLib)provider.get();
    }

    public static void injectMap(PickerFragment pickerfragment, Provider provider)
    {
        pickerfragment.map = (ObjectIdMap)provider.get();
    }

    public static void injectMediaDocumentUploadUtil(PickerFragment pickerfragment, Provider provider)
    {
        pickerfragment.mediaDocumentUploadUtil = (MediaDocumentUploadUtil)provider.get();
    }

    public static void injectNavigation(PickerFragment pickerfragment, Provider provider)
    {
        pickerfragment.navigation = (Navigation)provider.get();
    }

    public static void injectTransferUtil(PickerFragment pickerfragment, Provider provider)
    {
        pickerfragment.transferUtil = (TransferUtil)provider.get();
    }

    public static void injectTypeFaceFactory(PickerFragment pickerfragment, Provider provider)
    {
        pickerfragment.typeFaceFactory = (TypeFaceFactory)provider.get();
    }

    public static void injectUserPrefs(PickerFragment pickerfragment, Provider provider)
    {
        pickerfragment.userPrefs = (UserPreferences)provider.get();
    }

    public final void injectMembers(PickerFragment pickerfragment)
    {
        if (pickerfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(pickerfragment, objectInterfaceFinderProvider);
            SkypeListFragment_MembersInjector.injectAccessibilityUtil(pickerfragment, accessibilityAndAccessibilityUtilProvider);
            pickerfragment.accessibility = (AccessibilityUtil)accessibilityAndAccessibilityUtilProvider.get();
            pickerfragment.async = (AsyncService)asyncProvider.get();
            pickerfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            pickerfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            pickerfragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            pickerfragment.lib = (SkyLib)libProvider.get();
            pickerfragment.userPrefs = (UserPreferences)userPrefsProvider.get();
            pickerfragment.map = (ObjectIdMap)mapProvider.get();
            pickerfragment.mediaDocumentUploadUtil = (MediaDocumentUploadUtil)mediaDocumentUploadUtilProvider.get();
            pickerfragment.navigation = (Navigation)navigationProvider.get();
            pickerfragment.typeFaceFactory = (TypeFaceFactory)typeFaceFactoryProvider.get();
            pickerfragment.transferUtil = (TransferUtil)transferUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PickerFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/PickerFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
