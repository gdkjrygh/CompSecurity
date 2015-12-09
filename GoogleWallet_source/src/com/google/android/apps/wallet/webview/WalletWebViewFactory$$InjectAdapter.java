// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.accounts.Account;
import android.app.Activity;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            WalletWebViewFactory, HybridWebViewManager

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding hybridWebViewManager;
    private Binding walletAccount;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/webview/WalletWebViewFactory, getClass().getClassLoader());
        walletAccount = linker.requestBinding("@com.google.android.apps.wallet.account.api.BindingAnnotations$WalletGaiaAccount()/android.accounts.Account", com/google/android/apps/wallet/webview/WalletWebViewFactory, getClass().getClassLoader());
        hybridWebViewManager = linker.requestBinding("com.google.android.apps.wallet.webview.HybridWebViewManager", com/google/android/apps/wallet/webview/WalletWebViewFactory, getClass().getClassLoader());
    }

    public final WalletWebViewFactory get()
    {
        return new WalletWebViewFactory((Activity)activity.get(), (Account)walletAccount.get(), (HybridWebViewManager)hybridWebViewManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(walletAccount);
        set.add(hybridWebViewManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.webview.WalletWebViewFactory", "members/com.google.android.apps.wallet.webview.WalletWebViewFactory", false, com/google/android/apps/wallet/webview/WalletWebViewFactory);
    }
}
