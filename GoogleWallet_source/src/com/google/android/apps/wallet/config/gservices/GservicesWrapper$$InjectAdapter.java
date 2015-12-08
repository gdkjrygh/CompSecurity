// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.gservices;

import android.content.ContentResolver;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.config.gservices:
//            GservicesWrapper

public final class  extends Binding
    implements Provider
{

    private Binding contentResolver;

    public final void attach(Linker linker)
    {
        contentResolver = linker.requestBinding("android.content.ContentResolver", com/google/android/apps/wallet/config/gservices/GservicesWrapper, getClass().getClassLoader());
    }

    public final GservicesWrapper get()
    {
        return new GservicesWrapper((ContentResolver)contentResolver.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(contentResolver);
    }

    public ()
    {
        super("com.google.android.apps.wallet.config.gservices.GservicesWrapper", "members/com.google.android.apps.wallet.config.gservices.GservicesWrapper", false, com/google/android/apps/wallet/config/gservices/GservicesWrapper);
    }
}
