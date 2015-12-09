// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardModelPublisher

public final class  extends Binding
    implements Provider
{

    private Binding plasticCardModelProvider;

    public final void attach(Linker linker)
    {
        plasticCardModelProvider = linker.requestBinding("com.google.android.apps.wallet.plastic.PlasticCardModelPublisher", com/google/android/apps/wallet/plastic/OrderPlasticCardAction$Factory, getClass().getClassLoader());
    }

    public final plasticCardModelProvider get()
    {
        return new plasticCardModelProvider((PlasticCardModelPublisher)plasticCardModelProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(plasticCardModelProvider);
    }

    public ()
    {
        super("com.google.android.apps.wallet.plastic.OrderPlasticCardAction$Factory", "members/com.google.android.apps.wallet.plastic.OrderPlasticCardAction$Factory", false, com/google/android/apps/wallet/plastic/OrderPlasticCardAction$Factory);
    }
}
