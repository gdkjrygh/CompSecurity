// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            PinTokenRequestProcessor, AppPinToken

public final class  extends Binding
    implements Provider
{

    private Binding appPinToken;

    public final void attach(Linker linker)
    {
        appPinToken = linker.requestBinding("com.google.android.apps.wallet.pin.AppPinToken", com/google/android/apps/wallet/pin/PinTokenRequestProcessor, getClass().getClassLoader());
    }

    public final PinTokenRequestProcessor get()
    {
        return new PinTokenRequestProcessor((AppPinToken)appPinToken.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(appPinToken);
    }

    public ()
    {
        super("com.google.android.apps.wallet.pin.PinTokenRequestProcessor", "members/com.google.android.apps.wallet.pin.PinTokenRequestProcessor", true, com/google/android/apps/wallet/pin/PinTokenRequestProcessor);
    }
}
