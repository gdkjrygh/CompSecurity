// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty.discovery;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.loyalty.discovery:
//            FeaturedLoyaltyProgramListFragment, LoyaltyDiscoveryApiClient

final class this._cls0
    implements Callable
{

    final FeaturedLoyaltyProgramListFragment this$0;

    private com.google.wallet.proto.api.ramsResponse call()
        throws Exception
    {
        return loyaltyApiClient.fetchFeaturedPrograms(FeaturedLoyaltyProgramListFragment.access$200(FeaturedLoyaltyProgramListFragment.this));
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = FeaturedLoyaltyProgramListFragment.this;
        super();
    }
}
