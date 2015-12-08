// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import com.skype.android.inject.AccountProvider;
import com.skype.android.util.TimeUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.sync:
//            SyncAdapter

public final class SyncAdapter_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider timeUtilProvider;

    public SyncAdapter_MembersInjector(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            timeUtilProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new SyncAdapter_MembersInjector(provider, provider1);
    }

    public static void injectAccountProvider(SyncAdapter syncadapter, Provider provider)
    {
        syncadapter.accountProvider = (AccountProvider)provider.get();
    }

    public static void injectTimeUtil(SyncAdapter syncadapter, Provider provider)
    {
        syncadapter.timeUtil = (TimeUtil)provider.get();
    }

    public final void injectMembers(SyncAdapter syncadapter)
    {
        if (syncadapter == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            syncadapter.accountProvider = (AccountProvider)accountProvider.get();
            syncadapter.timeUtil = (TimeUtil)timeUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SyncAdapter)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/sync/SyncAdapter_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
