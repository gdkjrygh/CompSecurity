// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.favorites;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.SkypeListFragment_MembersInjector;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.contacts.ContactPickerFragment_MembersInjector;
import com.skype.android.app.contacts.PickerFragment_MembersInjector;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.favorites:
//            FavoritesPickContactsFragment

public final class FavoritesPickContactsFragment_MembersInjector
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

    public FavoritesPickContactsFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        return new FavoritesPickContactsFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    public static void injectAccessibility(FavoritesPickContactsFragment favoritespickcontactsfragment, Provider provider)
    {
        favoritespickcontactsfragment.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectLayoutExperience(FavoritesPickContactsFragment favoritespickcontactsfragment, Provider provider)
    {
        favoritespickcontactsfragment.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectMap(FavoritesPickContactsFragment favoritespickcontactsfragment, Provider provider)
    {
        favoritespickcontactsfragment.map = (ObjectIdMap)provider.get();
    }

    public final void injectMembers(FavoritesPickContactsFragment favoritespickcontactsfragment)
    {
        if (favoritespickcontactsfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(favoritespickcontactsfragment, objectInterfaceFinderProvider);
            SkypeListFragment_MembersInjector.injectAccessibilityUtil(favoritespickcontactsfragment, accessibilityAndAccessibilityUtilProvider);
            PickerFragment_MembersInjector.injectAccessibility(favoritespickcontactsfragment, accessibilityAndAccessibilityUtilProvider);
            PickerFragment_MembersInjector.injectAsync(favoritespickcontactsfragment, asyncProvider);
            PickerFragment_MembersInjector.injectContactUtil(favoritespickcontactsfragment, contactUtilProvider);
            PickerFragment_MembersInjector.injectConversationUtil(favoritespickcontactsfragment, conversationUtilProvider);
            PickerFragment_MembersInjector.injectLayoutExperience(favoritespickcontactsfragment, layoutExperienceProvider);
            PickerFragment_MembersInjector.injectLib(favoritespickcontactsfragment, libProvider);
            PickerFragment_MembersInjector.injectUserPrefs(favoritespickcontactsfragment, userPrefsProvider);
            PickerFragment_MembersInjector.injectMap(favoritespickcontactsfragment, mapProvider);
            PickerFragment_MembersInjector.injectMediaDocumentUploadUtil(favoritespickcontactsfragment, mediaDocumentUploadUtilProvider);
            PickerFragment_MembersInjector.injectNavigation(favoritespickcontactsfragment, navigationProvider);
            PickerFragment_MembersInjector.injectTypeFaceFactory(favoritespickcontactsfragment, typeFaceFactoryProvider);
            PickerFragment_MembersInjector.injectTransferUtil(favoritespickcontactsfragment, transferUtilProvider);
            ContactPickerFragment_MembersInjector.injectAsync(favoritespickcontactsfragment, asyncProvider);
            ContactPickerFragment_MembersInjector.injectLayoutExperience(favoritespickcontactsfragment, layoutExperienceProvider);
            ContactPickerFragment_MembersInjector.injectLib(favoritespickcontactsfragment, libProvider);
            ContactPickerFragment_MembersInjector.injectMap(favoritespickcontactsfragment, mapProvider);
            ContactPickerFragment_MembersInjector.injectAccount(favoritespickcontactsfragment, accountProvider);
            ContactPickerFragment_MembersInjector.injectContactUtil(favoritespickcontactsfragment, contactUtilProvider);
            ContactPickerFragment_MembersInjector.injectAdapter(favoritespickcontactsfragment, adapterProvider);
            ContactPickerFragment_MembersInjector.injectAccessibility(favoritespickcontactsfragment, accessibilityAndAccessibilityUtilProvider);
            ContactPickerFragment_MembersInjector.injectViewBuilder(favoritespickcontactsfragment, viewBuilderProvider);
            ContactPickerFragment_MembersInjector.injectNavigation(favoritespickcontactsfragment, navigationProvider);
            ContactPickerFragment_MembersInjector.injectTelemetryHelper(favoritespickcontactsfragment, telemetryHelperProvider);
            ContactPickerFragment_MembersInjector.injectEcsConfiguration(favoritespickcontactsfragment, ecsConfigurationProvider);
            favoritespickcontactsfragment.accessibility = (AccessibilityUtil)accessibilityAndAccessibilityUtilProvider.get();
            favoritespickcontactsfragment.map = (ObjectIdMap)mapProvider.get();
            favoritespickcontactsfragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((FavoritesPickContactsFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/favorites/FavoritesPickContactsFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
