// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import com.skype.Account;
import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.app.NavigationUrl;
import com.skype.android.util.SkypeCredit;
import com.skype.android.util.SkypeNumber;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.account:
//            BuyOnlineNumberDialog

public final class BuyOnlineNumberDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider navigationUrlProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider skypeCreditProvider;
    private final Provider skypeNumberProvider;

    public BuyOnlineNumberDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
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
        accountProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        skypeNumberProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        skypeCreditProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        } else
        {
            navigationUrlProvider = provider4;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new BuyOnlineNumberDialog_MembersInjector(provider, provider1, provider2, provider3, provider4);
    }

    public static void injectAccount(BuyOnlineNumberDialog buyonlinenumberdialog, Provider provider)
    {
        buyonlinenumberdialog.account = (Account)provider.get();
    }

    public static void injectNavigationUrl(BuyOnlineNumberDialog buyonlinenumberdialog, Provider provider)
    {
        buyonlinenumberdialog.navigationUrl = (NavigationUrl)provider.get();
    }

    public static void injectSkypeCredit(BuyOnlineNumberDialog buyonlinenumberdialog, Provider provider)
    {
        buyonlinenumberdialog.skypeCredit = (SkypeCredit)provider.get();
    }

    public static void injectSkypeNumber(BuyOnlineNumberDialog buyonlinenumberdialog, Provider provider)
    {
        buyonlinenumberdialog.skypeNumber = (SkypeNumber)provider.get();
    }

    public final void injectMembers(BuyOnlineNumberDialog buyonlinenumberdialog)
    {
        if (buyonlinenumberdialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(buyonlinenumberdialog, objectInterfaceFinderProvider);
            buyonlinenumberdialog.account = (Account)accountProvider.get();
            buyonlinenumberdialog.skypeNumber = (SkypeNumber)skypeNumberProvider.get();
            buyonlinenumberdialog.skypeCredit = (SkypeCredit)skypeCreditProvider.get();
            buyonlinenumberdialog.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((BuyOnlineNumberDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/account/BuyOnlineNumberDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
