// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            PinTokenResponseProcessor, CloudPinManager

public final class Q extends Binding
    implements Provider
{

    private Binding cloudPinManager;

    public final void attach(Linker linker)
    {
        cloudPinManager = linker.requestBinding("com.google.android.apps.wallet.pin.CloudPinManager", com/google/android/apps/wallet/pin/PinTokenResponseProcessor, getClass().getClassLoader());
    }

    public final PinTokenResponseProcessor get()
    {
        return new PinTokenResponseProcessor((CloudPinManager)cloudPinManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(cloudPinManager);
    }

    public Q()
    {
        super("com.google.android.apps.wallet.pin.PinTokenResponseProcessor", "members/com.google.android.apps.wallet.pin.PinTokenResponseProcessor", false, com/google/android/apps/wallet/pin/PinTokenResponseProcessor);
    }
}
