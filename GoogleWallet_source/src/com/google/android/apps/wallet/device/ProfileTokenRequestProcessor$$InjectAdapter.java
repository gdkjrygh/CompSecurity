// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.device;

import android.content.SharedPreferences;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.device:
//            ProfileTokenRequestProcessor

public final class  extends Binding
    implements Provider
{

    private Binding sharedPrefernces;

    public final void attach(Linker linker)
    {
        sharedPrefernces = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/device/ProfileTokenRequestProcessor, getClass().getClassLoader());
    }

    public final ProfileTokenRequestProcessor get()
    {
        return new ProfileTokenRequestProcessor((SharedPreferences)sharedPrefernces.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(sharedPrefernces);
    }

    public ()
    {
        super("com.google.android.apps.wallet.device.ProfileTokenRequestProcessor", "members/com.google.android.apps.wallet.device.ProfileTokenRequestProcessor", false, com/google/android/apps/wallet/device/ProfileTokenRequestProcessor);
    }
}
