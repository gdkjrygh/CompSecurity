// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import com.google.android.apps.wallet.rpc.RpcCaller;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            GiftCardsClient

public final class  extends Binding
    implements Provider
{

    private Binding contextParameters;
    private Binding rpcCaller;

    public final void attach(Linker linker)
    {
        rpcCaller = linker.requestBinding("com.google.android.apps.wallet.rpc.RpcCaller", com/google/android/apps/wallet/giftcard/GiftCardsClient, getClass().getClassLoader());
        contextParameters = linker.requestBinding("com.google.wallet.proto.NanoWalletWobl$LayoutContextParameters", com/google/android/apps/wallet/giftcard/GiftCardsClient, getClass().getClassLoader());
    }

    public final GiftCardsClient get()
    {
        return new GiftCardsClient((RpcCaller)rpcCaller.get(), (com.google.wallet.proto.ameters)contextParameters.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(rpcCaller);
        set.add(contextParameters);
    }

    public ()
    {
        super("com.google.android.apps.wallet.giftcard.GiftCardsClient", "members/com.google.android.apps.wallet.giftcard.GiftCardsClient", true, com/google/android/apps/wallet/giftcard/GiftCardsClient);
    }
}
