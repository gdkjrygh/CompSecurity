// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import com.skype.Account;
import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.util.TimeUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.account:
//            ChangeBirthdayDialog

public final class ChangeBirthdayDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider timeUtilProvider;

    public ChangeBirthdayDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2)
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
            timeUtilProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new ChangeBirthdayDialog_MembersInjector(provider, provider1, provider2);
    }

    public static void injectAccount(ChangeBirthdayDialog changebirthdaydialog, Provider provider)
    {
        changebirthdaydialog.account = (Account)provider.get();
    }

    public static void injectTimeUtil(ChangeBirthdayDialog changebirthdaydialog, Provider provider)
    {
        changebirthdaydialog.timeUtil = (TimeUtil)provider.get();
    }

    public final void injectMembers(ChangeBirthdayDialog changebirthdaydialog)
    {
        if (changebirthdaydialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(changebirthdaydialog, objectInterfaceFinderProvider);
            changebirthdaydialog.account = (Account)accountProvider.get();
            changebirthdaydialog.timeUtil = (TimeUtil)timeUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ChangeBirthdayDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/account/ChangeBirthdayDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
