// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.SkypeListFragment_MembersInjector;
import com.skype.android.app.Navigation;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactTopPicksFragment, ContactTopPicksGridListAdapter

public final class ContactTopPicksFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityAndAccessibilityUtilProvider;
    private final Provider accountProvider;
    private final Provider adapterProvider;
    private final Provider asyncProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider navProvider;
    private final Provider objectInterfaceFinderProvider;

    public ContactTopPicksFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9)
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
        libProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        navProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        adapterProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        } else
        {
            conversationUtilProvider = provider9;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9)
    {
        return new ContactTopPicksFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static void injectAccessibility(ContactTopPicksFragment contacttoppicksfragment, Provider provider)
    {
        contacttoppicksfragment.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectAccount(ContactTopPicksFragment contacttoppicksfragment, Provider provider)
    {
        contacttoppicksfragment.account = (Account)provider.get();
    }

    public static void injectAdapter(ContactTopPicksFragment contacttoppicksfragment, Provider provider)
    {
        contacttoppicksfragment.adapter = (ContactTopPicksGridListAdapter)provider.get();
    }

    public static void injectAsync(ContactTopPicksFragment contacttoppicksfragment, Provider provider)
    {
        contacttoppicksfragment.async = (AsyncService)provider.get();
    }

    public static void injectContactUtil(ContactTopPicksFragment contacttoppicksfragment, Provider provider)
    {
        contacttoppicksfragment.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(ContactTopPicksFragment contacttoppicksfragment, Provider provider)
    {
        contacttoppicksfragment.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectLib(ContactTopPicksFragment contacttoppicksfragment, Provider provider)
    {
        contacttoppicksfragment.lib = (SkyLib)provider.get();
    }

    public static void injectMap(ContactTopPicksFragment contacttoppicksfragment, Provider provider)
    {
        contacttoppicksfragment.map = (ObjectIdMap)provider.get();
    }

    public static void injectNav(ContactTopPicksFragment contacttoppicksfragment, Provider provider)
    {
        contacttoppicksfragment.nav = (Navigation)provider.get();
    }

    public final void injectMembers(ContactTopPicksFragment contacttoppicksfragment)
    {
        if (contacttoppicksfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(contacttoppicksfragment, objectInterfaceFinderProvider);
            SkypeListFragment_MembersInjector.injectAccessibilityUtil(contacttoppicksfragment, accessibilityAndAccessibilityUtilProvider);
            contacttoppicksfragment.async = (AsyncService)asyncProvider.get();
            contacttoppicksfragment.lib = (SkyLib)libProvider.get();
            contacttoppicksfragment.map = (ObjectIdMap)mapProvider.get();
            contacttoppicksfragment.account = (Account)accountProvider.get();
            contacttoppicksfragment.nav = (Navigation)navProvider.get();
            contacttoppicksfragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            contacttoppicksfragment.adapter = (ContactTopPicksGridListAdapter)adapterProvider.get();
            contacttoppicksfragment.accessibility = (AccessibilityUtil)accessibilityAndAccessibilityUtilProvider.get();
            contacttoppicksfragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactTopPicksFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactTopPicksFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
