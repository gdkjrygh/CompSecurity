// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            HybridWebView

public final class I extends Binding
    implements MembersInjector
{

    private Binding authUtil;
    private Binding executor;

    public final void attach(Linker linker)
    {
        authUtil = linker.requestBinding("com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil", com/google/android/apps/wallet/webview/HybridWebView, getClass().getClassLoader());
        executor = linker.requestBinding("@com.google.android.apps.wallet.util.async.BindingAnnotations$Parallel()/java.util.concurrent.Executor", com/google/android/apps/wallet/webview/HybridWebView, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(authUtil);
        set1.add(executor);
    }

    public final void injectMembers(HybridWebView hybridwebview)
    {
        hybridwebview.authUtil = (WalletGoogleAuthUtil)authUtil.get();
        hybridwebview.executor = (Executor)executor.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((HybridWebView)obj);
    }

    public I()
    {
        super(null, "members/com.google.android.apps.wallet.webview.HybridWebView", false, com/google/android/apps/wallet/webview/HybridWebView);
    }
}
