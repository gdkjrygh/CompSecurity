// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            HybridWebViewManager, HybridWebViewCookieManager

public final class  extends Binding
    implements Provider
{

    private Binding cookieManager;

    public final void attach(Linker linker)
    {
        cookieManager = linker.requestBinding("com.google.android.apps.wallet.webview.HybridWebViewCookieManager", com/google/android/apps/wallet/webview/HybridWebViewManager, getClass().getClassLoader());
    }

    public final HybridWebViewManager get()
    {
        return new HybridWebViewManager((HybridWebViewCookieManager)cookieManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(cookieManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.webview.HybridWebViewManager", "members/com.google.android.apps.wallet.webview.HybridWebViewManager", true, com/google/android/apps/wallet/webview/HybridWebViewManager);
    }
}
