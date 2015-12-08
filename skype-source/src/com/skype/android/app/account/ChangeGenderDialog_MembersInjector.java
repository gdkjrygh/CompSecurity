// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import com.skype.Account;
import com.skype.android.SkypeDialogFragment_MembersInjector;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.account:
//            ChangeGenderDialog

public final class ChangeGenderDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider objectInterfaceFinderProvider;

    public ChangeGenderDialog_MembersInjector(Provider provider, Provider provider1)
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
            accountProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new ChangeGenderDialog_MembersInjector(provider, provider1);
    }

    public static void injectAccount(ChangeGenderDialog changegenderdialog, Provider provider)
    {
        changegenderdialog.account = (Account)provider.get();
    }

    public final void injectMembers(ChangeGenderDialog changegenderdialog)
    {
        if (changegenderdialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(changegenderdialog, objectInterfaceFinderProvider);
            changegenderdialog.account = (Account)accountProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ChangeGenderDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/account/ChangeGenderDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
