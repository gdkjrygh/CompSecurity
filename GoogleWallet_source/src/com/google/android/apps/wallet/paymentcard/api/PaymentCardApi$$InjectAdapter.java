// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.api;

import android.accounts.Account;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.api:
//            PaymentCardApi

public final class  extends Binding
    implements Provider
{

    private Binding account;
    private Binding cloudConfigurationManager;
    private Binding threadChecker;

    public final void attach(Linker linker)
    {
        account = linker.requestBinding("@com.google.android.apps.wallet.account.api.BindingAnnotations$WalletGaiaAccount()/android.accounts.Account", com/google/android/apps/wallet/paymentcard/api/PaymentCardApi, getClass().getClassLoader());
        cloudConfigurationManager = linker.requestBinding("com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager", com/google/android/apps/wallet/paymentcard/api/PaymentCardApi, getClass().getClassLoader());
        threadChecker = linker.requestBinding("com.google.android.apps.wallet.util.async.ThreadChecker", com/google/android/apps/wallet/paymentcard/api/PaymentCardApi, getClass().getClassLoader());
    }

    public final PaymentCardApi get()
    {
        return new PaymentCardApi((Account)account.get(), (CloudConfigurationManager)cloudConfigurationManager.get(), (ThreadChecker)threadChecker.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(account);
        set.add(cloudConfigurationManager);
        set.add(threadChecker);
    }

    public ()
    {
        super("com.google.android.apps.wallet.paymentcard.api.PaymentCardApi", "members/com.google.android.apps.wallet.paymentcard.api.PaymentCardApi", false, com/google/android/apps/wallet/paymentcard/api/PaymentCardApi);
    }
}
