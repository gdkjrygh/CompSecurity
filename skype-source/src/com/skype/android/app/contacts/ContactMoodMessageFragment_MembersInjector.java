// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.util.ContactUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactMoodMessageFragment

public final class ContactMoodMessageFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider contactUtilProvider;
    private final Provider objectInterfaceFinderProvider;

    public ContactMoodMessageFragment_MembersInjector(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            contactUtilProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new ContactMoodMessageFragment_MembersInjector(provider, provider1);
    }

    public static void injectContactUtil(ContactMoodMessageFragment contactmoodmessagefragment, Provider provider)
    {
        contactmoodmessagefragment.contactUtil = (ContactUtil)provider.get();
    }

    public final void injectMembers(ContactMoodMessageFragment contactmoodmessagefragment)
    {
        if (contactmoodmessagefragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(contactmoodmessagefragment, objectInterfaceFinderProvider);
            contactmoodmessagefragment.contactUtil = (ContactUtil)contactUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactMoodMessageFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactMoodMessageFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
