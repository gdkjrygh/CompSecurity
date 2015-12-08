// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.account:
//            DeleteCallForwardingNumberDialog

public final class DeleteCallForwardingNumberDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider analyticsProvider;
    private final Provider libProvider;
    private final Provider objectInterfaceFinderProvider;

    public DeleteCallForwardingNumberDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3)
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
        accountProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsProvider = provider3;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new DeleteCallForwardingNumberDialog_MembersInjector(provider, provider1, provider2, provider3);
    }

    public static void injectAccount(DeleteCallForwardingNumberDialog deletecallforwardingnumberdialog, Provider provider)
    {
        deletecallforwardingnumberdialog.account = (Account)provider.get();
    }

    public static void injectAnalytics(DeleteCallForwardingNumberDialog deletecallforwardingnumberdialog, Provider provider)
    {
        deletecallforwardingnumberdialog.analytics = (Analytics)provider.get();
    }

    public static void injectLib(DeleteCallForwardingNumberDialog deletecallforwardingnumberdialog, Provider provider)
    {
        deletecallforwardingnumberdialog.lib = (SkyLib)provider.get();
    }

    public final void injectMembers(DeleteCallForwardingNumberDialog deletecallforwardingnumberdialog)
    {
        if (deletecallforwardingnumberdialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(deletecallforwardingnumberdialog, objectInterfaceFinderProvider);
            deletecallforwardingnumberdialog.lib = (SkyLib)libProvider.get();
            deletecallforwardingnumberdialog.account = (Account)accountProvider.get();
            deletecallforwardingnumberdialog.analytics = (Analytics)analyticsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((DeleteCallForwardingNumberDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/account/DeleteCallForwardingNumberDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
