// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.network.NetworkInformationProvider;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            NetworkAccessPrompter

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding networkInformationProvider;

    public final void attach(Linker linker)
    {
        networkInformationProvider = linker.requestBinding("com.google.android.apps.wallet.network.NetworkInformationProvider", com/google/android/apps/wallet/usersetup/NetworkAccessPrompter, getClass().getClassLoader());
        activity = linker.requestBinding("android.support.v4.app.FragmentActivity", com/google/android/apps/wallet/usersetup/NetworkAccessPrompter, getClass().getClassLoader());
    }

    public final NetworkAccessPrompter get()
    {
        return new NetworkAccessPrompter((NetworkInformationProvider)networkInformationProvider.get(), (FragmentActivity)activity.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(networkInformationProvider);
        set.add(activity);
    }

    public ()
    {
        super("com.google.android.apps.wallet.usersetup.NetworkAccessPrompter", "members/com.google.android.apps.wallet.usersetup.NetworkAccessPrompter", false, com/google/android/apps/wallet/usersetup/NetworkAccessPrompter);
    }
}
