// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import com.google.android.apps.wallet.loyalty.discovery.LoyaltyDiscoveryApiClient;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            SimplifiedLoyaltyProgramListFragment

final class this._cls0
    implements Callable
{

    final SimplifiedLoyaltyProgramListFragment this$0;

    private com.google.wallet.proto.api.msResponse call()
        throws Exception
    {
        return loyaltyApiClient.fetchFeaturedPrograms(SimplifiedLoyaltyProgramListFragment.access$300(SimplifiedLoyaltyProgramListFragment.this));
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = SimplifiedLoyaltyProgramListFragment.this;
        super();
    }
}
