// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            FetchCloudPinStateTask, CloudPinManager

public final class  extends Binding
    implements Provider
{

    private Binding pinManager;

    public final void attach(Linker linker)
    {
        pinManager = linker.requestBinding("com.google.android.apps.wallet.pin.CloudPinManager", com/google/android/apps/wallet/pin/FetchCloudPinStateTask, getClass().getClassLoader());
    }

    public final FetchCloudPinStateTask get()
    {
        return new FetchCloudPinStateTask((CloudPinManager)pinManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(pinManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.pin.FetchCloudPinStateTask", "members/com.google.android.apps.wallet.pin.FetchCloudPinStateTask", false, com/google/android/apps/wallet/pin/FetchCloudPinStateTask);
    }
}
