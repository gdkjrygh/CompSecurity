// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.app.Activity;
import android.os.Handler;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            WalletWebView, WalletWebViewFactory, HybridWebViewManager

public final class gressSpinnerManager extends Binding
    implements MembersInjector, Provider
{

    private Binding activity;
    private Binding handler;
    private Binding spinnerManager;
    private Binding webViewControlFactory;
    private Binding webViewManager;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/webview/WalletWebView, getClass().getClassLoader());
        webViewControlFactory = linker.requestBinding("com.google.android.apps.wallet.webview.WalletWebViewFactory", com/google/android/apps/wallet/webview/WalletWebView, getClass().getClassLoader());
        spinnerManager = linker.requestBinding("com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager", com/google/android/apps/wallet/webview/WalletWebView, getClass().getClassLoader());
        webViewManager = linker.requestBinding("com.google.android.apps.wallet.webview.HybridWebViewManager", com/google/android/apps/wallet/webview/WalletWebView, getClass().getClassLoader());
        handler = linker.requestBinding("@com.google.android.apps.wallet.inject.BindingAnnotations$MainThreadHandler()/android.os.Handler", com/google/android/apps/wallet/webview/WalletWebView, getClass().getClassLoader());
    }

    public final WalletWebView get()
    {
        WalletWebView walletwebview = new WalletWebView();
        injectMembers(walletwebview);
        return walletwebview;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(activity);
        set1.add(webViewControlFactory);
        set1.add(spinnerManager);
        set1.add(webViewManager);
        set1.add(handler);
    }

    public final void injectMembers(WalletWebView walletwebview)
    {
        walletwebview.activity = (Activity)activity.get();
        walletwebview.webViewControlFactory = (WalletWebViewFactory)webViewControlFactory.get();
        walletwebview.spinnerManager = (FullScreenProgressSpinnerManager)spinnerManager.get();
        walletwebview.webViewManager = (HybridWebViewManager)webViewManager.get();
        walletwebview.handler = (Handler)handler.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((WalletWebView)obj);
    }

    public gressSpinnerManager()
    {
        super("com.google.android.apps.wallet.webview.WalletWebView", "members/com.google.android.apps.wallet.webview.WalletWebView", false, com/google/android/apps/wallet/webview/WalletWebView);
    }
}
