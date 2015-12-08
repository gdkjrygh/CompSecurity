// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Activity;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactSearchAdapter, ContactAdapterViewBuilder

public final class ContactSearchAdapter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider contactUtilProvider;
    private final Provider contextProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final MembersInjector membersInjector;
    private final Provider viewBuilderProvider;

    public ContactSearchAdapter_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            viewBuilderProvider = provider5;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new ContactSearchAdapter_Factory(membersinjector, provider, provider1, provider2, provider3, provider4, provider5);
    }

    public final ContactSearchAdapter get()
    {
        ContactSearchAdapter contactsearchadapter = new ContactSearchAdapter((Activity)contextProvider.get(), (SkyLib)libProvider.get(), (ObjectIdMap)mapProvider.get(), (Account)accountProvider.get(), (ContactUtil)contactUtilProvider.get(), (ContactAdapterViewBuilder)viewBuilderProvider.get());
        membersInjector.injectMembers(contactsearchadapter);
        return contactsearchadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactSearchAdapter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
