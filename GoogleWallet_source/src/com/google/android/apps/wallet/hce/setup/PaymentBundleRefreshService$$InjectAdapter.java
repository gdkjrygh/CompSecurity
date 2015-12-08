// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;

import android.net.ConnectivityManager;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.setup:
//            PaymentBundleRefreshService, PaymentBundleRefresher

public final class Y extends Binding
    implements MembersInjector, Provider
{

    private Binding connectivityManager;
    private Binding paymentBundleRefresher;

    public final void attach(Linker linker)
    {
        connectivityManager = linker.requestBinding("android.net.ConnectivityManager", com/google/android/apps/wallet/hce/setup/PaymentBundleRefreshService, getClass().getClassLoader());
        paymentBundleRefresher = linker.requestBinding("com.google.android.apps.wallet.hce.setup.PaymentBundleRefresher", com/google/android/apps/wallet/hce/setup/PaymentBundleRefreshService, getClass().getClassLoader());
    }

    public final PaymentBundleRefreshService get()
    {
        PaymentBundleRefreshService paymentbundlerefreshservice = new PaymentBundleRefreshService();
        injectMembers(paymentbundlerefreshservice);
        return paymentbundlerefreshservice;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(connectivityManager);
        set1.add(paymentBundleRefresher);
    }

    public final void injectMembers(PaymentBundleRefreshService paymentbundlerefreshservice)
    {
        paymentbundlerefreshservice.connectivityManager = (ConnectivityManager)connectivityManager.get();
        paymentbundlerefreshservice.paymentBundleRefresher = (PaymentBundleRefresher)paymentBundleRefresher.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PaymentBundleRefreshService)obj);
    }

    public Y()
    {
        super("com.google.android.apps.wallet.hce.setup.PaymentBundleRefreshService", "members/com.google.android.apps.wallet.hce.setup.PaymentBundleRefreshService", false, com/google/android/apps/wallet/hce/setup/PaymentBundleRefreshService);
    }
}
