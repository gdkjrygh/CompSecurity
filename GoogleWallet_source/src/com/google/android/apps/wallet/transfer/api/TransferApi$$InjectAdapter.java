// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.api;

import com.google.android.apps.wallet.api.UriRegistry;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.transfer.api:
//            TransferApi

public final class  extends Binding
    implements Provider
{

    private Binding uriRegistry;

    public final void attach(Linker linker)
    {
        uriRegistry = linker.requestBinding("com.google.android.apps.wallet.api.UriRegistry", com/google/android/apps/wallet/transfer/api/TransferApi, getClass().getClassLoader());
    }

    public final TransferApi get()
    {
        return new TransferApi((UriRegistry)uriRegistry.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(uriRegistry);
    }

    public ()
    {
        super("com.google.android.apps.wallet.transfer.api.TransferApi", "members/com.google.android.apps.wallet.transfer.api.TransferApi", false, com/google/android/apps/wallet/transfer/api/TransferApi);
    }
}
