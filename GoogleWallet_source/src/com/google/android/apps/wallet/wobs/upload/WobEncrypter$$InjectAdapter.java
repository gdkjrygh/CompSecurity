// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.upload;

import com.google.android.apps.wallet.globalresources.GlobalResourceManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.upload:
//            WobEncrypter

public final class  extends Binding
    implements Provider
{

    private Binding globalResourceManager;

    public final void attach(Linker linker)
    {
        globalResourceManager = linker.requestBinding("com.google.android.apps.wallet.globalresources.GlobalResourceManager", com/google/android/apps/wallet/wobs/upload/WobEncrypter, getClass().getClassLoader());
    }

    public final WobEncrypter get()
    {
        return new WobEncrypter((GlobalResourceManager)globalResourceManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(globalResourceManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.wobs.upload.WobEncrypter", "members/com.google.android.apps.wallet.wobs.upload.WobEncrypter", false, com/google/android/apps/wallet/wobs/upload/WobEncrypter);
    }
}
