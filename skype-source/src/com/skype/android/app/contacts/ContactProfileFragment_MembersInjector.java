// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.NotificationManager;
import com.skype.SkyLib;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.SpanUtil;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.permission.PermissionRequest;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactProfileFragment

public final class ContactProfileFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider imageCacheProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider navigationProvider;
    private final Provider notificationManagerProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider permissionRequestProvider;
    private final Provider spanUtilProvider;
    private final Provider timeUtilProvider;

    public ContactProfileFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11)
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
        timeUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider2;
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
        navigationProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        notificationManagerProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        spanUtilProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        } else
        {
            permissionRequestProvider = provider11;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11)
    {
        return new ContactProfileFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static void injectAnalytics(ContactProfileFragment contactprofilefragment, Provider provider)
    {
        contactprofilefragment.analytics = (Analytics)provider.get();
    }

    public static void injectContactUtil(ContactProfileFragment contactprofilefragment, Provider provider)
    {
        contactprofilefragment.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(ContactProfileFragment contactprofilefragment, Provider provider)
    {
        contactprofilefragment.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectImageCache(ContactProfileFragment contactprofilefragment, Provider provider)
    {
        contactprofilefragment.imageCache = (ImageCache)provider.get();
    }

    public static void injectLayoutExperience(ContactProfileFragment contactprofilefragment, Provider provider)
    {
        contactprofilefragment.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(ContactProfileFragment contactprofilefragment, Provider provider)
    {
        contactprofilefragment.lib = (SkyLib)provider.get();
    }

    public static void injectNavigation(ContactProfileFragment contactprofilefragment, Provider provider)
    {
        contactprofilefragment.navigation = (Navigation)provider.get();
    }

    public static void injectNotificationManager(ContactProfileFragment contactprofilefragment, Provider provider)
    {
        contactprofilefragment.notificationManager = (NotificationManager)provider.get();
    }

    public static void injectPermissionRequest(ContactProfileFragment contactprofilefragment, Provider provider)
    {
        contactprofilefragment.permissionRequest = (PermissionRequest)provider.get();
    }

    public static void injectSpanUtil(ContactProfileFragment contactprofilefragment, Provider provider)
    {
        contactprofilefragment.spanUtil = (SpanUtil)provider.get();
    }

    public static void injectTimeUtil(ContactProfileFragment contactprofilefragment, Provider provider)
    {
        contactprofilefragment.timeUtil = (TimeUtil)provider.get();
    }

    public final void injectMembers(ContactProfileFragment contactprofilefragment)
    {
        if (contactprofilefragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(contactprofilefragment, objectInterfaceFinderProvider);
            contactprofilefragment.timeUtil = (TimeUtil)timeUtilProvider.get();
            contactprofilefragment.imageCache = (ImageCache)imageCacheProvider.get();
            contactprofilefragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactprofilefragment.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            contactprofilefragment.navigation = (Navigation)navigationProvider.get();
            contactprofilefragment.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            contactprofilefragment.lib = (SkyLib)libProvider.get();
            contactprofilefragment.analytics = (Analytics)analyticsProvider.get();
            contactprofilefragment.notificationManager = (NotificationManager)notificationManagerProvider.get();
            contactprofilefragment.spanUtil = (SpanUtil)spanUtilProvider.get();
            contactprofilefragment.permissionRequest = (PermissionRequest)permissionRequestProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactProfileFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactProfileFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
