// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.app.NavigationUrl;
import com.skype.android.util.SkypeCredit;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.account:
//            BuyCreditDialog

public final class BuyCreditDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider creditProvider;
    private final Provider navigationUrlProvider;
    private final Provider objectInterfaceFinderProvider;

    public BuyCreditDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2)
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
        creditProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            navigationUrlProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new BuyCreditDialog_MembersInjector(provider, provider1, provider2);
    }

    public static void injectCredit(BuyCreditDialog buycreditdialog, Provider provider)
    {
        buycreditdialog.credit = (SkypeCredit)provider.get();
    }

    public static void injectNavigationUrl(BuyCreditDialog buycreditdialog, Provider provider)
    {
        buycreditdialog.navigationUrl = (NavigationUrl)provider.get();
    }

    public final void injectMembers(BuyCreditDialog buycreditdialog)
    {
        if (buycreditdialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(buycreditdialog, objectInterfaceFinderProvider);
            buycreditdialog.credit = (SkypeCredit)creditProvider.get();
            buycreditdialog.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((BuyCreditDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/account/BuyCreditDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
