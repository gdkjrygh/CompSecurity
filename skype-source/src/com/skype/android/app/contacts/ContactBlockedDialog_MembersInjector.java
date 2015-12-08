// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.app.Navigation;
import com.skype.android.util.ContactUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactBlockedDialog

public final class ContactBlockedDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider contactUtilProvider;
    private final Provider navProvider;
    private final Provider objectInterfaceFinderProvider;

    public ContactBlockedDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2)
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
            navProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new ContactBlockedDialog_MembersInjector(provider, provider1, provider2);
    }

    public static void injectContactUtil(ContactBlockedDialog contactblockeddialog, Provider provider)
    {
        contactblockeddialog.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectNav(ContactBlockedDialog contactblockeddialog, Provider provider)
    {
        contactblockeddialog.nav = (Navigation)provider.get();
    }

    public final void injectMembers(ContactBlockedDialog contactblockeddialog)
    {
        if (contactblockeddialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(contactblockeddialog, objectInterfaceFinderProvider);
            contactblockeddialog.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactblockeddialog.nav = (Navigation)navProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactBlockedDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactBlockedDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
