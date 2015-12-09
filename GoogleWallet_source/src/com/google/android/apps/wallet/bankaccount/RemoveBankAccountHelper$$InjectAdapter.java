// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.bankaccount.api.BankAccountClient;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelPublisher;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            RemoveBankAccountHelper

public final class nager extends Binding
    implements MembersInjector, Provider
{

    private Binding analyticsUtil;
    private Binding bankAccountClient;
    private Binding bankAccountsModelPublisher;
    private Binding fullScreenSpinnerManager;

    public final void attach(Linker linker)
    {
        bankAccountClient = linker.requestBinding("com.google.android.apps.wallet.bankaccount.api.BankAccountClient", com/google/android/apps/wallet/bankaccount/RemoveBankAccountHelper, getClass().getClassLoader());
        bankAccountsModelPublisher = linker.requestBinding("com.google.android.apps.wallet.bankaccount.api.BankAccountsModelPublisher", com/google/android/apps/wallet/bankaccount/RemoveBankAccountHelper, getClass().getClassLoader());
        fullScreenSpinnerManager = linker.requestBinding("com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager", com/google/android/apps/wallet/bankaccount/RemoveBankAccountHelper, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/bankaccount/RemoveBankAccountHelper, getClass().getClassLoader());
    }

    public final RemoveBankAccountHelper get()
    {
        RemoveBankAccountHelper removebankaccounthelper = new RemoveBankAccountHelper();
        injectMembers(removebankaccounthelper);
        return removebankaccounthelper;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(bankAccountClient);
        set1.add(bankAccountsModelPublisher);
        set1.add(fullScreenSpinnerManager);
        set1.add(analyticsUtil);
    }

    public final void injectMembers(RemoveBankAccountHelper removebankaccounthelper)
    {
        removebankaccounthelper.bankAccountClient = (BankAccountClient)bankAccountClient.get();
        removebankaccounthelper.bankAccountsModelPublisher = (BankAccountsModelPublisher)bankAccountsModelPublisher.get();
        removebankaccounthelper.fullScreenSpinnerManager = (FullScreenProgressSpinnerManager)fullScreenSpinnerManager.get();
        removebankaccounthelper.analyticsUtil = (AnalyticsUtil)analyticsUtil.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RemoveBankAccountHelper)obj);
    }

    public nager()
    {
        super("com.google.android.apps.wallet.bankaccount.RemoveBankAccountHelper", "members/com.google.android.apps.wallet.bankaccount.RemoveBankAccountHelper", false, com/google/android/apps/wallet/bankaccount/RemoveBankAccountHelper);
    }
}
