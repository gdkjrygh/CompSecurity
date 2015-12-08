// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.sync:
//            ContactsObserver, ContactsIngestManager

public final class ContactsObserver_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contactsIngestManagerProvider;
    private final MembersInjector membersInjector;

    public ContactsObserver_Factory(MembersInjector membersinjector, Provider provider)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            contactsIngestManagerProvider = provider;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider)
    {
        return new ContactsObserver_Factory(membersinjector, provider);
    }

    public final ContactsObserver get()
    {
        ContactsObserver contactsobserver = new ContactsObserver((ContactsIngestManager)contactsIngestManagerProvider.get());
        membersInjector.injectMembers(contactsobserver);
        return contactsobserver;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/sync/ContactsObserver_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
