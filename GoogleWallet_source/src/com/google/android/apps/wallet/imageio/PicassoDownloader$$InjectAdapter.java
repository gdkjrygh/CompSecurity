// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.imageio;

import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.io.File;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.imageio:
//            PicassoDownloader

public final class  extends Binding
    implements Provider
{

    private Binding accountName;
    private Binding authScope;
    private Binding authUtil;
    private Binding authoritiesRequiringAuth;
    private Binding cacheDir;
    private Binding client;

    public final void attach(Linker linker)
    {
        client = linker.requestBinding("com.squareup.okhttp.OkHttpClient", com/google/android/apps/wallet/imageio/PicassoDownloader, getClass().getClassLoader());
        authoritiesRequiringAuth = linker.requestBinding("@com.google.android.apps.wallet.imageio.BindingAnnotations$AuthoritiesRequiringAuth()/java.util.Set<java.lang.String>", com/google/android/apps/wallet/imageio/PicassoDownloader, getClass().getClassLoader());
        authUtil = linker.requestBinding("com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil", com/google/android/apps/wallet/imageio/PicassoDownloader, getClass().getClassLoader());
        accountName = linker.requestBinding("@com.google.android.apps.wallet.userscope.api.BindingAnnotations$AccountName()/java.lang.String", com/google/android/apps/wallet/imageio/PicassoDownloader, getClass().getClassLoader());
        authScope = linker.requestBinding("@com.google.android.apps.wallet.imageio.BindingAnnotations$AuthScope()/java.lang.String", com/google/android/apps/wallet/imageio/PicassoDownloader, getClass().getClassLoader());
        cacheDir = linker.requestBinding("@com.google.android.apps.wallet.imageio.BindingAnnotations$ApplicationCacheDirectory()/java.io.File", com/google/android/apps/wallet/imageio/PicassoDownloader, getClass().getClassLoader());
    }

    public final PicassoDownloader get()
    {
        return new PicassoDownloader((OkHttpClient)client.get(), (Set)authoritiesRequiringAuth.get(), (WalletGoogleAuthUtil)authUtil.get(), (String)accountName.get(), (String)authScope.get(), (File)cacheDir.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(client);
        set.add(authoritiesRequiringAuth);
        set.add(authUtil);
        set.add(accountName);
        set.add(authScope);
        set.add(cacheDir);
    }

    public ()
    {
        super("com.google.android.apps.wallet.imageio.PicassoDownloader", "members/com.google.android.apps.wallet.imageio.PicassoDownloader", false, com/google/android/apps/wallet/imageio/PicassoDownloader);
    }
}
