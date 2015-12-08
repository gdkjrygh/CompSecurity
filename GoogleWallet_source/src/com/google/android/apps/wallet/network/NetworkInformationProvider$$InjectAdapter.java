// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.network;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.network:
//            NetworkInformationProvider

public final class  extends Binding
    implements Provider
{

    private Binding connectivityManager;
    private Binding telephonyManager;

    public final void attach(Linker linker)
    {
        connectivityManager = linker.requestBinding("android.net.ConnectivityManager", com/google/android/apps/wallet/network/NetworkInformationProvider, getClass().getClassLoader());
        telephonyManager = linker.requestBinding("android.telephony.TelephonyManager", com/google/android/apps/wallet/network/NetworkInformationProvider, getClass().getClassLoader());
    }

    public final NetworkInformationProvider get()
    {
        return new NetworkInformationProvider((ConnectivityManager)connectivityManager.get(), (TelephonyManager)telephonyManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(connectivityManager);
        set.add(telephonyManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.network.NetworkInformationProvider", "members/com.google.android.apps.wallet.network.NetworkInformationProvider", true, com/google/android/apps/wallet/network/NetworkInformationProvider);
    }
}
