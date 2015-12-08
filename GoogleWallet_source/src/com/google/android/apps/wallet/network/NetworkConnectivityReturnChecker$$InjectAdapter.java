// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.network;

import dagger.internal.Binding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.network:
//            NetworkConnectivityReturnChecker

public final class  extends Binding
    implements Provider
{

    public final NetworkConnectivityReturnChecker get()
    {
        return new NetworkConnectivityReturnChecker();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.google.android.apps.wallet.network.NetworkConnectivityReturnChecker", "members/com.google.android.apps.wallet.network.NetworkConnectivityReturnChecker", false, com/google/android/apps/wallet/network/NetworkConnectivityReturnChecker);
    }
}
