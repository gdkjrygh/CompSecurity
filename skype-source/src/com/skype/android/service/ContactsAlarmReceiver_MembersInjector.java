// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import com.skype.android.sync.ContactsIngestManager;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.service:
//            ContactsAlarmReceiver

public final class ContactsAlarmReceiver_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider contactsIngestManagerProvider;

    public ContactsAlarmReceiver_MembersInjector(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            contactsIngestManagerProvider = provider;
            return;
        }
    }

    public static MembersInjector create(Provider provider)
    {
        return new ContactsAlarmReceiver_MembersInjector(provider);
    }

    public static void injectContactsIngestManager(ContactsAlarmReceiver contactsalarmreceiver, Provider provider)
    {
        contactsalarmreceiver.contactsIngestManager = (ContactsIngestManager)provider.get();
    }

    public final void injectMembers(ContactsAlarmReceiver contactsalarmreceiver)
    {
        if (contactsalarmreceiver == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            contactsalarmreceiver.contactsIngestManager = (ContactsIngestManager)contactsIngestManagerProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactsAlarmReceiver)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/service/ContactsAlarmReceiver_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
