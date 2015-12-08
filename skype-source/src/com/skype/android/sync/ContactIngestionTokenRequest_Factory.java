// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import com.skype.android.app.token.MsaTokenRequest;
import com.skype.android.app.token.SkypeTokenAccess;
import com.skype.android.inject.AccountProvider;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.sync:
//            ContactIngestionTokenRequest

public final class ContactIngestionTokenRequest_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final MembersInjector membersInjector;
    private final Provider msaTokenRequestProvider;
    private final Provider skypeTokenAccessProvider;

    public ContactIngestionTokenRequest_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
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
        accountProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        msaTokenRequestProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            skypeTokenAccessProvider = provider2;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        return new ContactIngestionTokenRequest_Factory(membersinjector, provider, provider1, provider2);
    }

    public final ContactIngestionTokenRequest get()
    {
        ContactIngestionTokenRequest contactingestiontokenrequest = new ContactIngestionTokenRequest((AccountProvider)accountProvider.get(), (MsaTokenRequest)msaTokenRequestProvider.get(), (SkypeTokenAccess)skypeTokenAccessProvider.get());
        membersInjector.injectMembers(contactingestiontokenrequest);
        return contactingestiontokenrequest;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/sync/ContactIngestionTokenRequest_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
