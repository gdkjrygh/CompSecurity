// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.location;

import com.google.android.apps.wallet.base.java.System;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.util.location:
//            LocationHelper

public final class  extends Binding
    implements Provider
{

    private Binding system;

    public final void attach(Linker linker)
    {
        system = linker.requestBinding("com.google.android.apps.wallet.base.java.System", com/google/android/apps/wallet/util/location/LocationHelper, getClass().getClassLoader());
    }

    public final LocationHelper get()
    {
        return new LocationHelper((System)system.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(system);
    }

    public ()
    {
        super("com.google.android.apps.wallet.util.location.LocationHelper", "members/com.google.android.apps.wallet.util.location.LocationHelper", false, com/google/android/apps/wallet/util/location/LocationHelper);
    }
}
