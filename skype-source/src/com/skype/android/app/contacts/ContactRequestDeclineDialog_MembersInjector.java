// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.NotificationManager;
import com.skype.SkyLib;
import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.event.EventBus;
import com.skype.android.util.ContactUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactRequestDeclineDialog, ContactBlockDialog

public final class ContactRequestDeclineDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider contactUtilProvider;
    private final Provider eventBusProvider;
    private final Provider libProvider;
    private final Provider notificationManagerProvider;
    private final Provider objectInterfaceFinderProvider;

    public ContactRequestDeclineDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
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
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        } else
        {
            notificationManagerProvider = provider4;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new ContactRequestDeclineDialog_MembersInjector(provider, provider1, provider2, provider3, provider4);
    }

    public static void injectNotificationManager(ContactRequestDeclineDialog contactrequestdeclinedialog, Provider provider)
    {
        contactrequestdeclinedialog.notificationManager = (NotificationManager)provider.get();
    }

    public final void injectMembers(ContactRequestDeclineDialog contactrequestdeclinedialog)
    {
        if (contactrequestdeclinedialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(contactrequestdeclinedialog, objectInterfaceFinderProvider);
            contactrequestdeclinedialog.lib = (SkyLib)libProvider.get();
            contactrequestdeclinedialog.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactrequestdeclinedialog.eventBus = (EventBus)eventBusProvider.get();
            contactrequestdeclinedialog.notificationManager = (NotificationManager)notificationManagerProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactRequestDeclineDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactRequestDeclineDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
