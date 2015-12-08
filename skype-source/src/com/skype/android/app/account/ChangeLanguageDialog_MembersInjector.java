// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import com.skype.Account;
import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.util.ContactUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.account:
//            ChangeLanguageDialog

public final class ChangeLanguageDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider contactUtilProvider;
    private final Provider objectInterfaceFinderProvider;

    public ChangeLanguageDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2)
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
        } else
        {
            contactUtilProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new ChangeLanguageDialog_MembersInjector(provider, provider1, provider2);
    }

    public static void injectAccount(ChangeLanguageDialog changelanguagedialog, Provider provider)
    {
        changelanguagedialog.account = (Account)provider.get();
    }

    public static void injectContactUtil(ChangeLanguageDialog changelanguagedialog, Provider provider)
    {
        changelanguagedialog.contactUtil = (ContactUtil)provider.get();
    }

    public final void injectMembers(ChangeLanguageDialog changelanguagedialog)
    {
        if (changelanguagedialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(changelanguagedialog, objectInterfaceFinderProvider);
            changelanguagedialog.account = (Account)accountProvider.get();
            changelanguagedialog.contactUtil = (ContactUtil)contactUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ChangeLanguageDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/account/ChangeLanguageDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
