// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import com.google.common.cache.Cache;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            P2PModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final P2PModule module;

    public final Cache get()
    {
        P2PModule p2pmodule = module;
        return P2PModule.getClaimablePurchaseRecordEventCache();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (P2PModule p2pmodule)
    {
        super("com.google.common.cache.Cache<java.lang.Object, com.google.android.apps.wallet.p2p.ClaimablePurchaseRecordEvent>", false, "com.google.android.apps.wallet.p2p.P2PModule", "getClaimablePurchaseRecordEventCache");
        module = p2pmodule;
        setLibrary(true);
    }
}
