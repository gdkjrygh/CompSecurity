// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.NotificationManager;
import com.skype.SkyLib;
import com.skype.android.app.Agent_MembersInjector;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeUtil;
import com.skype.android.wakeup.ForegroundState;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactAgent

public final class ContactAgent_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider contactUtilProvider;
    private final Provider foregroundStateProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider notificationManagerProvider;
    private final Provider timeUtilProvider;
    private final Provider userPrefsProvider;

    public ContactAgent_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        notificationManagerProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        foregroundStateProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        } else
        {
            timeUtilProvider = provider8;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8)
    {
        return new ContactAgent_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static void injectContactUtil(ContactAgent contactagent, Provider provider)
    {
        contactagent.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectForegroundState(ContactAgent contactagent, Provider provider)
    {
        contactagent.foregroundState = (ForegroundState)provider.get();
    }

    public static void injectImageCache(ContactAgent contactagent, Provider provider)
    {
        contactagent.imageCache = (ImageCache)provider.get();
    }

    public static void injectLib(ContactAgent contactagent, Provider provider)
    {
        contactagent.lib = (SkyLib)provider.get();
    }

    public static void injectMap(ContactAgent contactagent, Provider provider)
    {
        contactagent.map = (ObjectIdMap)provider.get();
    }

    public static void injectNotificationManager(ContactAgent contactagent, Provider provider)
    {
        contactagent.notificationManager = (NotificationManager)provider.get();
    }

    public static void injectTimeUtil(ContactAgent contactagent, Provider provider)
    {
        contactagent.timeUtil = (TimeUtil)provider.get();
    }

    public final void injectMembers(ContactAgent contactagent)
    {
        if (contactagent == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            Agent_MembersInjector.injectAccountProvider(contactagent, accountProvider);
            Agent_MembersInjector.injectUserPrefsProvider(contactagent, userPrefsProvider);
            contactagent.lib = (SkyLib)libProvider.get();
            contactagent.imageCache = (ImageCache)imageCacheProvider.get();
            contactagent.notificationManager = (NotificationManager)notificationManagerProvider.get();
            contactagent.map = (ObjectIdMap)mapProvider.get();
            contactagent.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactagent.foregroundState = (ForegroundState)foregroundStateProvider.get();
            contactagent.timeUtil = (TimeUtil)timeUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactAgent)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactAgent_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
