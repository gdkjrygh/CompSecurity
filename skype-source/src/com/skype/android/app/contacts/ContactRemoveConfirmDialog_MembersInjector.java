// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.event.EventBus;
import com.skype.android.util.ContactUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactRemoveConfirmDialog

public final class ContactRemoveConfirmDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider contactUtilProvider;
    private final Provider eventBusProvider;
    private final Provider objectInterfaceFinderProvider;

    public ContactRemoveConfirmDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2)
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
        contactUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            eventBusProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new ContactRemoveConfirmDialog_MembersInjector(provider, provider1, provider2);
    }

    public static void injectContactUtil(ContactRemoveConfirmDialog contactremoveconfirmdialog, Provider provider)
    {
        contactremoveconfirmdialog.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectEventBus(ContactRemoveConfirmDialog contactremoveconfirmdialog, Provider provider)
    {
        contactremoveconfirmdialog.eventBus = (EventBus)provider.get();
    }

    public final void injectMembers(ContactRemoveConfirmDialog contactremoveconfirmdialog)
    {
        if (contactremoveconfirmdialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(contactremoveconfirmdialog, objectInterfaceFinderProvider);
            contactremoveconfirmdialog.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactremoveconfirmdialog.eventBus = (EventBus)eventBusProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactRemoveConfirmDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactRemoveConfirmDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
