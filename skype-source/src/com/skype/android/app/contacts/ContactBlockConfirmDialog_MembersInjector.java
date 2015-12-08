// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.SkyLib;
import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.event.EventBus;
import com.skype.android.util.ContactUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactBlockDialog, ContactBlockConfirmDialog

public final class ContactBlockConfirmDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider contactUtilProvider;
    private final Provider eventBusProvider;
    private final Provider libProvider;
    private final Provider objectInterfaceFinderProvider;

    public ContactBlockConfirmDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3)
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
        } else
        {
            eventBusProvider = provider3;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new ContactBlockConfirmDialog_MembersInjector(provider, provider1, provider2, provider3);
    }

    public final void injectMembers(ContactBlockConfirmDialog contactblockconfirmdialog)
    {
        if (contactblockconfirmdialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(contactblockconfirmdialog, objectInterfaceFinderProvider);
            contactblockconfirmdialog.lib = (SkyLib)libProvider.get();
            contactblockconfirmdialog.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactblockconfirmdialog.eventBus = (EventBus)eventBusProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactBlockConfirmDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactBlockConfirmDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
