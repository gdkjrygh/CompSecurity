// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import android.content.Context;
import com.skype.android.app.mnv.MnvAnalytics;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.NetworkUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.sync:
//            LegacyContactsIngestTaskImpl, ContactIngestionTokenRequest

public final class LegacyContactsIngestTaskImpl_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider contactIngestionTokenRequestProvider;
    private final Provider contactUtilProvider;
    private final Provider contextProvider;
    private final Provider mnvAnalyticsProvider;
    private final Provider networkUtilProvider;

    public LegacyContactsIngestTaskImpl_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        contactIngestionTokenRequestProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        networkUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        mnvAnalyticsProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            contactUtilProvider = provider5;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new LegacyContactsIngestTaskImpl_Factory(provider, provider1, provider2, provider3, provider4, provider5);
    }

    public final LegacyContactsIngestTaskImpl get()
    {
        return new LegacyContactsIngestTaskImpl((Context)contextProvider.get(), (AccountProvider)accountProvider.get(), (ContactIngestionTokenRequest)contactIngestionTokenRequestProvider.get(), (NetworkUtil)networkUtilProvider.get(), (MnvAnalytics)mnvAnalyticsProvider.get(), (ContactUtil)contactUtilProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/sync/LegacyContactsIngestTaskImpl_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
